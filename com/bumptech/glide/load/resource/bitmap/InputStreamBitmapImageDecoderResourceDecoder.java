package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(api = 28)
public final class InputStreamBitmapImageDecoderResourceDecoder implements ResourceDecoder {
    public final BitmapImageDecoderResourceDecoder a;

    public InputStreamBitmapImageDecoderResourceDecoder() {
        this.a = new BitmapImageDecoderResourceDecoder();
    }

    public Resource decode(@NonNull InputStream inputStream0, int v, int v1, @NonNull Options options0) throws IOException {
        ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream0));
        return this.a.decode(imageDecoder$Source0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((InputStream)object0), v, v1, options0);
    }

    public boolean handles(@NonNull InputStream inputStream0, @NonNull Options options0) throws IOException {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((InputStream)object0), options0);
    }
}

