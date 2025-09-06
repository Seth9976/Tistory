package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

public class BitmapResource implements Initializable, Resource {
    public final Bitmap a;
    public final BitmapPool b;

    public BitmapResource(@NonNull Bitmap bitmap0, @NonNull BitmapPool bitmapPool0) {
        this.a = (Bitmap)Preconditions.checkNotNull(bitmap0, "Bitmap must not be null");
        this.b = (BitmapPool)Preconditions.checkNotNull(bitmapPool0, "BitmapPool must not be null");
    }

    @NonNull
    public Bitmap get() {
        return this.a;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Object get() {
        return this.get();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class getResourceClass() {
        return Bitmap.class;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Util.getBitmapByteSize(this.a);
    }

    @Override  // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        this.a.prepareToDraw();
    }

    @Nullable
    public static BitmapResource obtain(@Nullable Bitmap bitmap0, @NonNull BitmapPool bitmapPool0) {
        return bitmap0 == null ? null : new BitmapResource(bitmap0, bitmapPool0);
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.b.put(this.a);
    }
}

