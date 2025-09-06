package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001A\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\b\u001A\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0010\u001A\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001A\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001A\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u0012J\u0016\u0010\u0019\u001A\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001CJ\f\u0010\u001D\u001A\u00020\u001E*\u00020\u001FH\u0017J\u0016\u0010 \u001A\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001A\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001A\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,141:1\n26#2:142\n26#2:144\n1#3:143\n168#4:145\n168#4:146\n482#4:147\n198#5:148\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n69#1:142\n86#1:144\n92#1:145\n102#1:146\n125#1:147\n135#1:148\n*E\n"})
public interface Density extends FontScaling {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Stable
        public static void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull Density density0, long v) {
            return density0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull Density density0, float f) {
            return density0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull Density density0, long v) {
            return density0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull Density density0, float f) {
            return density0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull Density density0, int v) {
            return density0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull Density density0, long v) {
            return density0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull Density density0, long v) {
            return density0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull Density density0, float f) {
            return density0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density0, @NotNull DpRect dpRect0) {
            return density0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull Density density0, long v) {
            return density0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull Density density0, float f) {
            return density0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull Density density0, float f) {
            return density0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull Density density0, int v) {
            return density0.super.toSp-kPz2Gy4(v);
        }
    }

    float getDensity();

    @Stable
    default int roundToPx--R2X_6o(long v) {
        return Math.round(this.toPx--R2X_6o(v));
    }

    @Stable
    default int roundToPx-0680j_4(float f) {
        float f1 = this.toPx-0680j_4(f);
        return Float.isInfinite(f1) ? 0x7FFFFFFF : Math.round(f1);
    }

    @Stable
    default float toDp-u2uoSUM(float f) {
        return Dp.constructor-impl(f / this.getDensity());
    }

    @Stable
    default float toDp-u2uoSUM(int v) {
        return Dp.constructor-impl(((float)v) / this.getDensity());
    }

    // 去混淆评级： 低(20)
    @Stable
    default long toDpSize-k-rfVVM(long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : DpKt.DpSize-YgX7TsA(this.toDp-u2uoSUM(Size.getWidth-impl(v)), this.toDp-u2uoSUM(Size.getHeight-impl(v)));
    }

    @Stable
    default float toPx--R2X_6o(long v) {
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return this.toPx-0680j_4(this.toDp-GaN1DYA(v));
    }

    @Stable
    default float toPx-0680j_4(float f) {
        return this.getDensity() * f;
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect0) {
        return new Rect(this.toPx-0680j_4(dpRect0.getLeft-D9Ej5fM()), this.toPx-0680j_4(dpRect0.getTop-D9Ej5fM()), this.toPx-0680j_4(dpRect0.getRight-D9Ej5fM()), this.toPx-0680j_4(dpRect0.getBottom-D9Ej5fM()));
    }

    // 去混淆评级： 低(20)
    @Stable
    default long toSize-XkaWNTQ(long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : SizeKt.Size(this.toPx-0680j_4(DpSize.getWidth-D9Ej5fM(v)), this.toPx-0680j_4(DpSize.getHeight-D9Ej5fM(v)));
    }

    @Stable
    default long toSp-kPz2Gy4(float f) {
        return this.toSp-0xMU5do(this.toDp-u2uoSUM(f));
    }

    @Stable
    default long toSp-kPz2Gy4(int v) {
        return this.toSp-0xMU5do(this.toDp-u2uoSUM(v));
    }
}

