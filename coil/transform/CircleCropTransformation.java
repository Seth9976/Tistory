package coil.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import coil.size.Size;
import coil.util.-Bitmaps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0017\u001A\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcoil/transform/CircleCropTransformation;", "Lcoil/transform/Transformation;", "<init>", "()V", "Landroid/graphics/Bitmap;", "input", "Lcoil/size/Size;", "size", "transform", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCircleCropTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,41:1\n95#2:42\n43#2,3:43\n*S KotlinDebug\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n*L\n27#1:42\n28#1:43,3\n*E\n"})
public final class CircleCropTransformation implements Transformation {
    public final String a;

    public CircleCropTransformation() {
        this.a = "coil.transform.CircleCropTransformation";
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof CircleCropTransformation;
    }

    @Override  // coil.transform.Transformation
    @NotNull
    public String getCacheKey() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return CircleCropTransformation.class.hashCode();
    }

    @Override  // coil.transform.Transformation
    @Nullable
    public Object transform(@NotNull Bitmap bitmap0, @NotNull Size size0, @NotNull Continuation continuation0) {
        Paint paint0 = new Paint(3);
        int v = Math.min(bitmap0.getWidth(), bitmap0.getHeight());
        float f = ((float)v) / 2.0f;
        Bitmap bitmap1 = Bitmap.createBitmap(v, v, -Bitmaps.getSafeConfig(bitmap0));
        Canvas canvas0 = new Canvas(bitmap1);
        canvas0.drawCircle(f, f, f, paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, f - ((float)bitmap0.getWidth()) / 2.0f, f - ((float)bitmap0.getHeight()) / 2.0f, paint0);
        return bitmap1;
    }
}

