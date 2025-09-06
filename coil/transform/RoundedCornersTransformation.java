package coil.transform;

import a5.b;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import androidx.annotation.Px;
import coil.decode.DecodeUtils;
import coil.size.-Sizes;
import coil.size.Dimension.Pixels;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.util.-Bitmaps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import zd.c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000F\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001E\u001A\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcoil/transform/RoundedCornersTransformation;", "Lcoil/transform/Transformation;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Lcoil/size/Size;", "size", "transform", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "e", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRoundedCornersTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,132:1\n95#2:133\n43#2,2:134\n45#2:137\n1#3:136\n57#4:138\n57#4:139\n*S KotlinDebug\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n*L\n58#1:133\n59#1:134,2\n59#1:137\n106#1:138\n107#1:139\n*E\n"})
public final class RoundedCornersTransformation implements Transformation {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public RoundedCornersTransformation(@Px float f) {
        this(f, f, f, f);
    }

    public RoundedCornersTransformation(@Px float f, @Px float f1, @Px float f2, @Px float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(f < 0.0f || f1 < 0.0f || f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.e = "coil.transform.RoundedCornersTransformation" + '-' + f + ',' + f1 + ',' + f2 + ',' + f3;
    }

    public RoundedCornersTransformation(float f, float f1, float f2, float f3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        this(f, f1, f2, f3);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof RoundedCornersTransformation && this.a == ((RoundedCornersTransformation)object0).a && this.b == ((RoundedCornersTransformation)object0).b && this.c == ((RoundedCornersTransformation)object0).c && this.d == ((RoundedCornersTransformation)object0).d;
    }

    @Override  // coil.transform.Transformation
    @NotNull
    public String getCacheKey() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override  // coil.transform.Transformation
    @Nullable
    public Object transform(@NotNull Bitmap bitmap0, @NotNull Size size0, @NotNull Continuation continuation0) {
        Pair pair0;
        Paint paint0 = new Paint(3);
        if(-Sizes.isOriginal(size0)) {
            pair0 = TuplesKt.to(bitmap0.getWidth(), bitmap0.getHeight());
        }
        else {
            Dimension dimension0 = size0.component1();
            Dimension dimension1 = size0.component2();
            if(!(dimension0 instanceof Pixels) || !(dimension1 instanceof Pixels)) {
                int v = bitmap0.getWidth();
                int v1 = bitmap0.getHeight();
                Dimension dimension2 = size0.getWidth();
                int v2 = 0x80000000;
                int v3 = dimension2 instanceof Pixels ? ((Pixels)dimension2).px : 0x80000000;
                Dimension dimension3 = size0.getHeight();
                if(dimension3 instanceof Pixels) {
                    v2 = ((Pixels)dimension3).px;
                }
                double f = DecodeUtils.computeSizeMultiplier(v, v1, v3, v2, Scale.FILL);
                pair0 = TuplesKt.to(c.roundToInt(((double)bitmap0.getWidth()) * f), c.roundToInt(f * ((double)bitmap0.getHeight())));
            }
            else {
                pair0 = TuplesKt.to(((Pixels)dimension0).px, ((Pixels)dimension1).px);
            }
        }
        int v4 = ((Number)pair0.component1()).intValue();
        int v5 = ((Number)pair0.component2()).intValue();
        Bitmap bitmap1 = Bitmap.createBitmap(v4, v5, -Bitmaps.getSafeConfig(bitmap0));
        Canvas canvas0 = new Canvas(bitmap1);
        canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix0 = new Matrix();
        float f1 = (float)DecodeUtils.computeSizeMultiplier(bitmap0.getWidth(), bitmap0.getHeight(), v4, v5, Scale.FILL);
        matrix0.setTranslate((((float)v4) - ((float)bitmap0.getWidth()) * f1) / 2.0f, b.a(f1, bitmap0.getHeight(), v5, 2.0f));
        matrix0.preScale(f1, f1);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader0.setLocalMatrix(matrix0);
        paint0.setShader(bitmapShader0);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()));
        Path path0 = new Path();
        path0.addRoundRect(rectF0, new float[]{this.a, this.a, this.b, this.b, this.d, this.d, this.c, this.c}, Path.Direction.CW);
        canvas0.drawPath(path0, paint0);
        return bitmap1;
    }
}

