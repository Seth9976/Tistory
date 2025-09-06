package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000F\u00A2\u0006\u0004\b\u0013\u0010\u0014J \u0010\u001B\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001D\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001D\u0010\u001EJ^\u0010\"\u001A\u00020\u001F2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0014\u0010\u0012\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000F\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u0015\u0010#\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b#\u0010$J\u0015\u0010%\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b%\u0010$R.\u0010.\u001A\u0004\u0018\u00010&2\b\u0010\'\u001A\u0004\u0018\u00010&8\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00102\u001A\u00020/8F\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u0013\u00104\u001A\u0004\u0018\u00010/8F\u00A2\u0006\u0006\u001A\u0004\b3\u00101\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00065"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "update-ZNqEYIc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;)V", "update", "maxIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "minIntrinsicWidth", "Landroidx/compose/ui/unit/Density;", "value", "k", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getLayoutOrNull", "layoutOrNull", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    public AnnotatedString a;
    public TextStyle b;
    public Resolver c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List h;
    public MinLinesConstrainer i;
    public long j;
    public Density k;
    public MultiParagraphIntrinsics l;
    public LayoutDirection m;
    public TextLayoutResult n;
    public int o;
    public int p;

    public MultiParagraphLayoutCache(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, List list0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? v : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x40) == 0 ? v2 : 1), ((v3 & 0x80) == 0 ? list0 : null), null);
    }

    public MultiParagraphLayoutCache(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.h = list0;
        this.j = 0x7FC000007FC00000L;
        this.o = -1;
        this.p = -1;
    }

    public final MultiParagraph a(long v, LayoutDirection layoutDirection0) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.b(layoutDirection0);
        return new MultiParagraph(multiParagraphIntrinsics0, LayoutUtilsKt.finalConstraints-tfFHcEY(v, this.e, this.d, multiParagraphIntrinsics0.getMaxIntrinsicWidth()), LayoutUtilsKt.finalMaxLines-xdlQI24(this.e, this.d, this.f), TextOverflow.equals-impl0(this.d, 2), null);
    }

    public final MultiParagraphIntrinsics b(LayoutDirection layoutDirection0) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.l;
        if(multiParagraphIntrinsics0 == null || layoutDirection0 != this.m || multiParagraphIntrinsics0.getHasStaleResolvedFonts()) {
            this.m = layoutDirection0;
            AnnotatedString annotatedString0 = this.a;
            TextStyle textStyle0 = TextStyleKt.resolveDefaults(this.b, layoutDirection0);
            Density density0 = this.k;
            Intrinsics.checkNotNull(density0);
            multiParagraphIntrinsics0 = new MultiParagraphIntrinsics(annotatedString0, textStyle0, (this.h == null ? CollectionsKt__CollectionsKt.emptyList() : this.h), density0, this.c);
        }
        this.l = multiParagraphIntrinsics0;
        return multiParagraphIntrinsics0;
    }

    public final TextLayoutResult c(LayoutDirection layoutDirection0, long v, MultiParagraph multiParagraph0) {
        float f = Math.min(multiParagraph0.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph0.getWidth());
        AnnotatedString annotatedString0 = this.a;
        TextStyle textStyle0 = this.b;
        List list0 = this.h == null ? CollectionsKt__CollectionsKt.emptyList() : this.h;
        int v1 = this.f;
        boolean z = this.e;
        int v2 = this.d;
        Density density0 = this.k;
        Intrinsics.checkNotNull(density0);
        return new TextLayoutResult(new TextLayoutInput(annotatedString0, textStyle0, list0, v1, z, v2, density0, layoutDirection0, this.c, v, null), multiParagraph0, ConstraintsKt.constrain-4WqzIAM(v, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(f), TextDelegateKt.ceilToIntPx(multiParagraph0.getHeight()))), null);
    }

    @Nullable
    public final Density getDensity$foundation_release() {
        return this.k;
    }

    @Nullable
    public final TextLayoutResult getLayoutOrNull() {
        return this.n;
    }

    @NotNull
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult0 = this.n;
        if(textLayoutResult0 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        return textLayoutResult0;
    }

    public final int intrinsicHeight(int v, @NotNull LayoutDirection layoutDirection0) {
        int v1 = this.p;
        if(v == this.o && this.o != -1) {
            return v1;
        }
        int v2 = TextDelegateKt.ceilToIntPx(this.a(ConstraintsKt.Constraints(0, v, 0, 0x7FFFFFFF), layoutDirection0).getHeight());
        this.o = v;
        this.p = v2;
        return v2;
    }

    public final boolean layoutWithConstraints-K40F9xA(long v, @NotNull LayoutDirection layoutDirection0) {
        if(this.g > 1) {
            MinLinesConstrainer minLinesConstrainer0 = this.i;
            TextStyle textStyle0 = this.b;
            Density density0 = this.k;
            Intrinsics.checkNotNull(density0);
            MinLinesConstrainer minLinesConstrainer1 = MinLinesConstrainer.Companion.from(minLinesConstrainer0, layoutDirection0, textStyle0, density0, this.c);
            this.i = minLinesConstrainer1;
            v = minLinesConstrainer1.coerceMinLines-Oh53vG4$foundation_release(v, this.g);
        }
        TextLayoutResult textLayoutResult0 = this.n;
        if(textLayoutResult0 != null && !textLayoutResult0.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() && layoutDirection0 == textLayoutResult0.getLayoutInput().getLayoutDirection() && (Constraints.equals-impl0(v, textLayoutResult0.getLayoutInput().getConstraints-msEJaDk()) || Constraints.getMaxWidth-impl(v) == Constraints.getMaxWidth-impl(textLayoutResult0.getLayoutInput().getConstraints-msEJaDk()) && ((float)Constraints.getMaxHeight-impl(v)) >= textLayoutResult0.getMultiParagraph().getHeight() && !textLayoutResult0.getMultiParagraph().getDidExceedMaxLines())) {
            TextLayoutResult textLayoutResult1 = this.n;
            Intrinsics.checkNotNull(textLayoutResult1);
            if(Constraints.equals-impl0(v, textLayoutResult1.getLayoutInput().getConstraints-msEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.n;
            Intrinsics.checkNotNull(textLayoutResult2);
            this.n = this.c(layoutDirection0, v, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.n = this.c(layoutDirection0, v, this.a(v, layoutDirection0));
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection0) {
        return TextDelegateKt.ceilToIntPx(this.b(layoutDirection0).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection0) {
        return TextDelegateKt.ceilToIntPx(this.b(layoutDirection0).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density0) {
        Density density1 = this.k;
        long v = density0 == null ? 0x7FC000007FC00000L : InlineDensity.constructor-impl(density0);
        if(density1 == null) {
            this.k = density0;
            this.j = v;
            return;
        }
        if(density0 == null || !InlineDensity.equals-impl0(this.j, v)) {
            this.k = density0;
            this.j = v;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final void update-ZNqEYIc(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, @Nullable List list0) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.h = list0;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }
}

