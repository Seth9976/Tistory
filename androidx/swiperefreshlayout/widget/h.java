package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class h extends Animation {
    public final int a;
    public final SwipeRefreshLayout b;

    public h(SwipeRefreshLayout swipeRefreshLayout0, int v) {
        this.a = v;
        this.b = swipeRefreshLayout0;
        super();
    }

    @Override  // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation0) {
        switch(this.a) {
            case 0: {
                this.b.setTargetOffsetTopAndBottom(this.b.mFrom + ((int)(((float)((this.b.H ? this.b.x : this.b.x - Math.abs(this.b.mOriginalOffsetTop)) - this.b.mFrom)) * f)) - this.b.u.getTop());
                this.b.z.setArrowScale(1.0f - f);
                return;
            }
            case 1: {
                this.b.setAnimationProgress(f);
                return;
            }
            case 2: {
                this.b.setAnimationProgress(1.0f - f);
                return;
            }
            case 3: {
                this.b.d(f);
                return;
            }
            default: {
                this.b.setAnimationProgress(-this.b.w * f + this.b.w);
                this.b.d(f);
            }
        }
    }
}

