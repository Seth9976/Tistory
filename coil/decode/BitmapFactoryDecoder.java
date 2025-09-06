package coil.decode;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.size.-Sizes;
import coil.size.Size;
import coil.util.-Bitmaps;
import coil.util.-Utils;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import o0.e;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q5.a;
import q5.b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\fB#\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder;", "Lcoil/decode/Decoder;", "Lcoil/decode/ImageSource;", "source", "Lcoil/request/Options;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;Lcoil/decode/ExifOrientationPolicy;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;)V", "Lcoil/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "q5/a", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n82#2,9:228\n1#3:237\n50#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
public final class BitmapFactoryDecoder implements Decoder {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$Companion;", "", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0017¢\u0006\u0004\b\u0006\u0010\bB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\'\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "", "maxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "<init>", "(ILcoil/decode/ExifOrientationPolicy;)V", "()V", "(I)V", "Lcoil/fetch/SourceResult;", "result", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/decode/Decoder;", "create", "(Lcoil/fetch/SourceResult;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/decode/Decoder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.decode.Decoder.Factory {
        public final ExifOrientationPolicy a;
        public final Semaphore b;

        @SinceKotlin(version = "999.9")
        public Factory() {
            this(0, null, 3, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public Factory(int v) {
            this(v, null, 2, null);
        }

        public Factory(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 4;
            }
            this(v);
        }

        public Factory(int v, @NotNull ExifOrientationPolicy exifOrientationPolicy0) {
            this.a = exifOrientationPolicy0;
            this.b = SemaphoreKt.Semaphore$default(v, 0, 2, null);
        }

        public Factory(int v, ExifOrientationPolicy exifOrientationPolicy0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 4;
            }
            if((v1 & 2) != 0) {
                exifOrientationPolicy0 = ExifOrientationPolicy.RESPECT_PERFORMANCE;
            }
            this(v, exifOrientationPolicy0);
        }

        @Override  // coil.decode.Decoder$Factory
        @NotNull
        public Decoder create(@NotNull SourceResult sourceResult0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return new BitmapFactoryDecoder(sourceResult0.getSource(), options0, this.b, this.a);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Factory;
        }

        @Override
        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DEFAULT_MAX_PARALLELISM = 4;
    public final ImageSource a;
    public final Options b;
    public final Semaphore c;
    public final ExifOrientationPolicy d;

    static {
        BitmapFactoryDecoder.Companion = new Companion(null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public BitmapFactoryDecoder(ImageSource imageSource0, Options options0) {
        this(imageSource0, options0, null, null, 12, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public BitmapFactoryDecoder(ImageSource imageSource0, Options options0, Semaphore semaphore0) {
        this(imageSource0, options0, semaphore0, null, 8, null);
    }

    public BitmapFactoryDecoder(ImageSource imageSource0, Options options0, Semaphore semaphore0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            semaphore0 = SemaphoreKt.Semaphore$default(0x7FFFFFFF, 0, 2, null);
        }
        this(imageSource0, options0, semaphore0);
    }

    public BitmapFactoryDecoder(@NotNull ImageSource imageSource0, @NotNull Options options0, @NotNull Semaphore semaphore0, @NotNull ExifOrientationPolicy exifOrientationPolicy0) {
        this.a = imageSource0;
        this.b = options0;
        this.c = semaphore0;
        this.d = exifOrientationPolicy0;
    }

    public BitmapFactoryDecoder(ImageSource imageSource0, Options options0, Semaphore semaphore0, ExifOrientationPolicy exifOrientationPolicy0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            semaphore0 = SemaphoreKt.Semaphore$default(0x7FFFFFFF, 0, 2, null);
        }
        if((v & 8) != 0) {
            exifOrientationPolicy0 = ExifOrientationPolicy.RESPECT_PERFORMANCE;
        }
        this(imageSource0, options0, semaphore0, exifOrientationPolicy0);
    }

    public static final DecodeResult access$decode(BitmapFactoryDecoder bitmapFactoryDecoder0, BitmapFactory.Options bitmapFactory$Options0) {
        Bitmap bitmap0;
        ExifUtils exifUtils1;
        ImageSource imageSource0 = bitmapFactoryDecoder0.a;
        a a0 = new a(imageSource0.source());
        BufferedSource bufferedSource0 = Okio.buffer(a0);
        boolean z = true;
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSource0.peek().inputStream(), null, bitmapFactory$Options0);
        Exception exception0 = (Exception)a0.c;
        if(exception0 != null) {
            throw exception0;
        }
        bitmapFactory$Options0.inJustDecodeBounds = false;
        ExifUtils exifUtils0 = ExifUtils.INSTANCE;
        ExifData exifData0 = exifUtils0.getExifData(bitmapFactory$Options0.outMimeType, bufferedSource0, bitmapFactoryDecoder0.d);
        Exception exception1 = (Exception)a0.c;
        if(exception1 != null) {
            throw exception1;
        }
        bitmapFactory$Options0.inMutable = false;
        Options options0 = bitmapFactoryDecoder0.b;
        if(options0.getColorSpace() != null) {
            bitmapFactory$Options0.inPreferredColorSpace = options0.getColorSpace();
        }
        bitmapFactory$Options0.inPremultiplied = options0.getPremultipliedAlpha();
        Bitmap.Config bitmap$Config0 = !exifData0.isFlipped() && !ExifUtilsKt.isRotated(exifData0) ? options0.getConfig() : -Bitmaps.toSoftware(options0.getConfig());
        if(options0.getAllowRgb565() && bitmap$Config0 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(bitmapFactory$Options0.outMimeType, "image/jpeg")) {
            bitmap$Config0 = Bitmap.Config.RGB_565;
        }
        Bitmap.Config bitmap$Config1 = Bitmap.Config.RGBA_F16;
        if(bitmapFactory$Options0.outConfig == bitmap$Config1 && bitmap$Config0 != Bitmap.Config.HARDWARE) {
            bitmap$Config0 = bitmap$Config1;
        }
        bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
        coil.decode.ImageSource.Metadata imageSource$Metadata0 = imageSource0.getMetadata();
        if(imageSource$Metadata0 instanceof ResourceMetadata && -Sizes.isOriginal(options0.getSize())) {
            bitmapFactory$Options0.inSampleSize = 1;
            bitmapFactory$Options0.inScaled = true;
            bitmapFactory$Options0.inDensity = ((ResourceMetadata)imageSource$Metadata0).getDensity();
            bitmapFactory$Options0.inTargetDensity = options0.getContext().getResources().getDisplayMetrics().densityDpi;
            exifUtils1 = exifUtils0;
        }
        else if(bitmapFactory$Options0.outWidth > 0 && bitmapFactory$Options0.outHeight > 0) {
            int v = ExifUtilsKt.isSwapped(exifData0) ? bitmapFactory$Options0.outHeight : bitmapFactory$Options0.outWidth;
            int v1 = ExifUtilsKt.isSwapped(exifData0) ? bitmapFactory$Options0.outWidth : bitmapFactory$Options0.outHeight;
            Size size0 = options0.getSize();
            int v2 = -Sizes.isOriginal(size0) ? v : -Utils.toPx(size0.getWidth(), options0.getScale());
            Size size1 = options0.getSize();
            int v3 = -Sizes.isOriginal(size1) ? v1 : -Utils.toPx(size1.getHeight(), options0.getScale());
            int v4 = DecodeUtils.calculateInSampleSize(v, v1, v2, v3, options0.getScale());
            bitmapFactory$Options0.inSampleSize = v4;
            exifUtils1 = exifUtils0;
            double f = DecodeUtils.computeSizeMultiplier(((double)v) / ((double)v4), ((double)v1) / ((double)v4), v2, v3, options0.getScale());
            if(options0.getAllowInexactSize()) {
                f = c.coerceAtMost(f, 1.0);
            }
            int v5 = f == 1.0 ? 1 : 0;
            bitmapFactory$Options0.inScaled = v5 ^ 1;
            if(v5 == 0) {
                if(Double.compare(f, 1.0) > 0) {
                    bitmapFactory$Options0.inDensity = zd.c.roundToInt(2147483647.0 / f);
                    bitmapFactory$Options0.inTargetDensity = 0x7FFFFFFF;
                }
                else {
                    bitmapFactory$Options0.inDensity = 0x7FFFFFFF;
                    bitmapFactory$Options0.inTargetDensity = zd.c.roundToInt(2147483647.0 * f);
                }
            }
        }
        else {
            exifUtils1 = exifUtils0;
            bitmapFactory$Options0.inSampleSize = 1;
            bitmapFactory$Options0.inScaled = false;
        }
        try {
            bitmap0 = BitmapFactory.decodeStream(bufferedSource0.inputStream(), null, bitmapFactory$Options0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedSource0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedSource0, null);
        Exception exception2 = (Exception)a0.c;
        if(exception2 != null) {
            throw exception2;
        }
        if(bitmap0 == null) {
            throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format.");
        }
        bitmap0.setDensity(options0.getContext().getResources().getDisplayMetrics().densityDpi);
        Bitmap bitmap1 = exifUtils1.reverseTransformations(bitmap0, exifData0);
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(options0.getContext().getResources(), bitmap1);
        if(bitmapFactory$Options0.inSampleSize <= 1 && !bitmapFactory$Options0.inScaled) {
            z = false;
        }
        return new DecodeResult(bitmapDrawable0, z);
    }

    @Override  // coil.decode.Decoder
    @Nullable
    public Object decode(@NotNull Continuation continuation0) {
        DecodeResult decodeResult0;
        Throwable throwable1;
        Semaphore semaphore2;
        Object object2;
        BitmapFactoryDecoder bitmapFactoryDecoder0;
        Semaphore semaphore0;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.s;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.s = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(b0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b0.o = this;
                semaphore0 = this.c;
                b0.p = semaphore0;
                b0.s = 1;
                if(semaphore0.acquire(b0) == object1) {
                    return object1;
                }
                bitmapFactoryDecoder0 = this;
                goto label_26;
            }
            case 1: {
                Semaphore semaphore1 = b0.p;
                bitmapFactoryDecoder0 = (BitmapFactoryDecoder)b0.o;
                ResultKt.throwOnFailure(object0);
                semaphore0 = semaphore1;
                try {
                label_26:
                    e e0 = new e(bitmapFactoryDecoder0, 12);
                    b0.o = semaphore0;
                    b0.p = null;
                    b0.s = 2;
                    object2 = InterruptibleKt.runInterruptible$default(null, e0, b0, 1, null);
                }
                catch(Throwable throwable0) {
                    semaphore2 = semaphore0;
                    throwable1 = throwable0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                semaphore2 = semaphore0;
                object0 = object2;
                decodeResult0 = (DecodeResult)object0;
                goto label_48;
            }
            case 2: {
                semaphore2 = (Semaphore)b0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    decodeResult0 = (DecodeResult)object0;
                    goto label_48;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        semaphore2.release();
        throw throwable1;
    label_48:
        semaphore2.release();
        return decodeResult0;
    }
}

