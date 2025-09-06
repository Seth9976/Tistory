package androidx.swiperefreshlayout.widget;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public final class a extends ImageView {
    public Animation.AnimationListener a;
    public int b;

    @Override  // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animation$AnimationListener0 = this.a;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationEnd(this.getAnimation());
        }
    }

    @Override  // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animation$AnimationListener0 = this.a;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationStart(this.getAnimation());
        }
    }

    @Override  // android.widget.ImageView
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public final void setBackgroundColor(int v) {
        if(this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(v);
            this.b = v;
        }
    }
}

