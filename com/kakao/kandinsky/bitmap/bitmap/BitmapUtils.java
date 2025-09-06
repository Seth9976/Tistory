package com.kakao.kandinsky.bitmap.bitmap;

import android.content.ContentResolver;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import androidx.exifinterface.media.ExifInterface;
import com.kakao.kandinsky.utils.Logger;
import java.io.InputStream;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/bitmap/bitmap/BitmapUtils;", "", "Landroid/net/Uri;", "uri", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/util/Size;", "getBitmapSize", "(Landroid/net/Uri;Landroid/content/ContentResolver;)Landroid/util/Size;", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BitmapUtils {
    @NotNull
    public static final BitmapUtils INSTANCE;
    public static final List a;

    static {
        BitmapUtils.INSTANCE = new BitmapUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
        BitmapUtils.a = CollectionsKt__CollectionsKt.listOf(new Integer[]{6, 8, 5, 7});
    }

    @Deprecated(message = "문제가 많음.. 분기 처리 불가")
    @NotNull
    public final Size getBitmapSize(@NotNull Uri uri0, @NotNull ContentResolver contentResolver0) {
        Size size0;
        Intrinsics.checkNotNullParameter(uri0, "uri");
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        InputStream inputStream0 = contentResolver0.openInputStream(uri0);
        if(inputStream0 == null) {
            size0 = null;
        }
        else {
            try {
                ExifInterface exifInterface0 = new ExifInterface(inputStream0);
                int v = exifInterface0.getAttributeInt("Orientation", 0);
                int v1 = exifInterface0.getAttributeInt("ImageWidth", 0);
                int v2 = exifInterface0.getAttributeInt("ImageLength", 0);
                Logger.INSTANCE.log("bitmap exif " + v + " " + v1 + " " + v2);
                if(v == 0 || v1 == 0 || v2 == 0) {
                    size0 = null;
                }
                else if(BitmapUtils.a.contains(v)) {
                    size0 = new Size(v2, v1);
                }
                else {
                    size0 = new Size(v1, v2);
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(inputStream0, throwable0);
                throw throwable1;
            }
        label_22:
            CloseableKt.closeFinally(inputStream0, null);
        }
        if(size0 == null) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            InputStream inputStream1 = contentResolver0.openInputStream(uri0);
            if(inputStream1 != null) {
                try {
                    BitmapFactory.decodeStream(inputStream1, null, bitmapFactory$Options0);
                }
                catch(Throwable throwable2) {
                    CloseableKt.closeFinally(inputStream1, throwable2);
                    throw throwable2;
                }
                CloseableKt.closeFinally(inputStream1, null);
            }
            bitmapFactory$Options0.inJustDecodeBounds = false;
            Logger.INSTANCE.log("bitmap option " + bitmapFactory$Options0.outWidth + " " + bitmapFactory$Options0.outHeight);
            return new Size(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
        }
        return size0;
    }
}

