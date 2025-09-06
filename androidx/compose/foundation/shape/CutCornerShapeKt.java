package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A8\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u000E\u001A.\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u000E2\b\b\u0002\u0010\t\u001A\u00020\u000E2\b\b\u0002\u0010\n\u001A\u00020\u000E2\b\b\u0002\u0010\u000B\u001A\u00020\u000E\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0010\u001A.\u0010\u0000\u001A\u00020\u00012\b\b\u0003\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\u00102\b\b\u0003\u0010\u0013\u001A\u00020\u00102\b\b\u0003\u0010\u0014\u001A\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"CutCornerShape", "Landroidx/compose/foundation/shape/CutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "CutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/CutCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "CutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/CutCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,199:1\n148#2:200\n148#2:201\n148#2:202\n148#2:203\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n146#1:200\n147#1:201\n148#1:202\n149#1:203\n*E\n"})
public final class CutCornerShapeKt {
    @NotNull
    public static final CutCornerShape CutCornerShape(float f) {
        return CutCornerShapeKt.CutCornerShape(CornerSizeKt.CornerSize(f));
    }

    @NotNull
    public static final CutCornerShape CutCornerShape(float f, float f1, float f2, float f3) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f1), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3));
    }

    @NotNull
    public static final CutCornerShape CutCornerShape(int v) {
        return CutCornerShapeKt.CutCornerShape(CornerSizeKt.CornerSize(v));
    }

    @NotNull
    public static final CutCornerShape CutCornerShape(@IntRange(from = 0L, to = 100L) int v, @IntRange(from = 0L, to = 100L) int v1, @IntRange(from = 0L, to = 100L) int v2, @IntRange(from = 0L, to = 100L) int v3) {
        return new CutCornerShape(CornerSizeKt.CornerSize(v), CornerSizeKt.CornerSize(v1), CornerSizeKt.CornerSize(v2), CornerSizeKt.CornerSize(v3));
    }

    @NotNull
    public static final CutCornerShape CutCornerShape(@NotNull CornerSize cornerSize0) {
        return new CutCornerShape(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    public static CutCornerShape CutCornerShape$default(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return CutCornerShapeKt.CutCornerShape(f, f1, f2, f3);
    }

    public static CutCornerShape CutCornerShape$default(int v, int v1, int v2, int v3, int v4, Object object0) {
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
        return CutCornerShapeKt.CutCornerShape(v, v1, v2, v3);
    }

    @NotNull
    public static final CutCornerShape CutCornerShape-0680j_4(float f) {
        return CutCornerShapeKt.CutCornerShape(CornerSizeKt.CornerSize-0680j_4(f));
    }

    @NotNull
    public static final CutCornerShape CutCornerShape-a9UjIt4(float f, float f1, float f2, float f3) {
        return new CutCornerShape(CornerSizeKt.CornerSize-0680j_4(f), CornerSizeKt.CornerSize-0680j_4(f1), CornerSizeKt.CornerSize-0680j_4(f2), CornerSizeKt.CornerSize-0680j_4(f3));
    }

    public static CutCornerShape CutCornerShape-a9UjIt4$default(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return CutCornerShapeKt.CutCornerShape-a9UjIt4(f, f1, f2, f3);
    }
}

