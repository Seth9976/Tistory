package a8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import f8.i;

public final class e extends AnimatorListenerAdapter {
    public final int a;
    public final Object b;

    public e(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationCancel(Animator animator0) {
        if(this.a != 3) {
            super.onAnimationCancel(animator0);
            return;
        }
        ((ActionBarOverlayLayout)this.b).w = null;
        ((ActionBarOverlayLayout)this.b).k = false;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationEnd(Animator animator0) {
        switch(this.a) {
            case 3: {
                ((ActionBarOverlayLayout)this.b).w = null;
                ((ActionBarOverlayLayout)this.b).k = false;
                return;
            }
            case 4: {
                ViewCompat.setClipBounds(((View)this.b), null);
                return;
            }
            case 5: {
                ((Transition)this.b).end();
                animator0.removeListener(this);
                return;
            }
            case 6: {
                StateListAnimator stateListAnimator0 = (StateListAnimator)this.b;
                if(stateListAnimator0.c == animator0) {
                    stateListAnimator0.c = null;
                }
                return;
            }
            case 7: {
                SideSheetBehavior sideSheetBehavior0 = (SideSheetBehavior)this.b;
                sideSheetBehavior0.a(5);
                if(sideSheetBehavior0.E != null && sideSheetBehavior0.E.get() != null) {
                    ((View)sideSheetBehavior0.E.get()).requestLayout();
                }
                return;
            }
            case 8: {
                ((i)this.b).q();
                ((i)this.b).r.start();
                return;
            }
            case 9: {
                ((ExpandableTransformationBehavior)this.b).p = null;
                return;
            }
            case 10: {
                ((HideBottomViewOnScrollBehavior)this.b).w = null;
                return;
            }
            case 11: {
                BottomSheetBehavior bottomSheetBehavior0 = (BottomSheetBehavior)this.b;
                bottomSheetBehavior0.l(5);
                if(bottomSheetBehavior0.k0 != null && bottomSheetBehavior0.k0.get() != null) {
                    ((View)bottomSheetBehavior0.k0.get()).requestLayout();
                }
                return;
            }
            case 12: {
                ((CircularRevealWidget)this.b).destroyCircularRevealCache();
                return;
            }
            default: {
                super.onAnimationEnd(animator0);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationRepeat(Animator animator0) {
        switch(this.a) {
            case 0: {
                super.onAnimationRepeat(animator0);
                ((h)this.b).h = (((h)this.b).h + 4) % ((h)this.b).g.indicatorColors.length;
                return;
            }
            case 1: {
                super.onAnimationRepeat(animator0);
                ((n)this.b).g = (((n)this.b).g + 1) % ((n)this.b).f.indicatorColors.length;
                ((n)this.b).h = true;
                return;
            }
            case 2: {
                super.onAnimationRepeat(animator0);
                ((p)this.b).h = (((p)this.b).h + 1) % ((p)this.b).g.indicatorColors.length;
                ((p)this.b).i = true;
                return;
            }
            default: {
                super.onAnimationRepeat(animator0);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 12) {
            super.onAnimationStart(animator0);
            return;
        }
        ((CircularRevealWidget)this.b).buildCircularRevealCache();
    }
}

