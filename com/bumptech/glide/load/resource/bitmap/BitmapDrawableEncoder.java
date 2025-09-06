package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

public class BitmapDrawableEncoder implements ResourceEncoder {
    public final BitmapPool a;
    public final ResourceEncoder b;

    public BitmapDrawableEncoder(BitmapPool bitmapPool0, ResourceEncoder resourceEncoder0) {
        this.a = bitmapPool0;
        this.b = resourceEncoder0;
    }

    public boolean encode(@NonNull Resource resource0, @NonNull File file0, @NonNull Options options0) {
        BitmapResource bitmapResource0 = new BitmapResource(((BitmapDrawable)resource0.get()).getBitmap(), this.a);
        return this.b.encode(bitmapResource0, file0, options0);
    }

    @Override  // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Object object0, @NonNull File file0, @NonNull Options options0) {
        return this.encode(((Resource)object0), file0, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options0) {
        return this.b.getEncodeStrategy(options0);
    }
}

