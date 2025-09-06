package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class m extends AnimatorListenerAdapter {
    public final int a;
    public boolean b;
    public final View c;

    public m(int v, View view0) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = false;
            this.c = view0;
            return;
        }
        this.c = view0;
        super();
    }

    public m(View view0, boolean z) {
        this.a = 2;
        this.b = z;
        this.c = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationCancel(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationCancel(animator0);
            return;
        }
        super.onAnimationCancel(animator0);
        this.b = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        switch(this.a) {
            case 0: {
                View view0 = this.c;
                r0.b(view0, 1.0f);
                if(this.b) {
                    view0.setLayerType(0, null);
                }
                return;
            }
            case 1: {
                super.onAnimationEnd(animator0);
                if(!this.b) {
                    this.c.setVisibility(4);
                }
                this.b = false;
                return;
            }
            default: {
                if(!this.b) {
                    this.c.setVisibility(4);
                }
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        switch(this.a) {
            case 0: {
                View view0 = this.c;
                if(ViewCompat.hasOverlappingRendering(view0) && view0.getLayerType() == 0) {
                    this.b = true;
                    view0.setLayerType(2, null);
                }
                return;
            }
            case 2: {
                if(this.b) {
                    this.c.setVisibility(0);
                }
                return;
            }
            default: {
                super.onAnimationStart(animator0);
            }
        }
    }
}

