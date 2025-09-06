package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle.Trim;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import l2.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A+\u0010\u0007\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00A2\u0006\u0004\b\u0007\u0010\b\u001A-\u0010\u000F\u001A\u00020\u0006*\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A6\u0010\u0017\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\u0013H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A.\u0010\u0017\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A_\u0010\'\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0012\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D0\u001C2\u0006\u0010\u000E\u001A\u00020\r2&\u0010&\u001A\"\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0 H\u0000\u00A2\u0006\u0004\b\'\u0010(\u001AM\u0010,\u001A\u00020\u00062\b\u0010)\u001A\u0004\u0018\u00010\u001E2\u0012\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D0\u001C2\u001E\u0010+\u001A\u001A\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060*H\u0000\u00A2\u0006\u0004\b,\u0010-\u001A.\u00102\u001A\u00020\u0006*\u00020\u00002\u0006\u0010/\u001A\u00020.2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101\u001A-\u00105\u001A\u00020\u0006*\u00020\u00002\b\u00104\u001A\u0004\u0018\u0001032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00A2\u0006\u0004\b5\u00106\u001A6\u0010:\u001A\u00020\u0006*\u00020\u00002\u0006\u00107\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b8\u00109\u001A-\u0010=\u001A\u00020\u0006*\u00020\u00002\b\u0010<\u001A\u0004\u0018\u00010;2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00A2\u0006\u0004\b=\u0010>\u001A.\u0010@\u001A\u00020\u0006*\u00020\u00002\u0006\u0010/\u001A\u00020.2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b?\u00101\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006A"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "setSpan", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextIndent;FLandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "(Landroidx/compose/ui/text/SpanStyle;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/ui/graphics/Color;", "color", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "(Landroid/text/Spannable;Landroidx/compose/ui/text/intl/LocaleList;II)V", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextDecoration;II)V", "setColor-RPmYEkk", "setColor", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,566:1\n1#2:567\n235#3,3:568\n33#3,4:571\n238#3,2:575\n38#3:577\n240#3:578\n69#3,6:579\n33#3,6:585\n696#4:591\n696#4:592\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n296#1:568,3\n296#1:571,4\n296#1:575,2\n296#1:577\n296#1:578\n364#1:579,6\n384#1:585,6\n448#1:591\n521#1:592\n*E\n"})
public final class SpannableExtensions_androidKt {
    // 去混淆评级： 低(20)
    public static final float a(long v, float f, Density density0) {
        long v1 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
            return ((double)density0.getFontScale()) > 1.05 ? TextUnit.getValue-impl(v) / TextUnit.getValue-impl(density0.toSp-kPz2Gy4(f)) * f : density0.toPx--R2X_6o(v);
        }
        return TextUnitType.equals-impl0(v1, 0x200000000L) ? TextUnit.getValue-impl(v) * f : NaNf;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle0, @NotNull List list0, @NotNull Function3 function30) {
        if(list0.size() <= 1) {
            if(!list0.isEmpty()) {
                SpanStyle spanStyle1 = (SpanStyle)((Range)list0.get(0)).getItem();
                if(spanStyle0 != null) {
                    spanStyle1 = spanStyle0.merge(spanStyle1);
                }
                function30.invoke(spanStyle1, ((Range)list0.get(0)).getStart(), ((Range)list0.get(0)).getEnd());
            }
            return;
        }
        int v = list0.size();
        Integer[] arr_integer = new Integer[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            arr_integer[v1] = 0;
        }
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Range annotatedString$Range0 = (Range)list0.get(v3);
            arr_integer[v3] = annotatedString$Range0.getStart();
            arr_integer[v3 + v] = annotatedString$Range0.getEnd();
        }
        ArraysKt___ArraysJvmKt.sort(arr_integer);
        int v4 = ((Number)ArraysKt___ArraysKt.first(arr_integer)).intValue();
        for(int v5 = 0; v5 < v * 2; ++v5) {
            Integer integer0 = arr_integer[v5];
            int v6 = (int)integer0;
            if(v6 != v4) {
                int v7 = list0.size();
                SpanStyle spanStyle2 = spanStyle0;
                for(int v8 = 0; v8 < v7; ++v8) {
                    Range annotatedString$Range1 = (Range)list0.get(v8);
                    if(annotatedString$Range1.getStart() != annotatedString$Range1.getEnd() && AnnotatedStringKt.intersect(v4, v6, annotatedString$Range1.getStart(), annotatedString$Range1.getEnd())) {
                        SpanStyle spanStyle3 = (SpanStyle)annotatedString$Range1.getItem();
                        spanStyle2 = spanStyle2 == null ? spanStyle3 : spanStyle2.merge(spanStyle3);
                    }
                }
                if(spanStyle2 != null) {
                    function30.invoke(spanStyle2, v4, integer0);
                }
                v4 = v6;
            }
        }
    }

    public static final void setBackground-RPmYEkk(@NotNull Spannable spannable0, long v, int v1, int v2) {
        if(v != 16L) {
            SpannableExtensions_androidKt.setSpan(spannable0, new BackgroundColorSpan(ColorKt.toArgb-8_81llA(v)), v1, v2);
        }
    }

    public static final void setColor-RPmYEkk(@NotNull Spannable spannable0, long v, int v1, int v2) {
        if(v != 16L) {
            SpannableExtensions_androidKt.setSpan(spannable0, new ForegroundColorSpan(ColorKt.toArgb-8_81llA(v)), v1, v2);
        }
    }

    public static final void setFontSize-KmRG4DE(@NotNull Spannable spannable0, long v, @NotNull Density density0, int v1, int v2) {
        long v3 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v3, 0x100000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new AbsoluteSizeSpan(c.roundToInt(density0.toPx--R2X_6o(v)), false), v1, v2);
            return;
        }
        if(TextUnitType.equals-impl0(v3, 0x200000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new RelativeSizeSpan(TextUnit.getValue-impl(v)), v1, v2);
        }
    }

    public static final void setLineHeight-KmRG4DE(@NotNull Spannable spannable0, long v, float f, @NotNull Density density0, @NotNull LineHeightStyle lineHeightStyle0) {
        float f1 = SpannableExtensions_androidKt.a(v, f, density0);
        if(!Float.isNaN(f1)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new LineHeightStyleSpan(f1, 0, (spannable0.length() != 0 && StringsKt___StringsKt.last(spannable0) != 10 ? spannable0.length() : spannable0.length() + 1), Trim.isTrimFirstLineTop-impl$ui_text_release(lineHeightStyle0.getTrim-EVpEnUU()), Trim.isTrimLastLineBottom-impl$ui_text_release(lineHeightStyle0.getTrim-EVpEnUU()), lineHeightStyle0.getAlignment-PIaL0Z0()), 0, spannable0.length());
        }
    }

    public static final void setLineHeight-r9BaKPg(@NotNull Spannable spannable0, long v, float f, @NotNull Density density0) {
        float f1 = SpannableExtensions_androidKt.a(v, f, density0);
        if(!Float.isNaN(f1)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new LineHeightSpan(f1), 0, spannable0.length());
        }
    }

    public static final void setLocaleList(@NotNull Spannable spannable0, @Nullable LocaleList localeList0, int v, int v1) {
        if(localeList0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, LocaleListHelperMethods.INSTANCE.localeSpan(localeList0), v, v1);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable0, @NotNull Object object0, int v, int v1) {
        spannable0.setSpan(object0, v, v1, 33);
    }

    public static final void setSpanStyles(@NotNull Spannable spannable0, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull Density density0, @NotNull Function4 function40) {
        LetterSpacingSpanPx letterSpacingSpanPx0;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = list0.get(v2);
            if(TextPaintExtensions_androidKt.hasFontAttributes(((SpanStyle)((Range)object0).getItem())) || ((SpanStyle)((Range)object0).getItem()).getFontSynthesis-ZQGJjVo() != null) {
                arrayList0.add(object0);
            }
        }
        SpannableExtensions_androidKt.flattenFontStylesAndApply((TextPaintExtensions_androidKt.hasFontAttributes(textStyle0.toSpanStyle()) || textStyle0.getFontSynthesis-ZQGJjVo() != null ? new SpanStyle(0L, 0L, textStyle0.getFontWeight(), textStyle0.getFontStyle-4Lr2A7w(), textStyle0.getFontSynthesis-ZQGJjVo(), textStyle0.getFontFamily(), null, 0L, null, null, null, 0L, null, null, null, null, 0xFFC3, null) : null), arrayList0, new a(spannable0, function40));
        int v3 = list0.size();
        boolean z = false;
        for(int v4 = 0; v4 < v3; ++v4) {
            Range annotatedString$Range0 = (Range)list0.get(v4);
            int v5 = annotatedString$Range0.getStart();
            int v6 = annotatedString$Range0.getEnd();
            if(v5 >= 0 && v5 < spannable0.length() && v6 > v5 && v6 <= spannable0.length()) {
                int v7 = annotatedString$Range0.getStart();
                int v8 = annotatedString$Range0.getEnd();
                Object object1 = annotatedString$Range0.getItem();
                BaselineShift baselineShift0 = ((SpanStyle)object1).getBaselineShift-5SSeXJ0();
                if(baselineShift0 != null) {
                    SpannableExtensions_androidKt.setSpan(spannable0, new BaselineShiftSpan(baselineShift0.unbox-impl()), v7, v8);
                }
                SpannableExtensions_androidKt.setColor-RPmYEkk(spannable0, ((SpanStyle)object1).getColor-0d7_KjU(), v7, v8);
                Brush brush0 = ((SpanStyle)object1).getBrush();
                float f = ((SpanStyle)object1).getAlpha();
                if(brush0 != null) {
                    if(brush0 instanceof SolidColor) {
                        SpannableExtensions_androidKt.setColor-RPmYEkk(spannable0, ((SolidColor)brush0).getValue-0d7_KjU(), v7, v8);
                    }
                    else if(brush0 instanceof ShaderBrush) {
                        SpannableExtensions_androidKt.setSpan(spannable0, new ShaderBrushSpan(((ShaderBrush)brush0), f), v7, v8);
                    }
                }
                SpannableExtensions_androidKt.setTextDecoration(spannable0, ((SpanStyle)object1).getTextDecoration(), v7, v8);
                SpannableExtensions_androidKt.setFontSize-KmRG4DE(spannable0, ((SpanStyle)object1).getFontSize-XSAIIZE(), density0, v7, v8);
                String s = ((SpanStyle)object1).getFontFeatureSettings();
                if(s != null) {
                    SpannableExtensions_androidKt.setSpan(spannable0, new FontFeatureSpan(s), v7, v8);
                }
                TextGeometricTransform textGeometricTransform0 = ((SpanStyle)object1).getTextGeometricTransform();
                if(textGeometricTransform0 != null) {
                    SpannableExtensions_androidKt.setSpan(spannable0, new ScaleXSpan(textGeometricTransform0.getScaleX()), v7, v8);
                    SpannableExtensions_androidKt.setSpan(spannable0, new SkewXSpan(textGeometricTransform0.getSkewX()), v7, v8);
                }
                SpannableExtensions_androidKt.setLocaleList(spannable0, ((SpanStyle)object1).getLocaleList(), v7, v8);
                SpannableExtensions_androidKt.setBackground-RPmYEkk(spannable0, ((SpanStyle)object1).getBackground-0d7_KjU(), v7, v8);
                Shadow shadow0 = ((SpanStyle)object1).getShadow();
                if(shadow0 != null) {
                    SpannableExtensions_androidKt.setSpan(spannable0, new ShadowSpan(ColorKt.toArgb-8_81llA(shadow0.getColor-0d7_KjU()), Offset.getX-impl(shadow0.getOffset-F1C5BW0()), Offset.getY-impl(shadow0.getOffset-F1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow0.getBlurRadius())), v7, v8);
                }
                DrawStyle drawStyle0 = ((SpanStyle)object1).getDrawStyle();
                if(drawStyle0 != null) {
                    SpannableExtensions_androidKt.setSpan(spannable0, new DrawStyleSpan(drawStyle0), v7, v8);
                }
                SpanStyle spanStyle0 = (SpanStyle)annotatedString$Range0.getItem();
                if(TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x100000000L) || TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x200000000L)) {
                    z = true;
                }
            }
        }
        if(z) {
            int v9 = list0.size();
            for(int v1 = 0; v1 < v9; ++v1) {
                Range annotatedString$Range1 = (Range)list0.get(v1);
                int v10 = annotatedString$Range1.getStart();
                int v11 = annotatedString$Range1.getEnd();
                SpanStyle spanStyle1 = (SpanStyle)annotatedString$Range1.getItem();
                if(v10 >= 0 && v10 < spannable0.length() && v11 > v10 && v11 <= spannable0.length()) {
                    long v12 = spanStyle1.getLetterSpacing-XSAIIZE();
                    long v13 = TextUnit.getType-UIouoOA(v12);
                    if(TextUnitType.equals-impl0(v13, 0x100000000L)) {
                        letterSpacingSpanPx0 = new LetterSpacingSpanPx(density0.toPx--R2X_6o(v12));
                    }
                    else if(TextUnitType.equals-impl0(v13, 0x200000000L)) {
                        letterSpacingSpanPx0 = new LetterSpacingSpanEm(TextUnit.getValue-impl(v12));
                    }
                    else {
                        letterSpacingSpanPx0 = null;
                    }
                    if(letterSpacingSpanPx0 != null) {
                        SpannableExtensions_androidKt.setSpan(spannable0, letterSpacingSpanPx0, v10, v11);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable0, @Nullable TextDecoration textDecoration0, int v, int v1) {
        if(textDecoration0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new TextDecorationSpan(textDecoration0.contains(TextDecoration.Companion.getUnderline()), textDecoration0.contains(TextDecoration.Companion.getLineThrough())), v, v1);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable0, @Nullable TextIndent textIndent0, float f, @NotNull Density density0) {
        float f2;
        if(textIndent0 != null && (!TextUnit.equals-impl0(textIndent0.getFirstLine-XSAIIZE(), 0x100000000L) || !TextUnit.equals-impl0(textIndent0.getRestLine-XSAIIZE(), 0x100000000L)) && !TextUnitKt.isUnspecified--R2X_6o(textIndent0.getFirstLine-XSAIIZE()) && !TextUnitKt.isUnspecified--R2X_6o(textIndent0.getRestLine-XSAIIZE())) {
            long v = TextUnit.getType-UIouoOA(textIndent0.getFirstLine-XSAIIZE());
            float f1 = 0.0f;
            if(TextUnitType.equals-impl0(v, 0x100000000L)) {
                f2 = density0.toPx--R2X_6o(textIndent0.getFirstLine-XSAIIZE());
            }
            else {
                f2 = TextUnitType.equals-impl0(v, 0x200000000L) ? TextUnit.getValue-impl(textIndent0.getFirstLine-XSAIIZE()) * f : 0.0f;
            }
            long v1 = TextUnit.getType-UIouoOA(textIndent0.getRestLine-XSAIIZE());
            if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
                f1 = density0.toPx--R2X_6o(textIndent0.getRestLine-XSAIIZE());
            }
            else if(TextUnitType.equals-impl0(v1, 0x200000000L)) {
                f1 = TextUnit.getValue-impl(textIndent0.getRestLine-XSAIIZE()) * f;
            }
            SpannableExtensions_androidKt.setSpan(spannable0, new LeadingMarginSpan.Standard(((int)(((float)Math.ceil(f2)))), ((int)(((float)Math.ceil(f1))))), 0, spannable0.length());
        }
    }
}

