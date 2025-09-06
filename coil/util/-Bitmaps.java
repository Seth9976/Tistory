package coil.util;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0013\u001A\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0016H\u0080\b\u001A\u000E\u0010\u0017\u001A\u00020\u0006*\u0004\u0018\u00010\u0006H\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\" \u0010\u0005\u001A\u00020\u0001*\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0018\u0010\u000B\u001A\u00020\f*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\r\"\u001E\u0010\u000E\u001A\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"allocationByteCountCompat", "", "Landroid/graphics/Bitmap;", "getAllocationByteCountCompat", "(Landroid/graphics/Bitmap;)I", "bytesPerPixel", "Landroid/graphics/Bitmap$Config;", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "getBytesPerPixel", "(Landroid/graphics/Bitmap$Config;)I", "isHardware", "", "(Landroid/graphics/Bitmap$Config;)Z", "safeConfig", "getSafeConfig$annotations", "(Landroid/graphics/Bitmap;)V", "getSafeConfig", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "toDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "context", "Landroid/content/Context;", "toSoftware", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Bitmaps")
@SourceDebugExtension({"SMAP\nBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,56:1\n28#2:57\n*S KotlinDebug\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n*L\n50#1:57\n*E\n"})
public final class -Bitmaps {
    public static final int getAllocationByteCountCompat(@NotNull Bitmap bitmap0) {
        if(!bitmap0.isRecycled()) {
            try {
                return bitmap0.getAllocationByteCount();
            }
            catch(Exception unused_ex) {
                int v = bitmap0.getWidth();
                int v1 = bitmap0.getHeight();
                return -Bitmaps.getBytesPerPixel(bitmap0.getConfig()) * (v1 * v);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap0 + " [" + bitmap0.getWidth() + " x " + bitmap0.getHeight() + "] + " + bitmap0.getConfig()).toString());
    }

    public static final int getBytesPerPixel(@Nullable Bitmap.Config bitmap$Config0) {
        if(bitmap$Config0 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if(bitmap$Config0 != Bitmap.Config.RGB_565 && bitmap$Config0 != Bitmap.Config.ARGB_4444) {
            return bitmap$Config0 == Bitmap.Config.RGBA_F16 ? 8 : 4;
        }
        return 2;
    }

    public static void getBytesPerPixel$annotations(Bitmap.Config bitmap$Config0) {
    }

    @NotNull
    public static final Bitmap.Config getSafeConfig(@NotNull Bitmap bitmap0) {
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        return bitmap$Config0 == null ? Bitmap.Config.ARGB_8888 : bitmap$Config0;
    }

    public static void getSafeConfig$annotations(Bitmap bitmap0) {
    }

    public static final boolean isHardware(@NotNull Bitmap.Config bitmap$Config0) {
        return bitmap$Config0 == Bitmap.Config.HARDWARE;
    }

    @NotNull
    public static final BitmapDrawable toDrawable(@NotNull Bitmap bitmap0, @NotNull Context context0) {
        return new BitmapDrawable(context0.getResources(), bitmap0);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final Bitmap.Config toSoftware(@Nullable Bitmap.Config bitmap$Config0) {
        return bitmap$Config0 != null && !-Bitmaps.isHardware(bitmap$Config0) ? bitmap$Config0 : Bitmap.Config.ARGB_8888;
    }
}

