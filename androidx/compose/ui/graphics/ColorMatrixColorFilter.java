package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001F\b\u0000\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001A\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001A\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "targetColorMatrix", "copyColorMatrix-gBh15pI", "([F)[F", "copyColorMatrix", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ColorMatrixColorFilter extends ColorFilter {
    public float[] b;

    public ColorMatrixColorFilter(float[] arr_f, android.graphics.ColorFilter colorFilter0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(colorFilter0);
        this.b = arr_f;
    }

    public ColorMatrixColorFilter(float[] arr_f, DefaultConstructorMarker defaultConstructorMarker0) {
        this(arr_f, AndroidColorFilter_androidKt.actualColorMatrixColorFilter-jHG-Opc(arr_f), null);
    }

    @NotNull
    public final float[] copyColorMatrix-gBh15pI(@NotNull float[] arr_f) {
        float[] arr_f1 = this.b;
        if(arr_f1 == null) {
            arr_f1 = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(this.getNativeColorFilter$ui_graphics_release());
            this.b = arr_f1;
        }
        ArraysKt___ArraysJvmKt.copyInto$default(arr_f1, arr_f, 0, 0, 0, 14, null);
        return arr_f;
    }

    public static float[] copyColorMatrix-gBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter0, float[] arr_f, int v, Object object0) {
        if((v & 1) != 0) {
            arr_f = ColorMatrix.constructor-impl$default(null, 1, null);
        }
        return colorMatrixColorFilter0.copyColorMatrix-gBh15pI(arr_f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ColorMatrixColorFilter)) {
            return false;
        }
        float[] arr_f = this.b;
        if(arr_f == null) {
            arr_f = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(this.getNativeColorFilter$ui_graphics_release());
            this.b = arr_f;
        }
        float[] arr_f1 = ((ColorMatrixColorFilter)object0).b;
        if(arr_f1 == null) {
            arr_f1 = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(((ColorMatrixColorFilter)object0).getNativeColorFilter$ui_graphics_release());
            ((ColorMatrixColorFilter)object0).b = arr_f1;
        }
        return Arrays.equals(arr_f, arr_f1);
    }

    @Override
    public int hashCode() {
        return this.b == null ? 0 : ColorMatrix.hashCode-impl(this.b);
    }

    @Override
    @NotNull
    public String toString() {
        return "ColorMatrixColorFilter(colorMatrix=" + (this.b == null ? "null" : ColorMatrix.toString-impl(this.b)) + ')';
    }
}

