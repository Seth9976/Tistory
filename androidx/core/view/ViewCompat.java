package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View.AccessibilityDelegate;
import android.view.View.DragShadowBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.R.id;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@NonNull View arg1, @NonNull KeyEvent arg2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;
    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;
    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;
    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;
    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;
    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    @Deprecated
    public static final int MEASURED_SIZE_MASK = 0xFFFFFF;
    @Deprecated
    public static final int MEASURED_STATE_MASK = 0xFF000000;
    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;
    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 0x20;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    public static WeakHashMap a = null;
    public static Method b = null;
    public static Field c = null;
    public static boolean d = false;
    public static final int[] e;
    public static final b0 f;
    public static final d0 g;

    static {
        ViewCompat.e = new int[]{id.accessibility_custom_action_0, id.accessibility_custom_action_1, id.accessibility_custom_action_2, id.accessibility_custom_action_3, id.accessibility_custom_action_4, id.accessibility_custom_action_5, id.accessibility_custom_action_6, id.accessibility_custom_action_7, id.accessibility_custom_action_8, id.accessibility_custom_action_9, id.accessibility_custom_action_10, id.accessibility_custom_action_11, id.accessibility_custom_action_12, id.accessibility_custom_action_13, id.accessibility_custom_action_14, id.accessibility_custom_action_15, id.accessibility_custom_action_16, id.accessibility_custom_action_17, id.accessibility_custom_action_18, id.accessibility_custom_action_19, id.accessibility_custom_action_20, id.accessibility_custom_action_21, id.accessibility_custom_action_22, id.accessibility_custom_action_23, id.accessibility_custom_action_24, id.accessibility_custom_action_25, id.accessibility_custom_action_26, id.accessibility_custom_action_27, id.accessibility_custom_action_28, id.accessibility_custom_action_29, id.accessibility_custom_action_30, id.accessibility_custom_action_31};
        ViewCompat.f = new b0();  // 初始化器: Ljava/lang/Object;-><init>()V
        ViewCompat.g = new d0();
    }

    public static boolean a(View view0, KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        q0 q00 = (q0)view0.getTag(id.tag_unhandled_key_event_manager);
        if(q00 == null) {
            q00 = new q0();  // 初始化器: Ljava/lang/Object;-><init>()V
            q00.a = null;
            q00.b = null;
            q00.c = null;
            view0.setTag(id.tag_unhandled_key_event_manager, q00);
        }
        if(keyEvent0.getAction() == 0) {
            WeakHashMap weakHashMap0 = q00.a;
            if(weakHashMap0 != null) {
                weakHashMap0.clear();
            }
            ArrayList arrayList0 = q0.d;
            if(!arrayList0.isEmpty()) {
                synchronized(arrayList0) {
                    if(q00.a == null) {
                        q00.a = new WeakHashMap();
                    }
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        ArrayList arrayList1 = q0.d;
                        View view1 = (View)((WeakReference)arrayList1.get(v1)).get();
                        if(view1 == null) {
                            arrayList1.remove(v1);
                        }
                        else {
                            q00.a.put(view1, Boolean.TRUE);
                            for(ViewParent viewParent0 = view1.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                                q00.a.put(((View)viewParent0), Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View view2 = q00.a(view0, keyEvent0);
        if(keyEvent0.getAction() == 0) {
            int v2 = keyEvent0.getKeyCode();
            if(view2 != null && !KeyEvent.isModifierKey(v2)) {
                if(q00.b == null) {
                    q00.b = new SparseArray();
                }
                q00.b.put(v2, new WeakReference(view2));
            }
        }
        return view2 != null;
    }

    public static int addAccessibilityAction(@NonNull View view0, @NonNull CharSequence charSequence0, @NonNull AccessibilityViewCommand accessibilityViewCommand0) {
        int v1;
        ArrayList arrayList0 = ViewCompat.c(view0);
        for(int v = 0; true; ++v) {
            if(v >= arrayList0.size()) {
                int v3 = -1;
                for(int v2 = 0; v2 < 0x20 && v3 == -1; ++v2) {
                    int v4 = ViewCompat.e[v2];
                    int v6 = 1;
                    for(int v5 = 0; v5 < arrayList0.size(); ++v5) {
                        v6 &= (((AccessibilityActionCompat)arrayList0.get(v5)).getId() == v4 ? 0 : 1);
                    }
                    if(v6 != 0) {
                        v3 = v4;
                    }
                }
                v1 = v3;
                break;
            }
            if(TextUtils.equals(charSequence0, ((AccessibilityActionCompat)arrayList0.get(v)).getLabel())) {
                v1 = ((AccessibilityActionCompat)arrayList0.get(v)).getId();
                break;
            }
        }
        if(v1 != -1) {
            AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = new AccessibilityActionCompat(v1, charSequence0, accessibilityViewCommand0);
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.getAccessibilityDelegate(view0);
            if(accessibilityDelegateCompat0 == null) {
                accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
            }
            ViewCompat.setAccessibilityDelegate(view0, accessibilityDelegateCompat0);
            ViewCompat.e(accessibilityNodeInfoCompat$AccessibilityActionCompat0.getId(), view0);
            ViewCompat.c(view0).add(accessibilityNodeInfoCompat$AccessibilityActionCompat0);
            ViewCompat.d(0, view0);
        }
        return v1;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view0, @NonNull Collection collection0, int v) {
        j0.a(view0, collection0, v);
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view0, @NonNull OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            l0.a(view0, viewCompat$OnUnhandledKeyEventListenerCompat0);
            return;
        }
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            view0.setTag(id.tag_unhandled_key_listeners, arrayList0);
        }
        arrayList0.add(viewCompat$OnUnhandledKeyEventListenerCompat0);
        if(arrayList0.size() == 1) {
            ArrayList arrayList1 = q0.d;
            synchronized(arrayList1) {
                for(Object object0: arrayList1) {
                    if(((WeakReference)object0).get() == view0) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                WeakReference weakReference0 = new WeakReference(view0);
                q0.d.add(weakReference0);
            }
        }
    }

    @NonNull
    @Deprecated
    public static ViewPropertyAnimatorCompat animate(@NonNull View view0) {
        if(ViewCompat.a == null) {
            ViewCompat.a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = (ViewPropertyAnimatorCompat)ViewCompat.a.get(view0);
        if(viewPropertyAnimatorCompat0 == null) {
            viewPropertyAnimatorCompat0 = new ViewPropertyAnimatorCompat(view0);
            ViewCompat.a.put(view0, viewPropertyAnimatorCompat0);
        }
        return viewPropertyAnimatorCompat0;
    }

    public static View.AccessibilityDelegate b(View view0) {
        if(Build.VERSION.SDK_INT >= 29) {
            return m0.a(view0);
        }
        if(!ViewCompat.d) {
            if(ViewCompat.c == null) {
                try {
                    Field field0 = View.class.getDeclaredField("mAccessibilityDelegate");
                    ViewCompat.c = field0;
                    field0.setAccessible(true);
                }
                catch(Throwable unused_ex) {
                    ViewCompat.d = true;
                    return null;
                }
            }
            try {
                Object object0 = ViewCompat.c.get(view0);
                if(object0 instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate)object0;
                }
            }
            catch(Throwable unused_ex) {
                ViewCompat.d = true;
            }
        }
        return null;
    }

    public static ArrayList c(View view0) {
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_accessibility_actions);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            view0.setTag(id.tag_accessibility_actions, arrayList0);
        }
        return arrayList0;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view0, int v) {
        return view0.canScrollHorizontally(v);
    }

    @Deprecated
    public static boolean canScrollVertically(View view0, int v) {
        return view0.canScrollVertically(v);
    }

    public static void cancelDragAndDrop(@NonNull View view0) {
        i0.a(view0);
    }

    @Deprecated
    public static int combineMeasuredStates(int v, int v1) {
        return View.combineMeasuredStates(v, v1);
    }

    @NonNull
    public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull Rect rect0) {
        return g0.b(view0, windowInsetsCompat0, rect0);
    }

    public static void d(int v, View view0) {
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        if(!accessibilityManager0.isEnabled()) {
            return;
        }
        boolean z = ViewCompat.getAccessibilityPaneTitle(view0) != null && view0.isShown() && view0.getWindowVisibility() == 0;
        int v1 = 0x20;
        if(view0.getAccessibilityLiveRegion() != 0 || z) {
            AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain();
            if(!z) {
                v1 = 0x800;
            }
            accessibilityEvent1.setEventType(v1);
            accessibilityEvent1.setContentChangeTypes(v);
            if(z) {
                accessibilityEvent1.getText().add(ViewCompat.getAccessibilityPaneTitle(view0));
                if(view0.getImportantForAccessibility() == 0) {
                    view0.setImportantForAccessibility(1);
                }
            }
            view0.sendAccessibilityEventUnchecked(accessibilityEvent1);
        }
        else {
            if(v == 0x20) {
                AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
                view0.onInitializeAccessibilityEvent(accessibilityEvent0);
                accessibilityEvent0.setEventType(0x20);
                accessibilityEvent0.setContentChangeTypes(0x20);
                accessibilityEvent0.setSource(view0);
                view0.onPopulateAccessibilityEvent(accessibilityEvent0);
                accessibilityEvent0.getText().add(ViewCompat.getAccessibilityPaneTitle(view0));
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
                return;
            }
            if(view0.getParent() != null) {
                ViewParent viewParent0 = view0.getParent();
                try {
                    viewParent0.notifySubtreeAccessibilityStateChanged(view0, view0, v);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewCompat", view0.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", abstractMethodError0);
                }
            }
        }
    }

    @NonNull
    public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
        WindowInsets windowInsets0 = windowInsetsCompat0.toWindowInsets();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = e0.a(view0, windowInsets0);
            return windowInsets1.equals(windowInsets0) ? windowInsetsCompat0 : WindowInsetsCompat.toWindowInsetsCompat(windowInsets1, view0);
        }
        return windowInsetsCompat0;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view0) {
        i0.b(view0);
    }

    public static boolean dispatchNestedFling(@NonNull View view0, float f, float f1, boolean z) {
        return g0.c(view0, f, f1, z);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view0, float f, float f1) {
        return g0.d(view0, f, f1);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view0, int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        return g0.e(view0, v, v1, arr_v, arr_v1);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view0, int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1, int v2) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
        }
        return v2 == 0 ? ViewCompat.dispatchNestedPreScroll(view0, v, v1, arr_v, arr_v1) : false;
    }

    public static void dispatchNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4, @NonNull int[] arr_v1) {
        if(view0 instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3)view0).dispatchNestedScroll(v, v1, v2, v3, arr_v, v4, arr_v1);
            return;
        }
        ViewCompat.dispatchNestedScroll(view0, v, v1, v2, v3, arr_v, v4);
    }

    public static boolean dispatchNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, @Nullable int[] arr_v) {
        return g0.f(view0, v, v1, v2, v3, arr_v);
    }

    public static boolean dispatchNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
        }
        return v4 == 0 ? ViewCompat.dispatchNestedScroll(view0, v, v1, v2, v3, arr_v) : false;
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view0) {
        i0.c(view0);
    }

    public static void e(int v, View view0) {
        ArrayList arrayList0 = ViewCompat.c(view0);
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            if(((AccessibilityActionCompat)arrayList0.get(v1)).getId() == v) {
                arrayList0.remove(v1);
                return;
            }
        }
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view0) {
        AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.getAccessibilityDelegate(view0);
        if(accessibilityDelegateCompat0 == null) {
            accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
        }
        ViewCompat.setAccessibilityDelegate(view0, accessibilityDelegateCompat0);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    @Nullable
    public static AccessibilityDelegateCompat getAccessibilityDelegate(@NonNull View view0) {
        View.AccessibilityDelegate view$AccessibilityDelegate0 = ViewCompat.b(view0);
        if(view$AccessibilityDelegate0 == null) {
            return null;
        }
        return view$AccessibilityDelegate0 instanceof a ? ((a)view$AccessibilityDelegate0).a : new AccessibilityDelegateCompat(view$AccessibilityDelegate0);
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(@NonNull View view0) {
        return view0.getAccessibilityLiveRegion();
    }

    @Nullable
    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = view0.getAccessibilityNodeProvider();
        return accessibilityNodeProvider0 == null ? null : new AccessibilityNodeProviderCompat(accessibilityNodeProvider0);
    }

    @Nullable
    @UiThread
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view0) {
        int v = id.tag_accessibility_pane_title;
        if(Build.VERSION.SDK_INT >= 28) {
            return l0.b(view0);
        }
        CharSequence charSequence0 = view0.getTag(v);
        return !CharSequence.class.isInstance(charSequence0) ? null : charSequence0;
    }

    @Deprecated
    public static float getAlpha(View view0) {
        return view0.getAlpha();
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view0) {
        return AutofillIdCompat.toAutofillIdCompat(j0.b(view0));
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view0) {
        return g0.g(view0);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view0) {
        return g0.h(view0);
    }

    @Nullable
    @Deprecated
    public static Rect getClipBounds(@NonNull View view0) {
        return view0.getClipBounds();
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view0) {
        if(Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSession0 = m0.b(view0);
            return contentCaptureSession0 == null ? null : ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession0, view0);
        }
        return null;
    }

    @Nullable
    @Deprecated
    public static Display getDisplay(@NonNull View view0) {
        return view0.getDisplay();
    }

    public static float getElevation(@NonNull View view0) {
        return g0.i(view0);
    }

    @Deprecated
    public static boolean getFitsSystemWindows(@NonNull View view0) {
        return view0.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(@NonNull View view0) {
        return view0.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@NonNull View view0) {
        return j0.c(view0);
    }

    public static int getImportantForContentCapture(@NonNull View view0) {
        return Build.VERSION.SDK_INT < 30 ? 0 : n0.a(view0);
    }

    @Deprecated
    public static int getLabelFor(@NonNull View view0) {
        return view0.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view0) {
        return view0.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(@NonNull View view0) {
        return view0.getLayoutDirection();
    }

    @Nullable
    @Deprecated
    public static Matrix getMatrix(View view0) {
        return view0.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view0) {
        return view0.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view0) {
        return view0.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view0) {
        return view0.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(@NonNull View view0) {
        return view0.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(@NonNull View view0) {
        return view0.getMinimumWidth();
    }

    public static int getNextClusterForwardId(@NonNull View view0) {
        return j0.d(view0);
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view0) {
        return Build.VERSION.SDK_INT < 0x1F ? ((String[])view0.getTag(id.tag_on_receive_content_mime_types)) : o0.a(view0);
    }

    @Deprecated
    public static int getOverScrollMode(View view0) {
        return view0.getOverScrollMode();
    }

    @Px
    @Deprecated
    public static int getPaddingEnd(@NonNull View view0) {
        return view0.getPaddingEnd();
    }

    @Px
    @Deprecated
    public static int getPaddingStart(@NonNull View view0) {
        return view0.getPaddingStart();
    }

    @Nullable
    @Deprecated
    public static ViewParent getParentForAccessibility(@NonNull View view0) {
        return view0.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view0) {
        return view0.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view0) {
        return view0.getPivotY();
    }

    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View view0) {
        return h0.a(view0);
    }

    @Deprecated
    public static float getRotation(View view0) {
        return view0.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view0) {
        return view0.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view0) {
        return view0.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view0) {
        return view0.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view0) {
        return view0.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View view0) {
        return h0.b(view0);
    }

    @Nullable
    @UiThread
    public static CharSequence getStateDescription(@NonNull View view0) {
        int v = id.tag_state_description;
        if(Build.VERSION.SDK_INT >= 30) {
            return n0.b(view0);
        }
        CharSequence charSequence0 = view0.getTag(v);
        return !CharSequence.class.isInstance(charSequence0) ? null : charSequence0;
    }

    @NonNull
    public static List getSystemGestureExclusionRects(@NonNull View view0) {
        return Build.VERSION.SDK_INT < 29 ? Collections.emptyList() : m0.c(view0);
    }

    @Nullable
    public static String getTransitionName(@NonNull View view0) {
        return g0.k(view0);
    }

    @Deprecated
    public static float getTranslationX(View view0) {
        return view0.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view0) {
        return view0.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View view0) {
        return g0.l(view0);
    }

    @Nullable
    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return n0.c(view0);
        }
        for(Context context0 = view0.getContext(); context0 instanceof ContextWrapper; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof Activity) {
                Window window0 = ((Activity)context0).getWindow();
                return window0 == null ? null : WindowCompat.getInsetsController(window0, view0);
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@NonNull View view0) {
        return view0.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view0) {
        return view0.getX();
    }

    @Deprecated
    public static float getY(View view0) {
        return view0.getY();
    }

    public static float getZ(@NonNull View view0) {
        return g0.m(view0);
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view0) {
        return ViewCompat.b(view0) != null;
    }

    public static boolean hasExplicitFocusable(@NonNull View view0) {
        return j0.e(view0);
    }

    public static boolean hasNestedScrollingParent(@NonNull View view0) {
        return g0.n(view0);
    }

    public static boolean hasNestedScrollingParent(@NonNull View view0, int v) {
        if(view0 instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2)view0).hasNestedScrollingParent(v);
            return false;
        }
        return v == 0 ? ViewCompat.hasNestedScrollingParent(view0) : false;
    }

    @Deprecated
    public static boolean hasOnClickListeners(@NonNull View view0) {
        return view0.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(@NonNull View view0) {
        return view0.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(@NonNull View view0) {
        return view0.hasTransientState();
    }

    @UiThread
    public static boolean isAccessibilityHeading(@NonNull View view0) {
        Boolean boolean0;
        int v = id.tag_accessibility_heading;
        if(Build.VERSION.SDK_INT >= 28) {
            boolean0 = Boolean.valueOf(l0.c(view0));
            return boolean0 != null && boolean0.booleanValue();
        }
        boolean0 = view0.getTag(v);
        if(!Boolean.class.isInstance(boolean0)) {
            boolean0 = null;
        }
        return boolean0 != null && boolean0.booleanValue();
    }

    @Deprecated
    public static boolean isAttachedToWindow(@NonNull View view0) {
        return view0.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(@NonNull View view0) {
        return j0.f(view0);
    }

    public static boolean isImportantForAccessibility(@NonNull View view0) {
        return g0.o(view0);
    }

    public static boolean isImportantForAutofill(@NonNull View view0) {
        return j0.g(view0);
    }

    public static boolean isImportantForContentCapture(@NonNull View view0) {
        return Build.VERSION.SDK_INT < 30 ? false : n0.d(view0);
    }

    @Deprecated
    public static boolean isInLayout(@NonNull View view0) {
        return view0.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view0) {
        return j0.h(view0);
    }

    @Deprecated
    public static boolean isLaidOut(@NonNull View view0) {
        return view0.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(@NonNull View view0) {
        return view0.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(@NonNull View view0) {
        return g0.p(view0);
    }

    @Deprecated
    public static boolean isOpaque(View view0) {
        return view0.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(@NonNull View view0) {
        return view0.isPaddingRelative();
    }

    @UiThread
    public static boolean isScreenReaderFocusable(@NonNull View view0) {
        Boolean boolean0;
        int v = id.tag_screen_reader_focusable;
        if(Build.VERSION.SDK_INT >= 28) {
            boolean0 = Boolean.valueOf(l0.d(view0));
            return boolean0 != null && boolean0.booleanValue();
        }
        boolean0 = view0.getTag(v);
        if(!Boolean.class.isInstance(boolean0)) {
            boolean0 = null;
        }
        return boolean0 != null && boolean0.booleanValue();
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view0) {
        view0.jumpDrawablesToCurrentState();
    }

    @Nullable
    public static View keyboardNavigationClusterSearch(@NonNull View view0, @Nullable View view1, int v) {
        return j0.i(view0, view1, v);
    }

    public static void offsetLeftAndRight(@NonNull View view0, int v) {
        view0.offsetLeftAndRight(v);
    }

    public static void offsetTopAndBottom(@NonNull View view0, int v) {
        view0.offsetTopAndBottom(v);
    }

    @NonNull
    public static WindowInsetsCompat onApplyWindowInsets(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
        WindowInsets windowInsets0 = windowInsetsCompat0.toWindowInsets();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = e0.b(view0, windowInsets0);
            return windowInsets1.equals(windowInsets0) ? windowInsetsCompat0 : WindowInsetsCompat.toWindowInsetsCompat(windowInsets1, view0);
        }
        return windowInsetsCompat0;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        view0.onInitializeAccessibilityEvent(accessibilityEvent0);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        view0.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat0.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        view0.onPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @Deprecated
    public static boolean performAccessibilityAction(@NonNull View view0, int v, @Nullable Bundle bundle0) {
        return view0.performAccessibilityAction(v, bundle0);
    }

    public static boolean performHapticFeedback(@NonNull View view0, int v) {
        int v1 = HapticFeedbackConstantsCompat.a(v);
        return v1 == -1 ? false : view0.performHapticFeedback(v1);
    }

    public static boolean performHapticFeedback(@NonNull View view0, int v, int v1) {
        int v2 = HapticFeedbackConstantsCompat.a(v);
        return v2 == -1 ? false : view0.performHapticFeedback(v2, v1);
    }

    @Nullable
    public static ContentInfoCompat performReceiveContent(@NonNull View view0, @NonNull ContentInfoCompat contentInfoCompat0) {
        if(Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat0 + ", view=" + view0.getClass().getSimpleName() + "[" + view0.getId() + "]");
        }
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return o0.b(view0, contentInfoCompat0);
        }
        OnReceiveContentListener onReceiveContentListener0 = (OnReceiveContentListener)view0.getTag(id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior0 = ViewCompat.f;
        if(onReceiveContentListener0 != null) {
            ContentInfoCompat contentInfoCompat1 = onReceiveContentListener0.onReceiveContent(view0, contentInfoCompat0);
            if(contentInfoCompat1 == null) {
                return null;
            }
            if(view0 instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior0 = (OnReceiveContentViewBehavior)view0;
            }
            return onReceiveContentViewBehavior0.onReceiveContent(contentInfoCompat1);
        }
        if(view0 instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior0 = (OnReceiveContentViewBehavior)view0;
        }
        return onReceiveContentViewBehavior0.onReceiveContent(contentInfoCompat0);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view0) {
        view0.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view0, int v, int v1, int v2, int v3) {
        view0.postInvalidateOnAnimation(v, v1, v2, v3);
    }

    @Deprecated
    public static void postOnAnimation(@NonNull View view0, @NonNull Runnable runnable0) {
        view0.postOnAnimation(runnable0);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void postOnAnimationDelayed(@NonNull View view0, @NonNull Runnable runnable0, long v) {
        view0.postOnAnimationDelayed(runnable0, v);
    }

    public static void removeAccessibilityAction(@NonNull View view0, int v) {
        ViewCompat.e(v, view0);
        ViewCompat.d(0, view0);
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view0, @NonNull OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            l0.e(view0, viewCompat$OnUnhandledKeyEventListenerCompat0);
            return;
        }
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
        if(arrayList0 != null) {
            arrayList0.remove(viewCompat$OnUnhandledKeyEventListenerCompat0);
            if(arrayList0.size() == 0) {
                synchronized(q0.d) {
                    for(int v1 = 0; true; ++v1) {
                        ArrayList arrayList2 = q0.d;
                        if(v1 >= arrayList2.size()) {
                            break;
                        }
                        if(((WeakReference)arrayList2.get(v1)).get() == view0) {
                            arrayList2.remove(v1);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view0, @NonNull AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0, @Nullable CharSequence charSequence0, @Nullable AccessibilityViewCommand accessibilityViewCommand0) {
        if(accessibilityViewCommand0 == null && charSequence0 == null) {
            ViewCompat.removeAccessibilityAction(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0.getId());
            return;
        }
        AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat1 = accessibilityNodeInfoCompat$AccessibilityActionCompat0.createReplacementAction(charSequence0, accessibilityViewCommand0);
        AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.getAccessibilityDelegate(view0);
        if(accessibilityDelegateCompat0 == null) {
            accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
        }
        ViewCompat.setAccessibilityDelegate(view0, accessibilityDelegateCompat0);
        ViewCompat.e(accessibilityNodeInfoCompat$AccessibilityActionCompat1.getId(), view0);
        ViewCompat.c(view0).add(accessibilityNodeInfoCompat$AccessibilityActionCompat1);
        ViewCompat.d(0, view0);
    }

    public static void requestApplyInsets(@NonNull View view0) {
        e0.c(view0);
    }

    @NonNull
    public static View requireViewById(@NonNull View view0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)l0.f(view0, v);
        }
        View view1 = view0.findViewById(v);
        if(view1 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        return view1;
    }

    @Deprecated
    public static int resolveSizeAndState(int v, int v1, int v2) {
        return View.resolveSizeAndState(v, v1, v2);
    }

    public static boolean restoreDefaultFocus(@NonNull View view0) {
        return j0.j(view0);
    }

    public static void saveAttributeDataForStyleable(@NonNull View view0, @SuppressLint({"ContextFirst"}) @NonNull Context context0, @NonNull int[] arr_v, @Nullable AttributeSet attributeSet0, @NonNull TypedArray typedArray0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 29) {
            m0.d(view0, context0, arr_v, attributeSet0, typedArray0, v, v1);
        }
    }

    public static void setAccessibilityDelegate(@NonNull View view0, @Nullable AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        if(accessibilityDelegateCompat0 == null && ViewCompat.b(view0) instanceof a) {
            accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
        }
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
        }
        view0.setAccessibilityDelegate((accessibilityDelegateCompat0 == null ? null : accessibilityDelegateCompat0.b));
    }

    @UiThread
    public static void setAccessibilityHeading(@NonNull View view0, boolean z) {
        new c0(id.tag_accessibility_heading, Boolean.class, 0, 28, 3).a(view0, Boolean.valueOf(z));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(@NonNull View view0, int v) {
        view0.setAccessibilityLiveRegion(v);
    }

    @UiThread
    public static void setAccessibilityPaneTitle(@NonNull View view0, @Nullable CharSequence charSequence0) {
        new c0(id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).a(view0, charSequence0);
        d0 d00 = ViewCompat.g;
        if(charSequence0 == null) {
            d00.a.remove(view0);
            view0.removeOnAttachStateChangeListener(d00);
            view0.getViewTreeObserver().removeOnGlobalLayoutListener(d00);
        }
        else {
            boolean z = view0.isShown() && view0.getWindowVisibility() == 0;
            d00.a.put(view0, Boolean.valueOf(z));
            view0.addOnAttachStateChangeListener(d00);
            if(view0.isAttachedToWindow()) {
                view0.getViewTreeObserver().addOnGlobalLayoutListener(d00);
            }
        }
    }

    @Deprecated
    public static void setActivated(View view0, boolean z) {
        view0.setActivated(z);
    }

    @Deprecated
    public static void setAlpha(View view0, @FloatRange(from = 0.0, to = 1.0) float f) {
        view0.setAlpha(f);
    }

    public static void setAutofillHints(@NonNull View view0, @Nullable String[] arr_s) {
        j0.k(view0, arr_s);
    }

    public static void setAutofillId(@NonNull View view0, @Nullable AutofillIdCompat autofillIdCompat0) {
        if(Build.VERSION.SDK_INT >= 28) {
            l0.i(view0, autofillIdCompat0);
        }
    }

    @Deprecated
    public static void setBackground(@NonNull View view0, @Nullable Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    public static void setBackgroundTintList(@NonNull View view0, @Nullable ColorStateList colorStateList0) {
        g0.q(view0, colorStateList0);
    }

    public static void setBackgroundTintMode(@NonNull View view0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        g0.r(view0, porterDuff$Mode0);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup0, boolean z) {
        if(ViewCompat.b == null) {
            try {
                ViewCompat.b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", noSuchMethodException0);
            }
            ViewCompat.b.setAccessible(true);
        }
        try {
            ViewCompat.b.invoke(viewGroup0, Boolean.valueOf(z));
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", illegalAccessException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", illegalArgumentException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", invocationTargetException0);
        }
    }

    @Deprecated
    public static void setClipBounds(@NonNull View view0, @Nullable Rect rect0) {
        view0.setClipBounds(rect0);
    }

    public static void setContentCaptureSession(@NonNull View view0, @Nullable ContentCaptureSessionCompat contentCaptureSessionCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            m0.e(view0, contentCaptureSessionCompat0);
        }
    }

    public static void setElevation(@NonNull View view0, float f) {
        g0.s(view0, f);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view0, boolean z) {
        view0.setFitsSystemWindows(z);
    }

    public static void setFocusedByDefault(@NonNull View view0, boolean z) {
        j0.l(view0, z);
    }

    @Deprecated
    public static void setHasTransientState(@NonNull View view0, boolean z) {
        view0.setHasTransientState(z);
    }

    @UiThread
    @Deprecated
    public static void setImportantForAccessibility(@NonNull View view0, int v) {
        view0.setImportantForAccessibility(v);
    }

    public static void setImportantForAutofill(@NonNull View view0, int v) {
        j0.m(view0, v);
    }

    public static void setImportantForContentCapture(@NonNull View view0, int v) {
        if(Build.VERSION.SDK_INT >= 30) {
            n0.e(view0, v);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view0, boolean z) {
        j0.n(view0, z);
    }

    @Deprecated
    public static void setLabelFor(@NonNull View view0, @IdRes int v) {
        view0.setLabelFor(v);
    }

    @Deprecated
    public static void setLayerPaint(@NonNull View view0, @Nullable Paint paint0) {
        view0.setLayerPaint(paint0);
    }

    @Deprecated
    public static void setLayerType(View view0, int v, Paint paint0) {
        view0.setLayerType(v, paint0);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull View view0, int v) {
        view0.setLayoutDirection(v);
    }

    public static void setNestedScrollingEnabled(@NonNull View view0, boolean z) {
        g0.t(view0, z);
    }

    public static void setNextClusterForwardId(@NonNull View view0, int v) {
        j0.o(view0, v);
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view0, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener0) {
        g0.u(view0, onApplyWindowInsetsListener0);
    }

    public static void setOnReceiveContentListener(@NonNull View view0, @Nullable String[] arr_s, @Nullable OnReceiveContentListener onReceiveContentListener0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            o0.c(view0, arr_s, onReceiveContentListener0);
            return;
        }
        if(arr_s == null || arr_s.length == 0) {
            arr_s = null;
        }
        int v = 0;
        if(onReceiveContentListener0 != null) {
            Preconditions.checkArgument(arr_s != null, "When the listener is set, MIME types must also be set");
        }
        if(arr_s != null) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(arr_s[v1].startsWith("*")) {
                    v = 1;
                    break;
                }
            }
            Preconditions.checkArgument(((boolean)(v ^ 1)), "A MIME type set here must not start with *: " + Arrays.toString(arr_s));
        }
        view0.setTag(id.tag_on_receive_content_mime_types, arr_s);
        view0.setTag(id.tag_on_receive_content_listener, onReceiveContentListener0);
    }

    @Deprecated
    public static void setOverScrollMode(View view0, int v) {
        view0.setOverScrollMode(v);
    }

    @Deprecated
    public static void setPaddingRelative(@NonNull View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPaddingRelative(v, v1, v2, v3);
    }

    @Deprecated
    public static void setPivotX(View view0, float f) {
        view0.setPivotX(f);
    }

    @Deprecated
    public static void setPivotY(View view0, float f) {
        view0.setPivotY(f);
    }

    public static void setPointerIcon(@NonNull View view0, @Nullable PointerIconCompat pointerIconCompat0) {
        i0.d(view0, ((PointerIcon)(pointerIconCompat0 == null ? null : pointerIconCompat0.getPointerIcon())));
    }

    @Deprecated
    public static void setRotation(View view0, float f) {
        view0.setRotation(f);
    }

    @Deprecated
    public static void setRotationX(View view0, float f) {
        view0.setRotationX(f);
    }

    @Deprecated
    public static void setRotationY(View view0, float f) {
        view0.setRotationY(f);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view0, boolean z) {
        view0.setSaveFromParentEnabled(z);
    }

    @Deprecated
    public static void setScaleX(View view0, float f) {
        view0.setScaleX(f);
    }

    @Deprecated
    public static void setScaleY(View view0, float f) {
        view0.setScaleY(f);
    }

    @UiThread
    public static void setScreenReaderFocusable(@NonNull View view0, boolean z) {
        new c0(id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).a(view0, Boolean.valueOf(z));
    }

    public static void setScrollIndicators(@NonNull View view0, int v) {
        h0.c(view0, v);
    }

    public static void setScrollIndicators(@NonNull View view0, int v, int v1) {
        h0.d(view0, v, v1);
    }

    @UiThread
    public static void setStateDescription(@NonNull View view0, @Nullable CharSequence charSequence0) {
        new c0(id.tag_state_description, CharSequence.class, 0x40, 30, 2).a(view0, charSequence0);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view0, @NonNull List list0) {
        if(Build.VERSION.SDK_INT >= 29) {
            m0.f(view0, list0);
        }
    }

    public static void setTooltipText(@NonNull View view0, @Nullable CharSequence charSequence0) {
        j0.p(view0, charSequence0);
    }

    public static void setTransitionName(@NonNull View view0, @Nullable String s) {
        g0.v(view0, s);
    }

    @Deprecated
    public static void setTranslationX(View view0, float f) {
        view0.setTranslationX(f);
    }

    @Deprecated
    public static void setTranslationY(View view0, float f) {
        view0.setTranslationY(f);
    }

    public static void setTranslationZ(@NonNull View view0, float f) {
        g0.w(view0, f);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view0, @Nullable Callback windowInsetsAnimationCompat$Callback0) {
        j1 j10 = null;
        if(Build.VERSION.SDK_INT >= 30) {
            if(windowInsetsAnimationCompat$Callback0 != null) {
                j10 = new j1(windowInsetsAnimationCompat$Callback0);
            }
            view0.setWindowInsetsAnimationCallback(j10);
            return;
        }
        Object object0 = view0.getTag(id.tag_on_apply_window_listener);
        if(windowInsetsAnimationCompat$Callback0 == null) {
            view0.setTag(id.tag_window_insets_animation_callback, null);
            if(object0 == null) {
                view0.setOnApplyWindowInsetsListener(null);
            }
        }
        else {
            h1 h10 = new h1(view0, windowInsetsAnimationCompat$Callback0);
            view0.setTag(id.tag_window_insets_animation_callback, h10);
            if(object0 == null) {
                view0.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    @Deprecated
    public static void setX(View view0, float f) {
        view0.setX(f);
    }

    @Deprecated
    public static void setY(View view0, float f) {
        view0.setY(f);
    }

    public static void setZ(@NonNull View view0, float f) {
        g0.x(view0, f);
    }

    public static boolean startDragAndDrop(@NonNull View view0, @Nullable ClipData clipData0, @NonNull View.DragShadowBuilder view$DragShadowBuilder0, @Nullable Object object0, int v) {
        return i0.e(view0, clipData0, view$DragShadowBuilder0, object0, v);
    }

    public static boolean startNestedScroll(@NonNull View view0, int v) {
        return g0.y(view0, v);
    }

    public static boolean startNestedScroll(@NonNull View view0, int v, int v1) {
        if(view0 instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2)view0).startNestedScroll(v, v1);
        }
        return v1 == 0 ? ViewCompat.startNestedScroll(view0, v) : false;
    }

    public static void stopNestedScroll(@NonNull View view0) {
        g0.z(view0);
    }

    public static void stopNestedScroll(@NonNull View view0, int v) {
        if(view0 instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2)view0).stopNestedScroll(v);
            return;
        }
        if(v == 0) {
            ViewCompat.stopNestedScroll(view0);
        }
    }

    public static void updateDragShadow(@NonNull View view0, @NonNull View.DragShadowBuilder view$DragShadowBuilder0) {
        i0.f(view0, view$DragShadowBuilder0);
    }
}

