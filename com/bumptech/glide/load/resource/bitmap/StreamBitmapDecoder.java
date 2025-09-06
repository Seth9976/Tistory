package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamBitmapDecoder implements ResourceDecoder {
    public final Downsampler a;
    public final ArrayPool b;

    public StreamBitmapDecoder(Downsampler downsampler0, ArrayPool arrayPool0) {
        this.a = downsampler0;
        this.b = arrayPool0;
    }

    public Resource decode(@NonNull InputStream inputStream0, int v, int v1, @NonNull Options options0) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream0;
        if(inputStream0 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream0 = (RecyclableBufferedInputStream)inputStream0;
            z = false;
        }
        else {
            z = true;
            recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(inputStream0, this.b);
        }
        ExceptionPassthroughInputStream exceptionPassthroughInputStream0 = ExceptionPassthroughInputStream.obtain(recyclableBufferedInputStream0);
        MarkEnforcingInputStream markEnforcingInputStream0 = new MarkEnforcingInputStream(exceptionPassthroughInputStream0);
        m m0 = new m(recyclableBufferedInputStream0, exceptionPassthroughInputStream0);
        try {
            return this.a.decode(markEnforcingInputStream0, v, v1, options0, m0);
        }
        finally {
            exceptionPassthroughInputStream0.release();
            if(z) {
                recyclableBufferedInputStream0.release();
            }
        }
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((InputStream)object0), v, v1, options0);
    }

    public boolean handles(@NonNull InputStream inputStream0, @NonNull Options options0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((InputStream)object0), options0);
    }
}

