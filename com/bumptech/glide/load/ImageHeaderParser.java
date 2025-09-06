package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
    public static enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        public final boolean a;

        public ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            switch(a.a[this.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static final int UNKNOWN_ORIENTATION = -1;

    int getOrientation(@NonNull InputStream arg1, @NonNull ArrayPool arg2) throws IOException;

    int getOrientation(@NonNull ByteBuffer arg1, @NonNull ArrayPool arg2) throws IOException;

    @NonNull
    ImageType getType(@NonNull InputStream arg1) throws IOException;

    @NonNull
    ImageType getType(@NonNull ByteBuffer arg1) throws IOException;
}

