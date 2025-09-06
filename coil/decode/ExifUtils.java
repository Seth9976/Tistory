package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.util.-Bitmaps;
import i6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\b2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\b¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcoil/decode/ExifUtils;", "", "", "mimeType", "Lokio/BufferedSource;", "source", "Lcoil/decode/ExifOrientationPolicy;", "policy", "Lcoil/decode/ExifData;", "getExifData", "(Ljava/lang/String;Lokio/BufferedSource;Lcoil/decode/ExifOrientationPolicy;)Lcoil/decode/ExifData;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "reverseTransformations", "(Landroid/graphics/Bitmap;Lcoil/decode/ExifData;)Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExifUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,132:1\n95#2:133\n95#2:134\n43#2,3:135\n*S KotlinDebug\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n*L\n65#1:133\n67#1:134\n70#1:135,3\n*E\n"})
public final class ExifUtils {
    @NotNull
    public static final ExifUtils INSTANCE;
    public static final Paint a;

    static {
        ExifUtils.INSTANCE = new ExifUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
        ExifUtils.a = new Paint(3);
    }

    @NotNull
    public final ExifData getExifData(@Nullable String s, @NotNull BufferedSource bufferedSource0, @NotNull ExifOrientationPolicy exifOrientationPolicy0) {
        if(ExifUtilsKt.supports(exifOrientationPolicy0, s)) {
            ExifInterface exifInterface0 = new ExifInterface(new a(bufferedSource0.peek().inputStream()));
            return new ExifData(exifInterface0.isFlipped(), exifInterface0.getRotationDegrees());
        }
        return ExifData.NONE;
    }

    @NotNull
    public final Bitmap reverseTransformations(@NotNull Bitmap bitmap0, @NotNull ExifData exifData0) {
        if(!exifData0.isFlipped() && !ExifUtilsKt.isRotated(exifData0)) {
            return bitmap0;
        }
        Matrix matrix0 = new Matrix();
        float f = ((float)bitmap0.getWidth()) / 2.0f;
        float f1 = ((float)bitmap0.getHeight()) / 2.0f;
        if(exifData0.isFlipped()) {
            matrix0.postScale(-1.0f, 1.0f, f, f1);
        }
        if(ExifUtilsKt.isRotated(exifData0)) {
            matrix0.postRotate(((float)exifData0.getRotationDegrees()), f, f1);
        }
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)bitmap0.getWidth()), ((float)bitmap0.getHeight()));
        matrix0.mapRect(rectF0);
        float f2 = rectF0.left;
        if(f2 != 0.0f || rectF0.top != 0.0f) {
            matrix0.postTranslate(-f2, -rectF0.top);
        }
        Bitmap bitmap1 = ExifUtilsKt.isSwapped(exifData0) ? Bitmap.createBitmap(bitmap0.getHeight(), bitmap0.getWidth(), -Bitmaps.getSafeConfig(bitmap0)) : Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), -Bitmaps.getSafeConfig(bitmap0));
        new Canvas(bitmap1).drawBitmap(bitmap0, matrix0, ExifUtils.a);
        bitmap0.recycle();
        return bitmap1;
    }
}

