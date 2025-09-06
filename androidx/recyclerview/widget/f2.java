package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

public final class f2 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final StaggeredGridLayoutManager f;

    public f2(StaggeredGridLayoutManager staggeredGridLayoutManager0, int v) {
        this.f = staggeredGridLayoutManager0;
        this.a = new ArrayList();
        this.b = 0x80000000;
        this.c = 0x80000000;
        this.d = 0;
        this.e = v;
    }

    public final void a(View view0) {
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams0.e = this;
        this.a.add(view0);
        this.c = 0x80000000;
        if(this.a.size() == 1) {
            this.b = 0x80000000;
        }
        if(staggeredGridLayoutManager$LayoutParams0.isItemRemoved() || staggeredGridLayoutManager$LayoutParams0.isItemChanged()) {
            int v = this.d;
            this.d = this.f.c.getDecoratedMeasurement(view0) + v;
        }
    }

    public final void b() {
        View view0 = (View)this.a.get(this.a.size() - 1);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = this.f;
        this.c = staggeredGridLayoutManager0.c.getDecoratedEnd(view0);
        if(staggeredGridLayoutManager$LayoutParams0.f) {
            int v = staggeredGridLayoutManager$LayoutParams0.getViewLayoutPosition();
            c2 c20 = staggeredGridLayoutManager0.m.f(v);
            if(c20 != null && c20.b == 1) {
                this.c = (c20.c == null ? 0 : c20.c[this.e]) + this.c;
            }
        }
    }

    public final void c() {
        int v = 0;
        View view0 = (View)this.a.get(0);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = this.f;
        this.b = staggeredGridLayoutManager0.c.getDecoratedStart(view0);
        if(staggeredGridLayoutManager$LayoutParams0.f) {
            int v1 = staggeredGridLayoutManager$LayoutParams0.getViewLayoutPosition();
            c2 c20 = staggeredGridLayoutManager0.m.f(v1);
            if(c20 != null && c20.b == -1) {
                int v2 = this.b;
                int[] arr_v = c20.c;
                if(arr_v != null) {
                    v = arr_v[this.e];
                }
                this.b = v2 - v;
            }
        }
    }

    public final void d() {
        this.a.clear();
        this.b = 0x80000000;
        this.c = 0x80000000;
        this.d = 0;
    }

    // 去混淆评级： 低(20)
    public final int e() {
        return this.f.h ? this.g(this.a.size() - 1, -1, false, false, true) : this.g(0, this.a.size(), false, false, true);
    }

    // 去混淆评级： 低(20)
    public final int f() {
        return this.f.h ? this.g(0, this.a.size(), false, false, true) : this.g(this.a.size() - 1, -1, false, false, true);
    }

    public final int g(int v, int v1, boolean z, boolean z1, boolean z2) {
        boolean z4;
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = this.f;
        int v2 = staggeredGridLayoutManager0.c.getStartAfterPadding();
        int v3 = staggeredGridLayoutManager0.c.getEndAfterPadding();
        int v4 = v;
        int v5 = v1 <= v4 ? -1 : 1;
        while(v4 != v1) {
            View view0 = (View)this.a.get(v4);
            int v6 = staggeredGridLayoutManager0.c.getDecoratedStart(view0);
            int v7 = staggeredGridLayoutManager0.c.getDecoratedEnd(view0);
            boolean z3 = false;
            if(!z2) {
                if(v6 < v3) {
                    z4 = true;
                }
            }
            else if(v6 <= v3) {
                z4 = true;
            }
            else {
                z4 = false;
            }
            if(!z2) {
                if(v7 > v2) {
                    z3 = true;
                }
            }
            else if(v7 >= v2) {
                z3 = true;
            }
            if(z4 && z3) {
                if(!z || !z1) {
                    if(z1) {
                        return staggeredGridLayoutManager0.getPosition(view0);
                    }
                    if(v6 < v2 || v7 > v3) {
                        return staggeredGridLayoutManager0.getPosition(view0);
                    }
                }
                else if(v6 >= v2 && v7 <= v3) {
                    return staggeredGridLayoutManager0.getPosition(view0);
                }
            }
            v4 += v5;
        }
        return -1;
    }

    public final int h(int v) {
        int v1 = this.c;
        if(v1 != 0x80000000) {
            return v1;
        }
        if(this.a.size() == 0) {
            return v;
        }
        this.b();
        return this.c;
    }

    public final View i(int v, int v1) {
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = this.f;
        ArrayList arrayList0 = this.a;
        View view0 = null;
        if(v1 == -1) {
            int v2 = arrayList0.size();
            int v3 = 0;
            while(v3 < v2) {
                View view1 = (View)arrayList0.get(v3);
                if(staggeredGridLayoutManager0.h && staggeredGridLayoutManager0.getPosition(view1) <= v || !staggeredGridLayoutManager0.h && staggeredGridLayoutManager0.getPosition(view1) >= v || !view1.hasFocusable()) {
                    return view0;
                }
                ++v3;
                view0 = view1;
            }
            return view0;
        }
        else {
            int v4 = arrayList0.size() - 1;
            while(v4 >= 0) {
                View view2 = (View)arrayList0.get(v4);
                if(staggeredGridLayoutManager0.h && staggeredGridLayoutManager0.getPosition(view2) >= v || !staggeredGridLayoutManager0.h && staggeredGridLayoutManager0.getPosition(view2) <= v || !view2.hasFocusable()) {
                    break;
                }
                --v4;
                view0 = view2;
            }
        }
        return view0;
    }

    public final int j(int v) {
        int v1 = this.b;
        if(v1 != 0x80000000) {
            return v1;
        }
        if(this.a.size() == 0) {
            return v;
        }
        this.c();
        return this.b;
    }

    public final void k() {
        int v = this.a.size();
        View view0 = (View)this.a.remove(v - 1);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams0.e = null;
        if(staggeredGridLayoutManager$LayoutParams0.isItemRemoved() || staggeredGridLayoutManager$LayoutParams0.isItemChanged()) {
            this.d -= this.f.c.getDecoratedMeasurement(view0);
        }
        if(v == 1) {
            this.b = 0x80000000;
        }
        this.c = 0x80000000;
    }

    public final void l() {
        View view0 = (View)this.a.remove(0);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams0.e = null;
        if(this.a.size() == 0) {
            this.c = 0x80000000;
        }
        if(staggeredGridLayoutManager$LayoutParams0.isItemRemoved() || staggeredGridLayoutManager$LayoutParams0.isItemChanged()) {
            this.d -= this.f.c.getDecoratedMeasurement(view0);
        }
        this.b = 0x80000000;
    }

    public final void m(View view0) {
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams0.e = this;
        this.a.add(0, view0);
        this.b = 0x80000000;
        if(this.a.size() == 1) {
            this.c = 0x80000000;
        }
        if(staggeredGridLayoutManager$LayoutParams0.isItemRemoved() || staggeredGridLayoutManager$LayoutParams0.isItemChanged()) {
            int v = this.d;
            this.d = this.f.c.getDecoratedMeasurement(view0) + v;
        }
    }
}

