package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

public final class y implements Key {
    public final Object a;
    public final int b;
    public final int c;
    public final Class d;
    public final Class e;
    public final Key f;
    public final Map g;
    public final Options h;
    public int i;

    public y(Object object0, Key key0, int v, int v1, Map map0, Class class0, Class class1, Options options0) {
        this.a = Preconditions.checkNotNull(object0);
        this.f = (Key)Preconditions.checkNotNull(key0, "Signature must not be null");
        this.b = v;
        this.c = v1;
        this.g = (Map)Preconditions.checkNotNull(map0);
        this.d = (Class)Preconditions.checkNotNull(class0, "Resource class must not be null");
        this.e = (Class)Preconditions.checkNotNull(class1, "Transcode class must not be null");
        this.h = (Options)Preconditions.checkNotNull(options0);
    }

    // 去混淆评级： 中等(70)
    @Override  // com.bumptech.glide.load.Key
    public final boolean equals(Object object0) {
        return object0 instanceof y && this.a.equals(((y)object0).a) && this.f.equals(((y)object0).f) && this.c == ((y)object0).c && this.b == ((y)object0).b && this.g.equals(((y)object0).g) && this.d.equals(((y)object0).d) && this.e.equals(((y)object0).e) && this.h.equals(((y)object0).h);
    }

    @Override  // com.bumptech.glide.load.Key
    public final int hashCode() {
        if(this.i == 0) {
            this.i = this.h.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.g.hashCode() + (((this.f.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
        }
        return this.i;
    }

    @Override
    public final String toString() {
        return "EngineKey{model=" + this.a + ", width=" + this.b + ", height=" + this.c + ", resourceClass=" + this.d + ", transcodeClass=" + this.e + ", signature=" + this.f + ", hashCode=" + this.i + ", transformations=" + this.g + ", options=" + this.h + '}';
    }

    @Override  // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest0) {
        throw new UnsupportedOperationException();
    }
}

