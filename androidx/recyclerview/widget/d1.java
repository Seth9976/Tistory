package androidx.recyclerview.widget;

import android.view.View;

public final class d1 extends OrientationHelper {
    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedEnd(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedBottom(view0) + recyclerView$LayoutParams0.bottomMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurement(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredHeight(view0) + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurementInOther(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredWidth(view0) + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedStart(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedTop(view0) - recyclerView$LayoutParams0.topMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEnd() {
        return this.mLayoutManager.getHeight();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEndAfterPadding() {
        int v = this.mLayoutManager.getPaddingBottom();
        return this.mLayoutManager.getHeight() - v;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEndPadding() {
        return this.mLayoutManager.getPaddingBottom();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getMode() {
        return this.mLayoutManager.getHeightMode();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getModeInOther() {
        return this.mLayoutManager.getWidthMode();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getStartAfterPadding() {
        return this.mLayoutManager.getPaddingTop();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTotalSpace() {
        int v = this.mLayoutManager.getPaddingTop();
        int v1 = this.mLayoutManager.getPaddingBottom();
        return this.mLayoutManager.getHeight() - v - v1;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedEndWithDecoration(View view0) {
        this.mLayoutManager.getTransformedBoundingBox(view0, true, this.b);
        return this.b.bottom;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedStartWithDecoration(View view0) {
        this.mLayoutManager.getTransformedBoundingBox(view0, true, this.b);
        return this.b.top;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChild(View view0, int v) {
        view0.offsetTopAndBottom(v);
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChildren(int v) {
        this.mLayoutManager.offsetChildrenVertical(v);
    }
}

