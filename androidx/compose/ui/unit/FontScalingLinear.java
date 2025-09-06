package androidx.compose.ui.unit;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001A\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\r\u001A\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScalingLinear;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public interface FontScalingLinear {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Stable
        public static void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull FontScalingLinear fontScalingLinear0, long v) {
            return fontScalingLinear0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull FontScalingLinear fontScalingLinear0, float f) {
            return fontScalingLinear0.super.toSp-0xMU5do(f);
        }
    }

    float getFontScale();

    @Stable
    default float toDp-GaN1DYA(long v) {
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.constructor-impl(this.getFontScale() * TextUnit.getValue-impl(v));
    }

    @Stable
    default long toSp-0xMU5do(float f) {
        return TextUnitKt.getSp(f / this.getFontScale());
    }
}

