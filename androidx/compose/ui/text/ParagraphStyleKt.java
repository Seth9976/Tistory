package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\'\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000B\u001Af\u0010 \u001A\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001A2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;F)Landroidx/compose/ui/text/ParagraphStyle;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveParagraphStyleDefaults", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "fastMerge", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,538:1\n251#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n500#1:539\n*E\n"})
public final class ParagraphStyleKt {
    public static final long a;

    static {
        ParagraphStyleKt.a = 0x7FC00000L;
    }

    // 去混淆评级： 低(26)
    @NotNull
    public static final ParagraphStyle fastMerge-j5T8yCg(@NotNull ParagraphStyle paragraphStyle0, int v, int v1, long v2, @Nullable TextIndent textIndent0, @Nullable PlatformParagraphStyle platformParagraphStyle0, @Nullable LineHeightStyle lineHeightStyle0, int v3, int v4, @Nullable TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle1;
        if(!TextAlign.equals-impl0(v, 0x80000000) && !TextAlign.equals-impl0(v, paragraphStyle0.getTextAlign-e0LSkKk()) || !TextUnitKt.isUnspecified--R2X_6o(v2) && !TextUnit.equals-impl0(v2, paragraphStyle0.getLineHeight-XSAIIZE()) || textIndent0 != null && !Intrinsics.areEqual(textIndent0, paragraphStyle0.getTextIndent()) || !TextDirection.equals-impl0(v1, 0x80000000) && !TextDirection.equals-impl0(v1, paragraphStyle0.getTextDirection-s_7X-co()) || platformParagraphStyle0 != null && !Intrinsics.areEqual(platformParagraphStyle0, paragraphStyle0.getPlatformStyle()) || lineHeightStyle0 != null && !Intrinsics.areEqual(lineHeightStyle0, paragraphStyle0.getLineHeightStyle()) || !LineBreak.equals-impl0(v3, 0) && !LineBreak.equals-impl0(v3, paragraphStyle0.getLineBreak-rAG3T2k()) || !Hyphens.equals-impl0(v4, 0x80000000) && !Hyphens.equals-impl0(v4, paragraphStyle0.getHyphens-vmbZdU8()) || textMotion0 != null && !Intrinsics.areEqual(textMotion0, paragraphStyle0.getTextMotion())) {
            long v5 = TextUnitKt.isUnspecified--R2X_6o(v2) ? paragraphStyle0.getLineHeight-XSAIIZE() : v2;
            if(textIndent0 == null) {
                textIndent0 = paragraphStyle0.getTextIndent();
            }
            if(TextAlign.equals-impl0(v, 0x80000000)) {
                v = paragraphStyle0.getTextAlign-e0LSkKk();
            }
            int v6 = TextDirection.equals-impl0(v1, 0x80000000) ? paragraphStyle0.getTextDirection-s_7X-co() : v1;
            if(paragraphStyle0.getPlatformStyle() == null) {
                platformParagraphStyle1 = platformParagraphStyle0;
            }
            else {
                platformParagraphStyle1 = platformParagraphStyle0 == null ? paragraphStyle0.getPlatformStyle() : paragraphStyle0.getPlatformStyle().merge(platformParagraphStyle0);
            }
            LineHeightStyle lineHeightStyle1 = lineHeightStyle0 == null ? paragraphStyle0.getLineHeightStyle() : lineHeightStyle0;
            int v7 = LineBreak.equals-impl0(v3, 0) ? paragraphStyle0.getLineBreak-rAG3T2k() : v3;
            int v8 = Hyphens.equals-impl0(v4, 0x80000000) ? paragraphStyle0.getHyphens-vmbZdU8() : v4;
            return textMotion0 == null ? new ParagraphStyle(v, v6, v5, textIndent0, platformParagraphStyle1, lineHeightStyle1, v7, v8, paragraphStyle0.getTextMotion(), null) : new ParagraphStyle(v, v6, v5, textIndent0, platformParagraphStyle1, lineHeightStyle1, v7, v8, textMotion0, null);
        }
        return paragraphStyle0;
    }

