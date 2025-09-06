package com.google.android.material.transformation;

import a8.e;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet p;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @NonNull
    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View arg1, View arg2, boolean arg3, boolean arg4);

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean onExpandedStateChange(View view0, View view1, boolean z, boolean z1) {
        AnimatorSet animatorSet0 = this.p;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        AnimatorSet animatorSet1 = this.onCreateExpandedStateChangeAnimation(view0, view1, z, animatorSet0 != null);
        this.p = animatorSet1;
        animatorSet1.addListener(new e(this, 9));
        this.p.start();
        if(!z1) {
            this.p.end();
        }
        return true;
    }
}

