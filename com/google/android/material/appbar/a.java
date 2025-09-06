package com.google.android.material.appbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final MaterialShapeDrawable d;
    public final Integer e;

    public a(AppBarLayout appBarLayout0, ColorStateList colorStateList0, ColorStateList colorStateList1, MaterialShapeDrawable materialShapeDrawable0, Integer integer0) {
        this.a = appBarLayout0;
        this.b = colorStateList0;
        this.c = colorStateList1;
        this.d = materialShapeDrawable0;
        this.e = integer0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        AppBarLayout appBarLayout0 = this.a;
        appBarLayout0.getClass();
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        int v = MaterialColors.layer(this.b.getDefaultColor(), this.c.getDefaultColor(), f);
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        MaterialShapeDrawable materialShapeDrawable0 = this.d;
        materialShapeDrawable0.setFillColor(colorStateList0);
        if(appBarLayout0.v != null && (appBarLayout0.w != null && appBarLayout0.w.equals(this.e))) {
            DrawableCompat.setTint(appBarLayout0.v, v);
        }
        ArrayList arrayList0 = appBarLayout0.r;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                LiftOnScrollListener appBarLayout$LiftOnScrollListener0 = (LiftOnScrollListener)object0;
                if(materialShapeDrawable0.getFillColor() != null) {
                    appBarLayout$LiftOnScrollListener0.onUpdate(0.0f, v);
                }
            }
        }
    }
}

