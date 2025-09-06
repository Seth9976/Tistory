package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NestedScrollingChildHelper {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public NestedScrollingChildHelper(@NonNull View view0) {
        this.c = view0;
    }

    public final boolean a(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        int[] arr_v3;
        int v6;
        int v5;
        if(this.isNestedScrollingEnabled()) {
            ViewParent viewParent0 = this.b(v4);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0 || v2 != 0 || v3 != 0) {
                View view0 = this.c;
                if(arr_v == null) {
                    v5 = 0;
                    v6 = 0;
                }
                else {
                    view0.getLocationInWindow(arr_v);
                    v5 = arr_v[0];
                    v6 = arr_v[1];
                }
                if(arr_v1 == null) {
                    if(this.e == null) {
                        this.e = new int[2];
                    }
                    int[] arr_v2 = this.e;
                    arr_v2[0] = 0;
                    arr_v2[1] = 0;
                    arr_v3 = arr_v2;
                }
                else {
                    arr_v3 = arr_v1;
                }
                ViewParentCompat.onNestedScroll(viewParent0, this.c, v, v1, v2, v3, v4, arr_v3);
                if(arr_v != null) {
                    view0.getLocationInWindow(arr_v);
                    arr_v[0] -= v5;
                    arr_v[1] -= v6;
                }
                return true;
            }
            else if(arr_v != null) {
                arr_v[0] = 0;
                arr_v[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent b(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            default: {
                return null;
            }
        }
    }

    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        if(this.isNestedScrollingEnabled()) {
            ViewParent viewParent0 = this.b(0);
            return viewParent0 == null ? false : ViewParentCompat.onNestedFling(viewParent0, this.c, f, f1, z);
        }
        return false;
    }

    public boolean dispatchNestedPreFling(float f, float f1) {
        if(this.isNestedScrollingEnabled()) {
            ViewParent viewParent0 = this.b(0);
            return viewParent0 == null ? false : ViewParentCompat.onNestedPreFling(viewParent0, this.c, f, f1);
        }
        return false;
    }

    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        return this.dispatchNestedPreScroll(v, v1, arr_v, arr_v1, 0);
    }

    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1, int v2) {
        int[] arr_v2;
        int v4;
        int v3;
        if(this.isNestedScrollingEnabled()) {
            ViewParent viewParent0 = this.b(v2);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0) {
                View view0 = this.c;
                if(arr_v1 == null) {
                    v3 = 0;
                    v4 = 0;
                }
                else {
                    view0.getLocationInWindow(arr_v1);
                    v3 = arr_v1[0];
                    v4 = arr_v1[1];
                }
                if(arr_v == null) {
                    if(this.e == null) {
                        this.e = new int[2];
                    }
                    arr_v2 = this.e;
                }
                else {
                    arr_v2 = arr_v;
                }
                arr_v2[0] = 0;
                arr_v2[1] = 0;
                ViewParentCompat.onNestedPreScroll(viewParent0, this.c, v, v1, arr_v2, v2);
                if(arr_v1 != null) {
                    view0.getLocationInWindow(arr_v1);
                    arr_v1[0] -= v3;
                    arr_v1[1] -= v4;
                }
                return arr_v2[0] != 0 || arr_v2[1] != 0;
            }
            else if(arr_v1 != null) {
                arr_v1[0] = 0;
                arr_v1[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4, @Nullable int[] arr_v1) {
        this.a(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v) {
        return this.a(v, v1, v2, v3, arr_v, 0, null);
    }

    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4) {
        return this.a(v, v1, v2, v3, arr_v, v4, null);
    }

    public boolean hasNestedScrollingParent() {
        return this.hasNestedScrollingParent(0);
    }

    public boolean hasNestedScrollingParent(int v) {
        return this.b(v) != null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.d;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.c);
    }

    public void onStopNestedScroll(@NonNull View view0) {
        ViewCompat.stopNestedScroll(this.c);
    }

    public void setNestedScrollingEnabled(boolean z) {
        if(this.d) {
            ViewCompat.stopNestedScroll(this.c);
        }
        this.d = z;
    }

    public boolean startNestedScroll(int v) {
        return this.startNestedScroll(v, 0);
    }

    public boolean startNestedScroll(int v, int v1) {
        if(this.hasNestedScrollingParent(v1)) {
            return true;
        }
        if(this.isNestedScrollingEnabled()) {
            View view0 = this.c;
            ViewParent viewParent0 = view0.getParent();
            View view1 = view0;
            while(viewParent0 != null) {
                if(ViewParentCompat.onStartNestedScroll(viewParent0, view1, view0, v, v1)) {
                    switch(v1) {
                        case 0: {
                            this.a = viewParent0;
                            break;
                        }
                        case 1: {
                            this.b = viewParent0;
                        }
                    }
                    ViewParentCompat.onNestedScrollAccepted(viewParent0, view1, view0, v, v1);
                    return true;
                }
                if(viewParent0 instanceof View) {
                    view1 = (View)viewParent0;
                }
                viewParent0 = viewParent0.getParent();
            }
        }
        return false;
    }

    public void stopNestedScroll() {
        this.stopNestedScroll(0);
    }

    public void stopNestedScroll(int v) {
        ViewParent viewParent0 = this.b(v);
        if(viewParent0 != null) {
            ViewParentCompat.onStopNestedScroll(viewParent0, this.c, v);
            switch(v) {
                case 0: {
                    this.a = null;
                    break;
                }
                case 1: {
                    this.b = null;
                }
            }
        }
    }
}

