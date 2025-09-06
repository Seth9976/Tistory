package h7;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zai;

public final class c extends Drawable.ConstantState {
    public int a;
    public int b;

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}

