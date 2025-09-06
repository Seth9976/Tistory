package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import java.io.IOException;

public class ResourceBitmapDecoder implements ResourceDecoder {
    public final ResourceDrawableDecoder a;
    public final BitmapPool b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder0, BitmapPool bitmapPool0) {
        this.a = resourceDrawableDecoder0;
        this.b = bitmapPool0;
    }

    @Nullable
    public Resource decode(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        Resource resource0 = this.a.decode(uri0, v, v1, options0);
        if(resource0 == null) {
            return null;
        }
        Drawable drawable0 = (Drawable)resource0.get();
        return k.a(this.b, drawable0, v, v1);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0, @NonNull Options options0) {
        return "android.resource".equals(uri0.getScheme());
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((Uri)object0), options0);
    }
}

