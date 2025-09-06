package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import g5.m;
import java.util.Arrays;

public final class c extends OnScrollListener {
    public a a;
    public final ViewPager2 b;
    public final m c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final g5.c g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public c(ViewPager2 viewPager20) {
        this.b = viewPager20;
        this.c = viewPager20.j;
        this.d = (LinearLayoutManager)viewPager20.j.getLayoutManager();
        this.g = new g5.c();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.c();
    }

    public final void a(int v) {
        a a0 = this.a;
        if(a0 != null) {
            a0.onPageSelected(v);
        }
    }

    public final void b(int v) {
        if(this.e == 3 && this.f == 0) {
            return;
        }
        if(this.f == v) {
            return;
        }
        this.f = v;
        a a0 = this.a;
        if(a0 != null) {
            a0.onPageScrollStateChanged(v);
        }
    }

    public final void c() {
        this.e = 0;
        this.f = 0;
        this.g.a = -1;
        this.g.b = 0.0f;
        this.g.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void d(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int v = this.i;
        if(v != -1) {
            this.h = v;
            this.i = -1;
        }
        else if(this.h == -1) {
            this.h = this.d.findFirstVisibleItemPosition();
        }
        this.b(1);
    }

    public final void e() {
        int v16;
        int v14;
        int v13;
        int v12;
        int v11;
        int v8;
        LinearLayoutManager linearLayoutManager0 = this.d;
        int v = linearLayoutManager0.findFirstVisibleItemPosition();
        g5.c c0 = this.g;
        c0.a = v;
        float f = 0.0f;
        if(v == -1) {
            c0.a = -1;
            c0.b = 0.0f;
            c0.c = 0;
            return;
        }
        View view0 = linearLayoutManager0.findViewByPosition(v);
        if(view0 == null) {
            c0.a = -1;
            c0.b = 0.0f;
            c0.c = 0;
            return;
        }
        int v2 = linearLayoutManager0.getLeftDecorationWidth(view0);
        int v3 = linearLayoutManager0.getRightDecorationWidth(view0);
        int v4 = linearLayoutManager0.getTopDecorationHeight(view0);
        int v5 = linearLayoutManager0.getBottomDecorationHeight(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            v2 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
            v3 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
            v4 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin;
            v5 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
        }
        int v6 = view0.getHeight() + v4 + v5;
        int v7 = view0.getWidth();
        m m0 = this.c;
        if(linearLayoutManager0.getOrientation() == 0) {
            v8 = view0.getLeft() - v2 - m0.getPaddingLeft();
            if(this.b.g.getLayoutDirection() == 1) {
                v8 = -v8;
            }
            v6 = v7 + v2 + v3;
        }
        else {
            v8 = view0.getTop() - v4 - m0.getPaddingTop();
        }
        c0.c = -v8;
        if(-v8 < 0) {
            int v9 = linearLayoutManager0.getChildCount();
            if(v9 == 0) {
            label_80:
                if(linearLayoutManager0.getChildCount() <= 1) {
                    v16 = linearLayoutManager0.getChildCount();
                label_82:
                    for(int v1 = 0; v1 < v16; ++v1) {
                        if(g5.a.a(linearLayoutManager0.getChildAt(v1))) {
                            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        }
                    }
                }
            }
            else {
                boolean z = linearLayoutManager0.getOrientation() == 0;
                int[][] arr2_v = new int[v9][2];
                for(int v10 = 0; v10 < v9; ++v10) {
                    View view1 = linearLayoutManager0.getChildAt(v10);
                    if(view1 == null) {
                        throw new IllegalStateException("null view contained in the view hierarchy");
                    }
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = view1.getLayoutParams();
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1) : g5.a.a;
                    int[] arr_v = arr2_v[v10];
                    if(z) {
                        v11 = view1.getLeft();
                        v12 = viewGroup$MarginLayoutParams0.leftMargin;
                    }
                    else {
                        v11 = view1.getTop();
                        v12 = viewGroup$MarginLayoutParams0.topMargin;
                    }
                    arr_v[0] = v11 - v12;
                    int[] arr_v1 = arr2_v[v10];
                    if(z) {
                        v13 = view1.getRight();
                        v14 = viewGroup$MarginLayoutParams0.rightMargin;
                    }
                    else {
                        v13 = view1.getBottom();
                        v14 = viewGroup$MarginLayoutParams0.bottomMargin;
                    }
                    arr_v1[1] = v13 + v14;
                }
                Arrays.sort(arr2_v, new androidx.constraintlayout.core.c(11));
                int v15 = 1;
                while(v15 < v9) {
                    if(arr2_v[v15 - 1][1] == arr2_v[v15][0]) {
                        ++v15;
                        continue;
                    }
                    v16 = linearLayoutManager0.getChildCount();
                    goto label_82;
                }
                int[] arr_v2 = arr2_v[0];
                if(arr_v2[0] > 0 || arr2_v[v9 - 1][1] < arr_v2[1] - arr_v2[0]) {
                    v16 = linearLayoutManager0.getChildCount();
                    goto label_82;
                }
                goto label_80;
            }
            throw new IllegalStateException("Page can only be offset by a positive amount, not by " + c0.c);
        }
        if(v6 != 0) {
            f = ((float)(-v8)) / ((float)v6);
        }
        c0.b = f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView0, int v) {
        int v1 = this.e;
        boolean z = true;
        if((v1 != 1 || this.f != 1) && v == 1) {
            this.d(false);
            return;
        }
        if((v1 == 1 || v1 == 4) && v == 2) {
            if(this.k) {
                this.b(2);
                this.j = true;
            }
            return;
        }
        if(v1 != 1 && v1 != 4) {
            z = false;
        }
        g5.c c0 = this.g;
        if(z && v == 0) {
            this.e();
            if(!this.k) {
                int v2 = c0.a;
                if(v2 != -1) {
                    a a0 = this.a;
                    if(a0 != null) {
                        a0.onPageScrolled(v2, 0.0f, 0);
                    }
                }
                this.b(0);
                this.c();
            }
            else if(c0.c == 0) {
                int v3 = c0.a;
                if(this.h != v3) {
                    this.a(v3);
                }
                this.b(0);
                this.c();
            }
        }
        if(this.e == 2 && v == 0 && this.l) {
            this.e();
            if(c0.c == 0) {
                int v4 = c0.a;
                if(this.i != v4) {
                    if(v4 == -1) {
                        v4 = 0;
                    }
                    this.a(v4);
                }
                this.b(0);
                this.c();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        this.k = true;
        this.e();
        g5.c c0 = this.g;
        if(this.j) {
            this.j = false;
            int v2 = v1 <= 0 && (v1 != 0 || (v >= 0 ? 0 : 1) != (this.b.g.getLayoutDirection() == 1 ? 1 : 0)) || c0.c == 0 ? c0.a : c0.a + 1;
            this.i = v2;
            if(this.h != v2) {
                this.a(v2);
            }
        }
        else if(this.e == 0) {
            this.a((c0.a == -1 ? 0 : c0.a));
        }
        int v3 = c0.a == -1 ? 0 : c0.a;
        float f = c0.b;
        int v4 = c0.c;
        a a0 = this.a;
        if(a0 != null) {
            a0.onPageScrolled(v3, f, v4);
        }
        if((c0.a == this.i || this.i == -1) && c0.c == 0 && this.f != 1) {
            this.b(0);
            this.c();
        }
    }
}

