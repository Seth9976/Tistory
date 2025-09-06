package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Preconditions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

interface ImageReader {
    public static final class ByteArrayReader implements ImageReader {
        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options bitmapFactory$Options0) {
            throw null;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(null, ByteBuffer.wrap(null), null);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(null, ByteBuffer.wrap(null));
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    public static final class ByteBufferReader implements ImageReader {
        public final ByteBuffer a;
        public final List b;
        public final ArrayPool c;

        public ByteBufferReader(List list0, ByteBuffer byteBuffer0, ArrayPool arrayPool0) {
            this.a = byteBuffer0;
            this.b = list0;
            this.c = arrayPool0;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options bitmapFactory$Options0) {
            return BitmapFactory.decodeStream(ByteBufferUtil.toStream(ByteBufferUtil.rewind(this.a)), null, bitmapFactory$Options0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            ByteBuffer byteBuffer0 = ByteBufferUtil.rewind(this.a);
            return ImageHeaderParserUtils.getOrientation(this.b, byteBuffer0, this.c);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageType getImageType() throws IOException {
            ByteBuffer byteBuffer0 = ByteBufferUtil.rewind(this.a);
            return ImageHeaderParserUtils.getType(this.b, byteBuffer0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    public static final class FileReader implements ImageReader {
        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options bitmapFactory$Options0) throws FileNotFoundException {
            Bitmap bitmap0;
            RecyclableBufferedInputStream recyclableBufferedInputStream0 = null;
            try {
                recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(new FileInputStream(null), null);
                bitmap0 = BitmapFactory.decodeStream(recyclableBufferedInputStream0, null, bitmapFactory$Options0);
            }
            catch(Throwable throwable0) {
                if(recyclableBufferedInputStream0 != null) {
                    try {
                        recyclableBufferedInputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw throwable0;
            }
            try {
                recyclableBufferedInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return bitmap0;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            int v;
            Throwable throwable1;
            RecyclableBufferedInputStream recyclableBufferedInputStream0;
            try {
                recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(new FileInputStream(null), null);
            }
            catch(Throwable throwable0) {
                recyclableBufferedInputStream0 = null;
                throwable1 = throwable0;
                goto label_9;
            }
            try {
                v = ImageHeaderParserUtils.getOrientation(null, recyclableBufferedInputStream0, null);
                goto label_12;
            }
            catch(Throwable throwable1) {
            }
        label_9:
            if(recyclableBufferedInputStream0 != null) {
                try {
                    recyclableBufferedInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable1;
            try {
            label_12:
                recyclableBufferedInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return v;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageType getImageType() throws IOException {
            ImageType imageHeaderParser$ImageType0;
            Throwable throwable1;
            RecyclableBufferedInputStream recyclableBufferedInputStream0;
            try {
                recyclableBufferedInputStream0 = new RecyclableBufferedInputStream(new FileInputStream(null), null);
            }
            catch(Throwable throwable0) {
                recyclableBufferedInputStream0 = null;
                throwable1 = throwable0;
                goto label_9;
            }
            try {
                imageHeaderParser$ImageType0 = ImageHeaderParserUtils.getType(null, recyclableBufferedInputStream0, null);
                goto label_12;
            }
            catch(Throwable throwable1) {
            }
        label_9:
            if(recyclableBufferedInputStream0 != null) {
                try {
                    recyclableBufferedInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable1;
            try {
            label_12:
                recyclableBufferedInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return imageHeaderParser$ImageType0;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    public static final class InputStreamImageReader implements ImageReader {
        public final InputStreamRewinder a;
        public final ArrayPool b;
        public final List c;

        public InputStreamImageReader(List list0, InputStream inputStream0, ArrayPool arrayPool0) {
            this.b = (ArrayPool)Preconditions.checkNotNull(arrayPool0);
            this.c = (List)Preconditions.checkNotNull(list0);
            this.a = new InputStreamRewinder(inputStream0, arrayPool0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options bitmapFactory$Options0) throws IOException {
            return BitmapFactory.decodeStream(this.a.rewindAndGet(), null, bitmapFactory$Options0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            InputStream inputStream0 = this.a.rewindAndGet();
            return ImageHeaderParserUtils.getOrientation(this.c, inputStream0, this.b);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageType getImageType() throws IOException {
            InputStream inputStream0 = this.a.rewindAndGet();
            return ImageHeaderParserUtils.getType(this.c, inputStream0, this.b);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
            this.a.fixMarkLimits();
        }
    }

    @RequiresApi(21)
    public static final class ParcelFileDescriptorImageReader implements ImageReader {
        public final ArrayPool a;
        public final List b;
        public final ParcelFileDescriptorRewinder c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor0, List list0, ArrayPool arrayPool0) {
            this.a = (ArrayPool)Preconditions.checkNotNull(arrayPool0);
            this.b = (List)Preconditions.checkNotNull(list0);
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options bitmapFactory$Options0) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.rewindAndGet().getFileDescriptor(), null, bitmapFactory$Options0);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.b, this.c, this.a);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.b, this.c, this.a);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    @Nullable
    Bitmap decodeBitmap(BitmapFactory.Options arg1) throws IOException;

    int getImageOrientation() throws IOException;

    ImageType getImageType() throws IOException;

    void stopGrowingBuffers();
}

