package d5;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public final class m extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public m(Drawable.ConstantState drawable$ConstantState0) {
        this.a = drawable$ConstantState0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        Drawable drawable0 = new VectorDrawableCompat();
        drawable0.a = (VectorDrawable)this.a.newDrawable();
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        Drawable drawable0 = new VectorDrawableCompat();
        drawable0.a = (VectorDrawable)this.a.newDrawable(resources0);
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
        Drawable drawable0 = new VectorDrawableCompat();
        drawable0.a = (VectorDrawable)this.a.newDrawable(resources0, resources$Theme0);
        return drawable0;
    }
}

