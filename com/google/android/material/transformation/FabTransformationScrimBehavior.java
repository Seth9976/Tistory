package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.m;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0L;
    public static final long COLLAPSE_DURATION = 150L;
    public static final long EXPAND_DELAY = 75L;
    public static final long EXPAND_DURATION = 150L;
    public final MotionTiming q;
    public final MotionTiming r;

    public FabTransformationScrimBehavior() {
        this.q = new MotionTiming(75L, 150L);
        this.r = new MotionTiming(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.q = new MotionTiming(75L, 150L);
        this.r = new MotionTiming(0L, 150L);
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        return view1 instanceof FloatingActionButton;
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        ObjectAnimator objectAnimator0;
        ArrayList arrayList0 = new ArrayList();
        new ArrayList();
        MotionTiming motionTiming0 = z ? this.q : this.r;
        if(z) {
            if(!z1) {
                view1.setAlpha(0.0f);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[]{1.0f});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[]{0.0f});
        }
        motionTiming0.apply(objectAnimator0);
        arrayList0.add(objectAnimator0);
        AnimatorSet animatorSet0 = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        animatorSet0.addListener(new m(view1, z));
        return animatorSet0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        return super.onTouchEvent(coordinatorLayout0, view0, motionEvent0);
    }
}

