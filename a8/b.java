package a8;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.progressindicator.BaseProgressIndicator;

public final class b extends AnimationCallback {
    public final BaseProgressIndicator b;

    public b(BaseProgressIndicator baseProgressIndicator0) {
        this.b = baseProgressIndicator0;
        super();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
    public final void onAnimationEnd(Drawable drawable0) {
        this.b.setIndeterminate(false);
        this.b.setProgressCompat(this.b.b, this.b.c);
    }
}

