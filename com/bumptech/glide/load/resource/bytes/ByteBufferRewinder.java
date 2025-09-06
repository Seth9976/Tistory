package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferRewinder implements DataRewinder {
    public static class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory {
        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public DataRewinder build(Object object0) {
            return this.build(((ByteBuffer)object0));
        }

        @NonNull
        public DataRewinder build(ByteBuffer byteBuffer0) {
            return new ByteBufferRewinder(byteBuffer0);
        }

        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public Class getDataClass() {
            return ByteBuffer.class;
        }
    }

    public final ByteBuffer a;

    public ByteBufferRewinder(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    public Object rewindAndGet() throws IOException {
        return this.rewindAndGet();
    }

    @NonNull
    public ByteBuffer rewindAndGet() {
        this.a.position(0);
        return this.a;
    }
}