    @Stable
    @NotNull
    public static final ParagraphStyle lerp(@NotNull ParagraphStyle paragraphStyle0, @NotNull ParagraphStyle paragraphStyle1, float f) {
        int v = ((TextAlign)SpanStyleKt.lerpDiscrete(TextAlign.box-impl(paragraphStyle0.getTextAlign-e0LSkKk()), TextAlign.box-impl(paragraphStyle1.getTextAlign-e0LSkKk()), f)).unbox-impl();
        int v1 = ((TextDirection)SpanStyleKt.lerpDiscrete(TextDirection.box-impl(paragraphStyle0.getTextDirection-s_7X-co()), TextDirection.box-impl(paragraphStyle1.getTextDirection-s_7X-co()), f)).unbox-impl();
        long v2 = SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(paragraphStyle0.getLineHeight-XSAIIZE(), paragraphStyle1.getLineHeight-XSAIIZE(), f);
        TextIndent textIndent0 = TextIndentKt.lerp((paragraphStyle0.getTextIndent() == null ? TextIndent.Companion.getNone() : paragraphStyle0.getTextIndent()), (paragraphStyle1.getTextIndent() == null ? TextIndent.Companion.getNone() : paragraphStyle1.getTextIndent()), f);
        PlatformParagraphStyle platformParagraphStyle0 = paragraphStyle0.getPlatformStyle();
        PlatformParagraphStyle platformParagraphStyle1 = paragraphStyle1.getPlatformStyle();
        if(platformParagraphStyle0 == null && platformParagraphStyle1 == null) {
            return new ParagraphStyle(v, v1, v2, textIndent0, null, ((LineHeightStyle)SpanStyleKt.lerpDiscrete(paragraphStyle0.getLineHeightStyle(), paragraphStyle1.getLineHeightStyle(), f)), ((LineBreak)SpanStyleKt.lerpDiscrete(LineBreak.box-impl(paragraphStyle0.getLineBreak-rAG3T2k()), LineBreak.box-impl(paragraphStyle1.getLineBreak-rAG3T2k()), f)).unbox-impl(), ((Hyphens)SpanStyleKt.lerpDiscrete(Hyphens.box-impl(paragraphStyle0.getHyphens-vmbZdU8()), Hyphens.box-impl(paragraphStyle1.getHyphens-vmbZdU8()), f)).unbox-impl(), ((TextMotion)SpanStyleKt.lerpDiscrete(paragraphStyle0.getTextMotion(), paragraphStyle1.getTextMotion(), f)), null);
        }
        if(platformParagraphStyle0 == null) {
            platformParagraphStyle0 = PlatformParagraphStyle.Companion.getDefault();
        }
        if(platformParagraphStyle1 == null) {
            platformParagraphStyle1 = PlatformParagraphStyle.Companion.getDefault();
        }
        return new ParagraphStyle(v, v1, v2, textIndent0, AndroidTextStyle_androidKt.lerp(platformParagraphStyle0, platformParagraphStyle1, f), ((LineHeightStyle)SpanStyleKt.lerpDiscrete(paragraphStyle0.getLineHeightStyle(), paragraphStyle1.getLineHeightStyle(), f)), ((LineBreak)SpanStyleKt.lerpDiscrete(LineBreak.box-impl(paragraphStyle0.getLineBreak-rAG3T2k()), LineBreak.box-impl(paragraphStyle1.getLineBreak-rAG3T2k()), f)).unbox-impl(), ((Hyphens)SpanStyleKt.lerpDiscrete(Hyphens.box-impl(paragraphStyle0.getHyphens-vmbZdU8()), Hyphens.box-impl(paragraphStyle1.getHyphens-vmbZdU8()), f)).unbox-impl(), ((TextMotion)SpanStyleKt.lerpDiscrete(paragraphStyle0.getTextMotion(), paragraphStyle1.getTextMotion(), f)), null);
    }

    // 去混淆评级： 中等(73)
    @NotNull
    public static final ParagraphStyle resolveParagraphStyleDefaults(@NotNull ParagraphStyle paragraphStyle0, @NotNull LayoutDirection layoutDirection0) {
        int v = TextStyleKt.resolveTextDirection-IhaHGbI(layoutDirection0, paragraphStyle0.getTextDirection-s_7X-co());
        TextIndent textIndent0 = paragraphStyle0.getTextIndent() == null ? TextIndent.Companion.getNone() : paragraphStyle0.getTextIndent();
        return new ParagraphStyle((TextAlign.equals-impl0(paragraphStyle0.getTextAlign-e0LSkKk(), 0x80000000) ? 5 : paragraphStyle0.getTextAlign-e0LSkKk()), v, (TextUnitKt.isUnspecified--R2X_6o(paragraphStyle0.getLineHeight-XSAIIZE()) ? ParagraphStyleKt.a : paragraphStyle0.getLineHeight-XSAIIZE()), textIndent0, paragraphStyle0.getPlatformStyle(), paragraphStyle0.getLineHeightStyle(), (LineBreak.equals-impl0(paragraphStyle0.getLineBreak-rAG3T2k(), 0) ? 0x10301 : paragraphStyle0.getLineBreak-rAG3T2k()), (Hyphens.equals-impl0(paragraphStyle0.getHyphens-vmbZdU8(), 0x80000000) ? 1 : paragraphStyle0.getHyphens-vmbZdU8()), (paragraphStyle0.getTextMotion() == null ? TextMotion.Companion.getStatic() : paragraphStyle0.getTextMotion()), null);
    }
}

