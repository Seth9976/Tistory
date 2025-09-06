package t7;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.checkbox.MaterialCheckBox;

public final class a extends AnimationCallback {
    public final MaterialCheckBox b;

    public a(MaterialCheckBox materialCheckBox0) {
        this.b = materialCheckBox0;
        super();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
    public final void onAnimationEnd(Drawable drawable0) {
        super.onAnimationEnd(drawable0);
        ColorStateList colorStateList0 = this.b.o;
        if(colorStateList0 != null) {
            DrawableCompat.setTintList(drawable0, colorStateList0);
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
    public final void onAnimationStart(Drawable drawable0) {
        super.onAnimationStart(drawable0);
        MaterialCheckBox materialCheckBox0 = this.b;
        ColorStateList colorStateList0 = materialCheckBox0.o;
        if(colorStateList0 != null) {
            DrawableCompat.setTint(drawable0, colorStateList0.getColorForState(materialCheckBox0.s, colorStateList0.getDefaultColor()));
        }
    }
}

