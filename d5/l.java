package d5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public final class l extends Drawable.ConstantState {
    public int a;
    public k b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new VectorDrawableCompat(this);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        return new VectorDrawableCompat(this);
    }
}

