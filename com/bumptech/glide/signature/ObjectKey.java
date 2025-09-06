package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class ObjectKey implements Key {
    public final Object a;

    public ObjectKey(@NonNull Object object0) {
        this.a = Preconditions.checkNotNull(object0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof ObjectKey ? this.a.equals(((ObjectKey)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectKey{object=" + this.a + '}';
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(this.a.toString().getBytes(Key.CHARSET));
    }
}

