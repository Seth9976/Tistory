package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface GifDecoder {
    public interface BitmapProvider {
        @NonNull
        Bitmap obtain(int arg1, int arg2, @NonNull Bitmap.Config arg3);

        @NonNull
        byte[] obtainByteArray(int arg1);

        @NonNull
        int[] obtainIntArray(int arg1);

        void release(@NonNull Bitmap arg1);

        void release(@NonNull byte[] arg1);

        void release(@NonNull int[] arg1);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER;

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    @NonNull
    ByteBuffer getData();

    int getDelay(int arg1);

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    @Nullable
    Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(@Nullable InputStream arg1, int arg2);

    int read(@Nullable byte[] arg1);

    void resetFrameIndex();

    void setData(@NonNull GifHeader arg1, @NonNull ByteBuffer arg2);

    void setData(@NonNull GifHeader arg1, @NonNull ByteBuffer arg2, int arg3);

    void setData(@NonNull GifHeader arg1, @NonNull byte[] arg2);

    void setDefaultBitmapConfig(@NonNull Bitmap.Config arg1);
}

