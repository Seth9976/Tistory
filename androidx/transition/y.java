package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

public final class y extends ViewGroup implements GhostView {
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    public final x f;
    public static final int g;

    public y(View view0) {
        super(view0.getContext());
        this.f = new x(this);
        this.c = view0;
        this.setWillNotDraw(false);
        this.setClipChildren(false);
        this.setLayerType(2, null);
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view0 = this.c;
        view0.setTag(id.ghost_view, this);
        view0.getViewTreeObserver().addOnPreDrawListener(this.f);
        r0.c(4, view0);
        if(view0.getParent() != null) {
            ((View)view0.getParent()).invalidate();
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        View view0 = this.c;
        view0.getViewTreeObserver().removeOnPreDrawListener(this.f);
        r0.c(0, view0);
        view0.setTag(id.ghost_view, null);
        if(view0.getParent() != null) {
            ((View)view0.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        f0.b(canvas0, true);
        canvas0.setMatrix(this.e);
        r0.c(0, this.c);
        this.c.invalidate();
        r0.c(4, this.c);
        long v = this.getDrawingTime();
        this.drawChild(canvas0, this.c, v);
        f0.b(canvas0, false);
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // androidx.transition.GhostView
    public final void reserveEndViewTransition(ViewGroup viewGroup0, View view0) {
        this.a = viewGroup0;
        this.b = view0;
    }

    @Override  // androidx.transition.GhostView, android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        View view0 = this.c;
        if(((y)view0.getTag(id.ghost_view)) == this) {
            r0.c((v == 0 ? 4 : 0), view0);
        }
    }
}

