package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion.Linearity;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001AW\u0010\u000E\u001A\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012&\u0010\t\u001A\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\fH\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001D\u0010\u0013\u001A\u00020\u0012*\u00020\u00002\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0013\u0010\u0015\u001A\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u0017\u0010\u0019\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "", "setTextMotion", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/style/TextMotion;)V", "hasFontAttributes", "(Landroidx/compose/ui/text/SpanStyle;)Z", "", "blurRadius", "correctBlurRadius", "(F)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextPaintExtensions_androidKt {
    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint0, @NotNull SpanStyle spanStyle0, @NotNull Function4 function40, @NotNull Density density0, boolean z) {
        long v = TextUnit.getType-UIouoOA(spanStyle0.getFontSize-XSAIIZE());
        if(TextUnitType.equals-impl0(v, 0x100000000L)) {
            androidTextPaint0.setTextSize(density0.toPx--R2X_6o(spanStyle0.getFontSize-XSAIIZE()));
        }
        else if(TextUnitType.equals-impl0(v, 0x200000000L)) {
            androidTextPaint0.setTextSize(TextUnit.getValue-impl(spanStyle0.getFontSize-XSAIIZE()) * androidTextPaint0.getTextSize());
        }
        if(TextPaintExtensions_androidKt.hasFontAttributes(spanStyle0)) {
            FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
            FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
            androidTextPaint0.setTypeface(((Typeface)function40.invoke(spanStyle0.getFontFamily(), (spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight()), FontStyle.box-impl((fontStyle0 == null ? 0 : fontStyle0.unbox-impl())), FontSynthesis.box-impl((fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl())))));
        }
        if(spanStyle0.getLocaleList() != null && !Intrinsics.areEqual(spanStyle0.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint0, spanStyle0.getLocaleList());
        }
        if(spanStyle0.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle0.getFontFeatureSettings(), "")) {
            androidTextPaint0.setFontFeatureSettings(spanStyle0.getFontFeatureSettings());
        }
        if(spanStyle0.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle0.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint0.setTextScaleX(spanStyle0.getTextGeometricTransform().getScaleX() * androidTextPaint0.getTextScaleX());
            androidTextPaint0.setTextSkewX(spanStyle0.getTextGeometricTransform().getSkewX() + androidTextPaint0.getTextSkewX());
        }
        androidTextPaint0.setColor-8_81llA(spanStyle0.getColor-0d7_KjU());
        androidTextPaint0.setBrush-12SF9DM(spanStyle0.getBrush(), 0x7FC000007FC00000L, spanStyle0.getAlpha());
        androidTextPaint0.setShadow(spanStyle0.getShadow());
        androidTextPaint0.setTextDecoration(spanStyle0.getTextDecoration());
        androidTextPaint0.setDrawStyle(spanStyle0.getDrawStyle());
        if(TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x100000000L) && TextUnit.getValue-impl(spanStyle0.getLetterSpacing-XSAIIZE()) != 0.0f) {
            float f = androidTextPaint0.getTextSize();
            float f1 = androidTextPaint0.getTextScaleX() * f;
            float f2 = density0.toPx--R2X_6o(spanStyle0.getLetterSpacing-XSAIIZE());
            if(f1 != 0.0f) {
                androidTextPaint0.setLetterSpacing(f2 / f1);
            }
        }
        else if(TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x200000000L)) {
            androidTextPaint0.setLetterSpacing(TextUnit.getValue-impl(spanStyle0.getLetterSpacing-XSAIIZE()));
        }
        long v1 = spanStyle0.getLetterSpacing-XSAIIZE();
        long v2 = spanStyle0.getBackground-0d7_KjU();
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        boolean z1 = false;
        boolean z2 = z && TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v1), 0x100000000L) && TextUnit.getValue-impl(v1) != 0.0f;
        boolean z3 = !Color.equals-impl0(v2, 0L);
        if(baselineShift0 != null && !BaselineShift.equals-impl0(baselineShift0.unbox-impl(), 0.0f)) {
            z1 = true;
        }
        if(z2 || z3 || z1) {
            if(!z2) {
                v1 = 0x7FC00000L;
            }
            if(!z3) {
                v2 = 0L;
            }
            return z1 ? new SpanStyle(0L, 0L, null, null, null, null, null, v1, baselineShift0, null, null, v2, null, null, null, null, 0xF67F, null) : new SpanStyle(0L, 0L, null, null, null, null, null, v1, null, null, null, v2, null, null, null, null, 0xF67F, null);
        }
        return null;
    }

    public static SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint0, SpanStyle spanStyle0, Function4 function40, Density density0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        return TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint0, spanStyle0, function40, density0, z);
    }

    public static final float correctBlurRadius(float f) {
        return f == 0.0f ? 1.401298E-45f : f;
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle0) {
        return spanStyle0.getFontFamily() != null || spanStyle0.getFontStyle-4Lr2A7w() != null || spanStyle0.getFontWeight() != null;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint0, @Nullable TextMotion textMotion0) {
        if(textMotion0 == null) {
            textMotion0 = TextMotion.Companion.getStatic();
        }
        androidTextPaint0.setFlags((textMotion0.getSubpixelTextPositioning$ui_text_release() ? androidTextPaint0.getFlags() | 0x80 : androidTextPaint0.getFlags() & 0xFFFFFF7F));
        int v = textMotion0.getLinearity-4e0Vf04$ui_text_release();
        if(Linearity.equals-impl0(v, 1)) {
            androidTextPaint0.setFlags(androidTextPaint0.getFlags() | 0x40);
            androidTextPaint0.setHinting(0);
            return;
        }
        if(Linearity.equals-impl0(v, 2)) {
            androidTextPaint0.getFlags();
            androidTextPaint0.setHinting(1);
            return;
        }
        if(Linearity.equals-impl0(v, 3)) {
            androidTextPaint0.getFlags();
            androidTextPaint0.setHinting(0);
            return;
        }
        androidTextPaint0.getFlags();
    }
}

