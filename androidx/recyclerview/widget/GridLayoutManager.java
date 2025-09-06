package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;
import kotlin.text.q;
import wb.a;

public class GridLayoutManager extends LinearLayoutManager {
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int getSpanIndex(int v, int v1) {
            return v % v1;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int getSpanSize(int v) {
            return 1;
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public int e;
        public int f;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public int getSpanIndex() {
            return this.e;
        }

        public int getSpanSize() {
            return this.f;
        }
    }

    public static abstract class SpanSizeLookup {
        public final SparseIntArray a;
        public final SparseIntArray b;
        public boolean c;
        public boolean d;

        public SpanSizeLookup() {
            this.a = new SparseIntArray();
            this.b = new SparseIntArray();
            this.c = false;
            this.d = false;
        }

        public static int a(SparseIntArray sparseIntArray0, int v) {
            int v1 = sparseIntArray0.size() - 1;
            int v2 = 0;
            while(v2 <= v1) {
                int v3 = v2 + v1 >>> 1;
                if(sparseIntArray0.keyAt(v3) < v) {
                    v2 = v3 + 1;
                }
                else {
                    v1 = v3 - 1;
                }
            }
            return v2 - 1 < 0 || v2 - 1 >= sparseIntArray0.size() ? -1 : sparseIntArray0.keyAt(v2 - 1);
        }

        public final int b(int v, int v1) {
            if(!this.d) {
                return this.getSpanGroupIndex(v, v1);
            }
            SparseIntArray sparseIntArray0 = this.b;
            int v2 = sparseIntArray0.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.getSpanGroupIndex(v, v1);
            sparseIntArray0.put(v, v3);
            return v3;
        }

        public final int c(int v, int v1) {
            if(!this.c) {
                return this.getSpanIndex(v, v1);
            }
            SparseIntArray sparseIntArray0 = this.a;
            int v2 = sparseIntArray0.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.getSpanIndex(v, v1);
            sparseIntArray0.put(v, v3);
            return v3;
        }

        public int getSpanGroupIndex(int v, int v1) {
            int v6;
            int v4;
            int v3;
            if(this.d) {
                SparseIntArray sparseIntArray0 = this.b;
                int v2 = SpanSizeLookup.a(sparseIntArray0, v);
                if(v2 == -1) {
                    v3 = 0;
                    v6 = 0;
                    v4 = 0;
                }
                else {
                    v3 = sparseIntArray0.get(v2);
                    v4 = v2 + 1;
                    int v5 = this.c(v2, v1);
                    v6 = this.getSpanSize(v2) + v5;
                    if(v6 == v1) {
                        ++v3;
                        v6 = 0;
                    }
                }
            }
            else {
                v3 = 0;
                v6 = 0;
                v4 = 0;
            }
            int v7 = this.getSpanSize(v);
            while(v4 < v) {
                int v8 = this.getSpanSize(v4);
                v6 += v8;
                if(v6 == v1) {
                    ++v3;
                    v6 = 0;
                }
                else if(v6 > v1) {
                    ++v3;
                    v6 = v8;
                }
                ++v4;
            }
            return v6 + v7 <= v1 ? v3 : v3 + 1;
        }

        public int getSpanIndex(int v, int v1) {
            int v5;
            int v3;
            int v2 = this.getSpanSize(v);
            if(v2 == v1) {
                return 0;
            }
            if(this.c) {
                SparseIntArray sparseIntArray0 = this.a;
                v3 = SpanSizeLookup.a(sparseIntArray0, v);
                if(v3 >= 0) {
                    int v4 = sparseIntArray0.get(v3);
                    v5 = this.getSpanSize(v3) + v4;
                    ++v3;
                }
                else {
                    v3 = 0;
                    v5 = 0;
                }
            }
            else {
                v3 = 0;
                v5 = 0;
            }
            while(v3 < v) {
                int v6 = this.getSpanSize(v3);
                v5 += v6;
                if(v5 == v1) {
                    v5 = 0;
                }
                else if(v5 > v1) {
                    v5 = v6;
                }
                ++v3;
            }
            return v2 + v5 > v1 ? 0 : v5;
        }

        public abstract int getSpanSize(int arg1);

        public void invalidateSpanGroupIndexCache() {
            this.b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if(!z) {
                this.b.clear();
            }
            this.d = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if(!z) {
                this.b.clear();
            }
            this.c = z;
        }
    }

    public static final int DEFAULT_SPAN_COUNT = -1;
    public boolean a;
    public int b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public SpanSizeLookup g;
    public final Rect h;
    public boolean i;

    public GridLayoutManager(Context context0, int v) {
        super(context0);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new DefaultSpanSizeLookup();
        this.h = new Rect();
        this.setSpanCount(v);
    }

    public GridLayoutManager(Context context0, int v, int v1, boolean z) {
        super(context0, v1, z);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new DefaultSpanSizeLookup();
        this.h = new Rect();
        this.setSpanCount(v);
    }

    public GridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new DefaultSpanSizeLookup();
        this.h = new Rect();
        this.setSpanCount(LayoutManager.getProperties(context0, attributeSet0, v, v1).spanCount);
    }

