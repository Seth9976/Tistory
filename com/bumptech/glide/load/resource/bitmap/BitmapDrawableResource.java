package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

public class BitmapDrawableResource extends DrawableResource implements Initializable {
    public final BitmapPool a;

    public BitmapDrawableResource(BitmapDrawable bitmapDrawable0, BitmapPool bitmapPool0) {
        super(bitmapDrawable0);
        this.a = bitmapPool0;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Util.getBitmapByteSize(((BitmapDrawable)this.drawable).getBitmap());
    }

    @Override  // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        ((BitmapDrawable)this.drawable).getBitmap().prepareToDraw();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        Bitmap bitmap0 = ((BitmapDrawable)this.drawable).getBitmap();
        this.a.put(bitmap0);
    }
}

