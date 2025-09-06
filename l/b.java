package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;

public final class b extends e {
    public LongSparseArray J;
    public SparseArrayCompat K;

    public b(b b0, AnimatedStateListDrawableCompat animatedStateListDrawableCompat0, Resources resources0) {
        super(b0, animatedStateListDrawableCompat0, resources0);
        if(b0 != null) {
            this.J = b0.J;
            this.K = b0.K;
            return;
        }
        this.J = new LongSparseArray();
        this.K = new SparseArrayCompat();
    }

    @Override  // l.e
    public final void f() {
        this.J = this.J.clone();
        this.K = this.K.clone();
    }

    public final int g(int v, int v1, Drawable drawable0, boolean z) {
        int v2 = this.a(drawable0);
        this.J.append(((long)v) << 0x20 | ((long)v1), ((long)(((long)v2) | (z ? 0x200000000L : 0L))));
        if(z) {
            this.J.append(((long)v) | ((long)v1) << 0x20, ((long)(0x100000000L | ((long)v2) | 0x200000000L)));
        }
        return v2;
    }

    @Override  // l.e
    public final Drawable newDrawable() {
        return new AnimatedStateListDrawableCompat(this, null);
    }

    @Override  // l.e
    public final Drawable newDrawable(Resources resources0) {
        return new AnimatedStateListDrawableCompat(this, resources0);
    }
}

