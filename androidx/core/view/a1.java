package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;

public final class a1 extends AnimatorListenerAdapter {
    public final int a;
    public final Object b;
    public final Object c;

    public a1(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    public a1(Object object0, View view0, int v) {
        this.a = v;
        this.c = object0;
        this.b = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationCancel(Animator animator0) {
        if(this.a != 0) {
            super.onAnimationCancel(animator0);
            return;
        }
        ((ViewPropertyAnimatorListener)this.c).onAnimationCancel(((View)this.b));
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        switch(this.a) {
            case 0: {
                ((ViewPropertyAnimatorListener)this.c).onAnimationEnd(((View)this.b));
                return;
            }
            case 1: {
                ((WindowInsetsAnimationCompat)this.c).setFraction(1.0f);
                i1.g(((View)this.b), ((WindowInsetsAnimationCompat)this.c));
                return;
            }
            case 2: {
                ((ArrayMap)this.c).remove(animator0);
                ((Transition)this.b).w.remove(animator0);
                return;
            }
            case 3: {
                ((View)this.b).setVisibility(8);
                ((AnimatorSet)this.c).start();
                return;
            }
            default: {
                ((DrawerLayout)this.c).closeDrawer(((View)this.b), false);
                ((DrawerLayout)this.c).setScrimColor(0x99000000);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        switch(this.a) {
            case 0: {
                ((ViewPropertyAnimatorListener)this.c).onAnimationStart(((View)this.b));
                return;
            }
            case 2: {
                ((Transition)this.b).w.add(animator0);
                return;
            }
            default: {
                super.onAnimationStart(animator0);
            }
        }
    }
}

