package com.kakao.tistory.presentation.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight.Companion;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b`\b\u00C7\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001C\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0004\u001A\u0004\b\u001B\u0010\u0006R\u0017\u0010\u001F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0004\u001A\u0004\b\u001E\u0010\u0006R\u0017\u0010\"\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010\u0004\u001A\u0004\b!\u0010\u0006R\u0017\u0010%\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u0004\u001A\u0004\b$\u0010\u0006R\u0017\u0010(\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\u0004\u001A\u0004\b\'\u0010\u0006R\u0017\u0010+\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\u0004\u001A\u0004\b*\u0010\u0006R\u0017\u0010.\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010\u0004\u001A\u0004\b-\u0010\u0006R\u0017\u00101\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u0010\u0004\u001A\u0004\b0\u0010\u0006R\u0017\u00104\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u0010\u0004\u001A\u0004\b3\u0010\u0006R\u0017\u00107\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010\u0004\u001A\u0004\b6\u0010\u0006R\u0017\u0010:\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u0010\u0004\u001A\u0004\b9\u0010\u0006R\u0017\u0010=\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010\u0004\u001A\u0004\b<\u0010\u0006R\u0017\u0010@\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b>\u0010\u0004\u001A\u0004\b?\u0010\u0006R\u0017\u0010C\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bA\u0010\u0004\u001A\u0004\bB\u0010\u0006R\u0017\u0010F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010\u0004\u001A\u0004\bE\u0010\u0006R\u0017\u0010I\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010\u0004\u001A\u0004\bH\u0010\u0006R\u0017\u0010L\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bJ\u0010\u0004\u001A\u0004\bK\u0010\u0006R\u0017\u0010O\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bM\u0010\u0004\u001A\u0004\bN\u0010\u0006R\u0017\u0010R\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010\u0004\u001A\u0004\bQ\u0010\u0006R\u0017\u0010U\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010\u0004\u001A\u0004\bT\u0010\u0006R\u0017\u0010X\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010\u0004\u001A\u0004\bW\u0010\u0006R\u0017\u0010[\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bY\u0010\u0004\u001A\u0004\bZ\u0010\u0006R\u0017\u0010^\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\\\u0010\u0004\u001A\u0004\b]\u0010\u0006R\u0017\u0010a\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b_\u0010\u0004\u001A\u0004\b`\u0010\u0006\u00A8\u0006b"}, d2 = {"Lcom/kakao/tistory/presentation/theme/TTextStyle;", "", "Landroidx/compose/ui/text/TextStyle;", "a", "Landroidx/compose/ui/text/TextStyle;", "getSize32Weight600", "()Landroidx/compose/ui/text/TextStyle;", "size32Weight600", "b", "getSize32Weight700", "size32Weight700", "c", "getSize30Weight600", "size30Weight600", "d", "getSize30Weight800", "size30Weight800", "e", "getSize24Weight900", "size24Weight900", "f", "getSize22Weight500", "size22Weight500", "g", "getSize22Weight700", "size22Weight700", "h", "getSize18Weight400", "size18Weight400", "i", "getSize18Weight600", "size18Weight600", "j", "getSize17Weight500", "size17Weight500", "k", "getSubTitle", "subTitle", "l", "getSize17Weight700", "size17Weight700", "m", "getSize16Weight400", "size16Weight400", "n", "getSize16Weight500", "size16Weight500", "o", "getSize16Weight600", "size16Weight600", "p", "getSize16Weight700", "size16Weight700", "q", "getSize15Weight400", "size15Weight400", "r", "getSize15Weight600", "size15Weight600", "s", "getSize15Weight700", "size15Weight700", "t", "getSize14Weight400", "size14Weight400", "u", "getSize14Weight700", "size14Weight700", "v", "getSize13Weight400", "size13Weight400", "w", "getSize13Weight300", "size13Weight300", "x", "getSize13Weight700", "size13Weight700", "y", "getSize12Weight400", "size12Weight400", "z", "getSize12Weight300", "size12Weight300", "A", "getSize12Weight500", "size12Weight500", "B", "getSize12Weight600", "size12Weight600", "C", "getSize12Weight700", "size12Weight700", "D", "getSize11Weight400", "size11Weight400", "E", "getSize11Weight500", "size11Weight500", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TTextStyle {
    public static final int $stable;
    public static final TextStyle A;
    public static final TextStyle B;
    public static final TextStyle C;
    public static final TextStyle D;
    public static final TextStyle E;
    @NotNull
    public static final TTextStyle INSTANCE;
    public static final TextStyle a;
    public static final TextStyle b;
    public static final TextStyle c;
    public static final TextStyle d;
    public static final TextStyle e;
    public static final TextStyle f;
    public static final TextStyle g;
    public static final TextStyle h;
    public static final TextStyle i;
    public static final TextStyle j;
    public static final TextStyle k;
    public static final TextStyle l;
    public static final TextStyle m;
    public static final TextStyle n;
    public static final TextStyle o;
    public static final TextStyle p;
    public static final TextStyle q;
    public static final TextStyle r;
    public static final TextStyle s;
    public static final TextStyle t;
    public static final TextStyle u;
    public static final TextStyle v;
    public static final TextStyle w;
    public static final TextStyle x;
    public static final TextStyle y;
    public static final TextStyle z;

    static {
        TTextStyle.INSTANCE = new TTextStyle();
        TextStyle textStyle0 = new TextStyle(0L, 0L, null, null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, new LineHeightStyle(0.5f, 0, null), 0, 0, null, 0xEFFFDF, null);
        Companion fontWeight$Companion0 = FontWeight.Companion;
        TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x142000000L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x142180000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.a = textStyle1;
        TTextStyle.b = TextStyle.copy-p1EtxEg$default(textStyle1, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle2 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141F00000L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x142180000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.c = textStyle2;
        TTextStyle.d = TextStyle.copy-p1EtxEg$default(textStyle2, 0L, 0x141F00000L, fontWeight$Companion0.getExtraBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x1420C0000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.e = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141C00000L, fontWeight$Companion0.getExtraBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x142100000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TextStyle textStyle3 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141B00000L, fontWeight$Companion0.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141E00000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.f = textStyle3;
        TTextStyle.g = TextStyle.copy-p1EtxEg$default(textStyle3, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle4 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141900000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141B80000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.h = textStyle4;
        TTextStyle.i = TextStyle.copy-p1EtxEg$default(textStyle4, 0L, 0L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle5 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141880000L, fontWeight$Companion0.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.j = textStyle5;
        TTextStyle.k = TextStyle.copy-p1EtxEg$default(textStyle5, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        TTextStyle.l = TextStyle.copy-p1EtxEg$default(textStyle5, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle6 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141800000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141B80000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.m = textStyle6;
        TTextStyle.n = TextStyle.copy-p1EtxEg$default(textStyle6, 0L, 0L, fontWeight$Companion0.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.o = TextStyle.copy-p1EtxEg$default(textStyle6, 0L, 0L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.p = TextStyle.copy-p1EtxEg$default(textStyle6, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle7 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141700000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141B00000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.q = textStyle7;
        TTextStyle.r = TextStyle.copy-p1EtxEg$default(textStyle7, 0L, 0L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.s = TextStyle.copy-p1EtxEg$default(textStyle7, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle8 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141600000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A80000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.t = textStyle8;
        TTextStyle.u = TextStyle.copy-p1EtxEg$default(textStyle8, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle9 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141500000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.v = textStyle9;
        TTextStyle.w = TextStyle.copy-p1EtxEg$default(textStyle9, 0L, 0L, fontWeight$Companion0.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.x = TextStyle.copy-p1EtxEg$default(textStyle9, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle10 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141400000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141900000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.y = textStyle10;
        TTextStyle.z = TextStyle.copy-p1EtxEg$default(textStyle10, 0L, 0L, fontWeight$Companion0.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.A = TextStyle.copy-p1EtxEg$default(textStyle10, 0L, 0L, fontWeight$Companion0.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.B = TextStyle.copy-p1EtxEg$default(textStyle10, 0L, 0L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TTextStyle.C = TextStyle.copy-p1EtxEg$default(textStyle10, 0L, 0L, fontWeight$Companion0.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        TextStyle textStyle11 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0x141300000L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141880000L, null, null, null, 0, 0, null, 0xFDFFF9, null);
        TTextStyle.D = textStyle11;
        TTextStyle.E = TextStyle.copy-p1EtxEg$default(textStyle11, 0L, 0L, fontWeight$Companion0.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
    }

    @NotNull
    public final TextStyle getSize11Weight400() {
        return TTextStyle.D;
    }

    @NotNull
    public final TextStyle getSize11Weight500() {
        return TTextStyle.E;
    }

    @NotNull
    public final TextStyle getSize12Weight300() {
        return TTextStyle.z;
    }

    @NotNull
    public final TextStyle getSize12Weight400() {
        return TTextStyle.y;
    }

    @NotNull
    public final TextStyle getSize12Weight500() {
        return TTextStyle.A;
    }

    @NotNull
    public final TextStyle getSize12Weight600() {
        return TTextStyle.B;
    }

    @NotNull
    public final TextStyle getSize12Weight700() {
        return TTextStyle.C;
    }

    @NotNull
    public final TextStyle getSize13Weight300() {
        return TTextStyle.w;
    }

    @NotNull
    public final TextStyle getSize13Weight400() {
        return TTextStyle.v;
    }

    @NotNull
    public final TextStyle getSize13Weight700() {
        return TTextStyle.x;
    }

    @NotNull
    public final TextStyle getSize14Weight400() {
        return TTextStyle.t;
    }

    @NotNull
    public final TextStyle getSize14Weight700() {
        return TTextStyle.u;
    }

    @NotNull
    public final TextStyle getSize15Weight400() {
        return TTextStyle.q;
    }

    @NotNull
    public final TextStyle getSize15Weight600() {
        return TTextStyle.r;
    }

    @NotNull
    public final TextStyle getSize15Weight700() {
        return TTextStyle.s;
    }

    @NotNull
    public final TextStyle getSize16Weight400() {
        return TTextStyle.m;
    }

    @NotNull
    public final TextStyle getSize16Weight500() {
        return TTextStyle.n;
    }

    @NotNull
    public final TextStyle getSize16Weight600() {
        return TTextStyle.o;
    }

    @NotNull
    public final TextStyle getSize16Weight700() {
        return TTextStyle.p;
    }

    @NotNull
    public final TextStyle getSize17Weight500() {
        return TTextStyle.j;
    }

    @NotNull
    public final TextStyle getSize17Weight700() {
        return TTextStyle.l;
    }

    @NotNull
    public final TextStyle getSize18Weight400() {
        return TTextStyle.h;
    }

    @NotNull
    public final TextStyle getSize18Weight600() {
        return TTextStyle.i;
    }

    @NotNull
    public final TextStyle getSize22Weight500() {
        return TTextStyle.f;
    }

    @NotNull
    public final TextStyle getSize22Weight700() {
        return TTextStyle.g;
    }

    @NotNull
    public final TextStyle getSize24Weight900() {
        return TTextStyle.e;
    }

    @NotNull
    public final TextStyle getSize30Weight600() {
        return TTextStyle.c;
    }

    @NotNull
    public final TextStyle getSize30Weight800() {
        return TTextStyle.d;
    }

    @NotNull
    public final TextStyle getSize32Weight600() {
        return TTextStyle.a;
    }

    @NotNull
    public final TextStyle getSize32Weight700() {
        return TTextStyle.b;
    }

    @NotNull
    public final TextStyle getSubTitle() {
        return TTextStyle.k;
    }
}

