package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A*\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A-\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0001\u001A\u00028\u00002\u0006\u0010\u0002\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A%\u0010\u000F\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0017\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001AÀ\u0001\u00106\u001A\u00020\f*\u00020\f2\u0006\u0010\u0015\u001A\u00020\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001A\u00020\u00032\u0006\u0010\u0019\u001A\u00020\u00002\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\u0010!\u001A\u0004\u0018\u00010 2\b\u0010#\u001A\u0004\u0018\u00010\"2\u0006\u0010$\u001A\u00020\u00002\b\u0010&\u001A\u0004\u0018\u00010%2\b\u0010(\u001A\u0004\u0018\u00010\'2\b\u0010*\u001A\u0004\u0018\u00010)2\u0006\u0010+\u001A\u00020\u00142\b\u0010-\u001A\u0004\u0018\u00010,2\b\u0010/\u001A\u0004\u0018\u00010.2\b\u00101\u001A\u0004\u0018\u0001002\b\u00103\u001A\u0004\u0018\u000102H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "a", "b", "", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "lerpTextUnitInheritable", "T", "fraction", "lerpDiscrete", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "lerp", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;F)Landroidx/compose/ui/text/SpanStyle;", "style", "resolveSpanStyleDefaults", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "fastMerge", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,950:1\n708#2:951\n696#2:952\n696#2:954\n696#2:956\n708#2:957\n696#2:958\n251#3:953\n251#3:955\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n848#1:951\n848#1:952\n890#1:954\n905#1:956\n937#1:957\n937#1:958\n889#1:953\n895#1:955\n*E\n"})
public final class SpanStyleKt {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final TextForegroundStyle d;

    static {
        SpanStyleKt.a = 0x141600000L;
        SpanStyleKt.b = 0x100000000L;
        SpanStyleKt.c = 0L;
        SpanStyleKt.d = TextForegroundStyle.Companion.from-8_81llA(0xFF00000000000000L);
    }

