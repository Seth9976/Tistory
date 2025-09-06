package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.a;
import java.io.IOException;

public final class UnitBitmapDecoder implements ResourceDecoder {
    public Resource decode(@NonNull Bitmap bitmap0, int v, int v1, @NonNull Options options0) {
        return new a(bitmap0, 2);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((Bitmap)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Bitmap bitmap0, @NonNull Options options0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((Bitmap)object0), options0);
    }
}

