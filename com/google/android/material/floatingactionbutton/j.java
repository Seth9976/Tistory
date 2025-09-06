package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.menu.f;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.animator;
import com.google.android.material.animation.MotionSpec;

public final class j extends b {
    public final Size g;
    public final boolean h;
    public final ExtendedFloatingActionButton i;

    public j(ExtendedFloatingActionButton extendedFloatingActionButton0, f f0, Size extendedFloatingActionButton$Size0, boolean z) {
        this.i = extendedFloatingActionButton0;
        super(extendedFloatingActionButton0, f0);
        this.g = extendedFloatingActionButton$Size0;
        this.h = z;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final AnimatorSet createAnimator() {
        MotionSpec motionSpec0 = this.getCurrentMotionSpec();
        boolean z = motionSpec0.hasPropertyValues("width");
        Size extendedFloatingActionButton$Size0 = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.i;
        if(z) {
            PropertyValuesHolder[] arr_propertyValuesHolder = motionSpec0.getPropertyValues("width");
            arr_propertyValuesHolder[0].setFloatValues(new float[]{((float)extendedFloatingActionButton0.getWidth()), ((float)extendedFloatingActionButton$Size0.getWidth())});
            motionSpec0.setPropertyValues("width", arr_propertyValuesHolder);
        }
        if(motionSpec0.hasPropertyValues("height")) {
            PropertyValuesHolder[] arr_propertyValuesHolder1 = motionSpec0.getPropertyValues("height");
            arr_propertyValuesHolder1[0].setFloatValues(new float[]{((float)extendedFloatingActionButton0.getHeight()), ((float)extendedFloatingActionButton$Size0.getHeight())});
            motionSpec0.setPropertyValues("height", arr_propertyValuesHolder1);
        }
        if(motionSpec0.hasPropertyValues("paddingStart")) {
            PropertyValuesHolder[] arr_propertyValuesHolder2 = motionSpec0.getPropertyValues("paddingStart");
            arr_propertyValuesHolder2[0].setFloatValues(new float[]{((float)ViewCompat.getPaddingStart(extendedFloatingActionButton0)), ((float)extendedFloatingActionButton$Size0.getPaddingStart())});
            motionSpec0.setPropertyValues("paddingStart", arr_propertyValuesHolder2);
        }
        if(motionSpec0.hasPropertyValues("paddingEnd")) {
            PropertyValuesHolder[] arr_propertyValuesHolder3 = motionSpec0.getPropertyValues("paddingEnd");
            arr_propertyValuesHolder3[0].setFloatValues(new float[]{((float)ViewCompat.getPaddingEnd(extendedFloatingActionButton0)), ((float)extendedFloatingActionButton$Size0.getPaddingEnd())});
            motionSpec0.setPropertyValues("paddingEnd", arr_propertyValuesHolder3);
        }
        if(motionSpec0.hasPropertyValues("labelOpacity")) {
            PropertyValuesHolder[] arr_propertyValuesHolder4 = motionSpec0.getPropertyValues("labelOpacity");
            float f = 1.0f;
            float f1 = this.h ? 0.0f : 1.0f;
            if(!this.h) {
                f = 0.0f;
            }
            arr_propertyValuesHolder4[0].setFloatValues(new float[]{f1, f});
            motionSpec0.setPropertyValues("labelOpacity", arr_propertyValuesHolder4);
        }
        return this.a(motionSpec0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final int getDefaultMotionSpecResource() {
        return this.h ? animator.mtrl_extended_fab_change_size_expand_motion_spec : animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        this.i.E = false;
        this.i.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            return;
        }
        viewGroup$LayoutParams0.width = this.g.getLayoutParams().width;
        viewGroup$LayoutParams0.height = this.g.getLayoutParams().height;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationStart(Animator animator0) {
        super.onAnimationStart(animator0);
        this.i.D = this.h;
        this.i.E = true;
        this.i.setHorizontallyScrolling(true);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void onChange(OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        if(extendedFloatingActionButton$OnChangedCallback0 == null) {
            return;
        }
        if(this.h) {
        }
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void performNow() {
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.i;
        boolean z = this.h;
        extendedFloatingActionButton0.D = z;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = extendedFloatingActionButton0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            return;
        }
        if(!z) {
            extendedFloatingActionButton0.G = viewGroup$LayoutParams0.width;
            extendedFloatingActionButton0.H = viewGroup$LayoutParams0.height;
        }
        viewGroup$LayoutParams0.width = this.g.getLayoutParams().width;
        viewGroup$LayoutParams0.height = this.g.getLayoutParams().height;
        ViewCompat.setPaddingRelative(extendedFloatingActionButton0, this.g.getPaddingStart(), extendedFloatingActionButton0.getPaddingTop(), this.g.getPaddingEnd(), extendedFloatingActionButton0.getPaddingBottom());
        extendedFloatingActionButton0.requestLayout();
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final boolean shouldCancel() {
        return this.h == this.i.D || this.i.getIcon() == null || TextUtils.isEmpty(this.i.getText());
    }
}

