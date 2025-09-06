package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import java.io.File;

public final class g implements Writer {
    public final Encoder a;
    public final Object b;
    public final Options c;

    public g(Encoder encoder0, Object object0, Options options0) {
        this.a = encoder0;
        this.b = object0;
        this.c = options0;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache$Writer
    public final boolean write(File file0) {
        return this.a.encode(this.b, file0, this.c);
    }
}

