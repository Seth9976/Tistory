package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation.Url;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration.Companion;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import k2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A+\u0010\b\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/platform/URLSpanCache;)Landroid/text/SpannableString;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n33#2,6:206\n33#2,6:212\n33#2,6:218\n33#2,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n60#1:206,6\n67#1:212,6\n77#1:218,6\n86#1:224,6\n*E\n"})
public final class AndroidAccessibilitySpannableString_androidKt {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final SpannableString toAccessibilitySpannableString(@NotNull AnnotatedString annotatedString0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull URLSpanCache uRLSpanCache0) {
        SpannableString spannableString0 = new SpannableString(annotatedString0.getText());
        List list0 = annotatedString0.getSpanStylesOrNull$ui_text_release();
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Range annotatedString$Range0 = (Range)list0.get(v1);
                int v2 = annotatedString$Range0.component2();
                int v3 = annotatedString$Range0.component3();
                SpanStyle spanStyle0 = SpanStyle.copy-GSF8kmg$default(((SpanStyle)annotatedString$Range0.component1()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFDF, null);
                SpannableExtensions_androidKt.setColor-RPmYEkk(spannableString0, spanStyle0.getColor-0d7_KjU(), v2, v3);
                int v4 = v3;
                int v5 = v2;
                SpannableExtensions_androidKt.setFontSize-KmRG4DE(spannableString0, spanStyle0.getFontSize-XSAIIZE(), density0, v2, v4);
                if(spanStyle0.getFontWeight() != null || spanStyle0.getFontStyle-4Lr2A7w() != null) {
                    FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
                    spannableString0.setSpan(new StyleSpan(AndroidFontUtils_androidKt.getAndroidTypefaceStyle-FO1MlWM((spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight()), (fontStyle0 == null ? 0 : fontStyle0.unbox-impl()))), v5, v4, 33);
                }
                if(spanStyle0.getFontFamily() != null) {
                    if(spanStyle0.getFontFamily() instanceof GenericFontFamily) {
                        spannableString0.setSpan(new TypefaceSpan(((GenericFontFamily)spanStyle0.getFontFamily()).getName()), v5, v4, 33);
                    }
                    else if(Build.VERSION.SDK_INT >= 28) {
                        FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
                        Object object0 = Resolver.resolve-DPcqOEQ$default(fontFamily$Resolver0, spanStyle0.getFontFamily(), null, 0, (fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()), 6, null).getValue();
                        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.graphics.Typeface");
                        spannableString0.setSpan(c.a.a(((Typeface)object0)), v5, v4, 33);
                    }
                }
                if(spanStyle0.getTextDecoration() != null) {
                    Companion textDecoration$Companion0 = TextDecoration.Companion;
                    if(spanStyle0.getTextDecoration().contains(textDecoration$Companion0.getUnderline())) {
                        spannableString0.setSpan(new UnderlineSpan(), v5, v4, 33);
                    }
                    if(spanStyle0.getTextDecoration().contains(textDecoration$Companion0.getLineThrough())) {
                        spannableString0.setSpan(new StrikethroughSpan(), v5, v4, 33);
                    }
                }
                if(spanStyle0.getTextGeometricTransform() != null) {
                    spannableString0.setSpan(new ScaleXSpan(spanStyle0.getTextGeometricTransform().getScaleX()), v5, v4, 33);
                }
                SpannableExtensions_androidKt.setLocaleList(spannableString0, spanStyle0.getLocaleList(), v5, v4);
                SpannableExtensions_androidKt.setBackground-RPmYEkk(spannableString0, spanStyle0.getBackground-0d7_KjU(), v5, v4);
            }
        }
        List list1 = annotatedString0.getTtsAnnotations(0, annotatedString0.length());
        int v6 = list1.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Range annotatedString$Range1 = (Range)list1.get(v7);
            spannableString0.setSpan(TtsAnnotationExtensions_androidKt.toSpan(((TtsAnnotation)annotatedString$Range1.component1())), annotatedString$Range1.component2(), annotatedString$Range1.component3(), 33);
        }
        List list2 = annotatedString0.getUrlAnnotations(0, annotatedString0.length());
        int v8 = list2.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            Range annotatedString$Range2 = (Range)list2.get(v9);
            spannableString0.setSpan(uRLSpanCache0.toURLSpan(((UrlAnnotation)annotatedString$Range2.component1())), annotatedString$Range2.component2(), annotatedString$Range2.component3(), 33);
        }
        List list3 = annotatedString0.getLinkAnnotations(0, annotatedString0.length());
        int v10 = list3.size();
        for(int v11 = 0; v11 < v10; ++v11) {
            Range annotatedString$Range3 = (Range)list3.get(v11);
            LinkAnnotation linkAnnotation0 = (LinkAnnotation)annotatedString$Range3.getItem();
            if(!(linkAnnotation0 instanceof Url) || linkAnnotation0.getLinkInteractionListener() != null) {
                spannableString0.setSpan(uRLSpanCache0.toClickableSpan(annotatedString$Range3), annotatedString$Range3.getStart(), annotatedString$Range3.getEnd(), 33);
            }
            else {
                Object object1 = annotatedString$Range3.getItem();
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                spannableString0.setSpan(uRLSpanCache0.toURLSpan(new Range(((Url)object1), annotatedString$Range3.getStart(), annotatedString$Range3.getEnd())), annotatedString$Range3.getStart(), annotatedString$Range3.getEnd(), 33);
            }
        }
        return spannableString0;
    }
}

