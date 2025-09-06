package androidx.transition;

import a8.e;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

public class ChangeClipBounds extends Transition {
    public static final String[] I;

    static {
        ChangeClipBounds.I = new String[]{"android:clipBounds:clip"};
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        ChangeClipBounds.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        ChangeClipBounds.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Animator animator0 = null;
        if(transitionValues0 != null && transitionValues1 != null && transitionValues0.values.containsKey("android:clipBounds:clip") && transitionValues1.values.containsKey("android:clipBounds:clip")) {
            Rect rect0 = (Rect)transitionValues0.values.get("android:clipBounds:clip");
            Rect rect1 = (Rect)transitionValues1.values.get("android:clipBounds:clip");
            boolean z = rect1 == null;
            if(rect0 == null && rect1 == null) {
                return null;
            }
            if(rect0 == null) {
                rect0 = (Rect)transitionValues0.values.get("android:clipBounds:bounds");
            }
            else if(rect1 == null) {
                rect1 = (Rect)transitionValues1.values.get("android:clipBounds:bounds");
            }
            if(rect0.equals(rect1)) {
                return null;
            }
            ViewCompat.setClipBounds(transitionValues1.view, rect0);
            Rect rect2 = new Rect();
            n n0 = new n(1);
            n0.b = rect2;
            animator0 = ObjectAnimator.ofObject(transitionValues1.view, r0.c, n0, new Rect[]{rect0, rect1});
            if(z) {
                animator0.addListener(new e(transitionValues1.view, 4));
            }
        }
        return animator0;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return ChangeClipBounds.I;
    }

    public static void l(TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        if(view0.getVisibility() == 8) {
            return;
        }
        Rect rect0 = ViewCompat.getClipBounds(view0);
        transitionValues0.values.put("android:clipBounds:clip", rect0);
        if(rect0 == null) {
            Rect rect1 = new Rect(0, 0, view0.getWidth(), view0.getHeight());
            transitionValues0.values.put("android:clipBounds:bounds", rect1);
        }
    }
}

