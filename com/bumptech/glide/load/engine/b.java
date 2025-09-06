package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class b extends WeakReference {
    public final Key a;
    public final boolean b;
    public Resource c;

    public b(Key key0, z z0, ReferenceQueue referenceQueue0, boolean z1) {
        super(z0, referenceQueue0);
        this.a = (Key)Preconditions.checkNotNull(key0);
        this.c = !z0.a || !z1 ? null : ((Resource)Preconditions.checkNotNull(z0.c));
        this.b = z0.a;
    }
}

