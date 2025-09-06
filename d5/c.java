package d5;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.collection.ArrayMap;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.util.ArrayList;

public final class c extends Drawable.ConstantState {
    public VectorDrawableCompat a;
    public AnimatorSet b;
    public ArrayList c;
    public ArrayMap d;

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}

