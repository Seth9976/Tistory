package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import com.bumptech.glide.util.Util;

public final class g implements Poolable {
    public final d a;
    public int b;
    public Bitmap.Config c;

    public g(d d0) {
        this.a = d0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g && this.b == ((g)object0).b && Util.bothNullOrEqual(this.c, ((g)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.b * 0x1F;
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
    public final void offer() {
        this.a.a(this);
    }

    @Override
    public final String toString() {
        return "[" + this.b + "](" + this.c + ")";
    }
}

