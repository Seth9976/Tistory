package d5;

import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

public final class b implements Drawable.Callback {
    public final int a;
    public Object b;

    public b() {
        this.a = 1;
        super();
    }

    public b(AnimatedVectorDrawableCompat animatedVectorDrawableCompat0) {
        this.a = 0;
        super();
        this.b = animatedVectorDrawableCompat0;
    }

    private final void a(Drawable drawable0) {
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        if(this.a != 0) {
            return;
        }
        ((AnimatedVectorDrawableCompat)this.b).invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        if(this.a != 0) {
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.b;
            if(drawable$Callback0 != null) {
                drawable$Callback0.scheduleDrawable(drawable0, runnable0, v);
            }
            return;
        }
        ((AnimatedVectorDrawableCompat)this.b).scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        if(this.a != 0) {
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.b;
            if(drawable$Callback0 != null) {
                drawable$Callback0.unscheduleDrawable(drawable0, runnable0);
            }
            return;
        }
        ((AnimatedVectorDrawableCompat)this.b).unscheduleSelf(runnable0);
    }
}

