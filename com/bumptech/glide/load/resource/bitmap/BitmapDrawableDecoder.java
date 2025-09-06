package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;

public class BitmapDrawableDecoder implements ResourceDecoder {
    public final ResourceDecoder a;
    public final Resources b;

    public BitmapDrawableDecoder(Context context0, ResourceDecoder resourceDecoder0) {
        this(context0.getResources(), resourceDecoder0);
    }

    public BitmapDrawableDecoder(@NonNull Resources resources0, @NonNull ResourceDecoder resourceDecoder0) {
        this.b = (Resources)Preconditions.checkNotNull(resources0);
        this.a = (ResourceDecoder)Preconditions.checkNotNull(resourceDecoder0);
    }

    @Deprecated
    public BitmapDrawableDecoder(Resources resources0, BitmapPool bitmapPool0, ResourceDecoder resourceDecoder0) {
        this(resources0, resourceDecoder0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        Resource resource0 = this.a.decode(object0, v, v1, options0);
        return LazyBitmapDrawableResource.obtain(this.b, resource0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.a.handles(object0, options0);
    }
}

