package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class InputStreamRewinder implements DataRewinder {
    public static final class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory {
        public final ArrayPool a;

        public Factory(ArrayPool arrayPool0) {
            this.a = arrayPool0;
        }

        @NonNull
        public DataRewinder build(InputStream inputStream0) {
            return new InputStreamRewinder(inputStream0, this.a);
        }

        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public DataRewinder build(Object object0) {
            return this.build(((InputStream)object0));
        }

        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public Class getDataClass() {
            return InputStream.class;
        }
    }

    public final RecyclableBufferedInputStream a;

    public InputStreamRewinder(InputStream inputStream0, ArrayPool arrayPool0) {
        RecyclableBufferedInputStream recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(inputStream0, arrayPool0);
        this.a = recyclableBufferedInputStream0;
        recyclableBufferedInputStream0.mark(0x500000);
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
        this.a.release();
    }

    public void fixMarkLimits() {
        this.a.fixMarkLimit();
    }

    @NonNull
    public InputStream rewindAndGet() throws IOException {
        this.a.reset();
        return this.a;
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    public Object rewindAndGet() throws IOException {
        return this.rewindAndGet();
    }
}

