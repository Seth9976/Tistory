package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

public final class ViewParentCompat {
    public static int[] a;

    public static void notifySubtreeAccessibilityStateChanged(@NonNull ViewParent viewParent0, @NonNull View view0, @NonNull View view1, int v) {
        viewParent0.notifySubtreeAccessibilityStateChanged(view0, view1, v);
    }

    public static boolean onNestedFling(@NonNull ViewParent viewParent0, @NonNull View view0, float f, float f1, boolean z) {
        try {
            return y0.a(viewParent0, view0, f, f1, z);
        }
        catch(AbstractMethodError abstractMethodError0) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedFling", abstractMethodError0);
            return false;
        }
    }

    public static boolean onNestedPreFling(@NonNull ViewParent viewParent0, @NonNull View view0, float f, float f1) {
        try {
            return y0.b(viewParent0, view0, f, f1);
        }
        catch(AbstractMethodError abstractMethodError0) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreFling", abstractMethodError0);
            return false;
        }
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v, int v1, @NonNull int[] arr_v) {
        ViewParentCompat.onNestedPreScroll(viewParent0, view0, v, v1, arr_v, 0);
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v, int v1, @NonNull int[] arr_v, int v2) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).onNestedPreScroll(view0, v, v1, arr_v, v2);
            return;
        }
        if(v2 == 0) {
            try {
                y0.c(viewParent0, view0, v, v1, arr_v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreScroll", abstractMethodError0);
            }
        }
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v, int v1, int v2, int v3) {
        int[] arr_v = ViewParentCompat.a;
        if(arr_v == null) {
            ViewParentCompat.a = new int[2];
        }
        else {
            arr_v[0] = 0;
            arr_v[1] = 0;
        }
        ViewParentCompat.onNestedScroll(viewParent0, view0, v, v1, v2, v3, 0, ViewParentCompat.a);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v, int v1, int v2, int v3, int v4) {
        int[] arr_v = ViewParentCompat.a;
        if(arr_v == null) {
            ViewParentCompat.a = new int[2];
        }
        else {
            arr_v[0] = 0;
            arr_v[1] = 0;
        }
        ViewParentCompat.onNestedScroll(viewParent0, view0, v, v1, v2, v3, v4, ViewParentCompat.a);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        if(viewParent0 instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3)viewParent0).onNestedScroll(view0, v, v1, v2, v3, v4, arr_v);
            return;
        }
        arr_v[0] += v2;
        arr_v[1] += v3;
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).onNestedScroll(view0, v, v1, v2, v3, v4);
            return;
        }
        if(v4 == 0) {
            try {
                y0.d(viewParent0, view0, v, v1, v2, v3);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScroll", abstractMethodError0);
            }
        }
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent0, @NonNull View view0, @NonNull View view1, int v) {
        ViewParentCompat.onNestedScrollAccepted(viewParent0, view0, view1, v, 0);
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent0, @NonNull View view0, @NonNull View view1, int v, int v1) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).onNestedScrollAccepted(view0, view1, v, v1);
            return;
        }
        if(v1 == 0) {
            try {
                y0.e(viewParent0, view0, view1, v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScrollAccepted", abstractMethodError0);
            }
        }
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, @NonNull View view1, int v) {
        return ViewParentCompat.onStartNestedScroll(viewParent0, view0, view1, v, 0);
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, @NonNull View view1, int v, int v1) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2)viewParent0).onStartNestedScroll(view0, view1, v, v1);
        }
        if(v1 == 0) {
            try {
                return y0.f(viewParent0, view0, view1, v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStartNestedScroll", abstractMethodError0);
            }
        }
        return false;
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0) {
        ViewParentCompat.onStopNestedScroll(viewParent0, view0, 0);
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent0, @NonNull View view0, int v) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).onStopNestedScroll(view0, v);
            return;
        }
        if(v == 0) {
            try {
                y0.g(viewParent0, view0);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStopNestedScroll", abstractMethodError0);
            }
        }
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent0, View view0, AccessibilityEvent accessibilityEvent0) {
        return viewParent0.requestSendAccessibilityEvent(view0, accessibilityEvent0);
    }
}

