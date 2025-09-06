package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class GranularRoundedCorners extends BitmapTransformation {
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public static final byte[] l;

    static {
        GranularRoundedCorners.l = new byte[]{99, 0x6F, 109, 46, 98, 0x75, 109, 0x70, 0x74, 101, 99, 104, 46, 103, 108, 105, 100, 101, 46, 108, 0x6F, 97, 100, 46, 0x72, 101, 0x73, 0x6F, 0x75, 0x72, 99, 101, 46, 98, 105, 0x74, 109, 97, 0x70, 46, 71, 0x72, 97, 110, 0x75, 108, 97, 0x72, 82, 0x6F, 0x75, 110, 100, 101, 100, 67, 0x6F, 0x72, 110, 101, 0x72, 0x73};
    }

    public GranularRoundedCorners(float f, float f1, float f2, float f3) {
        this.h = f;
        this.i = f1;
        this.j = f2;
        this.k = f3;
    }

    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof GranularRoundedCorners && this.h == ((GranularRoundedCorners)object0).h && this.i == ((GranularRoundedCorners)object0).i && this.j == ((GranularRoundedCorners)object0).j && this.k == ((GranularRoundedCorners)object0).k;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.k, Util.hashCode(this.j, Util.hashCode(this.i, Util.hashCode(this.h) * 0x1F - 0x78051026)));
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1) {
        return TransformationUtils.roundedCorners(bitmapPool0, bitmap0, this.h, this.i, this.j, this.k);
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(GranularRoundedCorners.l);
        messageDigest0.update(ByteBuffer.allocate(16).putFloat(this.h).putFloat(this.i).putFloat(this.j).putFloat(this.k).array());
    }
}

