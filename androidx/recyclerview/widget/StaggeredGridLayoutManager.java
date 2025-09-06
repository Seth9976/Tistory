package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public f2 e;
        public boolean f;

        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
        }

        public final int getSpanIndex() {
            return this.e == null ? -1 : this.e.e;
        }

        public boolean isFullSpan() {
            return this.f;
        }

        public void setFullSpan(boolean z) {
            this.f = z;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public ArrayList g;
        public boolean h;
        public boolean i;
        public boolean j;

        static {
            SavedState.CREATOR = new e2();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState() {
        }

        public SavedState(SavedState staggeredGridLayoutManager$SavedState0) {
            this.c = staggeredGridLayoutManager$SavedState0.c;
            this.a = staggeredGridLayoutManager$SavedState0.a;
            this.b = staggeredGridLayoutManager$SavedState0.b;
            this.d = staggeredGridLayoutManager$SavedState0.d;
            this.e = staggeredGridLayoutManager$SavedState0.e;
            this.f = staggeredGridLayoutManager$SavedState0.f;
            this.h = staggeredGridLayoutManager$SavedState0.h;
            this.i = staggeredGridLayoutManager$SavedState0.i;
            this.j = staggeredGridLayoutManager$SavedState0.j;
            this.g = staggeredGridLayoutManager$SavedState0.g;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
            if(this.c > 0) {
                parcel0.writeIntArray(this.d);
            }
            parcel0.writeInt(this.e);
            if(this.e > 0) {
                parcel0.writeIntArray(this.f);
            }
            parcel0.writeInt(((int)this.h));
            parcel0.writeInt(((int)this.i));
            parcel0.writeInt(((int)this.j));
            parcel0.writeList(this.g);
        }
    }

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int a;
    public f2[] b;
    public OrientationHelper c;
    public OrientationHelper d;
    public int e;
    public int f;
    public final p0 g;
    public boolean h;
    public boolean i;
    public BitSet j;
    public int k;
    public int l;
    public final d2 m;
    public int n;
    public boolean o;
    public boolean p;
    public SavedState q;
    public int r;
    public final Rect s;
    public final b2 t;
    public boolean u;
    public final boolean v;
    public int[] w;
    public final f1 x;

    public StaggeredGridLayoutManager(int v, int v1) {
        this.a = -1;
        this.h = false;
        this.i = false;
        this.k = -1;
        this.l = 0x80000000;
        this.m = new d2();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.n = 2;
        this.s = new Rect();
        this.t = new b2(this);
        this.u = false;
        this.v = true;
        this.x = new f1(this, 2);
        this.e = v1;
        this.setSpanCount(v);
        this.g = new p0();
        this.c = OrientationHelper.createOrientationHelper(this, this.e);
        this.d = OrientationHelper.createOrientationHelper(this, 1 - this.e);
    }

    public StaggeredGridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.a = -1;
        this.h = false;
        this.i = false;
        this.k = -1;
        this.l = 0x80000000;
        this.m = new d2();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.n = 2;
        this.s = new Rect();
        this.t = new b2(this);
        this.u = false;
        this.v = true;
        this.x = new f1(this, 2);
        Properties recyclerView$LayoutManager$Properties0 = LayoutManager.getProperties(context0, attributeSet0, v, v1);
        this.setOrientation(recyclerView$LayoutManager$Properties0.orientation);
        this.setSpanCount(recyclerView$LayoutManager$Properties0.spanCount);
        this.setReverseLayout(recyclerView$LayoutManager$Properties0.reverseLayout);
        this.g = new p0();
        this.c = OrientationHelper.createOrientationHelper(this, this.e);
        this.d = OrientationHelper.createOrientationHelper(this, 1 - this.e);
    }

    public final void A() {
        if(this.e != 1 && this.isLayoutRTL()) {
            this.i = !this.h;
            return;
        }
        this.i = this.h;
    }

    public final void B(int v) {
        this.g.e = v;
        this.g.d = this.i == (v == -1) ? 1 : -1;
    }

    public final void C(int v, int v1) {
        for(int v2 = 0; v2 < this.a; ++v2) {
            if(!this.b[v2].a.isEmpty()) {
                this.E(this.b[v2], v, v1);
            }
        }
    }

    public final void D(int v, State recyclerView$State0) {
        int v3;
        int v2;
        p0 p00 = this.g;
        boolean z = false;
        p00.b = 0;
        p00.c = v;
        if(this.isSmoothScrolling()) {
            int v1 = recyclerView$State0.getTargetScrollPosition();
            if(v1 == -1) {
                v2 = 0;
                v3 = 0;
            }
            else if(this.i == v1 < v) {
                v2 = this.c.getTotalSpace();
                v3 = 0;
            }
            else {
                v3 = this.c.getTotalSpace();
                v2 = 0;
            }
        }
        else {
            v2 = 0;
            v3 = 0;
        }
        if(this.getClipToPadding()) {
            p00.f = this.c.getStartAfterPadding() - v3;
            p00.g = this.c.getEndAfterPadding() + v2;
        }
        else {
            p00.g = this.c.getEnd() + v2;
            p00.f = -v3;
        }
        p00.h = false;
        p00.a = true;
        if(this.c.getMode() == 0 && this.c.getEnd() == 0) {
            z = true;
        }
        p00.i = z;
    }

    public final void E(f2 f20, int v, int v1) {
        int v2 = f20.d;
        int v3 = f20.e;
        if(v == -1) {
            int v4 = f20.b;
            if(v4 == 0x80000000) {
                f20.c();
                v4 = f20.b;
            }
            if(v4 + v2 <= v1) {
                this.j.set(v3, false);
            }
        }
        else {
            int v5 = f20.c;
            if(v5 == 0x80000000) {
                f20.b();
                v5 = f20.c;
            }
            if(v5 - v2 >= v1) {
                this.j.set(v3, false);
            }
        }
    }

    public static int F(int v, int v1, int v2) {
        if(v1 == 0 && v2 == 0) {
            return v;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return v3 == 0x80000000 || v3 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(v) - v1 - v2), v3) : v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void assertNotInLayoutOrScroll(String s) {
        if(this.q == null) {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
        return recyclerView$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v6;
        int v5;
        p0 p00;
        if(this.e != 0) {
            v = v1;
        }
        if(this.getChildCount() != 0 && v != 0) {
            this.w(v, recyclerView$State0);
            if(this.w == null || this.w.length < this.a) {
                this.w = new int[this.a];
            }
            int v4 = 0;
            for(int v3 = 0; true; ++v3) {
                p00 = this.g;
                if(v3 >= this.a) {
                    break;
                }
                if(p00.d == -1) {
                    v5 = p00.f;
                    v6 = this.b[v3].j(v5);
                }
                else {
                    v5 = this.b[v3].h(p00.g);
                    v6 = p00.g;
                }
                int v7 = v5 - v6;
                if(v7 >= 0) {
                    this.w[v4] = v7;
                    ++v4;
                }
            }
            Arrays.sort(this.w, 0, v4);
            for(int v2 = 0; v2 < v4 && (p00.c >= 0 && p00.c < recyclerView$State0.getItemCount()); ++v2) {
                recyclerView$LayoutManager$LayoutPrefetchRegistry0.addPosition(p00.c, this.w[v2]);
                p00.c += p00.d;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollExtent(State recyclerView$State0) {
        return this.f(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollOffset(State recyclerView$State0) {
        return this.g(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollRange(State recyclerView$State0) {
        return this.h(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int v) {
        int v1 = this.d(v);
        PointF pointF0 = new PointF();
        if(v1 == 0) {
            return null;
        }
        if(this.e == 0) {
            pointF0.x = (float)v1;
            pointF0.y = 0.0f;
            return pointF0;
        }
        pointF0.x = 0.0f;
        pointF0.y = (float)v1;
        return pointF0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollExtent(State recyclerView$State0) {
        return this.f(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollOffset(State recyclerView$State0) {
        return this.g(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollRange(State recyclerView$State0) {
        return this.h(recyclerView$State0);
    }

    public final int d(int v) {
        if(this.getChildCount() == 0) {
            return this.i ? 1 : -1;
        }
        return v < this.n() == this.i ? 1 : -1;
    }

    public final boolean e() {
        int v1;
        int v;
        if(this.getChildCount() != 0 && this.n != 0 && this.isAttachedToWindow()) {
            if(this.i) {
                v = this.o();
                v1 = this.n();
            }
            else {
                v = this.n();
                v1 = this.o();
            }
            d2 d20 = this.m;
            if(v == 0 && this.s() != null) {
                d20.b();
                this.requestSimpleAnimationsInNextLayout();
                this.requestLayout();
                return true;
            }
            if(!this.u) {
                return false;
            }
            int v2 = this.i ? -1 : 1;
            c2 c20 = d20.e(v, v1 + 1, v2);
            if(c20 == null) {
                this.u = false;
                d20.d(v1 + 1);
                return false;
            }
            c2 c21 = d20.e(v, c20.a, -v2);
            if(c21 == null) {
                d20.d(c20.a);
            }
            else {
                d20.d(c21.a + 1);
            }
            this.requestSimpleAnimationsInNextLayout();
            this.requestLayout();
            return true;
        }
        return false;
    }

    public final int f(State recyclerView$State0) {
        return this.getChildCount() == 0 ? 0 : v1.a(recyclerView$State0, this.c, this.k(!this.v), this.j(!this.v), this, this.v);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.a];
        }
        else if(arr_v.length >= this.a) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.a + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.a; ++v) {
            f2 f20 = this.b[v];
            arr_v[v] = f20.f.h ? f20.g(f20.a.size() - 1, -1, true, true, false) : f20.g(0, f20.a.size(), true, true, false);
        }
        return arr_v;
    }

    public int[] findFirstVisibleItemPositions(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.a];
        }
        else if(arr_v.length >= this.a) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.a + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.a; ++v) {
            f2 f20 = this.b[v];
            arr_v[v] = f20.f.h ? f20.g(f20.a.size() - 1, -1, false, true, false) : f20.g(0, f20.a.size(), false, true, false);
        }
        return arr_v;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.a];
        }
        else if(arr_v.length >= this.a) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.a + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.a; ++v) {
            f2 f20 = this.b[v];
            arr_v[v] = f20.f.h ? f20.g(0, f20.a.size(), true, true, false) : f20.g(f20.a.size() - 1, -1, true, true, false);
        }
        return arr_v;
    }

    public int[] findLastVisibleItemPositions(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.a];
        }
        else if(arr_v.length >= this.a) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.a + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.a; ++v) {
            f2 f20 = this.b[v];
            arr_v[v] = f20.f.h ? f20.g(0, f20.a.size(), false, true, false) : f20.g(f20.a.size() - 1, -1, false, true, false);
        }
        return arr_v;
    }

    public final int g(State recyclerView$State0) {
        return this.getChildCount() == 0 ? 0 : v1.b(recyclerView$State0, this.c, this.k(!this.v), this.j(!this.v), this, this.v, this.i);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.e == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(Context context0, AttributeSet attributeSet0) {
        return new LayoutParams(context0, attributeSet0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    public int getGapStrategy() {
        return this.n;
    }

    public int getOrientation() {
        return this.e;
    }

    public boolean getReverseLayout() {
        return this.h;
    }

    public int getSpanCount() {
        return this.a;
    }

    public final int h(State recyclerView$State0) {
        return this.getChildCount() == 0 ? 0 : v1.c(recyclerView$State0, this.c, this.k(!this.v), this.j(!this.v), this, this.v);
    }

    // This method was un-flattened
    public final int i(Recycler recyclerView$Recycler0, p0 p00, State recyclerView$State0) {
        int v39;
        int v37;
        LayoutParams staggeredGridLayoutManager$LayoutParams1;
        View view1;
        int v35;
        int v34;
        int v24;
        int v23;
        int v15;
        int v6;
        int v5;
        int v4;
        f2 f20;
        int v;
        this.j.set(0, this.a, true);
        p0 p01 = this.g;
        if(!p01.i) {
            v = p00.e == 1 ? p00.g + p00.b : p00.f - p00.b;
        }
        else if(p00.e == 1) {
            v = 0x7FFFFFFF;
        }
        else {
            v = 0x80000000;
        }
        this.C(p00.e, v);
        int v1 = this.i ? this.c.getEndAfterPadding() : this.c.getStartAfterPadding();
        boolean z = false;
        while(p00.c >= 0 && p00.c < recyclerView$State0.getItemCount() && (p01.i || !this.j.isEmpty())) {
            View view0 = recyclerView$Recycler0.getViewForPosition(p00.c);
            p00.c += p00.d;
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = staggeredGridLayoutManager$LayoutParams0.getViewLayoutPosition();
            d2 d20 = this.m;
            int v3 = d20.a == null || v2 >= d20.a.length ? -1 : d20.a[v2];
            boolean z1 = v3 == -1;
            if(z1) {
                if(staggeredGridLayoutManager$LayoutParams0.f) {
                    f20 = this.b[0];
                }
                else {
                    if(this.v(p00.e)) {
                        v4 = this.a - 1;
                        v5 = -1;
                        v6 = -1;
                    }
                    else {
                        v5 = this.a;
                        v4 = 0;
                        v6 = 1;
                    }
                    f2 f21 = null;
                    if(p00.e == 1) {
                        int v7 = this.c.getStartAfterPadding();
                        int v8 = 0x7FFFFFFF;
                        while(v4 != v5) {
                            f2 f22 = this.b[v4];
                            int v9 = f22.h(v7);
                            if(v9 < v8) {
                                v8 = v9;
                                f21 = f22;
                            }
                            v4 += v6;
                        }
                    }
                    else {
                        int v10 = this.c.getEndAfterPadding();
                        int v11 = 0x80000000;
                        while(v4 != v5) {
                            f2 f23 = this.b[v4];
                            int v12 = f23.j(v10);
                            if(v12 > v11) {
                                f21 = f23;
                                v11 = v12;
                            }
                            v4 += v6;
                        }
                    }
                    f20 = f21;
                }
                d20.c(v2);
                d20.a[v2] = f20.e;
            }
            else {
                f20 = this.b[v3];
            }
            staggeredGridLayoutManager$LayoutParams0.e = f20;
            if(p00.e == 1) {
                this.addView(view0);
            }
            else {
                this.addView(view0, 0);
            }
            if(!staggeredGridLayoutManager$LayoutParams0.f) {
                v15 = v;
                if(this.e == 1) {
                    int v17 = LayoutManager.getChildMeasureSpec(this.f, this.getWidthMode(), 0, staggeredGridLayoutManager$LayoutParams0.width, false);
                    int v18 = this.getPaddingTop();
                    this.t(v17, view0, LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingBottom() + v18, staggeredGridLayoutManager$LayoutParams0.height, true));
                }
                else {
                    int v19 = this.getPaddingLeft();
                    this.t(LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingRight() + v19, staggeredGridLayoutManager$LayoutParams0.width, true), view0, LayoutManager.getChildMeasureSpec(this.f, this.getHeightMode(), 0, staggeredGridLayoutManager$LayoutParams0.height, false));
                }
            }
            else if(this.e == 1) {
                int v13 = this.r;
                int v14 = this.getPaddingTop();
                v15 = v;
                this.t(v13, view0, LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingBottom() + v14, staggeredGridLayoutManager$LayoutParams0.height, true));
            }
            else {
                v15 = v;
                int v16 = this.getPaddingLeft();
                this.t(LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingRight() + v16, staggeredGridLayoutManager$LayoutParams0.width, true), view0, this.r);
            }
            if(p00.e == 1) {
                int v20 = staggeredGridLayoutManager$LayoutParams0.f ? this.p(v1) : f20.h(v1);
                int v21 = this.c.getDecoratedMeasurement(view0);
                if(z1 && staggeredGridLayoutManager$LayoutParams0.f) {
                    c2 c20 = new c2();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c20.c = new int[this.a];
                    for(int v22 = 0; v22 < this.a; ++v22) {
                        int[] arr_v = c20.c;
                        arr_v[v22] = v20 - this.b[v22].h(v20);
                    }
                    c20.b = -1;
                    c20.a = v2;
                    d20.a(c20);
                }
                v23 = v21 + v20;
                v24 = v20;
            }
            else {
                int v25 = staggeredGridLayoutManager$LayoutParams0.f ? this.q(v1) : f20.j(v1);
                v24 = v25 - this.c.getDecoratedMeasurement(view0);
                if(z1 && staggeredGridLayoutManager$LayoutParams0.f) {
                    c2 c21 = new c2();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c21.c = new int[this.a];
                    for(int v26 = 0; v26 < this.a; ++v26) {
                        int[] arr_v1 = c21.c;
                        arr_v1[v26] = this.b[v26].j(v25) - v25;
                    }
                    c21.b = 1;
                    c21.a = v2;
                    d20.a(c21);
                }
                v23 = v25;
            }
            if(staggeredGridLayoutManager$LayoutParams0.f && p00.d == -1) {
                if(!z1) {
                    if(p00.e == 1) {
                        int v27 = this.b[0].h(0x80000000);
                        int v28 = 1;
                        while(v28 < this.a) {
                            if(this.b[v28].h(0x80000000) != v27) {
                                goto label_135;
                            }
                            ++v28;
                        }
                        goto label_141;
                    }
                    else {
                        int v29 = this.b[0].j(0x80000000);
                        int v30 = 1;
                        while(true) {
                            if(v30 >= this.a) {
                                goto label_141;
                            }
                            if(this.b[v30].j(0x80000000) != v29) {
                                break;
                            }
                            ++v30;
                        }
                    }
                label_135:
                    c2 c22 = d20.f(v2);
                    if(c22 != null) {
                        c22.d = true;
                    }
                }
                this.u = true;
            }
        label_141:
            if(p00.e == 1) {
                if(staggeredGridLayoutManager$LayoutParams0.f) {
                    for(int v31 = this.a - 1; v31 >= 0; --v31) {
                        this.b[v31].a(view0);
                    }
                }
                else {
                    staggeredGridLayoutManager$LayoutParams0.e.a(view0);
                }
            }
            else if(staggeredGridLayoutManager$LayoutParams0.f) {
                for(int v32 = this.a - 1; v32 >= 0; --v32) {
                    this.b[v32].m(view0);
                }
            }
            else {
                staggeredGridLayoutManager$LayoutParams0.e.m(view0);
            }
            if(!this.isLayoutRTL() || this.e != 1) {
                int v36 = staggeredGridLayoutManager$LayoutParams0.f ? this.d.getStartAfterPadding() : f20.e * this.f + this.d.getStartAfterPadding();
                v35 = v36;
                v34 = this.d.getDecoratedMeasurement(view0) + v36;
            }
            else {
                int v33 = staggeredGridLayoutManager$LayoutParams0.f ? this.d.getEndAfterPadding() : this.d.getEndAfterPadding() - (this.a - 1 - f20.e) * this.f;
                v34 = v33;
                v35 = v33 - this.d.getDecoratedMeasurement(view0);
            }
            if(this.e == 1) {
                view1 = view0;
                this.layoutDecoratedWithMargins(view0, v35, v24, v34, v23);
                staggeredGridLayoutManager$LayoutParams1 = staggeredGridLayoutManager$LayoutParams0;
            }
            else {
                view1 = view0;
                staggeredGridLayoutManager$LayoutParams1 = staggeredGridLayoutManager$LayoutParams0;
                this.layoutDecoratedWithMargins(view1, v24, v35, v23, v34);
            }
            if(staggeredGridLayoutManager$LayoutParams1.f) {
                v37 = v15;
                this.C(p01.e, v37);
            }
            else {
                v37 = v15;
                this.E(f20, p01.e, v37);
            }
            this.x(recyclerView$Recycler0, p01);
            if(p01.h && view1.hasFocusable()) {
                if(staggeredGridLayoutManager$LayoutParams1.f) {
                    this.j.clear();
                }
                else {
                    this.j.set(f20.e, false);
                }
            }
            z = true;
            v = v37;
        }
        if(!z) {
            this.x(recyclerView$Recycler0, p01);
        }
        if(p01.e == -1) {
            int v38 = this.q(this.c.getStartAfterPadding());
            v39 = this.c.getStartAfterPadding() - v38;
            return v39 <= 0 ? 0 : Math.min(p00.b, v39);
        }
        v39 = this.p(this.c.getEndAfterPadding()) - this.c.getEndAfterPadding();
        return v39 <= 0 ? 0 : Math.min(p00.b, v39);
    }

    public void invalidateSpanAssignments() {
        this.m.b();
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    public final boolean isLayoutRTL() {
        return this.getLayoutDirection() == 1;
    }

    public final View j(boolean z) {
        int v = this.c.getStartAfterPadding();
        int v1 = this.c.getEndAfterPadding();
        int v2 = this.getChildCount() - 1;
        View view0 = null;
        while(v2 >= 0) {
            View view1 = this.getChildAt(v2);
            int v3 = this.c.getDecoratedStart(view1);
            int v4 = this.c.getDecoratedEnd(view1);
            if(v4 > v && v3 < v1) {
                if(v4 <= v1 || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
            --v2;
        }
        return view0;
    }

    public final View k(boolean z) {
        int v = this.c.getStartAfterPadding();
        int v1 = this.c.getEndAfterPadding();
        int v2 = this.getChildCount();
        View view0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = this.getChildAt(v3);
            int v4 = this.c.getDecoratedStart(view1);
            if(this.c.getDecoratedEnd(view1) > v && v4 < v1) {
                if(v4 >= v || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
        }
        return view0;
    }

    public final void l(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v = this.p(0x80000000);
        if(v == 0x80000000) {
            return;
        }
        int v1 = this.c.getEndAfterPadding() - v;
        if(v1 > 0) {
            int v2 = v1 - -this.scrollBy(-v1, recyclerView$Recycler0, recyclerView$State0);
            if(z && v2 > 0) {
                this.c.offsetChildren(v2);
            }
        }
    }

    public final void m(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v = this.q(0x7FFFFFFF);
        if(v == 0x7FFFFFFF) {
            return;
        }
        int v1 = v - this.c.getStartAfterPadding();
        if(v1 > 0) {
            int v2 = v1 - this.scrollBy(v1, recyclerView$Recycler0, recyclerView$State0);
            if(z && v2 > 0) {
                this.c.offsetChildren(-v2);
            }
        }
    }

    public final int n() {
        return this.getChildCount() == 0 ? 0 : this.getPosition(this.getChildAt(0));
    }

    public final int o() {
        int v = this.getChildCount();
        return v == 0 ? 0 : this.getPosition(this.getChildAt(v - 1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void offsetChildrenHorizontal(int v) {
        super.offsetChildrenHorizontal(v);
        for(int v1 = 0; v1 < this.a; ++v1) {
            f2 f20 = this.b[v1];
            int v2 = f20.b;
            if(v2 != 0x80000000) {
                f20.b = v2 + v;
            }
            int v3 = f20.c;
            if(v3 != 0x80000000) {
                f20.c = v3 + v;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void offsetChildrenVertical(int v) {
        super.offsetChildrenVertical(v);
        for(int v1 = 0; v1 < this.a; ++v1) {
            f2 f20 = this.b[v1];
            int v2 = f20.b;
            if(v2 != 0x80000000) {
                f20.b = v2 + v;
            }
            int v3 = f20.c;
            if(v3 != 0x80000000) {
                f20.c = v3 + v;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onAdapterChanged(@Nullable Adapter recyclerView$Adapter0, @Nullable Adapter recyclerView$Adapter1) {
        this.m.b();
        for(int v = 0; v < this.a; ++v) {
            this.b[v].d();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.onDetachedFromWindow(recyclerView0, recyclerView$Recycler0);
        this.removeCallbacks(this.x);
        for(int v = 0; v < this.a; ++v) {
            this.b[v].d();
        }
        recyclerView0.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v1;
        if(this.getChildCount() == 0) {
            return null;
        }
        View view1 = this.findContainingItemView(view0);
        if(view1 == null) {
            return null;
        }
        this.A();
        switch(v) {
            case 1: {
                v1 = this.e == 1 || !this.isLayoutRTL() ? -1 : 1;
                break;
            }
            case 2: {
                if(this.e == 1) {
                    v1 = 1;
                }
                else if(this.isLayoutRTL()) {
                    v1 = -1;
                }
                else {
                    v1 = 1;
                }
                break;
            }
            case 17: {
                v1 = this.e == 0 ? -1 : 0x80000000;
                break;
            }
            case 33: {
                v1 = this.e == 1 ? -1 : 0x80000000;
                break;
            }
            case 66: {
                v1 = this.e == 0 ? 1 : 0x80000000;
                break;
            }
            case 130: {
                v1 = this.e == 1 ? 1 : 0x80000000;
                break;
            }
            default: {
                v1 = 0x80000000;
            }
        }
        if(v1 == 0x80000000) {
            return null;
        }
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
        boolean z = staggeredGridLayoutManager$LayoutParams0.f;
        f2 f20 = staggeredGridLayoutManager$LayoutParams0.e;
        int v2 = v1 == 1 ? this.o() : this.n();
        this.D(v2, recyclerView$State0);
        this.B(v1);
        this.g.c = this.g.d + v2;
        this.g.b = (int)(((float)this.c.getTotalSpace()) * 0.333333f);
        this.g.h = true;
        this.g.a = false;
        this.i(recyclerView$Recycler0, this.g, recyclerView$State0);
        this.o = this.i;
        if(!z) {
            View view2 = f20.i(v2, v1);
            if(view2 != null && view2 != view1) {
                return view2;
            }
        }
        if(this.v(v1)) {
            for(int v4 = this.a - 1; v4 >= 0; --v4) {
                View view3 = this.b[v4].i(v2, v1);
                if(view3 != null && view3 != view1) {
                    return view3;
                }
            }
        }
        else {
            for(int v5 = 0; v5 < this.a; ++v5) {
                View view4 = this.b[v5].i(v2, v1);
                if(view4 != null && view4 != view1) {
                    return view4;
                }
            }
        }
        boolean z1 = !this.h == (v1 == -1 ? 1 : 0);
        if(!z) {
            View view5 = this.findViewByPosition((z1 ? f20.e() : f20.f()));
            if(view5 != null && view5 != view1) {
                return view5;
            }
        }
        if(this.v(v1)) {
            for(int v6 = this.a - 1; v6 >= 0; --v6) {
                if(v6 != f20.e) {
                    View view6 = this.findViewByPosition((z1 ? this.b[v6].e() : this.b[v6].f()));
                    if(view6 != null && view6 != view1) {
                        return view6;
                    }
                }
            }
            return null;
        }
        for(int v3 = 0; v3 < this.a; ++v3) {
            View view7 = this.findViewByPosition((z1 ? this.b[v3].e() : this.b[v3].f()));
            if(view7 != null && view7 != view1) {
                return view7;
            }
        }
        return null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        if(this.getChildCount() > 0) {
            View view0 = this.k(false);
            View view1 = this.j(false);
            if(view0 != null && view1 != null) {
                int v = this.getPosition(view0);
                int v1 = this.getPosition(view1);
                if(v < v1) {
                    accessibilityEvent0.setFromIndex(v);
                    accessibilityEvent0.setToIndex(v1);
                    return;
                }
                accessibilityEvent0.setFromIndex(v1);
                accessibilityEvent0.setToIndex(v);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsAdded(RecyclerView recyclerView0, int v, int v1) {
        this.r(v, v1, 1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsChanged(RecyclerView recyclerView0) {
        this.m.b();
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsMoved(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.r(v, v1, 8);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView0, int v, int v1) {
        this.r(v, v1, 2);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.r(v, v1, 4);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onLayoutChildren(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.u(recyclerView$Recycler0, recyclerView$State0, true);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onLayoutCompleted(State recyclerView$State0) {
        super.onLayoutCompleted(recyclerView$State0);
        this.k = -1;
        this.l = 0x80000000;
        this.q = null;
        this.t.a();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.q = (SavedState)parcelable0;
            if(this.k != -1) {
                ((SavedState)parcelable0).a = -1;
                ((SavedState)parcelable0).b = -1;
                ((SavedState)parcelable0).d = null;
                ((SavedState)parcelable0).c = 0;
                ((SavedState)parcelable0).e = 0;
                ((SavedState)parcelable0).f = null;
                ((SavedState)parcelable0).g = null;
            }
            this.requestLayout();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public Parcelable onSaveInstanceState() {
        int v2;
        SavedState staggeredGridLayoutManager$SavedState0 = this.q;
        if(staggeredGridLayoutManager$SavedState0 != null) {
            return new SavedState(staggeredGridLayoutManager$SavedState0);
        }
        Parcelable parcelable0 = new SavedState();
        parcelable0.h = this.h;
        parcelable0.i = this.o;
        parcelable0.j = this.p;
        d2 d20 = this.m;
        if(d20 == null) {
            parcelable0.e = 0;
        }
        else {
            int[] arr_v = d20.a;
            if(arr_v == null) {
                parcelable0.e = 0;
            }
            else {
                parcelable0.f = arr_v;
                parcelable0.e = arr_v.length;
                parcelable0.g = d20.b;
            }
        }
        int v1 = -1;
        if(this.getChildCount() > 0) {
            parcelable0.a = this.o ? this.o() : this.n();
            View view0 = this.i ? this.j(true) : this.k(true);
            if(view0 != null) {
                v1 = this.getPosition(view0);
            }
            parcelable0.b = v1;
            parcelable0.c = this.a;
            parcelable0.d = new int[this.a];
            for(int v = 0; v < this.a; ++v) {
                if(this.o) {
                    v2 = this.b[v].h(0x80000000);
                    if(v2 != 0x80000000) {
                        v2 -= this.c.getEndAfterPadding();
                    }
                }
                else {
                    v2 = this.b[v].j(0x80000000);
                    if(v2 != 0x80000000) {
                        v2 -= this.c.getStartAfterPadding();
                    }
                }
                parcelable0.d[v] = v2;
            }
            return parcelable0;
        }
        parcelable0.a = -1;
        parcelable0.b = -1;
        parcelable0.c = 0;
        return parcelable0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onScrollStateChanged(int v) {
        if(v == 0) {
            this.e();
        }
    }

    public final int p(int v) {
        int v1 = this.b[0].h(v);
        for(int v2 = 1; v2 < this.a; ++v2) {
            int v3 = this.b[v2].h(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    public final int q(int v) {
        int v1 = this.b[0].j(v);
        for(int v2 = 1; v2 < this.a; ++v2) {
            int v3 = this.b[v2].j(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    public final void r(int v, int v1, int v2) {
        int v5;
        int v4;
        int v3 = this.i ? this.o() : this.n();
        if(v2 != 8) {
            v4 = v + v1;
            v5 = v;
        }
        else if(v < v1) {
            v4 = v1 + 1;
            v5 = v;
        }
        else {
            v4 = v + 1;
            v5 = v1;
        }
        d2 d20 = this.m;
        d20.g(v5);
        if(v2 == 1) {
            d20.h(v, v1);
        }
        else {
            switch(v2) {
                case 2: {
                    d20.i(v, v1);
                    break;
                }
                case 8: {
                    d20.i(v, 1);
                    d20.h(v1, 1);
                }
            }
        }
        if(v4 <= v3) {
            return;
        }
        if(v5 <= (this.i ? this.n() : this.o())) {
            this.requestLayout();
        }
    }

    // This method was un-flattened
    public final View s() {
        int v5;
        int v = this.getChildCount();
        int v1 = v - 1;
        BitSet bitSet0 = new BitSet(this.a);
        bitSet0.set(0, this.a, true);
        int v2 = -1;
        int v3 = this.e != 1 || !this.isLayoutRTL() ? -1 : 1;
        if(this.i) {
            v = -1;
        }
        else {
            v1 = 0;
        }
        if(v1 < v) {
            v2 = 1;
        }
        while(v1 != v) {
            View view0 = this.getChildAt(v1);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(bitSet0.get(staggeredGridLayoutManager$LayoutParams0.e.e)) {
                f2 f20 = staggeredGridLayoutManager$LayoutParams0.e;
                if(this.i) {
                    int v4 = f20.c;
                    if(v4 == 0x80000000) {
                        f20.b();
                        v4 = f20.c;
                    }
                    if(v4 < this.c.getEndAfterPadding()) {
                        v5 = !((LayoutParams)((View)f20.a.get(f20.a.size() - 1)).getLayoutParams()).f;
                        goto label_33;
                    }
                }
                else {
                    int v6 = f20.b;
                    if(v6 == 0x80000000) {
                        f20.c();
                        v6 = f20.b;
                    }
                    if(v6 > this.c.getStartAfterPadding()) {
                        v5 = !((LayoutParams)((View)f20.a.get(0)).getLayoutParams()).f;
                        goto label_33;
                    }
                }
                v5 = 0;
            label_33:
                if(v5 != 0) {
                    return view0;
                }
                bitSet0.clear(staggeredGridLayoutManager$LayoutParams0.e.e);
            }
            if(!staggeredGridLayoutManager$LayoutParams0.f) {
                int v7 = v1 + v2;
                if(v7 != v) {
                    View view1 = this.getChildAt(v7);
                    if(this.i) {
                        int v8 = this.c.getDecoratedEnd(view0);
                        int v9 = this.c.getDecoratedEnd(view1);
                        if(v8 < v9) {
                            return view0;
                        }
                        if(v8 == v9) {
                            goto label_52;
                        }
                    }
                    else {
                        int v10 = this.c.getDecoratedStart(view0);
                        int v11 = this.c.getDecoratedStart(view1);
                        if(v10 > v11) {
                            return view0;
                        }
                        if(v10 == v11) {
                        label_52:
                            LayoutParams staggeredGridLayoutManager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                            if((staggeredGridLayoutManager$LayoutParams0.e.e - staggeredGridLayoutManager$LayoutParams1.e.e >= 0 ? 0 : 1) != (v3 >= 0 ? 0 : 1)) {
                                return view0;
                            }
                        }
                    }
                }
            }
            v1 += v2;
        }
        return null;
    }

    public final int scrollBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.getChildCount() != 0 && v != 0) {
            this.w(v, recyclerView$State0);
            p0 p00 = this.g;
            int v1 = this.i(recyclerView$Recycler0, p00, recyclerView$State0);
            if(p00.b >= v1) {
                v = v >= 0 ? v1 : -v1;
            }
            this.c.offsetChildren(-v);
            this.o = this.i;
            p00.b = 0;
            this.x(recyclerView$Recycler0, p00);
            return v;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int scrollHorizontallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.scrollBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void scrollToPosition(int v) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.q;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.a != v) {
            staggeredGridLayoutManager$SavedState0.d = null;
            staggeredGridLayoutManager$SavedState0.c = 0;
            staggeredGridLayoutManager$SavedState0.a = -1;
            staggeredGridLayoutManager$SavedState0.b = -1;
        }
        this.k = v;
        this.l = 0x80000000;
        this.requestLayout();
    }

    public void scrollToPositionWithOffset(int v, int v1) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.q;
        if(staggeredGridLayoutManager$SavedState0 != null) {
            staggeredGridLayoutManager$SavedState0.d = null;
            staggeredGridLayoutManager$SavedState0.c = 0;
            staggeredGridLayoutManager$SavedState0.a = -1;
            staggeredGridLayoutManager$SavedState0.b = -1;
        }
        this.k = v;
        this.l = v1;
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int scrollVerticallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.scrollBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    public void setGapStrategy(int v) {
        this.assertNotInLayoutOrScroll(null);
        if(v == this.n) {
            return;
        }
        if(v != 0 && v != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.n = v;
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void setMeasuredDimension(Rect rect0, int v, int v1) {
        int v7;
        int v6;
        int v2 = this.getPaddingLeft();
        int v3 = this.getPaddingRight() + v2;
        int v4 = this.getPaddingTop();
        int v5 = this.getPaddingBottom() + v4;
        if(this.e == 1) {
            v6 = LayoutManager.chooseSize(v1, rect0.height() + v5, this.getMinimumHeight());
            v7 = LayoutManager.chooseSize(v, this.f * this.a + v3, this.getMinimumWidth());
        }
        else {
            v7 = LayoutManager.chooseSize(v, rect0.width() + v3, this.getMinimumWidth());
            v6 = LayoutManager.chooseSize(v1, this.f * this.a + v5, this.getMinimumHeight());
        }
        this.setMeasuredDimension(v7, v6);
    }

    public void setOrientation(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.assertNotInLayoutOrScroll(null);
        if(v == this.e) {
            return;
        }
        this.e = v;
        OrientationHelper orientationHelper0 = this.c;
        this.c = this.d;
        this.d = orientationHelper0;
        this.requestLayout();
    }

    public void setReverseLayout(boolean z) {
        this.assertNotInLayoutOrScroll(null);
        SavedState staggeredGridLayoutManager$SavedState0 = this.q;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.h != z) {
            staggeredGridLayoutManager$SavedState0.h = z;
        }
        this.h = z;
        this.requestLayout();
    }

    public void setSpanCount(int v) {
        this.assertNotInLayoutOrScroll(null);
        if(v != this.a) {
            this.invalidateSpanAssignments();
            this.a = v;
            this.j = new BitSet(this.a);
            this.b = new f2[this.a];
            for(int v1 = 0; v1 < this.a; ++v1) {
                f2[] arr_f2 = this.b;
                arr_f2[v1] = new f2(this, v1);
            }
            this.requestLayout();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        LinearSmoothScroller linearSmoothScroller0 = new LinearSmoothScroller(recyclerView0.getContext());
        linearSmoothScroller0.setTargetPosition(v);
        this.startSmoothScroll(linearSmoothScroller0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final void t(int v, View view0, int v1) {
        this.calculateItemDecorationsForChild(view0, this.s);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = StaggeredGridLayoutManager.F(v, staggeredGridLayoutManager$LayoutParams0.leftMargin + this.s.left, staggeredGridLayoutManager$LayoutParams0.rightMargin + this.s.right);
        int v3 = StaggeredGridLayoutManager.F(v1, staggeredGridLayoutManager$LayoutParams0.topMargin + this.s.top, staggeredGridLayoutManager$LayoutParams0.bottomMargin + this.s.bottom);
        if(this.shouldMeasureChild(view0, v2, v3, staggeredGridLayoutManager$LayoutParams0)) {
            view0.measure(v2, v3);
        }
    }

    public final void u(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        boolean z1 = true;
        b2 b20 = this.t;
        if((this.q != null || this.k != -1) && recyclerView$State0.getItemCount() == 0) {
            this.removeAndRecycleAllViews(recyclerView$Recycler0);
            b20.a();
            return;
        }
        boolean z2 = !b20.e || this.k != -1 || this.q != null;
        d2 d20 = this.m;
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = b20.g;
        if(z2) {
            b20.a();
            SavedState staggeredGridLayoutManager$SavedState0 = this.q;
            if(staggeredGridLayoutManager$SavedState0 == null) {
                this.A();
                b20.c = this.i;
            }
            else {
                int v = staggeredGridLayoutManager$SavedState0.c;
                if(v > 0) {
                    if(v == this.a) {
                        for(int v1 = 0; v1 < this.a; ++v1) {
                            this.b[v1].d();
                            SavedState staggeredGridLayoutManager$SavedState1 = this.q;
                            int v2 = staggeredGridLayoutManager$SavedState1.d[v1];
                            if(v2 != 0x80000000) {
                                v2 += (staggeredGridLayoutManager$SavedState1.i ? this.c.getEndAfterPadding() : this.c.getStartAfterPadding());
                            }
                            f2 f20 = this.b[v1];
                            f20.b = v2;
                            f20.c = v2;
                        }
                    }
                    else {
                        staggeredGridLayoutManager$SavedState0.d = null;
                        staggeredGridLayoutManager$SavedState0.c = 0;
                        staggeredGridLayoutManager$SavedState0.e = 0;
                        staggeredGridLayoutManager$SavedState0.f = null;
                        staggeredGridLayoutManager$SavedState0.g = null;
                        staggeredGridLayoutManager$SavedState0.a = staggeredGridLayoutManager$SavedState0.b;
                    }
                }
                this.p = this.q.j;
                this.setReverseLayout(this.q.h);
                this.A();
                SavedState staggeredGridLayoutManager$SavedState2 = this.q;
                int v3 = staggeredGridLayoutManager$SavedState2.a;
                if(v3 == -1) {
                    b20.c = this.i;
                }
                else {
                    this.k = v3;
                    b20.c = staggeredGridLayoutManager$SavedState2.i;
                }
                if(staggeredGridLayoutManager$SavedState2.e > 1) {
                    d20.a = staggeredGridLayoutManager$SavedState2.f;
                    d20.b = staggeredGridLayoutManager$SavedState2.g;
                }
            }
            if(recyclerView$State0.isPreLayout()) {
            label_97:
                int v9 = 0;
                if(this.o) {
                    int v10 = recyclerView$State0.getItemCount();
                    for(int v11 = this.getChildCount() - 1; v11 >= 0; --v11) {
                        int v12 = this.getPosition(this.getChildAt(v11));
                        if(v12 >= 0 && v12 < v10) {
                            v9 = v12;
                            break;
                        }
                    }
                }
                else {
                    int v13 = recyclerView$State0.getItemCount();
                    int v14 = this.getChildCount();
                    for(int v15 = 0; v15 < v14; ++v15) {
                        int v16 = this.getPosition(this.getChildAt(v15));
                        if(v16 >= 0 && v16 < v13) {
                            v9 = v16;
                            break;
                        }
                    }
                }
                b20.a = v9;
                b20.b = 0x80000000;
            }
            else {
                int v4 = this.k;
                if(v4 == -1) {
                    goto label_97;
                }
                else if(v4 < 0 || v4 >= recyclerView$State0.getItemCount()) {
                    this.k = -1;
                    this.l = 0x80000000;
                    goto label_97;
                }
                else if(this.q != null && this.q.a != -1 && this.q.c >= 1) {
                    b20.b = 0x80000000;
                    b20.a = this.k;
                }
                else {
                    View view0 = this.findViewByPosition(this.k);
                    if(view0 == null) {
                        int v7 = this.k;
                        b20.a = v7;
                        int v8 = this.l;
                        if(v8 == 0x80000000) {
                            boolean z3 = this.d(v7) == 1;
                            b20.c = z3;
                            b20.b = z3 ? staggeredGridLayoutManager0.c.getEndAfterPadding() : staggeredGridLayoutManager0.c.getStartAfterPadding();
                        }
                        else if(b20.c) {
                            b20.b = staggeredGridLayoutManager0.c.getEndAfterPadding() - v8;
                        }
                        else {
                            b20.b = staggeredGridLayoutManager0.c.getStartAfterPadding() + v8;
                        }
                        b20.d = true;
                    }
                    else {
                        b20.a = this.i ? this.o() : this.n();
                        if(this.l == 0x80000000) {
                            if(this.c.getDecoratedMeasurement(view0) > this.c.getTotalSpace()) {
                                b20.b = b20.c ? this.c.getEndAfterPadding() : this.c.getStartAfterPadding();
                            }
                            else {
                                int v5 = this.c.getDecoratedStart(view0) - this.c.getStartAfterPadding();
                                if(v5 < 0) {
                                    b20.b = -v5;
                                }
                                else {
                                    int v6 = this.c.getEndAfterPadding() - this.c.getDecoratedEnd(view0);
                                    b20.b = v6 < 0 ? v6 : 0x80000000;
                                }
                            }
                        }
                        else if(b20.c) {
                            b20.b = this.c.getEndAfterPadding() - this.l - this.c.getDecoratedEnd(view0);
                        }
                        else {
                            b20.b = this.c.getStartAfterPadding() + this.l - this.c.getDecoratedStart(view0);
                        }
                    }
                }
            }
            b20.e = true;
        }
        if(this.q == null && this.k == -1 && (b20.c != this.o || this.isLayoutRTL() != this.p)) {
            d20.b();
            b20.d = true;
        }
        if(this.getChildCount() > 0 && (this.q == null || this.q.c < 1)) {
            if(b20.d) {
                for(int v17 = 0; v17 < this.a; ++v17) {
                    this.b[v17].d();
                    int v18 = b20.b;
                    if(v18 != 0x80000000) {
                        f2 f21 = this.b[v17];
                        f21.b = v18;
                        f21.c = v18;
                    }
                }
            }
            else if(z2 || b20.f == null) {
                for(int v21 = 0; v21 < this.a; ++v21) {
                    f2 f23 = this.b[v21];
                    boolean z4 = this.i;
                    int v22 = b20.b;
                    int v23 = z4 ? f23.h(0x80000000) : f23.j(0x80000000);
                    f23.d();
                    if(v23 != 0x80000000 && ((!z4 || v23 >= f23.f.c.getEndAfterPadding()) && (z4 || v23 <= f23.f.c.getStartAfterPadding()))) {
                        if(v22 != 0x80000000) {
                            v23 += v22;
                        }
                        f23.c = v23;
                        f23.b = v23;
                    }
                }
                f2[] arr_f2 = this.b;
                if(b20.f == null || b20.f.length < arr_f2.length) {
                    b20.f = new int[staggeredGridLayoutManager0.b.length];
                }
                for(int v24 = 0; v24 < arr_f2.length; ++v24) {
                    int[] arr_v = b20.f;
                    arr_v[v24] = arr_f2[v24].j(0x80000000);
                }
            }
            else {
                for(int v19 = 0; v19 < this.a; ++v19) {
                    f2 f22 = this.b[v19];
                    f22.d();
                    int v20 = b20.f[v19];
                    f22.b = v20;
                    f22.c = v20;
                }
            }
        }
        this.detachAndScrapAttachedViews(recyclerView$Recycler0);
        p0 p00 = this.g;
        p00.a = false;
        this.u = false;
        int v25 = this.d.getTotalSpace();
        this.f = v25 / this.a;
        this.r = View.MeasureSpec.makeMeasureSpec(v25, this.d.getMode());
        this.D(b20.a, recyclerView$State0);
        if(b20.c) {
            this.B(-1);
            this.i(recyclerView$Recycler0, p00, recyclerView$State0);
            this.B(1);
        }
        else {
            this.B(1);
            this.i(recyclerView$Recycler0, p00, recyclerView$State0);
            this.B(-1);
        }
        p00.c = b20.a + p00.d;
        this.i(recyclerView$Recycler0, p00, recyclerView$State0);
        if(this.d.getMode() != 0x40000000) {
            int v26 = this.getChildCount();
            float f = 0.0f;
            for(int v27 = 0; v27 < v26; ++v27) {
                View view1 = this.getChildAt(v27);
                float f1 = (float)this.d.getDecoratedMeasurement(view1);
                if(f1 >= f) {
                    if(((LayoutParams)view1.getLayoutParams()).isFullSpan()) {
                        f1 = f1 * 1.0f / ((float)this.a);
                    }
                    f = Math.max(f, f1);
                }
            }
            int v28 = this.f;
            int v29 = Math.round(f * ((float)this.a));
            v29 = this.d.getMode() == 0x80000000 ? Math.min(v29, this.d.getTotalSpace()) : Math.round(f * ((float)this.a));
            this.f = v29 / this.a;
            this.r = View.MeasureSpec.makeMeasureSpec(v29, this.d.getMode());
            if(this.f != v28) {
                for(int v30 = 0; v30 < v26; ++v30) {
                    View view2 = this.getChildAt(v30);
                    LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                    if(!staggeredGridLayoutManager$LayoutParams0.f) {
                        if(!this.isLayoutRTL() || this.e != 1) {
                            int v32 = this.f * staggeredGridLayoutManager$LayoutParams0.e.e;
                            int v33 = staggeredGridLayoutManager$LayoutParams0.e.e * v28;
                            if(this.e == 1) {
                                view2.offsetLeftAndRight(v32 - v33);
                            }
                            else {
                                view2.offsetTopAndBottom(v32 - v33);
                            }
                        }
                        else {
                            int v31 = -(this.a - 1 - staggeredGridLayoutManager$LayoutParams0.e.e);
                            view2.offsetLeftAndRight(this.f * v31 - v31 * v28);
                        }
                    }
                }
            }
        }
        if(this.getChildCount() > 0) {
            if(this.i) {
                this.l(recyclerView$Recycler0, recyclerView$State0, true);
                this.m(recyclerView$Recycler0, recyclerView$State0, false);
            }
            else {
                this.m(recyclerView$Recycler0, recyclerView$State0, true);
                this.l(recyclerView$Recycler0, recyclerView$State0, false);
            }
        }
        if(!z || recyclerView$State0.isPreLayout() || this.n == 0 || this.getChildCount() <= 0 || !this.u && this.s() == null) {
            z1 = false;
        }
        else {
            this.removeCallbacks(this.x);
            if(!this.e()) {
                z1 = false;
            }
        }
        if(recyclerView$State0.isPreLayout()) {
            b20.a();
        }
        this.o = b20.c;
        this.p = this.isLayoutRTL();
        if(z1) {
            b20.a();
            this.u(recyclerView$Recycler0, recyclerView$State0, false);
        }
    }

    public final boolean v(int v) {
        return this.e == 0 ? v == -1 != this.i : v == -1 == this.i == this.isLayoutRTL();
    }

    public final void w(int v, State recyclerView$State0) {
        int v2;
        int v1;
        if(v > 0) {
            v1 = this.o();
            v2 = 1;
        }
        else {
            v1 = this.n();
            v2 = -1;
        }
        this.g.a = true;
        this.D(v1, recyclerView$State0);
        this.B(v2);
        this.g.c = v1 + this.g.d;
        this.g.b = Math.abs(v);
    }

    public final void x(Recycler recyclerView$Recycler0, p0 p00) {
        int v = 1;
        if(p00.a && !p00.i) {
            if(p00.b == 0) {
                if(p00.e == -1) {
                    this.y(p00.g, recyclerView$Recycler0);
                    return;
                }
                this.z(p00.f, recyclerView$Recycler0);
                return;
            }
            if(p00.e == -1) {
                int v1 = p00.f;
                int v2 = this.b[0].j(v1);
                while(v < this.a) {
                    int v3 = this.b[v].j(v1);
                    if(v3 > v2) {
                        v2 = v3;
                    }
                    ++v;
                }
                int v4 = v1 - v2;
                this.y((v4 >= 0 ? p00.g - Math.min(v4, p00.b) : p00.g), recyclerView$Recycler0);
                return;
            }
            int v5 = p00.g;
            int v6 = this.b[0].h(v5);
            while(v < this.a) {
                int v7 = this.b[v].h(v5);
                if(v7 < v6) {
                    v6 = v7;
                }
                ++v;
            }
            int v8 = v6 - p00.g;
            this.z((v8 >= 0 ? Math.min(v8, p00.b) + p00.f : p00.f), recyclerView$Recycler0);
        }
    }

    public final void y(int v, Recycler recyclerView$Recycler0) {
        for(int v1 = this.getChildCount() - 1; v1 >= 0; --v1) {
            View view0 = this.getChildAt(v1);
            if(this.c.getDecoratedStart(view0) < v || this.c.getTransformedStartWithDecoration(view0) < v) {
                break;
            }
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                for(int v3 = 0; v3 < this.a; ++v3) {
                    if(this.b[v3].a.size() == 1) {
                        return;
                    }
                }
                for(int v2 = 0; v2 < this.a; ++v2) {
                    this.b[v2].k();
                }
            }
            else {
                if(staggeredGridLayoutManager$LayoutParams0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$LayoutParams0.e.k();
            }
            this.removeAndRecycleView(view0, recyclerView$Recycler0);
        }
    }

    public final void z(int v, Recycler recyclerView$Recycler0) {
        while(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            if(this.c.getDecoratedEnd(view0) > v || this.c.getTransformedEndWithDecoration(view0) > v) {
                break;
            }
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                for(int v2 = 0; v2 < this.a; ++v2) {
                    if(this.b[v2].a.size() == 1) {
                        return;
                    }
                }
                for(int v1 = 0; v1 < this.a; ++v1) {
                    this.b[v1].l();
                }
            }
            else {
                if(staggeredGridLayoutManager$LayoutParams0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$LayoutParams0.e.l();
            }
            this.removeAndRecycleView(view0, recyclerView$Recycler0);
        }
    }
}

