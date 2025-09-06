package com.kakao.android.base.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/android/base/utils/ImageUtils;", "", "", "path", "", "maxSize", "", "checkImageSize", "(Ljava/lang/String;J)Z", "Landroid/graphics/Bitmap;", "getImageBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageUtils {
    @NotNull
    public static final ImageUtils INSTANCE;

    static {
        ImageUtils.INSTANCE = new ImageUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean checkImageSize(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "path");
        long v1 = new File(s).length();
        Logger.INSTANCE.log("getImageSizeFromURI() : " + v1);
        return v1 <= v;
    }

    @Nullable
    public final Bitmap getImageBitmap(@NotNull String s) {
        int v;
        Intrinsics.checkNotNullParameter(s, "path");
        try {
            ExifInterface exifInterface0 = new ExifInterface(s);
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return null;
        }
        switch(exifInterface0.getAttributeInt("Orientation", 1)) {
            case 3: {
                v = 180;
                break;
            }
            case 6: {
                v = 90;
                break;
            }
            case 8: {
                v = 270;
                break;
            }
            default: {
                v = 0;
            }
        }
        Bitmap bitmap0 = BitmapFactory.decodeFile(s);
        Intrinsics.checkNotNullExpressionValue(bitmap0, "decodeFile(...)");
        Matrix matrix0 = new Matrix();
        matrix0.postRotate(((float)v));
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
        Intrinsics.checkNotNullExpressionValue(bitmap1, "createBitmap(...)");
        return bitmap1;
    }
}

