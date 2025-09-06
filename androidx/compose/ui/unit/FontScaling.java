package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001A\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\r\u001A\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,68:1\n54#2,7:69\n*S KotlinDebug\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n*L\n59#1:69,7\n*E\n"})
public interface FontScaling {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Stable
        public static void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull FontScaling fontScaling0, long v) {
            return fontScaling0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull FontScaling fontScaling0, float f) {
            return fontScaling0.super.toSp-0xMU5do(f);
        }
    }

    float getFontScale();

    @Stable
    default float toDp-GaN1DYA(long v) {
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory0 = FontScaleConverterFactory.INSTANCE;
        if(!fontScaleConverterFactory0.isNonLinearFontScalingActive(this.getFontScale())) {
            return Dp.constructor-impl(this.getFontScale() * TextUnit.getValue-impl(v));
        }
        FontScaleConverter fontScaleConverter0 = fontScaleConverterFactory0.forScale(this.getFontScale());
        float f = TextUnit.getValue-impl(v);
        return fontScaleConverter0 == null ? Dp.constructor-impl(this.getFontScale() * f) : Dp.constructor-impl(fontScaleConverter0.convertSpToDp(f));
    }

    @Stable
    default long toSp-0xMU5do(float f) {
        FontScaleConverterFactory fontScaleConverterFactory0 = FontScaleConverterFactory.INSTANCE;
        if(!fontScaleConverterFactory0.isNonLinearFontScalingActive(this.getFontScale())) {
            return TextUnitKt.getSp(f / this.getFontScale());
        }
        FontScaleConverter fontScaleConverter0 = fontScaleConverterFactory0.forScale(this.getFontScale());
        return fontScaleConverter0 == null ? TextUnitKt.getSp(f / this.getFontScale()) : TextUnitKt.getSp(fontScaleConverter0.convertDpToSp(f));
    }
}

