package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class f implements Key {
    public final Key a;
    public final Key b;

    public f(Key key0, Key key1) {
        this.a = key0;
        this.b = key1;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.load.Key
    public final boolean equals(Object object0) {
        return object0 instanceof f && this.a.equals(((f)object0).a) && this.b.equals(((f)object0).b);
    }

    @Override  // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.a + ", signature=" + this.b + '}';
    }

    @Override  // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest0) {
        this.a.updateDiskCacheKey(messageDigest0);
        this.b.updateDiskCacheKey(messageDigest0);
    }
}

