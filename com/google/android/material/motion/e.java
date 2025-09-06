package com.google.android.material.motion;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPickerBinding;
import f8.i;
import kotlin.jvm.internal.Intrinsics;
import s7.b;

public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final Object b;

    public e(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((ClippableRoundedCornerLayout)object0).updateCornerRadius(((float)(((Float)valueAnimator0.getAnimatedValue()))));
                return;
            }
            case 1: {
                ((DrawerArrowDrawable)object0).setProgress(((float)(((Float)valueAnimator0.getAnimatedValue()))));
                return;
            }
            case 2: {
                ((FadeThroughDrawable)object0).setProgress(((float)(((Float)valueAnimator0.getAnimatedValue()))));
                return;
            }
            case 3: {
                ((i)object0).getClass();
                float f1 = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ((i)object0).d.setAlpha(f1);
                return;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((PickerFragment)object0), "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator0, "it");
                if(((PickerFragment)object0).getView() != null) {
                    Object object1 = valueAnimator0.getAnimatedValue();
                    Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
                    int v = (int)(((Integer)object1));
                    KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = ((PickerFragment)object0).z;
                    Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = kphotopickerFragmentPhotoPickerBinding0.keLayoutSelectAnimation.getLayoutParams();
                    if(viewGroup$LayoutParams0 != null) {
                        viewGroup$LayoutParams0.height = v;
                    }
                    KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = ((PickerFragment)object0).z;
                    Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
                    kphotopickerFragmentPhotoPickerBinding1.keLayoutSelectAnimation.requestLayout();
                }
                return;
            }
            case 5: {
                ((b)object0).getClass();
                float f2 = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ((b)object0).j.setAlpha(((int)(255.0f * f2)));
                ((b)object0).y = f2;
                return;
            }
            default: {
                float f = valueAnimator0.getAnimatedFraction();
                ((DrawerLayout)object0).setScrimColor(ColorUtils.setAlphaComponent(0x99000000, AnimationUtils.lerp(DrawerLayoutUtils.a, 0, f)));
            }
        }
    }
}

