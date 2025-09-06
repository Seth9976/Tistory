package androidx.compose.ui.text;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001Be\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019Be\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u001B\u001A\u00020\u001A\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0018\u0010\u001CJ\u0082\u0001\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0014\b\u0002\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020\f2\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010#\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b&\u0010\'R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R#\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010$R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u001D\u0010\u000F\u001A\u00020\u000E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u00105\u001A\u0004\b<\u0010$R\u0017\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0017\u0010\u001B\u001A\u00020\u001A8\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u001D\u0010\u0017\u001A\u00020\u00168\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010LR\u001A\u0010\u0015\u001A\u00020\u00148FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bO\u0010P\u001A\u0004\bM\u0010N\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Q"}, d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-hu-1Yfo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Landroidx/compose/ui/text/TextLayoutInput;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "c", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "d", "I", "getMaxLines", "e", "Z", "getSoftWrap", "()Z", "f", "getOverflow-gIe3tQ8", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "h", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "i", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "j", "J", "getConstraints-msEJaDk", "()J", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutInput {
    public static final int $stable = 8;
    public final AnnotatedString a;
    public final TextStyle b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Density g;
    public final LayoutDirection h;
    public final Resolver i;
    public final long j;
    public final ResourceLoader k;

    @Deprecated(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(font$ResourceLoader0), v2);
    }

    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, Resolver fontFamily$Resolver0, long v2) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = list0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = density0;
        this.h = layoutDirection0;
        this.i = fontFamily$Resolver0;
        this.j = v2;
        this.k = font$ResourceLoader0;
    }

    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, Resolver fontFamily$Resolver0, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, null, fontFamily$Resolver0, v2);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @NotNull
    public final TextLayoutInput copy-hu-1Yfo(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull List list0, int v, boolean z, int v1, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull ResourceLoader font$ResourceLoader0, long v2) {
        return new TextLayoutInput(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, this.i, v2);
    }

    public static TextLayoutInput copy-hu-1Yfo$default(TextLayoutInput textLayoutInput0, AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, int v3, Object object0) {
        AnnotatedString annotatedString1 = (v3 & 1) == 0 ? annotatedString0 : textLayoutInput0.a;
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : textLayoutInput0.b;
        List list1 = (v3 & 4) == 0 ? list0 : textLayoutInput0.c;
        int v4 = (v3 & 8) == 0 ? v : textLayoutInput0.d;
        boolean z1 = (v3 & 16) == 0 ? z : textLayoutInput0.e;
        int v5 = (v3 & 0x20) == 0 ? v1 : textLayoutInput0.f;
        Density density1 = (v3 & 0x40) == 0 ? density0 : textLayoutInput0.g;
        LayoutDirection layoutDirection1 = (v3 & 0x80) == 0 ? layoutDirection0 : textLayoutInput0.h;
        ResourceLoader font$ResourceLoader1 = (v3 & 0x100) == 0 ? font$ResourceLoader0 : textLayoutInput0.getResourceLoader();
        return (v3 & 0x200) == 0 ? textLayoutInput0.copy-hu-1Yfo(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, v2) : textLayoutInput0.copy-hu-1Yfo(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, textLayoutInput0.j);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutInput)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TextLayoutInput)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextLayoutInput)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextLayoutInput)object0).c)) {
            return false;
        }
        if(this.d != ((TextLayoutInput)object0).d) {
            return false;
        }
        if(this.e != ((TextLayoutInput)object0).e) {
            return false;
        }
        if(!TextOverflow.equals-impl0(this.f, ((TextLayoutInput)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((TextLayoutInput)object0).g)) {
            return false;
        }
        if(this.h != ((TextLayoutInput)object0).h) {
            return false;
        }
        return Intrinsics.areEqual(this.i, ((TextLayoutInput)object0).i) ? Constraints.equals-impl0(this.j, ((TextLayoutInput)object0).j) : false;
    }

    public final long getConstraints-msEJaDk() {
        return this.j;
    }

    @NotNull
    public final Density getDensity() {
        return this.g;
    }

    @NotNull
    public final Resolver getFontFamilyResolver() {
        return this.i;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.h;
    }

    public final int getMaxLines() {
        return this.d;
    }

    public final int getOverflow-gIe3tQ8() {
        return this.f;
    }

    @NotNull
    public final List getPlaceholders() {
        return this.c;
    }

    @NotNull
    public final ResourceLoader getResourceLoader() {
        return this.k == null ? f.b.from(this.i) : this.k;
    }

    @Deprecated(message = "Replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static void getResourceLoader$annotations() {
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

    @Override
    public int hashCode() {
        return Constraints.hashCode-impl(this.j) + (this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + (TextOverflow.hashCode-impl(this.f) + a.e((b.c(this.c, q.b(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F) + this.d) * 0x1F, 0x1F, this.e)) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TextLayoutInput(text=" + this.a + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + TextOverflow.toString-impl(this.f) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + Constraints.toString-impl(this.j) + ')';
    }
}