    @NotNull
    public static final SpanStyle fastMerge-dSHsh3o(@NotNull SpanStyle spanStyle0, long v, @Nullable Brush brush0, float f, long v1, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v2, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v3, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable PlatformSpanStyle platformSpanStyle0, @Nullable DrawStyle drawStyle0) {
        PlatformSpanStyle platformSpanStyle1;
        Shadow shadow1;
        TextDecoration textDecoration2;
        DrawStyle drawStyle1;
        long v4;
        TextGeometricTransform textGeometricTransform1;
        if(!TextUnitKt.isUnspecified--R2X_6o(v1) && !TextUnit.equals-impl0(v1, spanStyle0.getFontSize-XSAIIZE())) {
            textGeometricTransform1 = textGeometricTransform0;
            v4 = v3;
            drawStyle1 = drawStyle0;
        }
        else if((brush0 != null || v == 16L || Color.equals-impl0(v, spanStyle0.getTextForegroundStyle$ui_text_release().getColor-0d7_KjU())) && (fontStyle0 == null || Intrinsics.areEqual(fontStyle0, spanStyle0.getFontStyle-4Lr2A7w())) && (fontWeight0 == null || Intrinsics.areEqual(fontWeight0, spanStyle0.getFontWeight())) && (fontFamily0 == null || fontFamily0 == spanStyle0.getFontFamily()) && (TextUnitKt.isUnspecified--R2X_6o(v2) || TextUnit.equals-impl0(v2, spanStyle0.getLetterSpacing-XSAIIZE())) && (textDecoration0 == null || Intrinsics.areEqual(textDecoration0, spanStyle0.getTextDecoration())) && Intrinsics.areEqual(brush0, spanStyle0.getTextForegroundStyle$ui_text_release().getBrush()) && (brush0 == null || f == spanStyle0.getTextForegroundStyle$ui_text_release().getAlpha()) && (fontSynthesis0 == null || Intrinsics.areEqual(fontSynthesis0, spanStyle0.getFontSynthesis-ZQGJjVo())) && (s == null || Intrinsics.areEqual(s, spanStyle0.getFontFeatureSettings())) && (baselineShift0 == null || Intrinsics.areEqual(baselineShift0, spanStyle0.getBaselineShift-5SSeXJ0()))) {
            textGeometricTransform1 = textGeometricTransform0;
            if(textGeometricTransform1 != null && !Intrinsics.areEqual(textGeometricTransform1, spanStyle0.getTextGeometricTransform()) || localeList0 != null && !Intrinsics.areEqual(localeList0, spanStyle0.getLocaleList())) {
                v4 = v3;
                drawStyle1 = drawStyle0;
            }
            else {
                v4 = v3;
                if(v4 != 16L && !Color.equals-impl0(v4, spanStyle0.getBackground-0d7_KjU()) || shadow0 != null && !Intrinsics.areEqual(shadow0, spanStyle0.getShadow()) || platformSpanStyle0 != null && !Intrinsics.areEqual(platformSpanStyle0, spanStyle0.getPlatformStyle())) {
                    drawStyle1 = drawStyle0;
                }
                else {
                    drawStyle1 = drawStyle0;
                    if(drawStyle1 == null || Intrinsics.areEqual(drawStyle1, spanStyle0.getDrawStyle())) {
                        return spanStyle0;
                    }
                }
            }
        }
        else {
            textGeometricTransform1 = textGeometricTransform0;
            v4 = v3;
            drawStyle1 = drawStyle0;
        }
        TextForegroundStyle textForegroundStyle0 = spanStyle0.getTextForegroundStyle$ui_text_release().merge((brush0 == null ? TextForegroundStyle.Companion.from-8_81llA(v) : TextForegroundStyle.Companion.from(brush0, f)));
        FontFamily fontFamily1 = fontFamily0 == null ? spanStyle0.getFontFamily() : fontFamily0;
        long v5 = TextUnitKt.isUnspecified--R2X_6o(v1) ? spanStyle0.getFontSize-XSAIIZE() : v1;
        if(fontWeight0 == null) {
            fontWeight0 = spanStyle0.getFontWeight();
        }
        if(fontStyle0 == null) {
            fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
        }
        if(fontSynthesis0 == null) {
            fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
        }
        String s1 = s == null ? spanStyle0.getFontFeatureSettings() : s;
        long v6 = TextUnitKt.isUnspecified--R2X_6o(v2) ? spanStyle0.getLetterSpacing-XSAIIZE() : v2;
        if(baselineShift0 == null) {
            baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        }
        if(textGeometricTransform1 == null) {
            textGeometricTransform1 = spanStyle0.getTextGeometricTransform();
        }
        LocaleList localeList1 = localeList0 == null ? spanStyle0.getLocaleList() : localeList0;
        if(v4 == 16L) {
            v4 = spanStyle0.getBackground-0d7_KjU();
        }
        TextDecoration textDecoration1 = textDecoration0 == null ? spanStyle0.getTextDecoration() : textDecoration0;
        if(shadow0 == null) {
            shadow0 = spanStyle0.getShadow();
        }
        if(spanStyle0.getPlatformStyle() == null) {
            textDecoration2 = textDecoration1;
            shadow1 = shadow0;
            platformSpanStyle1 = platformSpanStyle0;
        }
        else {
            shadow1 = shadow0;
            if(platformSpanStyle0 != null) {
            }
            textDecoration2 = textDecoration1;
            platformSpanStyle1 = spanStyle0.getPlatformStyle();
        }
        if(drawStyle1 == null) {
            drawStyle1 = spanStyle0.getDrawStyle();
        }
        return new SpanStyle(textForegroundStyle0, v5, fontWeight0, fontStyle0, fontSynthesis0, fontFamily1, s1, v6, baselineShift0, textGeometricTransform1, localeList1, v4, textDecoration2, shadow1, platformSpanStyle1, drawStyle1, null);
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle spanStyle0, @NotNull SpanStyle spanStyle1, float f) {
        TextForegroundStyle textForegroundStyle0 = TextDrawStyleKt.lerp(spanStyle0.getTextForegroundStyle$ui_text_release(), spanStyle1.getTextForegroundStyle$ui_text_release(), f);
        Object object0 = SpanStyleKt.lerpDiscrete(spanStyle0.getFontFamily(), spanStyle1.getFontFamily(), f);
        long v = SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(spanStyle0.getFontSize-XSAIIZE(), spanStyle1.getFontSize-XSAIIZE(), f);
        FontWeight fontWeight0 = FontWeightKt.lerp((spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight()), (spanStyle1.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle1.getFontWeight()), f);
        Object object1 = SpanStyleKt.lerpDiscrete(spanStyle0.getFontStyle-4Lr2A7w(), spanStyle1.getFontStyle-4Lr2A7w(), f);
        Object object2 = SpanStyleKt.lerpDiscrete(spanStyle0.getFontSynthesis-ZQGJjVo(), spanStyle1.getFontSynthesis-ZQGJjVo(), f);
        Object object3 = SpanStyleKt.lerpDiscrete(spanStyle0.getFontFeatureSettings(), spanStyle1.getFontFeatureSettings(), f);
        long v1 = SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(spanStyle0.getLetterSpacing-XSAIIZE(), spanStyle1.getLetterSpacing-XSAIIZE(), f);
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        BaselineShift baselineShift1 = spanStyle1.getBaselineShift-5SSeXJ0();
        float f1 = BaselineShiftKt.lerp-jWV1Mfo((baselineShift0 == null ? 0.0f : baselineShift0.unbox-impl()), (baselineShift1 == null ? 0.0f : baselineShift1.unbox-impl()), f);
        TextGeometricTransform textGeometricTransform0 = TextGeometricTransformKt.lerp((spanStyle0.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : spanStyle0.getTextGeometricTransform()), (spanStyle1.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : spanStyle1.getTextGeometricTransform()), f);
        Object object4 = SpanStyleKt.lerpDiscrete(spanStyle0.getLocaleList(), spanStyle1.getLocaleList(), f);
        long v2 = ColorKt.lerp-jxsXWHM(spanStyle0.getBackground-0d7_KjU(), spanStyle1.getBackground-0d7_KjU(), f);
        TextDecoration textDecoration0 = (TextDecoration)SpanStyleKt.lerpDiscrete(spanStyle0.getTextDecoration(), spanStyle1.getTextDecoration(), f);
        Shadow shadow0 = ShadowKt.lerp((spanStyle0.getShadow() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle0.getShadow()), (spanStyle1.getShadow() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle1.getShadow()), f);
        PlatformSpanStyle platformSpanStyle0 = spanStyle0.getPlatformStyle();
        if(platformSpanStyle0 == null && spanStyle1.getPlatformStyle() == null) {
            return new SpanStyle(textForegroundStyle0, v, fontWeight0, ((FontStyle)object1), ((FontSynthesis)object2), ((FontFamily)object0), ((String)object3), v1, BaselineShift.box-impl(f1), textGeometricTransform0, ((LocaleList)object4), v2, textDecoration0, shadow0, null, ((DrawStyle)SpanStyleKt.lerpDiscrete(spanStyle0.getDrawStyle(), spanStyle1.getDrawStyle(), f)), null);
        }
        if(platformSpanStyle0 == null) {
            platformSpanStyle0 = PlatformSpanStyle.Companion.getDefault();
        }
        return new SpanStyle(textForegroundStyle0, v, fontWeight0, ((FontStyle)object1), ((FontSynthesis)object2), ((FontFamily)object0), ((String)object3), v1, BaselineShift.box-impl(f1), textGeometricTransform0, ((LocaleList)object4), v2, textDecoration0, shadow0, platformSpanStyle0, ((DrawStyle)SpanStyleKt.lerpDiscrete(spanStyle0.getDrawStyle(), spanStyle1.getDrawStyle(), f)), null);
    }

