package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import kotlin.text.q;
import r0.a;

public final class Downsampler {
    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool arg1, Bitmap arg2) throws IOException;

        void onObtainBounds();
    }

    public static final Option ALLOW_HARDWARE_CONFIG;
    public static final Option DECODE_FORMAT;
    @Deprecated
    public static final Option DOWNSAMPLE_STRATEGY;
    public static final Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
    public static final Option PREFERRED_COLOR_SPACE;
    public final BitmapPool a;
    public final DisplayMetrics b;
    public final ArrayPool c;
    public final List d;
    public final HardwareConfigState e;
    public static final Set f;
    public static final i g;
    public static final Set h;
    public static final Queue i;

    static {
        Downsampler.DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
        Downsampler.PREFERRED_COLOR_SPACE = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
        Downsampler.DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
        Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
        Downsampler.ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
        Downsampler.f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Downsampler.g = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        Downsampler.h = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
        Downsampler.i = Util.createQueue(0);
    }

    public Downsampler(List list0, DisplayMetrics displayMetrics0, BitmapPool bitmapPool0, ArrayPool arrayPool0) {
        this.e = HardwareConfigState.getInstance();
        this.d = list0;
        this.b = (DisplayMetrics)Preconditions.checkNotNull(displayMetrics0);
        this.a = (BitmapPool)Preconditions.checkNotNull(bitmapPool0);
        this.c = (ArrayPool)Preconditions.checkNotNull(arrayPool0);
    }

    public final BitmapResource a(ImageReader imageReader0, int v, int v1, Options options0, DecodeCallbacks downsampler$DecodeCallbacks0) {
        Queue queue0;
        BitmapResource bitmapResource0;
        BitmapFactory.Options bitmapFactory$Options0;
        Object object0 = this.c.get(0x10000, byte[].class);
        synchronized(Downsampler.class) {
            queue0 = Downsampler.i;
            synchronized(queue0) {
                bitmapFactory$Options0 = (BitmapFactory.Options)queue0.poll();
            }
            if(bitmapFactory$Options0 == null) {
                bitmapFactory$Options0 = new BitmapFactory.Options();
                Downsampler.e(bitmapFactory$Options0);
            }
        }
        bitmapFactory$Options0.inTempStorage = (byte[])object0;
        DecodeFormat decodeFormat0 = (DecodeFormat)options0.get(Downsampler.DECODE_FORMAT);
        PreferredColorSpace preferredColorSpace0 = (PreferredColorSpace)options0.get(Downsampler.PREFERRED_COLOR_SPACE);
        DownsampleStrategy downsampleStrategy0 = (DownsampleStrategy)options0.get(DownsampleStrategy.OPTION);
        boolean z = ((Boolean)options0.get(Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        boolean z1 = options0.get(Downsampler.ALLOW_HARDWARE_CONFIG) != null && ((Boolean)options0.get(Downsampler.ALLOW_HARDWARE_CONFIG)).booleanValue();
        try {
            bitmapResource0 = BitmapResource.obtain(this.b(imageReader0, bitmapFactory$Options0, downsampleStrategy0, decodeFormat0, preferredColorSpace0, z1, v, v1, z, downsampler$DecodeCallbacks0), this.a);
        }
        catch(Throwable throwable1) {
            Downsampler.e(bitmapFactory$Options0);
            synchronized(Downsampler.i) {
                Downsampler.i.offer(bitmapFactory$Options0);
            }
            this.c.put(((byte[])object0));
            throw throwable1;
        }
        Downsampler.e(bitmapFactory$Options0);
        synchronized(queue0) {
            queue0.offer(bitmapFactory$Options0);
        }
        this.c.put(((byte[])object0));
        return bitmapResource0;
    }

    public final Bitmap b(ImageReader imageReader0, BitmapFactory.Options bitmapFactory$Options0, DownsampleStrategy downsampleStrategy0, DecodeFormat decodeFormat0, PreferredColorSpace preferredColorSpace0, boolean z, int v, int v1, boolean z1, DecodeCallbacks downsampler$DecodeCallbacks0) {
        int v23;
        boolean z4;
        int v17;
        int v16;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        long v2 = LogTime.getLogTime();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapPool bitmapPool0 = this.a;
        Downsampler.c(imageReader0, bitmapFactory$Options0, downsampler$DecodeCallbacks0, bitmapPool0);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        int v3 = bitmapFactory$Options0.outWidth;
        int v4 = bitmapFactory$Options0.outHeight;
        String s = bitmapFactory$Options0.outMimeType;
        int v5 = imageReader0.getImageOrientation();
        int v6 = TransformationUtils.getExifOrientationDegrees(v5);
        boolean z2 = TransformationUtils.isExifOrientationRequired(v5);
        if(v != 0x80000000) {
            v7 = v;
        }
        else if(v6 != 90 && v6 != 270) {
            v7 = v3;
        }
        else {
            v7 = v4;
        }
        if(v1 != 0x80000000) {
            v8 = v1;
        }
        else if(v6 != 90 && v6 != 270) {
            v8 = v4;
        }
        else {
            v8 = v3;
        }
        ImageType imageHeaderParser$ImageType0 = imageReader0.getImageType();
        float f = 1.0f;
        if(v3 <= 0) {
            v9 = v7;
        label_115:
            if(Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageType0 + " with target [" + v9 + "x" + v8 + "]");
            }
        }
        else if(v4 <= 0) {
            v9 = v7;
            goto label_115;
        }
        else {
            if(v6 == 90 || v6 == 270) {
                v11 = v4;
                v10 = v3;
            }
            else {
                v10 = v4;
                v11 = v3;
            }
            float f1 = downsampleStrategy0.getScaleFactor(v11, v10, v7, v8);
            if(f1 <= 0.0f) {
                goto label_103;
            }
            SampleSizeRounding downsampleStrategy$SampleSizeRounding0 = downsampleStrategy0.getSampleSizeRounding(v11, v10, v7, v8);
            if(downsampleStrategy$SampleSizeRounding0 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int v12 = v11 / ((int)(((double)(f1 * ((float)v11))) + 0.5));
            int v13 = v10 / ((int)(((double)(f1 * ((float)v10))) + 0.5));
            int v14 = downsampleStrategy$SampleSizeRounding0 == SampleSizeRounding.MEMORY ? Math.max(v12, v13) : Math.min(v12, v13);
            int v15 = Math.max(1, Integer.highestOneBit(v14));
            v15 = downsampleStrategy$SampleSizeRounding0 != SampleSizeRounding.MEMORY || ((float)v15) >= 1.0f / f1 ? Math.max(1, Integer.highestOneBit(v14)) : v15 << 1;
            bitmapFactory$Options0.inSampleSize = v15;
            if(imageHeaderParser$ImageType0 == ImageType.JPEG) {
                float f2 = (float)Math.min(v15, 8);
                v16 = (int)Math.ceil(((float)v11) / f2);
                v17 = (int)Math.ceil(((float)v10) / f2);
                if(v15 / 8 > 0) {
                    v16 /= v15 / 8;
                    v17 /= v15 / 8;
                }
            }
            else if(imageHeaderParser$ImageType0 == ImageType.PNG || imageHeaderParser$ImageType0 == ImageType.PNG_A) {
                v16 = (int)Math.floor(((float)v11) / ((float)v15));
                v17 = (int)Math.floor(((float)v10) / ((float)v15));
            }
            else if(imageHeaderParser$ImageType0.isWebp()) {
                v16 = Math.round(((float)v11) / ((float)v15));
                v17 = Math.round(((float)v10) / ((float)v15));
            }
            else if(v11 % v15 == 0 && v10 % v15 == 0) {
                v16 = v11 / v15;
                v17 = v10 / v15;
            }
            else {
                bitmapFactory$Options0.inJustDecodeBounds = true;
                Downsampler.c(imageReader0, bitmapFactory$Options0, downsampler$DecodeCallbacks0, bitmapPool0);
                bitmapFactory$Options0.inJustDecodeBounds = false;
                v17 = bitmapFactory$Options0.outHeight;
                v16 = bitmapFactory$Options0.outWidth;
            }
            v9 = v7;
            double f3 = (double)downsampleStrategy0.getScaleFactor(v16, v17, v9, v8);
            int v18 = Double.compare(f3, 1.0);
            int v19 = (int)Math.round((v18 > 0 ? 1.0 / f3 : f3) * 2147483647.0);
            int v20 = (int)(((double)v19) * f3 + 0.5);
            bitmapFactory$Options0.inTargetDensity = (int)(f3 / ((double)(((float)v20) / ((float)v19))) * ((double)v20) + 0.5);
            int v21 = (int)Math.round((v18 > 0 ? 1.0 / f3 : f3) * 2147483647.0);
            bitmapFactory$Options0.inDensity = v21;
            if(bitmapFactory$Options0.inTargetDensity <= 0 || v21 <= 0 || bitmapFactory$Options0.inTargetDensity == v21) {
                bitmapFactory$Options0.inTargetDensity = 0;
                bitmapFactory$Options0.inDensity = 0;
            }
            else {
                bitmapFactory$Options0.inScaled = true;
            }
            if(Log.isLoggable("Downsampler", 2)) {
                StringBuilder stringBuilder0 = q.u("Calculate scaling, source: [", v3, "x", v4, "], degreesToRotate: ");
                a.A(stringBuilder0, v6, ", target: [", v9, "x");
                a.A(stringBuilder0, v8, "], power of two scaled: [", v16, "x");
                stringBuilder0.append(v17);
                stringBuilder0.append("], exact scale factor: ");
                stringBuilder0.append(f1);
                stringBuilder0.append(", power of 2 sample size: ");
                stringBuilder0.append(v15);
                stringBuilder0.append(", adjusted scale factor: ");
                stringBuilder0.append(f3);
                stringBuilder0.append(", target density: ");
                stringBuilder0.append(bitmapFactory$Options0.inTargetDensity);
                stringBuilder0.append(", density: ");
                stringBuilder0.append(bitmapFactory$Options0.inDensity);
                Log.v("Downsampler", stringBuilder0.toString());
                goto label_117;
            label_103:
                StringBuilder stringBuilder1 = new StringBuilder("Cannot scale with factor: ");
                stringBuilder1.append(f1);
                stringBuilder1.append(" from: ");
                stringBuilder1.append(downsampleStrategy0);
                stringBuilder1.append(", source: [");
                a.A(stringBuilder1, v3, "x", v4, "], target: [");
                stringBuilder1.append(v7);
                stringBuilder1.append("x");
                stringBuilder1.append(v8);
                stringBuilder1.append("]");
                throw new IllegalArgumentException(stringBuilder1.toString());
            }
        }
    label_117:
        boolean z3 = this.e.isHardwareConfigAllowed(v9, v8, (v3 == -1 || v4 == -1 ? false : z), z2);
        if(z3) {
            bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.HARDWARE;
            bitmapFactory$Options0.inMutable = false;
        }
        if(!z3) {
            if(decodeFormat0 == DecodeFormat.PREFER_ARGB_8888) {
                bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            else {
                try {
                    z4 = imageReader0.getImageType().hasAlpha();
                }
                catch(IOException iOException0) {
                    if(Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat0, iOException0);
                    }
                    z4 = false;
                }
                bitmapFactory$Options0.inPreferredConfig = z4 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                if((z4 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565) == Bitmap.Config.RGB_565) {
                    bitmapFactory$Options0.inDither = true;
                }
            }
        }
        int v22 = Build.VERSION.SDK_INT;
        if(v3 < 0 || v4 < 0 || !z1) {
            int v24 = bitmapFactory$Options0.inTargetDensity;
            if(v24 > 0 && (bitmapFactory$Options0.inDensity > 0 && v24 != bitmapFactory$Options0.inDensity)) {
                f = ((float)v24) / ((float)bitmapFactory$Options0.inDensity);
            }
            int v25 = bitmapFactory$Options0.inSampleSize;
            v23 = Math.round(((float)(((int)Math.ceil(((float)v3) / ((float)v25))))) * f);
            int v26 = Math.round(((float)(((int)Math.ceil(((float)v4) / ((float)v25))))) * f);
            if(Log.isLoggable("Downsampler", 2)) {
                StringBuilder stringBuilder2 = q.u("Calculated target [", v23, "x", v26, "] for source [");
                a.A(stringBuilder2, v3, "x", v4, "], sampleSize: ");
                stringBuilder2.append(v25);
                stringBuilder2.append(", targetDensity: ");
                stringBuilder2.append(bitmapFactory$Options0.inTargetDensity);
                stringBuilder2.append(", density: ");
                stringBuilder2.append(bitmapFactory$Options0.inDensity);
                stringBuilder2.append(", density multiplier: ");
                stringBuilder2.append(f);
                Log.v("Downsampler", stringBuilder2.toString());
            }
            v8 = v26;
        }
        else {
            v23 = v9;
        }
        if(v23 > 0 && v8 > 0) {
            Bitmap.Config bitmap$Config0 = bitmapFactory$Options0.inPreferredConfig;
            if(bitmap$Config0 != Bitmap.Config.HARDWARE) {
                Bitmap.Config bitmap$Config1 = bitmapFactory$Options0.outConfig;
                if(bitmap$Config1 != null) {
                    bitmap$Config0 = bitmap$Config1;
                }
                bitmapFactory$Options0.inBitmap = bitmapPool0.getDirty(v23, v8, bitmap$Config0);
            }
        }
        if(preferredColorSpace0 != null) {
            bitmapFactory$Options0.inPreferredColorSpace = v22 >= 28 ? ColorSpace.get((preferredColorSpace0 != PreferredColorSpace.DISPLAY_P3 || (bitmapFactory$Options0.outColorSpace == null || !bitmapFactory$Options0.outColorSpace.isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3)) : ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmap0 = Downsampler.c(imageReader0, bitmapFactory$Options0, downsampler$DecodeCallbacks0, bitmapPool0);
        downsampler$DecodeCallbacks0.onDecodeComplete(bitmapPool0, bitmap0);
        if(Log.isLoggable("Downsampler", 2)) {
            StringBuilder stringBuilder3 = new StringBuilder("Decoded ");
            stringBuilder3.append(Downsampler.d(bitmap0));
            stringBuilder3.append(" from [");
            stringBuilder3.append(v3);
            stringBuilder3.append("x");
            wb.a.j(stringBuilder3, v4, "] ", s, " with inBitmap ");
            stringBuilder3.append(Downsampler.d(bitmapFactory$Options0.inBitmap));
            stringBuilder3.append(" for [");
            stringBuilder3.append(v);
            stringBuilder3.append("x");
            stringBuilder3.append(v1);
            stringBuilder3.append("], sample size: ");
            stringBuilder3.append(bitmapFactory$Options0.inSampleSize);
            stringBuilder3.append(", density: ");
            stringBuilder3.append(bitmapFactory$Options0.inDensity);
            stringBuilder3.append(", target density: ");
            stringBuilder3.append(bitmapFactory$Options0.inTargetDensity);
            stringBuilder3.append(", thread: ");
            stringBuilder3.append("jeb-dexdec-sb-st-1151");
            stringBuilder3.append(", duration: ");
            stringBuilder3.append(LogTime.getElapsedMillis(v2));
            Log.v("Downsampler", stringBuilder3.toString());
        }
        if(bitmap0 != null) {
            bitmap0.setDensity(this.b.densityDpi);
            Bitmap bitmap1 = TransformationUtils.rotateImageExif(bitmapPool0, bitmap0, v5);
            if(!bitmap0.equals(bitmap1)) {
                bitmapPool0.put(bitmap0);
                return bitmap1;
            }
            return bitmap1;
        }
        return null;
    }

    public static Bitmap c(ImageReader imageReader0, BitmapFactory.Options bitmapFactory$Options0, DecodeCallbacks downsampler$DecodeCallbacks0, BitmapPool bitmapPool0) {
        if(!bitmapFactory$Options0.inJustDecodeBounds) {
            downsampler$DecodeCallbacks0.onObtainBounds();
            imageReader0.stopGrowingBuffers();
        }
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        String s = bitmapFactory$Options0.outMimeType;
        TransformationUtils.getBitmapDrawableLock().lock();
        try {
            return imageReader0.decodeBitmap(bitmapFactory$Options0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            StringBuilder stringBuilder0 = q.u("Exception decoding bitmap, outWidth: ", v, ", outHeight: ", v1, ", outMimeType: ");
            stringBuilder0.append(s);
            stringBuilder0.append(", inBitmap: ");
            stringBuilder0.append(Downsampler.d(bitmapFactory$Options0.inBitmap));
            IOException iOException0 = new IOException(stringBuilder0.toString(), illegalArgumentException0);
            if(Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException0);
            }
            Bitmap bitmap1 = bitmapFactory$Options0.inBitmap;
            if(bitmap1 != null) {
                try {
                    bitmapPool0.put(bitmap1);
                    bitmapFactory$Options0.inBitmap = null;
                    return Downsampler.c(imageReader0, bitmapFactory$Options0, downsampler$DecodeCallbacks0, bitmapPool0);
                }
                catch(IOException unused_ex) {
                    throw iOException0;
                }
            }
            throw iOException0;
        }
        finally {
            TransformationUtils.getBitmapDrawableLock().unlock();
        }
    }

    public static String d(Bitmap bitmap0) {
        return bitmap0 == null ? null : "[" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] " + bitmap0.getConfig() + (" (" + bitmap0.getAllocationByteCount() + ")");
    }

    @RequiresApi(21)
    public Resource decode(ParcelFileDescriptor parcelFileDescriptor0, int v, int v1, Options options0) throws IOException {
        return this.a(new ParcelFileDescriptorImageReader(parcelFileDescriptor0, this.d, this.c), v, v1, options0, Downsampler.g);
    }

    public Resource decode(InputStream inputStream0, int v, int v1, Options options0) throws IOException {
        return this.decode(inputStream0, v, v1, options0, Downsampler.g);
    }

    public Resource decode(InputStream inputStream0, int v, int v1, Options options0, DecodeCallbacks downsampler$DecodeCallbacks0) throws IOException {
        return this.a(new InputStreamImageReader(this.d, inputStream0, this.c), v, v1, options0, downsampler$DecodeCallbacks0);
    }

    public Resource decode(ByteBuffer byteBuffer0, int v, int v1, Options options0) throws IOException {
        return this.a(new ByteBufferReader(this.d, byteBuffer0, this.c), v, v1, options0, Downsampler.g);
    }

    public static void e(BitmapFactory.Options bitmapFactory$Options0) {
        bitmapFactory$Options0.inTempStorage = null;
        bitmapFactory$Options0.inDither = false;
        bitmapFactory$Options0.inScaled = false;
        bitmapFactory$Options0.inSampleSize = 1;
        bitmapFactory$Options0.inPreferredConfig = null;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        bitmapFactory$Options0.inDensity = 0;
        bitmapFactory$Options0.inTargetDensity = 0;
        bitmapFactory$Options0.inPreferredColorSpace = null;
        bitmapFactory$Options0.outColorSpace = null;
        bitmapFactory$Options0.outConfig = null;
        bitmapFactory$Options0.outWidth = 0;
        bitmapFactory$Options0.outHeight = 0;
        bitmapFactory$Options0.outMimeType = null;
        bitmapFactory$Options0.inBitmap = null;
        bitmapFactory$Options0.inMutable = true;
    }

    // 去混淆评级： 低(20)
    public boolean handles(ParcelFileDescriptor parcelFileDescriptor0) {
        return 1;
    }

    public boolean handles(InputStream inputStream0) [...] // Inlined contents

    public boolean handles(ByteBuffer byteBuffer0) [...] // Inlined contents
}

