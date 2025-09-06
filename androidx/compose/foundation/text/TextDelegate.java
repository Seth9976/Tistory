package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 U2\u00020\u0001:\u0001UBe\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0014\b\u0002\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001A\u0010\u001BJ,\u0010\"\u001A\u00020\u001E2\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0018\u001A\u00020\u00172\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u0010,\u001A\u0004\b0\u0010.R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R\u001D\u0010\f\u001A\u00020\u000B8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010,\u001A\u0004\b6\u0010.R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R#\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR$\u0010J\u001A\u0004\u0018\u00010C8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010P\u001A\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010\u001BR\u0011\u0010R\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010.R\u0011\u0010T\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bS\u0010.\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006V"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutIntrinsics", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layout", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "c", "I", "getMaxLines", "()I", "d", "getMinLines", "e", "Z", "getSoftWrap", "()Z", "f", "getOverflow-gIe3tQ8", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "h", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "i", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "j", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "paragraphIntrinsics", "k", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "intrinsicsLayoutDirection", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
public final class TextDelegate {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void paint(@NotNull Canvas canvas0, @NotNull TextLayoutResult textLayoutResult0) {
            TextPainter.INSTANCE.paint(canvas0, textLayoutResult0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnnotatedString a;
    public final TextStyle b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Density g;
    public final Resolver h;
    public final List i;
    public MultiParagraphIntrinsics j;
    public LayoutDirection k;

    static {
        TextDelegate.Companion = new Companion(null);
    }

    public TextDelegate(AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, boolean z, int v2, Density density0, Resolver fontFamily$Resolver0, List list0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, ((v3 & 4) == 0 ? v : 0x7FFFFFFF), ((v3 & 8) == 0 ? v1 : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v2 : 1), density0, fontFamily$Resolver0, ((v3 & 0x100) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), null);
    }

    public TextDelegate(AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, boolean z, int v2, Density density0, Resolver fontFamily$Resolver0, List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = v2;
        this.g = density0;
        this.h = fontFamily$Resolver0;
        this.i = list0;
        if(v <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if(v1 > v) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    @NotNull
    public final Density getDensity() {
        return this.g;
    }

    @NotNull
    public final Resolver getFontFamilyResolver() {
        return this.h;
    }

    @Nullable
    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.k;
    }

    public final int getMaxIntrinsicWidth() {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        return TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics0.getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.c;
    }

    public final int getMinIntrinsicWidth() {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        return TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics0.getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.d;
    }

    public final int getOverflow-gIe3tQ8() {
        return this.f;
    }

    @Nullable
    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.j;
    }

    @NotNull
    public final List getPlaceholders() {
        return this.i;
    }

    public final boolean getSoftWrap() {
        return this.e;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.b;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.a;
    }

    @NotNull
    public final TextLayoutResult layout-NN6Ew-U(long v, @NotNull LayoutDirection layoutDirection0, @Nullable TextLayoutResult textLayoutResult0) {
        if(textLayoutResult0 != null && TextLayoutHelperKt.canReuse-7_7YC6M(textLayoutResult0, this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection0, this.h, v)) {
            return textLayoutResult0.copy-O0kMr_c(new TextLayoutInput(textLayoutResult0.getLayoutInput().getText(), this.b, textLayoutResult0.getLayoutInput().getPlaceholders(), textLayoutResult0.getLayoutInput().getMaxLines(), textLayoutResult0.getLayoutInput().getSoftWrap(), textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), textLayoutResult0.getLayoutInput().getDensity(), textLayoutResult0.getLayoutInput().getLayoutDirection(), textLayoutResult0.getLayoutInput().getFontFamilyResolver(), v, null), ConstraintsKt.constrain-4WqzIAM(v, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult0.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult0.getMultiParagraph().getHeight()))));
        }
        this.layoutIntrinsics(layoutDirection0);
        int v1 = Constraints.getMinWidth-impl(v);
        int v2 = this.f;
        int v3 = !this.e && !TextOverflow.equals-impl0(v2, 2) || !Constraints.getHasBoundedWidth-impl(v) ? 0x7FFFFFFF : Constraints.getMaxWidth-impl(v);
        int v4 = this.e || !TextOverflow.equals-impl0(v2, 2) ? this.c : 1;
        if(v1 != v3) {
            v3 = c.coerceIn(this.getMaxIntrinsicWidth(), v1, v3);
        }
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        MultiParagraph multiParagraph0 = new MultiParagraph(multiParagraphIntrinsics0, Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(0, v3, 0, Constraints.getMaxHeight-impl(v)), v4, TextOverflow.equals-impl0(v2, 2), null);
        long v5 = ConstraintsKt.constrain-4WqzIAM(v, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraph0.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraph0.getHeight())));
        return new TextLayoutResult(new TextLayoutInput(this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection0, this.h, v, null), multiParagraph0, v5, null);
    }

    public static TextLayoutResult layout-NN6Ew-U$default(TextDelegate textDelegate0, long v, LayoutDirection layoutDirection0, TextLayoutResult textLayoutResult0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            textLayoutResult0 = null;
        }
        return textDelegate0.layout-NN6Ew-U(v, layoutDirection0, textLayoutResult0);
    }

    public final void layoutIntrinsics(@NotNull LayoutDirection layoutDirection0) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null || layoutDirection0 != this.k || multiParagraphIntrinsics0.getHasStaleResolvedFonts()) {
            this.k = layoutDirection0;
            TextStyle textStyle0 = TextStyleKt.resolveDefaults(this.b, layoutDirection0);
            multiParagraphIntrinsics0 = new MultiParagraphIntrinsics(this.a, textStyle0, this.i, this.g, this.h);
        }
        this.j = multiParagraphIntrinsics0;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@Nullable LayoutDirection layoutDirection0) {
        this.k = layoutDirection0;
    }

    public final void setParagraphIntrinsics$foundation_release(@Nullable MultiParagraphIntrinsics multiParagraphIntrinsics0) {
        this.j = multiParagraphIntrinsics0;
    }
}

