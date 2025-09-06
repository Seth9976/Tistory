package l;

import android.graphics.drawable.Animatable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import g.b;

public final class a extends b {
    public final int b;
    public final Animatable c;

    public a(Animatable animatable0, int v) {
        this.b = v;
        this.c = animatable0;
        super();
    }

    @Override  // g.b
    public final void F() {
        if(this.b != 0) {
            ((AnimatedVectorDrawableCompat)this.c).start();
            return;
        }
        this.c.start();
    }

    @Override  // g.b
    public final void G() {
        if(this.b != 0) {
            ((AnimatedVectorDrawableCompat)this.c).stop();
            return;
        }
        this.c.stop();
    }
}

