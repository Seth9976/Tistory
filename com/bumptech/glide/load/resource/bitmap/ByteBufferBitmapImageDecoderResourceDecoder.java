package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(api = 28)
public final class ByteBufferBitmapImageDecoderResourceDecoder implements ResourceDecoder {
    public final BitmapImageDecoderResourceDecoder a;

    public ByteBufferBitmapImageDecoderResourceDecoder() {
        this.a = new BitmapImageDecoderResourceDecoder();
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((ByteBuffer)object0), v, v1, options0);
    }

    public Resource decode(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull Options options0) throws IOException {
        ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(byteBuffer0);
        return this.a.decode(imageDecoder$Source0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((ByteBuffer)object0), options0);
    }

    public boolean handles(@NonNull ByteBuffer byteBuffer0, @NonNull Options options0) throws IOException {
        return true;
    }
}

