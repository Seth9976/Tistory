package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

public class BitmapDrawableTranscoder implements ResourceTranscoder {
    public final Resources a;

    public BitmapDrawableTranscoder(@NonNull Context context0) {
        this(context0.getResources());
    }

    public BitmapDrawableTranscoder(@NonNull Resources resources0) {
        this.a = (Resources)Preconditions.checkNotNull(resources0);
    }

    @Deprecated
    public BitmapDrawableTranscoder(@NonNull Resources resources0, BitmapPool bitmapPool0) {
        this(resources0);
    }

    @Override  // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource transcode(@NonNull Resource resource0, @NonNull Options options0) {
        return LazyBitmapDrawableResource.obtain(this.a, resource0);
    }
}

