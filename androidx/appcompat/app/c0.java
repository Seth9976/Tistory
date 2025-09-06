package androidx.appcompat.app;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.List;

public final class c0 extends WindowCallbackWrapper {
    public s0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final i0 f;

    public c0(i0 i00, Window.Callback window$Callback0) {
        this.f = i00;
        super(window$Callback0);
    }

    public final void a(Window.Callback window$Callback0) {
        try {
            this.c = true;
            window$Callback0.onContentChanged();
            this.c = false;
        }
        catch(Throwable throwable0) {
            this.c = false;
            throw throwable0;
        }
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.d ? this.getWrapped().dispatchKeyEvent(keyEvent0) : this.f.m(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        if(!super.dispatchKeyShortcutEvent(keyEvent0)) {
            int v = keyEvent0.getKeyCode();
            i0 i00 = this.f;
            i00.t();
            if(i00.o == null || !i00.o.onKeyShortcut(v, keyEvent0)) {
                if(i00.N == null || !i00.x(i00.N, keyEvent0.getKeyCode(), keyEvent0)) {
                    goto label_10;
                }
                AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = i00.N;
                if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                    appCompatDelegateImpl$PanelFeatureState0.l = true;
                    return true;
                label_10:
                    if(i00.N == null) {
                        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = i00.s(0);
                        i00.y(appCompatDelegateImpl$PanelFeatureState1, keyEvent0);
                        boolean z = i00.x(appCompatDelegateImpl$PanelFeatureState1, keyEvent0.getKeyCode(), keyEvent0);
                        appCompatDelegateImpl$PanelFeatureState1.k = false;
                        return z;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onContentChanged() {
        if(this.c) {
            this.getWrapped().onContentChanged();
        }
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        return v != 0 || menu0 instanceof MenuBuilder ? super.onCreatePanelMenu(v, menu0) : false;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final View onCreatePanelView(int v) {
        s0 s00 = this.b;
        if(s00 != null) {
            View view0 = s00.onCreatePanelView(v);
            return view0 == null ? super.onCreatePanelView(v) : view0;
        }
        return super.onCreatePanelView(v);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onMenuOpened(int v, Menu menu0) {
        super.onMenuOpened(v, menu0);
        i0 i00 = this.f;
        if(v == 108) {
            i00.t();
            ActionBar actionBar0 = i00.o;
            if(actionBar0 != null) {
                actionBar0.dispatchMenuVisibilityChanged(true);
                return true;
            }
        }
        else {
            i00.getClass();
        }
        return true;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onPanelClosed(int v, Menu menu0) {
        if(this.e) {
            this.getWrapped().onPanelClosed(v, menu0);
            return;
        }
        super.onPanelClosed(v, menu0);
        i0 i00 = this.f;
        if(v == 108) {
            i00.t();
            ActionBar actionBar0 = i00.o;
            if(actionBar0 != null) {
                actionBar0.dispatchMenuVisibilityChanged(false);
            }
        }
        else if(v == 0) {
            AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = i00.s(0);
            if(appCompatDelegateImpl$PanelFeatureState0.m) {
                i00.k(appCompatDelegateImpl$PanelFeatureState0, false);
            }
        }
        else {
            i00.getClass();
        }
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        MenuBuilder menuBuilder0 = menu0 instanceof MenuBuilder ? ((MenuBuilder)menu0) : null;
        if(v == 0 && menuBuilder0 == null) {
            return false;
        }
        if(menuBuilder0 != null) {
            menuBuilder0.setOverrideVisibleItems(true);
        }
        s0 s00 = this.b;
        if(s00 != null) {
            s00.onPreparePanel(v);
        }
        boolean z = super.onPreparePanel(v, view0, menu0);
        if(menuBuilder0 != null) {
            menuBuilder0.setOverrideVisibleItems(false);
        }
        return z;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        MenuBuilder menuBuilder0 = this.f.s(0).h;
        if(menuBuilder0 != null) {
            super.onProvideKeyboardShortcuts(list0, menuBuilder0, v);
            return;
        }
        super.onProvideKeyboardShortcuts(list0, menu0, v);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return null;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        i0 i00 = this.f;
        if(i00.z && v == 0) {
            CallbackWrapper supportActionModeWrapper$CallbackWrapper0 = new CallbackWrapper(i00.k, actionMode$Callback0);
            androidx.appcompat.view.ActionMode actionMode0 = i00.startSupportActionMode(supportActionModeWrapper$CallbackWrapper0);
            return actionMode0 == null ? null : supportActionModeWrapper$CallbackWrapper0.getActionModeWrapper(actionMode0);
        }
        return super.onWindowStartingActionMode(actionMode$Callback0, v);
    }
}

