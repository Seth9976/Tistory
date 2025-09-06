package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import java.io.IOException;

public final class GifFrameResourceDecoder implements ResourceDecoder {
    public final BitmapPool a;

    public GifFrameResourceDecoder(BitmapPool bitmapPool0) {
        this.a = bitmapPool0;
    }

    public Resource decode(@NonNull GifDecoder gifDecoder0, int v, int v1, @NonNull Options options0) {
        return BitmapResource.obtain(gifDecoder0.getNextFrame(), this.a);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((GifDecoder)object0), v, v1, options0);
    }

    public boolean handles(@NonNull GifDecoder gifDecoder0, @NonNull Options options0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((GifDecoder)object0), options0);
    }
}

