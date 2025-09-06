package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u008A\u0001\u0010\"\u001A\u00020\u001F2\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\b2\u0014\b\u0002\u0010\u0018\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00062\b\b\u0002\u0010\u001C\u001A\u00020\u00042\b\b\u0002\u0010\u001D\u001A\u00020\u00022\b\b\u0002\u0010\u001E\u001A\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!Jt\u0010\"\u001A\u00020\u001F2\u0006\u0010\r\u001A\u00020#2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\b2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00062\b\b\u0002\u0010\u001C\u001A\u00020\u00042\b\b\u0002\u0010\u001D\u001A\u00020\u00022\b\b\u0002\u0010\u001E\u001A\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultFontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "defaultDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Constraints;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/TextLayoutResult;", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "measure", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextMeasurer {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final TextLayoutResult access$layout(Companion textMeasurer$Companion0, TextLayoutInput textLayoutInput0) {
            textMeasurer$Companion0.getClass();
            MultiParagraphIntrinsics multiParagraphIntrinsics0 = new MultiParagraphIntrinsics(textLayoutInput0.getText(), TextStyleKt.resolveDefaults(textLayoutInput0.getStyle(), textLayoutInput0.getLayoutDirection()), textLayoutInput0.getPlaceholders(), textLayoutInput0.getDensity(), textLayoutInput0.getFontFamilyResolver());
            int v = Constraints.getMinWidth-impl(textLayoutInput0.getConstraints-msEJaDk());
            int v1 = !textLayoutInput0.getSoftWrap() && !TextOverflow.equals-impl0(textLayoutInput0.getOverflow-gIe3tQ8(), 2) || !Constraints.getHasBoundedWidth-impl(textLayoutInput0.getConstraints-msEJaDk()) ? 0x7FFFFFFF : Constraints.getMaxWidth-impl(textLayoutInput0.getConstraints-msEJaDk());
            int v2 = textLayoutInput0.getSoftWrap() || !TextOverflow.equals-impl0(textLayoutInput0.getOverflow-gIe3tQ8(), 2) ? textLayoutInput0.getMaxLines() : 1;
            if(v != v1) {
                v1 = c.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics0.getMaxIntrinsicWidth()), v, v1);
            }
            MultiParagraph multiParagraph0 = new MultiParagraph(multiParagraphIntrinsics0, Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(0, v1, 0, Constraints.getMaxHeight-impl(textLayoutInput0.getConstraints-msEJaDk())), v2, TextOverflow.equals-impl0(textLayoutInput0.getOverflow-gIe3tQ8(), 2), null);
            return new TextLayoutResult(textLayoutInput0, multiParagraph0, ConstraintsKt.constrain-4WqzIAM(textLayoutInput0.getConstraints-msEJaDk(), IntSizeKt.IntSize(((int)(((float)Math.ceil(multiParagraph0.getWidth())))), ((int)(((float)Math.ceil(multiParagraph0.getHeight())))))), null);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Resolver a;
    public final Density b;
    public final LayoutDirection c;
    public final TextLayoutCache d;

    static {
        TextMeasurer.Companion = new Companion(null);
    }

    public TextMeasurer(@NotNull Resolver fontFamily$Resolver0, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, int v) {
        this.a = fontFamily$Resolver0;
        this.b = density0;
        this.c = layoutDirection0;
        this.d = v <= 0 ? null : new TextLayoutCache(v);
    }

    public TextMeasurer(Resolver fontFamily$Resolver0, Density density0, LayoutDirection layoutDirection0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 8) != 0) {
            v = 8;
        }
        this(fontFamily$Resolver0, density0, layoutDirection0, v);
    }

    @Stable
    @NotNull
    public final TextLayoutResult measure-wNUYSr0(@NotNull String s, @NotNull TextStyle textStyle0, int v, boolean z, int v1, long v2, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, boolean z1) {
        return TextMeasurer.measure-xDpz5zY$default(this, new AnnotatedString(s, null, null, 6, null), textStyle0, v, z, v1, null, v2, layoutDirection0, density0, fontFamily$Resolver0, z1, 0x20, null);
    }

    public static TextLayoutResult measure-wNUYSr0$default(TextMeasurer textMeasurer0, String s, TextStyle textStyle0, int v, boolean z, int v1, long v2, LayoutDirection layoutDirection0, Density density0, Resolver fontFamily$Resolver0, boolean z1, int v3, Object object0) {
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
        int v4 = (v3 & 4) == 0 ? v : 1;
        boolean z2 = (v3 & 8) == 0 ? z : true;
        int v5 = (v3 & 16) == 0 ? v1 : 0x7FFFFFFF;
        long v6 = (v3 & 0x20) == 0 ? v2 : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        LayoutDirection layoutDirection1 = (v3 & 0x40) == 0 ? layoutDirection0 : textMeasurer0.c;
        Density density1 = (v3 & 0x80) == 0 ? density0 : textMeasurer0.b;
        Resolver fontFamily$Resolver1 = (v3 & 0x100) == 0 ? fontFamily$Resolver0 : textMeasurer0.a;
        return (v3 & 0x200) == 0 ? textMeasurer0.measure-wNUYSr0(s, textStyle1, v4, z2, v5, v6, layoutDirection1, density1, fontFamily$Resolver1, z1) : textMeasurer0.measure-wNUYSr0(s, textStyle1, v4, z2, v5, v6, layoutDirection1, density1, fontFamily$Resolver1, false);
    }

    @Stable
    @NotNull
    public final TextLayoutResult measure-xDpz5zY(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, int v, boolean z, int v1, @NotNull List list0, long v2, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, boolean z1) {
        TextLayoutInput textLayoutInput0 = new TextLayoutInput(annotatedString0, textStyle0, list0, v1, z, v, density0, layoutDirection0, fontFamily$Resolver0, v2, null);
        TextLayoutCache textLayoutCache0 = this.d;
        TextLayoutResult textLayoutResult0 = z1 || textLayoutCache0 == null ? null : textLayoutCache0.get(textLayoutInput0);
        if(textLayoutResult0 != null) {
            return textLayoutResult0.copy-O0kMr_c(textLayoutInput0, ConstraintsKt.constrain-4WqzIAM(v2, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult0.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult0.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult textLayoutResult1 = Companion.access$layout(TextMeasurer.Companion, textLayoutInput0);
        if(textLayoutCache0 != null) {
            textLayoutCache0.put(textLayoutInput0, textLayoutResult1);
        }
        return textLayoutResult1;
    }

    public static TextLayoutResult measure-xDpz5zY$default(TextMeasurer textMeasurer0, AnnotatedString annotatedString0, TextStyle textStyle0, int v, boolean z, int v1, List list0, long v2, LayoutDirection layoutDirection0, Density density0, Resolver fontFamily$Resolver0, boolean z1, int v3, Object object0) {
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
        int v4 = (v3 & 4) == 0 ? v : 1;
        boolean z2 = (v3 & 8) == 0 ? z : true;
        int v5 = (v3 & 16) == 0 ? v1 : 0x7FFFFFFF;
        List list1 = (v3 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        long v6 = (v3 & 0x40) == 0 ? v2 : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        LayoutDirection layoutDirection1 = (v3 & 0x80) == 0 ? layoutDirection0 : textMeasurer0.c;
        Density density1 = (v3 & 0x100) == 0 ? density0 : textMeasurer0.b;
        Resolver fontFamily$Resolver1 = (v3 & 0x200) == 0 ? fontFamily$Resolver0 : textMeasurer0.a;
        return (v3 & 0x400) == 0 ? textMeasurer0.measure-xDpz5zY(annotatedString0, textStyle1, v4, z2, v5, list1, v6, layoutDirection1, density1, fontFamily$Resolver1, z1) : textMeasurer0.measure-xDpz5zY(annotatedString0, textStyle1, v4, z2, v5, list1, v6, layoutDirection1, density1, fontFamily$Resolver1, false);
    }
}

