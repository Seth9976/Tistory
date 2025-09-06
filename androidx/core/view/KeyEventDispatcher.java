package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class KeyEventDispatcher {
    public interface Component {
        boolean superDispatchKeyEvent(@NonNull KeyEvent arg1);
    }

    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;

    public static boolean dispatchBeforeHierarchy(@NonNull View view0, @NonNull KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT < 28) {
            q0 q00 = (q0)view0.getTag(id.tag_unhandled_key_event_manager);
            WeakReference weakReference0 = null;
            if(q00 == null) {
                q00 = new q0();  // 初始化器: Ljava/lang/Object;-><init>()V
                q00.a = null;
                q00.b = null;
                q00.c = null;
                view0.setTag(id.tag_unhandled_key_event_manager, q00);
            }
            if(q00.c == null || q00.c.get() != keyEvent0) {
                q00.c = new WeakReference(keyEvent0);
                if(q00.b == null) {
                    q00.b = new SparseArray();
                }
                SparseArray sparseArray0 = q00.b;
                if(keyEvent0.getAction() == 1) {
                    int v = sparseArray0.indexOfKey(keyEvent0.getKeyCode());
                    if(v >= 0) {
                        weakReference0 = (WeakReference)sparseArray0.valueAt(v);
                        sparseArray0.removeAt(v);
                    }
                }
                if(weakReference0 == null) {
                    weakReference0 = (WeakReference)sparseArray0.get(keyEvent0.getKeyCode());
                }
                if(weakReference0 != null) {
                    View view1 = (View)weakReference0.get();
                    if(view1 != null && view1.isAttachedToWindow()) {
                        q0.b(view1, keyEvent0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    public static boolean dispatchKeyEvent(@NonNull Component keyEventDispatcher$Component0, @Nullable View view0, @Nullable Window.Callback window$Callback0, @NonNull KeyEvent keyEvent0) {
        KeyEvent.DispatcherState keyEvent$DispatcherState0 = null;
        boolean z = false;
        if(keyEventDispatcher$Component0 == null) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            return keyEventDispatcher$Component0.superDispatchKeyEvent(keyEvent0);
        }
        if(window$Callback0 instanceof Activity) {
            ((Activity)window$Callback0).onUserInteraction();
            Window window0 = ((Activity)window$Callback0).getWindow();
            if(window0.hasFeature(8)) {
                ActionBar actionBar0 = ((Activity)window$Callback0).getActionBar();
                if(keyEvent0.getKeyCode() != 82 || actionBar0 == null) {
                    goto label_21;
                }
                else {
                    if(!KeyEventDispatcher.a) {
                        try {
                            KeyEventDispatcher.b = actionBar0.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        }
                        catch(NoSuchMethodException unused_ex) {
                        }
                        KeyEventDispatcher.a = true;
                    }
                    Method method0 = KeyEventDispatcher.b;
                    if(method0 != null) {
                        try {
                            Object object0 = method0.invoke(actionBar0, keyEvent0);
                            if(object0 != null) {
                                z = ((Boolean)object0).booleanValue();
                            }
                        }
                        catch(IllegalAccessException | InvocationTargetException unused_ex) {
                        }
                    }
                    if(!z) {
                        goto label_21;
                    }
                }
            }
            else {
            label_21:
                if(!window0.superDispatchKeyEvent(keyEvent0)) {
                    View view1 = window0.getDecorView();
                    if(!ViewCompat.a(view1, keyEvent0)) {
                        if(view1 != null) {
                            keyEvent$DispatcherState0 = view1.getKeyDispatcherState();
                        }
                        return keyEvent0.dispatch(((Activity)window$Callback0), keyEvent$DispatcherState0, ((Activity)window$Callback0));
                    }
                }
            }
            return true;
        }
        if(window$Callback0 instanceof Dialog) {
            Dialog dialog0 = (Dialog)window$Callback0;
            if(!KeyEventDispatcher.c) {
                try {
                    Field field0 = Dialog.class.getDeclaredField("mOnKeyListener");
                    KeyEventDispatcher.d = field0;
                    field0.setAccessible(true);
                }
                catch(NoSuchFieldException unused_ex) {
                }
                KeyEventDispatcher.c = true;
            }
            Field field1 = KeyEventDispatcher.d;
            DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = null;
            if(field1 != null) {
                try {
                    dialogInterface$OnKeyListener0 = (DialogInterface.OnKeyListener)field1.get(dialog0);
                }
                catch(IllegalAccessException unused_ex) {
                }
            }
            if(dialogInterface$OnKeyListener0 == null || !dialogInterface$OnKeyListener0.onKey(dialog0, keyEvent0.getKeyCode(), keyEvent0)) {
                Window window1 = dialog0.getWindow();
                if(!window1.superDispatchKeyEvent(keyEvent0)) {
                    View view2 = window1.getDecorView();
                    if(!ViewCompat.a(view2, keyEvent0)) {
                        if(view2 != null) {
                            keyEvent$DispatcherState0 = view2.getKeyDispatcherState();
                        }
                        return keyEvent0.dispatch(dialog0, keyEvent$DispatcherState0, dialog0);
                    }
                }
            }
            return true;
        }
        return view0 != null && ViewCompat.a(view0, keyEvent0) || keyEventDispatcher$Component0.superDispatchKeyEvent(keyEvent0);
    }
}

