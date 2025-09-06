package a8;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.progressindicator.BaseProgressIndicator;

public final class c extends AnimationCallback {
    public final BaseProgressIndicator b;

    public c(BaseProgressIndicator baseProgressIndicator0) {
        this.b = baseProgressIndicator0;
        super();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
    public final void onAnimationEnd(Drawable drawable0) {
        super.onAnimationEnd(drawable0);
        BaseProgressIndicator baseProgressIndicator0 = this.b;
        if(!baseProgressIndicator0.i) {
            baseProgressIndicator0.setVisibility(baseProgressIndicator0.j);
        }
    }
}

