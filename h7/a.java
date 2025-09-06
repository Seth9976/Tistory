package h7;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class a extends Drawable.ConstantState {
    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return b.a;
    }
}

