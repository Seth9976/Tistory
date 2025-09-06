package com.kakao.kphotopicker.util;

import android.content.ContentResolver;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder.Source;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;
import android.util.Size;
import androidx.annotation.RequiresApi;
import java.io.BufferedInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lc.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\'\u0010\u000E\u001A\u0004\u0018\u00010\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\'\u0010\u0012\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u000B¢\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u000B¢\u0006\u0004\b\u001A\u0010\u001BJ\u001F\u0010\u001E\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u001D\u001A\u00020\u001C¢\u0006\u0004\b\u001E\u0010\u001FJ\u001F\u0010 \u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u001D\u001A\u00020\u001C¢\u0006\u0004\b \u0010\u001F¨\u0006!"}, d2 = {"Lcom/kakao/kphotopicker/util/BitmapUtil;", "", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "getBitmapFromP", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "Ljava/io/InputStream;", "inputStream", "", "viewWidth", "viewHeight", "getBitmap", "(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;", "bitmap", "", "getScaledBitmap", "(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;", "contentUri", "width", "height", "getThumbnailBitmapFromQ", "(Landroid/content/ContentResolver;Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "imageOrientation", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "", "localImageId", "getImageThumbnailBitmapFromLocalImageID", "(Landroid/content/ContentResolver;J)Landroid/graphics/Bitmap;", "getVideoThumbnailBitmapFromLocalImageID", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/kakao/kphotopicker/util/BitmapUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class BitmapUtil {
    @NotNull
    public static final BitmapUtil INSTANCE;

    static {
        BitmapUtil.INSTANCE = new BitmapUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull InputStream inputStream0, int v, int v1) {
        Intrinsics.checkNotNullParameter(inputStream0, "inputStream");
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0);
        bufferedInputStream0.mark(bufferedInputStream0.available());
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        int v2 = 1;
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedInputStream0, null, bitmapFactory$Options0);
        bufferedInputStream0.reset();
        int v3 = bitmapFactory$Options0.outWidth;
        int v4 = bitmapFactory$Options0.outHeight;
        if(v3 > v || v4 > v1) {
            while(v3 / 2 / v2 > v && v4 / 2 / v2 > v1) {
                v2 *= 2;
            }
        }
        bitmapFactory$Options0.inSampleSize = v2;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap0 = BitmapFactory.decodeStream(bufferedInputStream0, null, bitmapFactory$Options0);
        bufferedInputStream0.close();
        return bitmap0;
    }

    @RequiresApi(28)
    @NotNull
    public final Bitmap getBitmapFromP(@NotNull ContentResolver contentResolver0, @NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        ImageDecoder.Source imageDecoder$Source0 = a.c(contentResolver0, uri0);
        Intrinsics.checkNotNullExpressionValue(imageDecoder$Source0, "createSource(...)");
        Bitmap bitmap0 = a.a(imageDecoder$Source0);
        Intrinsics.checkNotNullExpressionValue(bitmap0, "decodeBitmap(...)");
        return bitmap0;
    }

    @Nullable
    public final Bitmap getImageThumbnailBitmapFromLocalImageID(@NotNull ContentResolver contentResolver0, long v) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inDither = true;
        bitmapFactory$Options0.inPurgeable = true;
        bitmapFactory$Options0.inSampleSize = 1;
        try {
            return MediaStore.Images.Thumbnails.getThumbnail(contentResolver0, v, 1, bitmapFactory$Options0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            Logger.INSTANCE.error("getImageThumbnailBitmapFromLocalImageID: OutOfMemoryError " + outOfMemoryError0);
            return null;
        }
        catch(Exception exception0) {
            Logger.INSTANCE.error("MediaStore.Images.Thumbnails.getThumbnail failed: " + exception0);
            return null;
        }
    }

    @Nullable
    public final Bitmap getScaledBitmap(@NotNull Bitmap bitmap0, float f, float f1) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        if(Float.compare(f1, 0.0f) > 0) {
            float f2 = (float)bitmap0.getWidth();
            float f3 = (float)bitmap0.getHeight();
            float f4 = f2 / f3;
            float f5 = f / f1;
            int v = Float.compare(f, f2);
            if(v < 0 && f1 > f3) {
                return Bitmap.createScaledBitmap(bitmap0, ((int)f), ((int)(f / f2 * f3)), true);
            }
            int v1 = Float.compare(f, f2);
            if(v1 > 0 && f1 < f3) {
                return Bitmap.createScaledBitmap(bitmap0, ((int)(f1 / f3 * f2)), ((int)f1), true);
            }
            if(v < 0 && f1 < f3) {
                return f4 < f5 ? Bitmap.createScaledBitmap(bitmap0, ((int)(f1 / f3 * f2)), ((int)f1), true) : Bitmap.createScaledBitmap(bitmap0, ((int)f), ((int)(f / f2 * f3)), true);
            }
            if(v1 > 0 && f1 > f3) {
                return f4 > f5 ? Bitmap.createScaledBitmap(bitmap0, ((int)f), ((int)(f / f2 * f3)), true) : Bitmap.createScaledBitmap(bitmap0, ((int)(f / f2 * f2)), ((int)f1), true);
            }
            return Bitmap.createScaledBitmap(bitmap0, ((int)f2), ((int)f3), true);
        }
        return bitmap0;
    }

    @Nullable
    public final Bitmap getThumbnailBitmapFromQ(@NotNull ContentResolver contentResolver0, @NotNull Uri uri0, int v, int v1) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        Intrinsics.checkNotNullParameter(uri0, "contentUri");
        if(Build.VERSION.SDK_INT >= 29) {
            try {
                return d.c(contentResolver0, uri0, new Size(v, v1));
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    @Nullable
    public final Bitmap getVideoThumbnailBitmapFromLocalImageID(@NotNull ContentResolver contentResolver0, long v) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inDither = true;
        bitmapFactory$Options0.inPurgeable = true;
        bitmapFactory$Options0.inSampleSize = 1;
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(contentResolver0, v, 1, bitmapFactory$Options0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            Logger.INSTANCE.error("getThumbnailBitmapFromLocalImageID: OutOfMemoryError " + outOfMemoryError0);
            return null;
        }
        catch(Exception exception0) {
            Logger.INSTANCE.error("MediaStore.Video.Thumbnails.getThumbnail failed: " + exception0);
            return null;
        }
    }

    @NotNull
    public final Bitmap rotateBitmap(@NotNull Bitmap bitmap0, int v) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        if(v != 0) {
            int v1 = bitmap0.getWidth();
            int v2 = bitmap0.getHeight();
            Matrix matrix0 = new Matrix();
            matrix0.setRotate(((float)v), ((float)bitmap0.getWidth()) / 2.0f, ((float)bitmap0.getHeight()) / 2.0f);
            bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, v1, v2, matrix0, true);
            Intrinsics.checkNotNull(bitmap0);
        }
        return bitmap0;
    }
}