    public final void A() {
        int v1;
        int v;
        if(this.getOrientation() == 1) {
            v = this.getWidth() - this.getPaddingRight();
            v1 = this.getPaddingLeft();
        }
        else {
            v = this.getHeight() - this.getPaddingBottom();
            v1 = this.getPaddingTop();
        }
        this.r(v - v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
        return recyclerView$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(State recyclerView$State0, r0 r00, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v = this.b;
        for(int v1 = 0; v1 < this.b && (r00.d >= 0 && r00.d < recyclerView$State0.getItemCount() && v > 0); ++v1) {
            int v2 = r00.d;
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.addPosition(v2, Math.max(0, r00.g));
            v -= this.g.getSpanSize(v2);
            r00.d += r00.e;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int computeHorizontalScrollOffset(State recyclerView$State0) {
        return this.i ? this.s(recyclerView$State0) : super.computeHorizontalScrollOffset(recyclerView$State0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int computeHorizontalScrollRange(State recyclerView$State0) {
        return this.i ? this.t(recyclerView$State0) : super.computeHorizontalScrollRange(recyclerView$State0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int computeVerticalScrollOffset(State recyclerView$State0) {
        return this.i ? this.s(recyclerView$State0) : super.computeVerticalScrollOffset(recyclerView$State0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int computeVerticalScrollRange(State recyclerView$State0) {
        return this.i ? this.t(recyclerView$State0) : super.computeVerticalScrollRange(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z, boolean z1) {
        int v3;
        int v2;
        int v = this.getChildCount();
        int v1 = 1;
        if(z1) {
            v2 = this.getChildCount() - 1;
            v3 = -1;
            v1 = -1;
        }
        else {
            v3 = v;
            v2 = 0;
        }
        int v4 = recyclerView$State0.getItemCount();
        this.ensureLayoutState();
        int v5 = this.mOrientationHelper.getStartAfterPadding();
        int v6 = this.mOrientationHelper.getEndAfterPadding();
        View view0 = null;
        View view1 = null;
        while(v2 != v3) {
            View view2 = this.getChildAt(v2);
            int v7 = this.getPosition(view2);
            if(v7 >= 0 && v7 < v4 && this.x(v7, recyclerView$Recycler0, recyclerView$State0) == 0) {
                if(!((androidx.recyclerview.widget.RecyclerView.LayoutParams)view2.getLayoutParams()).isItemRemoved()) {
                    if(this.mOrientationHelper.getDecoratedStart(view2) < v6 && this.mOrientationHelper.getDecoratedEnd(view2) >= v5) {
                        return view2;
                    }
                    if(view0 == null) {
                        view0 = view2;
                    }
                }
                else if(view1 == null) {
                    view1 = view2;
                }
            }
            v2 += v1;
        }
        return view0 == null ? view1 : view0;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
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

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int getColumnCountForAccessibility(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.mOrientation == 1) {
            return this.b;
        }
        return recyclerView$State0.getItemCount() >= 1 ? this.w(recyclerView$State0.getItemCount() - 1, recyclerView$Recycler0, recyclerView$State0) + 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int getRowCountForAccessibility(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.mOrientation == 0) {
            return this.b;
        }
        return recyclerView$State0.getItemCount() >= 1 ? this.w(recyclerView$State0.getItemCount() - 1, recyclerView$Recycler0, recyclerView$State0) + 1 : 0;
    }

    public int getSpanCount() {
        return this.b;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.g;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.i;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(Recycler recyclerView$Recycler0, State recyclerView$State0, r0 r00, LayoutChunkResult linearLayoutManager$LayoutChunkResult0) {
        int v32;
        int v31;
        int v30;
        int v29;
        int v27;
        int v26;
        int v25;
        int v24;
        int v21;
        int v20;
        int v8;
        int v7;
        int v6;
        int v = this.mOrientationHelper.getModeInOther();
        int v1 = this.getChildCount() <= 0 ? 0 : this.c[this.b];
        if(v != 0x40000000) {
            this.A();
        }
        boolean z = r00.e == 1;
        int v2 = z ? this.b : this.x(r00.d, recyclerView$Recycler0, recyclerView$State0) + this.y(r00.d, recyclerView$Recycler0, recyclerView$State0);
        int v3 = 0;
        while(v3 < this.b && (r00.d >= 0 && r00.d < recyclerView$State0.getItemCount() && v2 > 0)) {
            int v4 = r00.d;
            int v5 = this.y(v4, recyclerView$Recycler0, recyclerView$State0);
            if(v5 <= this.b) {
                v2 -= v5;
                if(v2 < 0) {
                    break;
                }
                View view0 = r00.b(recyclerView$Recycler0);
                if(view0 == null) {
                    break;
                }
                this.d[v3] = view0;
                ++v3;
                continue;
            }
            StringBuilder stringBuilder0 = q.u("Item at position ", v4, " requires ", v5, " spans but GridLayoutManager has only ");
            throw new IllegalArgumentException(a.c(this.b, " spans.", stringBuilder0));
        }
        if(v3 == 0) {
            linearLayoutManager$LayoutChunkResult0.mFinished = true;
            return;
        }
        if(z) {
            v6 = 1;
            v7 = v3;
            v8 = 0;
        }
        else {
            v8 = v3 - 1;
            v7 = -1;
            v6 = -1;
        }
        int v9 = 0;
        while(v8 != v7) {
            View view1 = this.d[v8];
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v10 = this.y(this.getPosition(view1), recyclerView$Recycler0, recyclerView$State0);
            ((LayoutParams)viewGroup$LayoutParams0).f = v10;
            ((LayoutParams)viewGroup$LayoutParams0).e = v9;
            v9 += v10;
            v8 += v6;
        }
        float f = 0.0f;
        int v12 = 0;
        for(int v11 = 0; v11 < v3; ++v11) {
            View view2 = this.d[v11];
            if(r00.k == null) {
                if(z) {
                    this.addView(view2);
                }
                else {
                    this.addView(view2, 0);
                }
            }
            else if(z) {
                this.addDisappearingView(view2);
            }
            else {
                this.addDisappearingView(view2, 0);
            }
            this.calculateItemDecorationsForChild(view2, this.h);
            this.z(view2, v, false);
            int v13 = this.mOrientationHelper.getDecoratedMeasurement(view2);
            if(v13 > v12) {
                v12 = v13;
            }
            LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
            float f1 = ((float)this.mOrientationHelper.getDecoratedMeasurementInOther(view2)) * 1.0f / ((float)gridLayoutManager$LayoutParams0.f);
            if(f1 > f) {
                f = f1;
            }
        }
        if(v != 0x40000000) {
            this.r(Math.max(Math.round(f * ((float)this.b)), v1));
            v12 = 0;
            for(int v14 = 0; v14 < v3; ++v14) {
                View view3 = this.d[v14];
                this.z(view3, 0x40000000, true);
                int v15 = this.mOrientationHelper.getDecoratedMeasurement(view3);
                if(v15 > v12) {
                    v12 = v15;
                }
            }
        }
        for(int v16 = 0; v16 < v3; ++v16) {
            View view4 = this.d[v16];
            if(this.mOrientationHelper.getDecoratedMeasurement(view4) != v12) {
                LayoutParams gridLayoutManager$LayoutParams1 = (LayoutParams)view4.getLayoutParams();
                int v17 = gridLayoutManager$LayoutParams1.b.top + gridLayoutManager$LayoutParams1.b.bottom + gridLayoutManager$LayoutParams1.topMargin + gridLayoutManager$LayoutParams1.bottomMargin;
                int v18 = gridLayoutManager$LayoutParams1.b.left + gridLayoutManager$LayoutParams1.b.right + gridLayoutManager$LayoutParams1.leftMargin + gridLayoutManager$LayoutParams1.rightMargin;
                int v19 = this.v(gridLayoutManager$LayoutParams1.e, gridLayoutManager$LayoutParams1.f);
                if(this.mOrientation == 1) {
                    v20 = LayoutManager.getChildMeasureSpec(v19, 0x40000000, v18, gridLayoutManager$LayoutParams1.width, false);
                    v21 = View.MeasureSpec.makeMeasureSpec(v12 - v17, 0x40000000);
                }
                else {
                    int v22 = View.MeasureSpec.makeMeasureSpec(v12 - v18, 0x40000000);
                    v21 = LayoutManager.getChildMeasureSpec(v19, 0x40000000, v17, gridLayoutManager$LayoutParams1.height, false);
                    v20 = v22;
                }
                if(this.shouldReMeasureChild(view4, v20, v21, ((androidx.recyclerview.widget.RecyclerView.LayoutParams)view4.getLayoutParams()))) {
                    view4.measure(v20, v21);
                }
            }
        }
        int v23 = 0;
        linearLayoutManager$LayoutChunkResult0.mConsumed = v12;
        if(this.mOrientation != 1) {
            if(r00.f == -1) {
                v26 = r00.b - v12;
                v27 = r00.b;
            }
            else {
                v27 = r00.b + v12;
                v26 = r00.b;
            }
            v25 = 0;
            v24 = 0;
        }
        else if(r00.f == -1) {
            v24 = r00.b;
            v25 = v24 - v12;
            v26 = 0;
            v27 = 0;
        }
        else {
            v25 = r00.b;
            v27 = 0;
            v24 = r00.b + v12;
            v26 = 0;
        }
        while(v23 < v3) {
            View view5 = this.d[v23];
            LayoutParams gridLayoutManager$LayoutParams2 = (LayoutParams)view5.getLayoutParams();
            if(this.mOrientation != 1) {
                int v34 = this.getPaddingTop() + this.c[gridLayoutManager$LayoutParams2.e];
                v32 = v26;
                v29 = v27;
                v30 = v34;
                v31 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + v34;
            }
            else if(this.isLayoutRTL()) {
                int v28 = this.getPaddingLeft() + this.c[this.b - gridLayoutManager$LayoutParams2.e];
                v29 = v28;
                v30 = v25;
                v31 = v24;
                v32 = v28 - this.mOrientationHelper.getDecoratedMeasurementInOther(view5);
            }
            else {
                int v33 = this.getPaddingLeft() + this.c[gridLayoutManager$LayoutParams2.e];
                v29 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + v33;
                v30 = v25;
                v31 = v24;
                v32 = v33;
            }
            this.layoutDecoratedWithMargins(view5, v32, v30, v29, v31);
            if(gridLayoutManager$LayoutParams2.isItemRemoved() || gridLayoutManager$LayoutParams2.isItemChanged()) {
                linearLayoutManager$LayoutChunkResult0.mIgnoreConsumed = true;
            }
            linearLayoutManager$LayoutChunkResult0.mFocusable |= view5.hasFocusable();
            ++v23;
            v26 = v32;
            v27 = v29;
            v25 = v30;
            v24 = v31;
        }
        Arrays.fill(this.d, null);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(Recycler recyclerView$Recycler0, State recyclerView$State0, q0 q00, int v) {
        super.onAnchorReady(recyclerView$Recycler0, recyclerView$State0, q00, v);
        this.A();
        if(recyclerView$State0.getItemCount() > 0 && !recyclerView$State0.isPreLayout()) {
            int v1 = this.x(q00.b, recyclerView$Recycler0, recyclerView$State0);
            if(v == 1) {
                while(v1 > 0) {
                    int v2 = q00.b;
                    if(v2 <= 0) {
                        break;
                    }
                    q00.b = v2 - 1;
                    v1 = this.x(v2 - 1, recyclerView$Recycler0, recyclerView$State0);
                }
            }
            else {
                int v3 = recyclerView$State0.getItemCount();
                int v4 = q00.b;
                while(v4 < v3 - 1) {
                    int v5 = this.x(v4 + 1, recyclerView$Recycler0, recyclerView$State0);
                    if(v5 <= v1) {
                        break;
                    }
                    ++v4;
                    v1 = v5;
                }
                q00.b = v4;
            }
        }
        this.u();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public View onFocusSearchFailed(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v17;
        int v16;
        int v15;
        int v14;
        View view5;
        int v5;
        int v4;
        int v3;
        View view1 = this.findContainingItemView(view0);
        View view2 = null;
        if(view1 == null) {
            return null;
        }
        LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
        int v1 = gridLayoutManager$LayoutParams0.e;
        int v2 = gridLayoutManager$LayoutParams0.f + v1;
        if(super.onFocusSearchFailed(view0, v, recyclerView$Recycler0, recyclerView$State0) == null) {
            return null;
        }
        if(this.convertFocusDirectionToLayoutDirection(v) == 1 == this.mShouldReverseLayout) {
            v4 = this.getChildCount();
            v5 = 1;
            v3 = 0;
        }
        else {
            v3 = this.getChildCount() - 1;
            v4 = -1;
            v5 = -1;
        }
        int v6 = this.mOrientation != 1 || !this.isLayoutRTL() ? 0 : 1;
        int v7 = this.w(v3, recyclerView$Recycler0, recyclerView$State0);
        int v8 = -1;
        int v9 = -1;
        int v10 = 0;
        int v11 = 0;
        int v12 = v3;
        View view3 = null;
        while(v12 != v4) {
            int v13 = this.w(v12, recyclerView$Recycler0, recyclerView$State0);
            View view4 = this.getChildAt(v12);
            if(view4 == view1) {
                break;
            }
            if(!view4.hasFocusable() || v13 == v7) {
                LayoutParams gridLayoutManager$LayoutParams1 = (LayoutParams)view4.getLayoutParams();
                int v18 = gridLayoutManager$LayoutParams1.e;
                int v19 = gridLayoutManager$LayoutParams1.f + v18;
                if(view4.hasFocusable() && v18 == v1 && v19 == v2) {
                    return view4;
                }
                if((!view4.hasFocusable() || view2 != null) && (view4.hasFocusable() || view3 != null)) {
                    view5 = view3;
                    int v20 = Math.min(v19, v2) - Math.max(v18, v1);
                    if(view4.hasFocusable()) {
                        if(v20 <= v10 && (v20 != v10 || v6 != (v18 <= v8 ? 0 : 1))) {
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                            goto label_95;
                        }
                        else {
                        label_49:
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                            goto label_73;
                        }
                        goto label_59;
                    }
                    else {
                    label_59:
                        if(view2 == null) {
                            v14 = v10;
                            v15 = v4;
                            int v21 = 1;
                            if(this.isViewPartiallyVisible(view4, false, true)) {
                                v17 = v11;
                                if(v20 > v17) {
                                    v16 = v9;
                                    goto label_73;
                                }
                                else if(v20 == v17) {
                                    v16 = v9;
                                    if(v18 <= v16) {
                                        v21 = 0;
                                    }
                                    if(v6 == v21) {
                                    label_73:
                                        if(view4.hasFocusable()) {
                                            v8 = gridLayoutManager$LayoutParams1.e;
                                            v9 = v16;
                                            v11 = v17;
                                            view3 = view5;
                                            view2 = view4;
                                            v10 = Math.min(v19, v2) - Math.max(v18, v1);
                                        }
                                        else {
                                            v11 = Math.min(v19, v2) - Math.max(v18, v1);
                                            v9 = gridLayoutManager$LayoutParams1.e;
                                            v10 = v14;
                                            view3 = view4;
                                        }
                                        goto label_99;
                                    }
                                }
                                else {
                                    v16 = v9;
                                }
                            }
                            else {
                                v16 = v9;
                                v17 = v11;
                            }
                        }
                        else {
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                        }
                    }
                }
                else {
                    view5 = view3;
                    goto label_49;
                }
            }
            else {
                if(view2 != null) {
                    break;
                }
                view5 = view3;
                v14 = v10;
                v15 = v4;
                v16 = v9;
                v17 = v11;
            }
        label_95:
            v9 = v16;
            v11 = v17;
            v10 = v14;
            view3 = view5;
        label_99:
            v12 += v5;
            v4 = v15;
        }
        return view2 == null ? view3 : view2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setClassName("android.widget.GridView");
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(Recycler recyclerView$Recycler0, State recyclerView$State0, View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view0, accessibilityNodeInfoCompat0);
            return;
        }
        int v = this.w(((LayoutParams)viewGroup$LayoutParams0).getViewLayoutPosition(), recyclerView$Recycler0, recyclerView$State0);
        if(this.mOrientation == 0) {
            accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(((LayoutParams)viewGroup$LayoutParams0).getSpanIndex(), ((LayoutParams)viewGroup$LayoutParams0).getSpanSize(), v, 1, false, false));
            return;
        }
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v, 1, ((LayoutParams)viewGroup$LayoutParams0).getSpanIndex(), ((LayoutParams)viewGroup$LayoutParams0).getSpanSize(), false, false));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsAdded(RecyclerView recyclerView0, int v, int v1) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsChanged(RecyclerView recyclerView0) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsMoved(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView0, int v, int v1) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        SparseIntArray sparseIntArray0 = this.f;
        SparseIntArray sparseIntArray1 = this.e;
        if(recyclerView$State0.isPreLayout()) {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)this.getChildAt(v1).getLayoutParams();
                int v2 = gridLayoutManager$LayoutParams0.getViewLayoutPosition();
                sparseIntArray1.put(v2, gridLayoutManager$LayoutParams0.getSpanSize());
                sparseIntArray0.put(v2, gridLayoutManager$LayoutParams0.getSpanIndex());
            }
        }
        super.onLayoutChildren(recyclerView$Recycler0, recyclerView$State0);
        sparseIntArray1.clear();
        sparseIntArray0.clear();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutCompleted(State recyclerView$State0) {
        super.onLayoutCompleted(recyclerView$State0);
        this.a = false;
    }

    public final void r(int v) {
        int v7;
        int[] arr_v = this.c;
        int v1 = this.b;
        if(arr_v == null || arr_v.length != v1 + 1 || arr_v[arr_v.length - 1] != v) {
            arr_v = new int[v1 + 1];
        }
        int v3 = 0;
        arr_v[0] = 0;
        int v4 = v / v1;
        int v5 = v % v1;
        int v6 = 0;
        for(int v2 = 1; v2 <= v1; ++v2) {
            v3 += v5;
            if(v3 <= 0 || v1 - v3 >= v5) {
                v7 = v4;
            }
            else {
                v7 = v4 + 1;
                v3 -= v1;
            }
            v6 += v7;
            arr_v[v2] = v6;
        }
        this.c = arr_v;
    }

    public final int s(State recyclerView$State0) {
        if(this.getChildCount() != 0 && recyclerView$State0.getItemCount() != 0) {
            this.ensureLayoutState();
            boolean z = this.isSmoothScrollbarEnabled();
            View view0 = this.findFirstVisibleChildClosestToStart(!z, true);
            View view1 = this.findFirstVisibleChildClosestToEnd(!z, true);
            if(view0 != null && view1 != null) {
                int v = this.g.b(this.getPosition(view0), this.b);
                int v1 = this.g.b(this.getPosition(view1), this.b);
                int v2 = this.g.b(recyclerView$State0.getItemCount() - 1, this.b);
                int v3 = this.mShouldReverseLayout ? Math.max(0, v2 + 1 - Math.max(v, v1) - 1) : Math.max(0, Math.min(v, v1));
                if(!z) {
                    return v3;
                }
                int v4 = this.mOrientationHelper.getDecoratedEnd(view1);
                int v5 = this.mOrientationHelper.getDecoratedStart(view0);
                int v6 = this.g.b(this.getPosition(view0), this.b);
                return Math.round(((float)v3) * (((float)Math.abs(v4 - v5)) / ((float)(this.g.b(this.getPosition(view1), this.b) - v6 + 1))) + ((float)(this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(view0))));
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int scrollHorizontallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.A();
        this.u();
        return super.scrollHorizontallyBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int scrollVerticallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.A();
        this.u();
        return super.scrollVerticallyBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void setMeasuredDimension(Rect rect0, int v, int v1) {
        int v7;
        int v6;
        if(this.c == null) {
            super.setMeasuredDimension(rect0, v, v1);
        }
        int v2 = this.getPaddingLeft();
        int v3 = this.getPaddingRight() + v2;
        int v4 = this.getPaddingTop();
        int v5 = this.getPaddingBottom() + v4;
        if(this.mOrientation == 1) {
            v6 = LayoutManager.chooseSize(v1, rect0.height() + v5, this.getMinimumHeight());
            v7 = LayoutManager.chooseSize(v, this.c[this.c.length - 1] + v3, this.getMinimumWidth());
        }
        else {
            v7 = LayoutManager.chooseSize(v, rect0.width() + v3, this.getMinimumWidth());
            v6 = LayoutManager.chooseSize(v1, this.c[this.c.length - 1] + v5, this.getMinimumHeight());
        }
        this.setMeasuredDimension(v7, v6);
    }

    public void setSpanCount(int v) {
        if(v == this.b) {
            return;
        }
        this.a = true;
        if(v < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + v);
        }
        this.b = v;
        this.g.invalidateSpanIndexCache();
        this.requestLayout();
    }

    public void setSpanSizeLookup(SpanSizeLookup gridLayoutManager$SpanSizeLookup0) {
        this.g = gridLayoutManager$SpanSizeLookup0;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.i = z;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    public final int t(State recyclerView$State0) {
        if(this.getChildCount() != 0 && recyclerView$State0.getItemCount() != 0) {
            this.ensureLayoutState();
            View view0 = this.findFirstVisibleChildClosestToStart(!this.isSmoothScrollbarEnabled(), true);
            View view1 = this.findFirstVisibleChildClosestToEnd(!this.isSmoothScrollbarEnabled(), true);
            if(view0 != null && view1 != null) {
                if(!this.isSmoothScrollbarEnabled()) {
                    return this.g.b(recyclerView$State0.getItemCount() - 1, this.b) + 1;
                }
                int v = this.mOrientationHelper.getDecoratedEnd(view1);
                int v1 = this.mOrientationHelper.getDecoratedStart(view0);
                int v2 = this.g.b(this.getPosition(view0), this.b);
                return (int)(((float)(v - v1)) / ((float)(this.g.b(this.getPosition(view1), this.b) - v2 + 1)) * ((float)(this.g.b(recyclerView$State0.getItemCount() - 1, this.b) + 1)));
            }
        }
        return 0;
    }

    public final void u() {
        if(this.d == null || this.d.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public final int v(int v, int v1) {
        return this.mOrientation != 1 || !this.isLayoutRTL() ? this.c[v1 + v] - this.c[v] : this.c[this.b - v] - this.c[this.b - v - v1];
    }

    public final int w(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(!recyclerView$State0.isPreLayout()) {
            return this.g.b(v, this.b);
        }
        int v1 = recyclerView$Recycler0.convertPreLayoutPositionToPostLayout(v);
        if(v1 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + v);
            return 0;
        }
        return this.g.b(v1, this.b);
    }

    public final int x(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(!recyclerView$State0.isPreLayout()) {
            return this.g.c(v, this.b);
        }
        int v1 = this.f.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$Recycler0.convertPreLayoutPositionToPostLayout(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 0;
        }
        return this.g.c(v2, this.b);
    }

    public final int y(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(!recyclerView$State0.isPreLayout()) {
            return this.g.getSpanSize(v);
        }
        int v1 = this.e.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$Recycler0.convertPreLayoutPositionToPostLayout(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 1;
        }
        return this.g.getSpanSize(v2);
    }

    public final void z(View view0, int v, boolean z) {
        int v5;
        int v4;
        LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = gridLayoutManager$LayoutParams0.b.top + gridLayoutManager$LayoutParams0.b.bottom + gridLayoutManager$LayoutParams0.topMargin + gridLayoutManager$LayoutParams0.bottomMargin;
        int v2 = gridLayoutManager$LayoutParams0.b.left + gridLayoutManager$LayoutParams0.b.right + gridLayoutManager$LayoutParams0.leftMargin + gridLayoutManager$LayoutParams0.rightMargin;
        int v3 = this.v(gridLayoutManager$LayoutParams0.e, gridLayoutManager$LayoutParams0.f);
        if(this.mOrientation == 1) {
            v4 = LayoutManager.getChildMeasureSpec(v3, v, v2, gridLayoutManager$LayoutParams0.width, false);
            v5 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), this.getHeightMode(), v1, gridLayoutManager$LayoutParams0.height, true);
        }
        else {
            v5 = LayoutManager.getChildMeasureSpec(v3, v, v1, gridLayoutManager$LayoutParams0.height, false);
            v4 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), this.getWidthMode(), v2, gridLayoutManager$LayoutParams0.width, true);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams)view0.getLayoutParams();
        if((z ? this.shouldReMeasureChild(view0, v4, v5, recyclerView$LayoutParams0) : this.shouldMeasureChild(view0, v4, v5, recyclerView$LayoutParams0))) {
            view0.measure(v4, v5);
        }
    }
}

