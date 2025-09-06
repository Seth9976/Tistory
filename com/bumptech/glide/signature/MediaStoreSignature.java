package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class MediaStoreSignature implements Key {
    public final String a;
    public final long b;
    public final int c;

    public MediaStoreSignature(@Nullable String s, long v, int v1) {
        if(s == null) {
            s = "";
        }
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.b != ((MediaStoreSignature)object0).b) {
            return false;
        }
        return this.c == ((MediaStoreSignature)object0).c ? this.a.equals(((MediaStoreSignature)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(ByteBuffer.allocate(12).putLong(this.b).putInt(this.c).array());
        messageDigest0.update(this.a.getBytes(Key.CHARSET));
    }
}

