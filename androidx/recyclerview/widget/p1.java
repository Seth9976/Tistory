package androidx.recyclerview.widget;

import android.view.View;

public final class p1 implements ViewBoundsCheck.Callback {
    public final LayoutManager a;

    public p1(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final View getChildAt(int v) {
        return this.a.getChildAt(v);
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getChildEnd(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.a.getDecoratedBottom(view0) + recyclerView$LayoutParams0.bottomMargin;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getChildStart(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.a.getDecoratedTop(view0) - recyclerView$LayoutParams0.topMargin;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getParentEnd() {
        int v = this.a.getPaddingBottom();
        return this.a.getHeight() - v;
    }

    @Override  // androidx.recyclerview.widget.ViewBoundsCheck$Callback
    public final int getParentStart() {
        return this.a.getPaddingTop();
    }
}

