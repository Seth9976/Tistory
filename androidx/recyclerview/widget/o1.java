package androidx.recyclerview.widget;

import android.view.View;

public final class o1 implements ViewBoundsCheck.Callback {
    public final LayoutManager a;

    public o1(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final View getChildAt(int v) {
        return this.a.getChildAt(v);
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getChildEnd(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.a.getDecoratedRight(view0) + recyclerView$LayoutParams0.rightMargin;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getChildStart(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.a.getDecoratedLeft(view0) - recyclerView$LayoutParams0.leftMargin;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getParentEnd() {
        int v = this.a.getPaddingRight();
        return this.a.getWidth() - v;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getParentStart() {
        return this.a.getPaddingLeft();
    }
}

