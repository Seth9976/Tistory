package coil.util;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ?\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000F\u001A\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Lcoil/util/ImageLoaderOptions;", "", "", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "bitmapFactoryMaxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILcoil/decode/ExifOrientationPolicy;)V", "copy", "(ZZZILcoil/decode/ExifOrientationPolicy;)Lcoil/util/ImageLoaderOptions;", "a", "Z", "getAddLastModifiedToFileCacheKey", "()Z", "b", "getNetworkObserverEnabled", "c", "getRespectCacheHeaders", "d", "I", "getBitmapFactoryMaxParallelism", "()I", "e", "Lcoil/decode/ExifOrientationPolicy;", "getBitmapFactoryExifOrientationPolicy", "()Lcoil/decode/ExifOrientationPolicy;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageLoaderOptions {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final ExifOrientationPolicy e;

    public ImageLoaderOptions() {
        this(false, false, false, 0, null, 0x1F, null);
    }

    public ImageLoaderOptions(boolean z, boolean z1, boolean z2, int v, @NotNull ExifOrientationPolicy exifOrientationPolicy0) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = v;
        this.e = exifOrientationPolicy0;
    }

    public ImageLoaderOptions(boolean z, boolean z1, boolean z2, int v, ExifOrientationPolicy exifOrientationPolicy0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 8) != 0) {
            v = 4;
        }
        if((v1 & 16) != 0) {
            exifOrientationPolicy0 = ExifOrientationPolicy.RESPECT_PERFORMANCE;
        }
        this(((v1 & 1) == 0 ? z : true), ((v1 & 2) == 0 ? z1 : true), ((v1 & 4) == 0 ? z2 : true), v, exifOrientationPolicy0);
    }

    @NotNull
    public final ImageLoaderOptions copy(boolean z, boolean z1, boolean z2, int v, @NotNull ExifOrientationPolicy exifOrientationPolicy0) {
        return new ImageLoaderOptions(z, z1, z2, v, exifOrientationPolicy0);
    }

    public static ImageLoaderOptions copy$default(ImageLoaderOptions imageLoaderOptions0, boolean z, boolean z1, boolean z2, int v, ExifOrientationPolicy exifOrientationPolicy0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = imageLoaderOptions0.a;
        }
        if((v1 & 2) != 0) {
            z1 = imageLoaderOptions0.b;
        }
        if((v1 & 4) != 0) {
            z2 = imageLoaderOptions0.c;
        }
        if((v1 & 8) != 0) {
            v = imageLoaderOptions0.d;
        }
        if((v1 & 16) != 0) {
            exifOrientationPolicy0 = imageLoaderOptions0.e;
        }
        return imageLoaderOptions0.copy(z, z1, z2, v, exifOrientationPolicy0);
    }

    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.a;
    }

    @NotNull
    public final ExifOrientationPolicy getBitmapFactoryExifOrientationPolicy() {
        return this.e;
    }

    public final int getBitmapFactoryMaxParallelism() {
        return this.d;
    }

    public final boolean getNetworkObserverEnabled() {
        return this.b;
    }

    public final boolean getRespectCacheHeaders() {
        return this.c;
    }
}

