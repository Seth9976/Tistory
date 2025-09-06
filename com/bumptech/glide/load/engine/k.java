package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;

public final class k {
    public Key a;
    public ResourceEncoder b;
    public c0 c;

    public final void a(t t0, Options options0) {
        try {
            t0.getDiskCache().put(this.a, new g(this.b, this.c, options0));
        }
        finally {
            this.c.a();
        }
    }
}

