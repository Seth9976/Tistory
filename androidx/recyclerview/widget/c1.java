package androidx.recyclerview.widget;

import android.view.View;

public final class c1 extends OrientationHelper {
    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedEnd(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedRight(view0) + recyclerView$LayoutParams0.rightMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurement(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredWidth(view0) + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurementInOther(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredHeight(view0) + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedStart(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.mLayoutManager.getDecoratedLeft(view0) - recyclerView$LayoutParams0.leftMargin;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEnd() {
        return this.mLayoutManager.getWidth();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEndAfterPadding() {
        int v = this.mLayoutManager.getPaddingRight();
        return this.mLayoutManager.getWidth() - v;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getEndPadding() {
        return this.mLayoutManager.getPaddingRight();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getMode() {
        return this.mLayoutManager.getWidthMode();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getModeInOther() {
        return this.mLayoutManager.getHeightMode();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getStartAfterPadding() {
        return this.mLayoutManager.getPaddingLeft();
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTotalSpace() {
        int v = this.mLayoutManager.getPaddingLeft();
        int v1 = this.mLayoutManager.getPaddingRight();
        return this.mLayoutManager.getWidth() - v - v1;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedEndWithDecoration(View view0) {
        this.mLayoutManager.getTransformedBoundingBox(view0, true, this.b);
        return this.b.right;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedStartWithDecoration(View view0) {
        this.mLayoutManager.getTransformedBoundingBox(view0, true, this.b);
        return this.b.left;
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChild(View view0, int v) {
        view0.offsetLeftAndRight(v);
    }

    @Override  // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChildren(int v) {
        this.mLayoutManager.offsetChildrenHorizontal(v);
    }
}

