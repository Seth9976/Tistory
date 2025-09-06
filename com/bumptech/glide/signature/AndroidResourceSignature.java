package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class AndroidResourceSignature implements Key {
    public final int a;
    public final Key b;

    public AndroidResourceSignature(int v, Key key0) {
        this.a = v;
        this.b = key0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof AndroidResourceSignature && this.a == ((AndroidResourceSignature)object0).a && this.b.equals(((AndroidResourceSignature)object0).b);
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.b, this.a);
    }

    @NonNull
    public static Key obtain(@NonNull Context context0) {
        Key key0 = ApplicationVersionSignature.obtain(context0);
        return new AndroidResourceSignature(context0.getResources().getConfiguration().uiMode & 0x30, key0);
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        this.b.updateDiskCacheKey(messageDigest0);
        messageDigest0.update(ByteBuffer.allocate(4).putInt(this.a).array());
    }
}

