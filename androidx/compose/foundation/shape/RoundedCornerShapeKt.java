package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0013\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0018\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\t¢\u0006\u0004\b\u0003\u0010\b\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0003\u0010\f\u001A8\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A5\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t¢\u0006\u0004\b\u0003\u0010\u0012\u001A5\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\u0013\u001A\u00020\n2\b\b\u0003\u0010\u0014\u001A\u00020\n2\b\b\u0003\u0010\u0015\u001A\u00020\n2\b\b\u0003\u0010\u0016\u001A\u00020\n¢\u0006\u0004\b\u0003\u0010\u0017\"\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/shape/CornerSize;", "corner", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", "size", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "", "percent", "(I)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "(IIII)Landroidx/compose/foundation/shape/RoundedCornerShape;", "a", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n148#2:202\n148#2:203\n148#2:204\n148#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n148#1:202\n149#1:203\n150#1:204\n151#1:205\n*E\n"})
public final class RoundedCornerShapeKt {
    public static final RoundedCornerShape a;

    static {
        RoundedCornerShapeKt.a = RoundedCornerShapeKt.RoundedCornerShape(50);
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f) {
        return RoundedCornerShapeKt.RoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f, float f1, float f2, float f3) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f1), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int v) {
        return RoundedCornerShapeKt.RoundedCornerShape(CornerSizeKt.CornerSize(v));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(@IntRange(from = 0L, to = 100L) int v, @IntRange(from = 0L, to = 100L) int v1, @IntRange(from = 0L, to = 100L) int v2, @IntRange(from = 0L, to = 100L) int v3) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(v), CornerSizeKt.CornerSize(v1), CornerSizeKt.CornerSize(v2), CornerSizeKt.CornerSize(v3));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(@NotNull CornerSize cornerSize0) {
        return new RoundedCornerShape(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    public static RoundedCornerShape RoundedCornerShape$default(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return RoundedCornerShapeKt.RoundedCornerShape(f, f1, f2, f3);
    }

    public static RoundedCornerShape RoundedCornerShape$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        return RoundedCornerShapeKt.RoundedCornerShape(v, v1, v2, v3);
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape-0680j_4(float f) {
        return RoundedCornerShapeKt.RoundedCornerShape(CornerSizeKt.CornerSize-0680j_4(f));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape-a9UjIt4(float f, float f1, float f2, float f3) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize-0680j_4(f), CornerSizeKt.CornerSize-0680j_4(f1), CornerSizeKt.CornerSize-0680j_4(f2), CornerSizeKt.CornerSize-0680j_4(f3));
    }

    public static RoundedCornerShape RoundedCornerShape-a9UjIt4$default(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4(f, f1, f2, f3);
    }

    @NotNull
    public static final RoundedCornerShape getCircleShape() {
        return RoundedCornerShapeKt.a;
    }
}

