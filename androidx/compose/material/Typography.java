package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u001F\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\u0002\u0012\b\b\u0002\u0010\n\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u0012\b\b\u0002\u0010\f\u001A\u00020\u0002\u0012\b\b\u0002\u0010\r\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0014J\u008F\u0001\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010\"\u001A\u0004\b&\u0010$R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010\"\u001A\u0004\b(\u0010$R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\"\u001A\u0004\b*\u0010$R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010\"\u001A\u0004\b,\u0010$R\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010\"\u001A\u0004\b.\u0010$R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u0010\"\u001A\u0004\b0\u0010$R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b1\u0010\"\u001A\u0004\b2\u0010$R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010\"\u001A\u0004\b4\u0010$R\u0017\u0010\f\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010\"\u001A\u0004\b6\u0010$R\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u0010\"\u001A\u0004\b8\u0010$R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b9\u0010\"\u001A\u0004\b:\u0010$R\u0017\u0010\u000F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010\"\u001A\u0004\b<\u0010$\u00A8\u0006="}, d2 = {"Landroidx/compose/material/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "copy", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material/Typography;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/TextStyle;", "getH1", "()Landroidx/compose/ui/text/TextStyle;", "b", "getH2", "c", "getH3", "d", "getH4", "e", "getH5", "f", "getH6", "g", "getSubtitle1", "h", "getSubtitle2", "i", "getBody1", "j", "getBody2", "k", "getButton", "l", "getCaption", "m", "getOverline", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
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

    public Typography(@NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12) {
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
    }

    public Typography(@NotNull FontFamily fontFamily0, @NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12) {
        this(TypographyKt.access$withDefaultFontFamily(textStyle0, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle1, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle2, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle3, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle4, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle5, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle6, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle7, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle8, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle9, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle10, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle11, fontFamily0), TypographyKt.access$withDefaultFontFamily(textStyle12, fontFamily0));
    }

    // 去混淆评级： 中等(130)
    public Typography(FontFamily fontFamily0, TextStyle textStyle0, TextStyle textStyle1, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        FontFamily fontFamily1 = (v & 1) == 0 ? fontFamily0 : FontFamily.Companion.getDefault();
        this(fontFamily1, ((v & 2) == 0 ? textStyle0 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x142C00000L, FontWeight.Companion.getLight(), null, null, null, null, 0x1BFC00000L, null, null, null, 0L, null, null, null, 0, 0, 0x142E00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 4) == 0 ? textStyle1 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x142700000L, FontWeight.Companion.getLight(), null, null, null, null, 0x1BF000000L, null, null, null, 0L, null, null, null, 0, 0, 0x142900000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 8) == 0 ? textStyle2 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x142400000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x100000000L, null, null, null, 0L, null, null, null, 0, 0, 0x142600000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 16) == 0 ? textStyle3 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x142080000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x13E800000L, null, null, null, 0L, null, null, null, 0, 0, 0x142100000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x20) == 0 ? textStyle4 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141C00000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x100000000L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x40) == 0 ? textStyle5 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141A00000L, FontWeight.Companion.getMedium(), null, null, null, null, 5336832410L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x80) == 0 ? textStyle6 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141800000L, FontWeight.Companion.getNormal(), null, null, null, null, 5336832410L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x100) == 0 ? textStyle7 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141600000L, FontWeight.Companion.getMedium(), null, null, null, null, 0x13DCCCCCDL, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x200) == 0 ? textStyle8 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141800000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x13F000000L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x400) == 0 ? textStyle9 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x13E800000L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x800) == 0 ? textStyle10 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141600000L, FontWeight.Companion.getMedium(), null, null, null, null, 0x13FA00000L, null, null, null, 0L, null, null, null, 0, 0, 0x141800000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x1000) == 0 ? textStyle11 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x13ECCCCCDL, null, null, null, 0L, null, null, null, 0, 0, 0x141800000L, null, null, null, 0, 0, null, 0xFDFF79, null)), ((v & 0x2000) == 0 ? textStyle12 : TextStyle.copy-p1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, 0x141200000L, FontWeight.Companion.getNormal(), null, null, null, null, 0x13FC00000L, null, null, null, 0L, null, null, null, 0, 0, 0x141800000L, null, null, null, 0, 0, null, 0xFDFF79, null)));
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12) {
        return new Typography(textStyle0, textStyle1, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12);
    }

    public static Typography copy$default(Typography typography0, TextStyle textStyle0, TextStyle textStyle1, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, int v, Object object0) {
        TextStyle textStyle13 = (v & 1) == 0 ? textStyle0 : typography0.a;
        TextStyle textStyle14 = (v & 2) == 0 ? textStyle1 : typography0.b;
        TextStyle textStyle15 = (v & 4) == 0 ? textStyle2 : typography0.c;
        TextStyle textStyle16 = (v & 8) == 0 ? textStyle3 : typography0.d;
        TextStyle textStyle17 = (v & 16) == 0 ? textStyle4 : typography0.e;
        TextStyle textStyle18 = (v & 0x20) == 0 ? textStyle5 : typography0.f;
        TextStyle textStyle19 = (v & 0x40) == 0 ? textStyle6 : typography0.g;
        TextStyle textStyle20 = (v & 0x80) == 0 ? textStyle7 : typography0.h;
        TextStyle textStyle21 = (v & 0x100) == 0 ? textStyle8 : typography0.i;
        TextStyle textStyle22 = (v & 0x200) == 0 ? textStyle9 : typography0.j;
        TextStyle textStyle23 = (v & 0x400) == 0 ? textStyle10 : typography0.k;
        TextStyle textStyle24 = (v & 0x800) == 0 ? textStyle11 : typography0.l;
        return (v & 0x1000) == 0 ? typography0.copy(textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle12) : typography0.copy(textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, typography0.m);
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
        return Intrinsics.areEqual(this.l, ((Typography)object0).l) ? Intrinsics.areEqual(this.m, ((Typography)object0).m) : false;
    }

    @NotNull
    public final TextStyle getBody1() {
        return this.i;
    }

    @NotNull
    public final TextStyle getBody2() {
        return this.j;
    }

    @NotNull
    public final TextStyle getButton() {
        return this.k;
    }

    @NotNull
    public final TextStyle getCaption() {
        return this.l;
    }

    @NotNull
    public final TextStyle getH1() {
        return this.a;
    }

    @NotNull
    public final TextStyle getH2() {
        return this.b;
    }

    @NotNull
    public final TextStyle getH3() {
        return this.c;
    }

    @NotNull
    public final TextStyle getH4() {
        return this.d;
    }

    @NotNull
    public final TextStyle getH5() {
        return this.e;
    }

    @NotNull
    public final TextStyle getH6() {
        return this.f;
    }

    @NotNull
    public final TextStyle getOverline() {
        return this.m;
    }

    @NotNull
    public final TextStyle getSubtitle1() {
        return this.g;
    }

    @NotNull
    public final TextStyle getSubtitle2() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return this.m.hashCode() + q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(q.b(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f), 0x1F, this.g), 0x1F, this.h), 0x1F, this.i), 0x1F, this.j), 0x1F, this.k), 0x1F, this.l);
    }

    @Override
    @NotNull
    public String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}

