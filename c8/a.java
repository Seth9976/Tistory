package c8;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.shape.MaterialShapeDrawable;

public final class a extends Drawable.ConstantState {
    public MaterialShapeDrawable a;
    public boolean b;

    public a(a a0) {
        this.a = (MaterialShapeDrawable)a0.a.getConstantState().newDrawable();
        this.b = a0.b;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new RippleDrawableCompat(new a(this));
    }
}

