package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001E\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001A\u0010\u001BR \u0010\"\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001F\u0010\u0019\u0012\u0004\b!\u0010\u001D\u001A\u0004\b \u0010\u001B¨\u0006$"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "dp", "convertDpToSp", "(F)F", "sp", "convertSpToDp", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[F", "getMFromSpValues", "()[F", "getMFromSpValues$annotations", "()V", "mFromSpValues", "b", "getMToDpValues", "getMToDpValues$annotations", "mToDpValues", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FontScaleConverterTable implements FontScaleConverter {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final float access$lookupAndInterpolate(Companion fontScaleConverterTable$Companion0, float f, float[] arr_f, float[] arr_f1) {
            fontScaleConverterTable$Companion0.getClass();
            float f1 = Math.abs(f);
            float f2 = Math.signum(f);
            int v = Arrays.binarySearch(arr_f, f1);
            if(v >= 0) {
                return f2 * arr_f1[v];
            }
            int v1 = -(v + 1) - 1;
            if(v1 >= arr_f.length - 1) {
                float f3 = arr_f[arr_f.length - 1];
                return f3 == 0.0f ? 0.0f : arr_f1[arr_f.length - 1] / f3 * f;
            }
            return v1 == -1 ? f2 * MathUtils.INSTANCE.constrainedMap(0.0f, arr_f1[0], 0.0f, arr_f[0], f1) : f2 * MathUtils.INSTANCE.constrainedMap(arr_f1[v1], arr_f1[-(v + 1)], arr_f[v1], arr_f[-(v + 1)], f1);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float[] a;
    public final float[] b;

    static {
        FontScaleConverterTable.Companion = new Companion(null);
        FontScaleConverterTable.$stable = 8;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public FontScaleConverterTable(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        if(arr_f.length != arr_f1.length || arr_f.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = arr_f;
        this.b = arr_f1;
    }

    @Override  // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f) {
        return Companion.access$lookupAndInterpolate(FontScaleConverterTable.Companion, f, this.b, this.a);
    }

    @Override  // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f) {
        return Companion.access$lookupAndInterpolate(FontScaleConverterTable.Companion, f, this.a, this.b);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontScaleConverterTable ? Arrays.equals(this.a, ((FontScaleConverterTable)object0).a) && Arrays.equals(this.b, ((FontScaleConverterTable)object0).b) : false;
    }

    @NotNull
    public final float[] getMFromSpValues() {
        return this.a;
    }

    @VisibleForTesting
    public static void getMFromSpValues$annotations() {
    }

    @NotNull
    public final float[] getMToDpValues() {
        return this.b;
    }

    @VisibleForTesting
    public static void getMToDpValues$annotations() {
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.a);
        return Arrays.hashCode(this.b) + v * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        String s = Arrays.toString(this.a);
        Intrinsics.checkNotNullExpressionValue(s, "toString(this)");
        String s1 = Arrays.toString(this.b);
        Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
        return "FontScaleConverter{fromSpValues=" + s + ", toDpValues=" + s1 + '}';
    }
}

