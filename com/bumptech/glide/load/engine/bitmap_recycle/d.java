package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.emoji2.text.g;

public final class d extends g {
    public final int b;

    public d(int v) {
        this.b = v;
        super();
    }

    public final Poolable b() {
        return this.b != 0 ? new com.bumptech.glide.load.engine.bitmap_recycle.g(this) : new c(this);
    }
}

