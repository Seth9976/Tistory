package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;

public abstract class y0 {
    @DoNotInline
    public static boolean a(ViewParent viewParent0, View view0, float f, float f1, boolean z) {
        return viewParent0.onNestedFling(view0, f, f1, z);
    }

    @DoNotInline
    public static boolean b(ViewParent viewParent0, View view0, float f, float f1) {
        return viewParent0.onNestedPreFling(view0, f, f1);
    }

    @DoNotInline
    public static void c(ViewParent viewParent0, View view0, int v, int v1, int[] arr_v) {
        viewParent0.onNestedPreScroll(view0, v, v1, arr_v);
    }

    @DoNotInline
    public static void d(ViewParent viewParent0, View view0, int v, int v1, int v2, int v3) {
        viewParent0.onNestedScroll(view0, v, v1, v2, v3);
    }

    @DoNotInline
    public static void e(ViewParent viewParent0, View view0, View view1, int v) {
        viewParent0.onNestedScrollAccepted(view0, view1, v);
    }

    @DoNotInline
    public static boolean f(ViewParent viewParent0, View view0, View view1, int v) {
        return viewParent0.onStartNestedScroll(view0, view1, v);
    }

    @DoNotInline
    public static void g(ViewParent viewParent0, View view0) {
        viewParent0.onStopNestedScroll(view0);
    }
}

