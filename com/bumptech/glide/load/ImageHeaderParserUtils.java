package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ImageHeaderParserUtils {
    interface OrientationReader {
        int getOrientationAndRewind(ImageHeaderParser arg1) throws IOException;
    }

    interface TypeReader {
        ImageType getTypeAndRewind(ImageHeaderParser arg1) throws IOException;
    }

    @RequiresApi(21)
    public static int getOrientation(@NonNull List list0, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, @NonNull ArrayPool arrayPool0) throws IOException {
        int v2;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            RecyclableBufferedInputStream recyclableBufferedInputStream0 = null;
            try {
                recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder0.rewindAndGet().getFileDescriptor()), arrayPool0);
                v2 = imageHeaderParser0.getOrientation(recyclableBufferedInputStream0, arrayPool0);
            }
            catch(Throwable throwable0) {
                if(recyclableBufferedInputStream0 != null) {
                    recyclableBufferedInputStream0.release();
                }
                parcelFileDescriptorRewinder0.rewindAndGet();
                throw throwable0;
            }
            recyclableBufferedInputStream0.release();
            parcelFileDescriptorRewinder0.rewindAndGet();
            if(v2 != -1) {
                return v2;
            }
        }
        return -1;
    }

    public static int getOrientation(@NonNull List list0, @Nullable InputStream inputStream0, @NonNull ArrayPool arrayPool0) throws IOException {
        int v3;
        if(inputStream0 == null) {
            return -1;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new RecyclableBufferedInputStream(inputStream0, arrayPool0);
        }
        inputStream0.mark(0x500000);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            try {
                v3 = imageHeaderParser0.getOrientation(inputStream0, arrayPool0);
            }
            finally {
                inputStream0.reset();
            }
            if(v3 != -1) {
                return v3;
            }
        }
        return -1;
    }

    public static int getOrientation(@NonNull List list0, @Nullable ByteBuffer byteBuffer0, @NonNull ArrayPool arrayPool0) throws IOException {
        int v3;
        if(byteBuffer0 == null) {
            return -1;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            try {
                v3 = imageHeaderParser0.getOrientation(byteBuffer0, arrayPool0);
            }
            finally {
                ByteBufferUtil.rewind(byteBuffer0);
            }
            if(v3 != -1) {
                return v3;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageType getType(@NonNull List list0, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, @NonNull ArrayPool arrayPool0) throws IOException {
        ImageType imageHeaderParser$ImageType0;
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            RecyclableBufferedInputStream recyclableBufferedInputStream0 = null;
            try {
                recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder0.rewindAndGet().getFileDescriptor()), arrayPool0);
                imageHeaderParser$ImageType0 = imageHeaderParser0.getType(recyclableBufferedInputStream0);
            }
            catch(Throwable throwable0) {
                if(recyclableBufferedInputStream0 != null) {
                    recyclableBufferedInputStream0.release();
                }
                parcelFileDescriptorRewinder0.rewindAndGet();
                throw throwable0;
            }
            recyclableBufferedInputStream0.release();
            parcelFileDescriptorRewinder0.rewindAndGet();
            if(imageHeaderParser$ImageType0 == ImageType.UNKNOWN) {
                ++v1;
                continue;
            }
            return imageHeaderParser$ImageType0;
        }
        return ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageType getType(@NonNull List list0, @Nullable InputStream inputStream0, @NonNull ArrayPool arrayPool0) throws IOException {
        ImageType imageHeaderParser$ImageType0;
        if(inputStream0 == null) {
            return ImageType.UNKNOWN;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new RecyclableBufferedInputStream(inputStream0, arrayPool0);
        }
        inputStream0.mark(0x500000);
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            try {
                imageHeaderParser$ImageType0 = imageHeaderParser0.getType(inputStream0);
            }
            finally {
                inputStream0.reset();
            }
            if(imageHeaderParser$ImageType0 == ImageType.UNKNOWN) {
                ++v1;
                continue;
            }
            return imageHeaderParser$ImageType0;
        }
        return ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageType getType(@NonNull List list0, @Nullable ByteBuffer byteBuffer0) throws IOException {
        ImageType imageHeaderParser$ImageType0;
        if(byteBuffer0 == null) {
            return ImageType.UNKNOWN;
        }
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            ImageHeaderParser imageHeaderParser0 = (ImageHeaderParser)list0.get(v1);
            try {
                imageHeaderParser$ImageType0 = imageHeaderParser0.getType(byteBuffer0);
            }
            finally {
                ByteBufferUtil.rewind(byteBuffer0);
            }
            if(imageHeaderParser$ImageType0 == ImageType.UNKNOWN) {
                ++v1;
                continue;
            }
            return imageHeaderParser$ImageType0;
        }
        return ImageType.UNKNOWN;
    }
}

