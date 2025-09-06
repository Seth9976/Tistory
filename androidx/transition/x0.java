package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class x0 extends AnimatorListenerAdapter implements AnimatorUtils.AnimatorPauseListenerCompat, TransitionListener {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public x0(int v, View view0) {
        this.f = false;
        this.a = view0;
        this.b = v;
        this.c = (ViewGroup)view0.getParent();
        this.d = true;
        this.a(true);
    }

    public final void a(boolean z) {
        if(this.d && this.e != z) {
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 != null) {
                this.e = z;
                f0.d(viewGroup0, z);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.f = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(!this.f) {
            r0.c(this.b, this.a);
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 != null) {
                viewGroup0.invalidate();
            }
        }
        this.a(false);
    }

    @Override  // android.animation.AnimatorListenerAdapter, androidx.transition.AnimatorUtils$AnimatorPauseListenerCompat
    public final void onAnimationPause(Animator animator0) {
        if(!this.f) {
            r0.c(this.b, this.a);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.AnimatorListenerAdapter, androidx.transition.AnimatorUtils$AnimatorPauseListenerCompat
    public final void onAnimationResume(Animator animator0) {
        if(!this.f) {
            r0.c(0, this.a);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        if(!this.f) {
            r0.c(this.b, this.a);
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 != null) {
                viewGroup0.invalidate();
            }
        }
        this.a(false);
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
        this.a(false);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
        this.a(true);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
    }
}

