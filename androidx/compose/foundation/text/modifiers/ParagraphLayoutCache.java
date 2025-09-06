package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J \u0010\u0017\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u0019\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0019\u0010\u001AJH\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010 \u001A\u0004\u0018\u00010\u001F2\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b \u0010!J\u0015\u0010\"\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b$\u0010#J\u000F\u0010%\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b%\u0010&R.\u0010/\u001A\u0004\u0018\u00010\'2\b\u0010(\u001A\u0004\u0018\u00010\'8\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00107\u001A\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010F\u001A\u00020?8\u0000@\u0000X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001A\u00020\u001B8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010H\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006J"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextLayoutResult;", "minIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "maxIntrinsicWidth", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "value", "i", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/Paragraph;", "j", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraph", "k", "Z", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Landroidx/compose/ui/unit/IntSize;", "l", "J", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    public String a;
    public TextStyle b;
    public Resolver c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public Density i;
    public Paragraph j;
    public boolean k;
    public long l;
    public MinLinesConstrainer m;
    public ParagraphIntrinsics n;
    public LayoutDirection o;
    public long p;
    public int q;
    public int r;

    public ParagraphLayoutCache(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? v : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x40) == 0 ? v2 : 1), null);
    }

    public ParagraphLayoutCache(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = textStyle0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.h = 0x7FC000007FC00000L;
        this.l = 0L;
        this.p = Constraints.Companion.fixed-JhjzzOo(0, 0);
        this.q = -1;
        this.r = -1;
    }

    public final Paragraph a(long v, LayoutDirection layoutDirection0) {
        ParagraphIntrinsics paragraphIntrinsics0 = this.b(layoutDirection0);
        return ParagraphKt.Paragraph-_EkL_-Y(paragraphIntrinsics0, LayoutUtilsKt.finalConstraints-tfFHcEY(v, this.e, this.d, paragraphIntrinsics0.getMaxIntrinsicWidth()), LayoutUtilsKt.finalMaxLines-xdlQI24(this.e, this.d, this.f), TextOverflow.equals-impl0(this.d, 2));
    }

    public final ParagraphIntrinsics b(LayoutDirection layoutDirection0) {
        ParagraphIntrinsics paragraphIntrinsics0 = this.n;
        if(paragraphIntrinsics0 == null || layoutDirection0 != this.o || paragraphIntrinsics0.getHasStaleResolvedFonts()) {
            this.o = layoutDirection0;
            String s = this.a;
            TextStyle textStyle0 = TextStyleKt.resolveDefaults(this.b, layoutDirection0);
            Density density0 = this.i;
            Intrinsics.checkNotNull(density0);
            paragraphIntrinsics0 = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(s, textStyle0, null, null, density0, this.c, 12, null);
        }
        this.n = paragraphIntrinsics0;
        return paragraphIntrinsics0;
    }

    @Nullable
    public final Density getDensity$foundation_release() {
        return this.i;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.k;
    }

    public final long getLayoutSize-YbymL2g$foundation_release() {
        return this.l;
    }

    @NotNull
    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics0 = this.n;
        if(paragraphIntrinsics0 != null) {
            paragraphIntrinsics0.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Paragraph getParagraph$foundation_release() {
        return this.j;
    }

    public final int intrinsicHeight(int v, @NotNull LayoutDirection layoutDirection0) {
        int v1 = this.r;
        if(v == this.q && this.q != -1) {
            return v1;
        }
        int v2 = TextDelegateKt.ceilToIntPx(this.a(ConstraintsKt.Constraints(0, v, 0, 0x7FFFFFFF), layoutDirection0).getHeight());
        this.q = v;
        this.r = v2;
        return v2;
    }

    public final boolean layoutWithConstraints-K40F9xA(long v, @NotNull LayoutDirection layoutDirection0) {
        boolean z = true;
        if(this.g > 1) {
            MinLinesConstrainer minLinesConstrainer0 = this.m;
            TextStyle textStyle0 = this.b;
            Density density0 = this.i;
            Intrinsics.checkNotNull(density0);
            MinLinesConstrainer minLinesConstrainer1 = MinLinesConstrainer.Companion.from(minLinesConstrainer0, layoutDirection0, textStyle0, density0, this.c);
            this.m = minLinesConstrainer1;
            v = minLinesConstrainer1.coerceMinLines-Oh53vG4$foundation_release(v, this.g);
        }
        Paragraph paragraph0 = this.j;
        boolean z1 = false;
        if(paragraph0 != null && (this.n != null && !this.n.getHasStaleResolvedFonts() && layoutDirection0 == this.o && (Constraints.equals-impl0(v, this.p) || Constraints.getMaxWidth-impl(v) == Constraints.getMaxWidth-impl(this.p) && ((float)Constraints.getMaxHeight-impl(v)) >= paragraph0.getHeight() && !paragraph0.getDidExceedMaxLines()))) {
            if(!Constraints.equals-impl0(v, this.p)) {
                Paragraph paragraph1 = this.j;
                Intrinsics.checkNotNull(paragraph1);
                long v1 = ConstraintsKt.constrain-4WqzIAM(v, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph1.getMaxIntrinsicWidth(), paragraph1.getWidth())), TextDelegateKt.ceilToIntPx(paragraph1.getHeight())));
                this.l = v1;
                if(TextOverflow.equals-impl0(this.d, 3) || ((float)IntSize.getWidth-impl(v1)) >= paragraph1.getWidth() && ((float)IntSize.getHeight-impl(v1)) >= paragraph1.getHeight()) {
                    z = false;
                }
                this.k = z;
                this.p = v;
            }
            return false;
        }
        Paragraph paragraph2 = this.a(v, layoutDirection0);
        this.p = v;
        long v2 = ConstraintsKt.constrain-4WqzIAM(v, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraph2.getWidth()), TextDelegateKt.ceilToIntPx(paragraph2.getHeight())));
        this.l = v2;
        if(!TextOverflow.equals-impl0(this.d, 3) && (((float)IntSize.getWidth-impl(v2)) < paragraph2.getWidth() || ((float)IntSize.getHeight-impl(v2)) < paragraph2.getHeight())) {
            z1 = true;
        }
        this.k = z1;
        this.j = paragraph2;
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection0) {
        return TextDelegateKt.ceilToIntPx(this.b(layoutDirection0).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection0) {
        return TextDelegateKt.ceilToIntPx(this.b(layoutDirection0).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density0) {
        Density density1 = this.i;
        long v = density0 == null ? 0x7FC000007FC00000L : InlineDensity.constructor-impl(density0);
        if(density1 == null) {
            this.i = density0;
            this.h = v;
            return;
        }
        if(density0 == null || !InlineDensity.equals-impl0(this.h, v)) {
            this.i = density0;
            this.h = v;
            this.j = null;
            this.n = null;
            this.o = null;
            this.q = -1;
            this.r = -1;
            this.p = Constraints.Companion.fixed-JhjzzOo(0, 0);
            this.l = 0L;
            this.k = false;
        }
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.k = z;
    }

    public final void setLayoutSize-ozmzZPI$foundation_release(long v) {
        this.l = v;
    }

    public final void setParagraph$foundation_release(@Nullable Paragraph paragraph0) {
        this.j = paragraph0;
    }

    @Nullable
    public final TextLayoutResult slowCreateTextLayoutResultOrNull(@NotNull TextStyle textStyle0) {
        LayoutDirection layoutDirection0 = this.o;
        if(layoutDirection0 == null) {
            return null;
        }
        Density density0 = this.i;
        if(density0 == null) {
            return null;
        }
        AnnotatedString annotatedString0 = new AnnotatedString(this.a, null, null, 6, null);
        if(this.j == null) {
            return null;
        }
        if(this.n == null) {
            return null;
        }
        long v = Constraints.copy-Zbe2FdA$default(this.p, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString0, textStyle0, CollectionsKt__CollectionsKt.emptyList(), this.f, this.e, this.d, density0, layoutDirection0, this.c, v, null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString0, textStyle0, CollectionsKt__CollectionsKt.emptyList(), density0, this.c), v, this.f, TextOverflow.equals-impl0(this.d, 2), null), this.l, null);
    }

    @Override
    @NotNull
    public String toString() {
        return "ParagraphLayoutCache(paragraph=" + (this.j == null ? "null" : "<paragraph>") + ", lastDensity=" + InlineDensity.toString-impl(this.h) + ')';
    }

    public final void update-L6sJoHM(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2) {
        this.a = s;
        this.b = textStyle0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = Constraints.Companion.fixed-JhjzzOo(0, 0);
        this.l = 0L;
        this.k = false;
    }
}

