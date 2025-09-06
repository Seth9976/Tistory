package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u009D\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\u0002\u0012\b\b\u0002\u0010\n\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u0012\b\b\u0002\u0010\f\u001A\u00020\u0002\u0012\b\b\u0002\u0010\r\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u00A3\u0001\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010!\u001A\u0004\b%\u0010#R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010!\u001A\u0004\b\'\u0010#R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010#R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010!\u001A\u0004\b+\u0010#R\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010!\u001A\u0004\b-\u0010#R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010!\u001A\u0004\b/\u0010#R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u0010!\u001A\u0004\b1\u0010#R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u0010!\u001A\u0004\b3\u0010#R\u0017\u0010\f\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b4\u0010!\u001A\u0004\b5\u0010#R\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u0010!\u001A\u0004\b7\u0010#R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u0010!\u001A\u0004\b9\u0010#R\u0017\u0010\u000F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010!\u001A\u0004\b;\u0010#R\u0017\u0010\u0010\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b<\u0010!\u001A\u0004\b=\u0010#R\u0017\u0010\u0011\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b>\u0010!\u001A\u0004\b?\u0010#\u00A8\u0006@"}, d2 = {"Landroidx/compose/material3/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "copy", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material3/Typography;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/TextStyle;", "getDisplayLarge", "()Landroidx/compose/ui/text/TextStyle;", "b", "getDisplayMedium", "c", "getDisplaySmall", "d", "getHeadlineLarge", "e", "getHeadlineMedium", "f", "getHeadlineSmall", "g", "getTitleLarge", "h", "getTitleMedium", "i", "getTitleSmall", "j", "getBodyLarge", "k", "getBodyMedium", "l", "getBodySmall", "m", "getLabelLarge", "n", "getLabelMedium", "o", "getLabelSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Typography {
    public static final int $stable;
    public final TextStyle a;
    public final TextStyle b;
    public final TextStyle c;
    public final TextStyle d;
    public final TextStyle e;
    public final TextStyle f;
    public final TextStyle g;
    public final TextStyle h;
    public final TextStyle i;
    public final TextStyle j;
    public final TextStyle k;
    public final TextStyle l;
    public final TextStyle m;
    public final TextStyle n;
    public final TextStyle o;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFF, null);
    }

    public Typography(@NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12, @NotNull TextStyle textStyle13, @NotNull TextStyle textStyle14) {
        this.a = textStyle0;
        this.b = textStyle1;
        this.c = textStyle2;
        this.d = textStyle3;
        this.e = textStyle4;
        this.f = textStyle5;
        this.g = textStyle6;
        this.h = textStyle7;
        this.i = textStyle8;
        this.j = textStyle9;
        this.k = textStyle10;
        this.l = textStyle11;
        this.m = textStyle12;
        this.n = textStyle13;
        this.o = textStyle14;
    }

    public Typography(TextStyle textStyle0, TextStyle textStyle1, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? textStyle0 : TypographyTokens.INSTANCE.getDisplayLarge()), ((v & 2) == 0 ? textStyle1 : TypographyTokens.INSTANCE.getDisplayMedium()), ((v & 4) == 0 ? textStyle2 : TypographyTokens.INSTANCE.getDisplaySmall()), ((v & 8) == 0 ? textStyle3 : TypographyTokens.INSTANCE.getHeadlineLarge()), ((v & 16) == 0 ? textStyle4 : TypographyTokens.INSTANCE.getHeadlineMedium()), ((v & 0x20) == 0 ? textStyle5 : TypographyTokens.INSTANCE.getHeadlineSmall()), ((v & 0x40) == 0 ? textStyle6 : TypographyTokens.INSTANCE.getTitleLarge()), ((v & 0x80) == 0 ? textStyle7 : TypographyTokens.INSTANCE.getTitleMedium()), ((v & 0x100) == 0 ? textStyle8 : TypographyTokens.INSTANCE.getTitleSmall()), ((v & 0x200) == 0 ? textStyle9 : TypographyTokens.INSTANCE.getBodyLarge()), ((v & 0x400) == 0 ? textStyle10 : TypographyTokens.INSTANCE.getBodyMedium()), ((v & 0x800) == 0 ? textStyle11 : TypographyTokens.INSTANCE.getBodySmall()), ((v & 0x1000) == 0 ? textStyle12 : TypographyTokens.INSTANCE.getLabelLarge()), ((v & 0x2000) == 0 ? textStyle13 : TypographyTokens.INSTANCE.getLabelMedium()), ((v & 0x4000) == 0 ? textStyle14 : TypographyTokens.INSTANCE.getLabelSmall()));
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12, @NotNull TextStyle textStyle13, @NotNull TextStyle textStyle14) {
        return new Typography(textStyle0, textStyle1, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14);
    }

    public static Typography copy$default(Typography typography0, TextStyle textStyle0, TextStyle textStyle1, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, int v, Object object0) {
        TextStyle textStyle15 = (v & 1) == 0 ? textStyle0 : typography0.a;
        TextStyle textStyle16 = (v & 2) == 0 ? textStyle1 : typography0.b;
        TextStyle textStyle17 = (v & 4) == 0 ? textStyle2 : typography0.c;
        TextStyle textStyle18 = (v & 8) == 0 ? textStyle3 : typography0.d;
        TextStyle textStyle19 = (v & 16) == 0 ? textStyle4 : typography0.e;
        TextStyle textStyle20 = (v & 0x20) == 0 ? textStyle5 : typography0.f;
        TextStyle textStyle21 = (v & 0x40) == 0 ? textStyle6 : typography0.g;
        TextStyle textStyle22 = (v & 0x80) == 0 ? textStyle7 : typography0.h;
        TextStyle textStyle23 = (v & 0x100) == 0 ? textStyle8 : typography0.i;
        TextStyle textStyle24 = (v & 0x200) == 0 ? textStyle9 : typography0.j;
        TextStyle textStyle25 = (v & 0x400) == 0 ? textStyle10 : typography0.k;
        TextStyle textStyle26 = (v & 0x800) == 0 ? textStyle11 : typography0.l;
        TextStyle textStyle27 = (v & 0x1000) == 0 ? textStyle12 : typography0.m;
        TextStyle textStyle28 = (v & 0x2000) == 0 ? textStyle13 : typography0.n;
        return (v & 0x4000) == 0 ? typography0.copy(textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle14) : typography0.copy(textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, typography0.o);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Typography)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Typography)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Typography)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((Typography)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((Typography)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((Typography)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((Typography)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((Typography)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((Typography)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((Typography)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((Typography)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((Typography)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((Typography)object0).l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((Typography)object0).m)) {
            return false;
        }
        return Intrinsics.areEqual(this.n, ((Typography)object0).n) ? Intrinsics.areEqual(this.o, ((Typography)object0).o) : false;
    }

    @NotNull
    public final TextStyle getBodyLarge() {
        return this.j;
    }

    @NotNull
    public final TextStyle getBodyMedium() {
        return this.k;
    }

    @NotNull
    public final TextStyle getBodySmall() {
        return this.l;
    }

    @NotNull
    public final TextStyle getDisplayLarge() {
        return this.a;
    }

    @NotNull
    public final TextStyle getDisplayMedium() {
        return this.b;
    }

    @NotNull
    public final TextStyle getDisplaySmall() {
        return this.c;
    }

    @NotNull
    public final TextStyle getHeadlineLarge() {
        return this.d;
    }

    @NotNull
    public final TextStyle getHeadlineMedium() {
        return this.e;
    }

    @NotNull
    public final TextStyle getHeadlineSmall() {
        return this.f;
    }

    @NotNull
    public final TextStyle getLabelLarge() {
        return this.m;
    }

    @NotNull
    public final TextStyle getLabelMedium() {
        return this.n;
    }

    @NotNull
    public final TextStyle getLabelSmall() {
        return this.o;
    }

    @NotNull
    public final TextStyle getTitleLarge() {
        return this.g;
    }

    @NotNull
    public final TextStyle getTitleMedium() {
        return this.h;
    }

    @NotNull
    public final TextStyle getTitleSmall() {
        return this.i;
    }

    @Override
    public int hashCode() {
        return this.o.hashCode() + q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f), 0x1F, this.g), 0x1F, this.h), 0x1F, this.i), 0x1F, this.j), 0x1F, this.k), 0x1F, this.l), 0x1F, this.m), 0x1F, this.n);
    }

    @Override
    @NotNull
    public String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}

