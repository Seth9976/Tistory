package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.b0;
import com.google.android.material.search.u;

public final class c extends AnimatorListenerAdapter {
    public final int a;
    public boolean b;
    public final Object c;

    public c(b0 b00) {
        this.a = 1;
        this.c = b00;
        super();
        this.b = false;
    }

    public c(Object object0, boolean z, int v) {
        this.a = v;
        this.c = object0;
        this.b = z;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationCancel(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationCancel(animator0);
            return;
        }
        this.b = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        switch(this.a) {
            case 0: {
                if(!this.b) {
                    ((d)this.c).super.dismiss();
                }
                return;
            }
            case 1: {
                if(this.b) {
                    this.b = false;
                    return;
                }
                b0 b00 = (b0)this.c;
                if(((float)(((Float)b00.L.getAnimatedValue()))) == 0.0f) {
                    b00.M = 0;
                    b00.d(0);
                    return;
                }
                b00.M = 2;
                b00.E.invalidate();
                return;
            }
            default: {
                u.a(((u)this.c), (this.b ? 1.0f : 0.0f));
                ((u)this.c).c.resetClipBoundsAndCornerRadius();
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 2) {
            super.onAnimationStart(animator0);
            return;
        }
        u.a(((u)this.c), (this.b ? 0.0f : 1.0f));
    }
}