    public static final Object lerpDiscrete(Object object0, Object object1, float f) {
        return ((double)f) < 0.5 ? object0 : object1;
    }

    // 去混淆评级： 低(20)
    public static final long lerpTextUnitInheritable-C3pnCVY(long v, long v1, float f) {
        return TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1) ? ((TextUnit)SpanStyleKt.lerpDiscrete(TextUnit.box-impl(v), TextUnit.box-impl(v1), f)).unbox-impl() : TextUnitKt.lerp-C3pnCVY(v, v1, f);
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle spanStyle0) {
        TextForegroundStyle textForegroundStyle0 = spanStyle0.getTextForegroundStyle$ui_text_release().takeOrElse(m0.w);
        long v = TextUnitKt.isUnspecified--R2X_6o(spanStyle0.getFontSize-XSAIIZE()) ? SpanStyleKt.a : spanStyle0.getFontSize-XSAIIZE();
        FontWeight fontWeight0 = spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight();
        FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
        FontStyle fontStyle1 = FontStyle.box-impl((fontStyle0 == null ? 0 : fontStyle0.unbox-impl()));
        FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
        FontSynthesis fontSynthesis1 = FontSynthesis.box-impl((fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()));
        FontFamily fontFamily0 = spanStyle0.getFontFamily();
        if(fontFamily0 == null) {
            fontFamily0 = FontFamily.Companion.getDefault();
        }
        String s = spanStyle0.getFontFeatureSettings() == null ? "" : spanStyle0.getFontFeatureSettings();
        long v1 = TextUnitKt.isUnspecified--R2X_6o(spanStyle0.getLetterSpacing-XSAIIZE()) ? SpanStyleKt.b : spanStyle0.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        BaselineShift baselineShift1 = BaselineShift.box-impl((baselineShift0 == null ? 0.0f : baselineShift0.unbox-impl()));
        TextGeometricTransform textGeometricTransform0 = spanStyle0.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : spanStyle0.getTextGeometricTransform();
        LocaleList localeList0 = spanStyle0.getLocaleList() == null ? LocaleList.Companion.getCurrent() : spanStyle0.getLocaleList();
        long v2 = spanStyle0.getBackground-0d7_KjU() == 16L ? SpanStyleKt.c : spanStyle0.getBackground-0d7_KjU();
        TextDecoration textDecoration0 = spanStyle0.getTextDecoration() == null ? TextDecoration.Companion.getNone() : spanStyle0.getTextDecoration();
        Shadow shadow0 = spanStyle0.getShadow() == null ? Shadow.Companion.getNone() : spanStyle0.getShadow();
        PlatformSpanStyle platformSpanStyle0 = spanStyle0.getPlatformStyle();
        DrawStyle drawStyle0 = spanStyle0.getDrawStyle();
        if(drawStyle0 == null) {
            drawStyle0 = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyle0, v, fontWeight0, fontStyle1, fontSynthesis1, fontFamily0, s, v1, baselineShift1, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }
}

