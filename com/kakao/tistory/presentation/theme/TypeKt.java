package com.kakao.tistory.presentation.theme;

import androidx.compose.material.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.font;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u000B\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0015\u0010\u000F\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E\"\u0015\u0010\u0011\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u000E\"\u0015\u0010\u0013\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u000E\"\u0015\u0010\u0015\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u000E\"\u0015\u0010\u0017\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u000E\"\u0015\u0010\u0019\u001A\u00020\f*\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u000E¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "a", "Landroidx/compose/ui/text/font/FontFamily;", "getTFont", "()Landroidx/compose/ui/text/font/FontFamily;", "TFont", "Landroidx/compose/material/Typography;", "b", "Landroidx/compose/material/Typography;", "getTypography", "()Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/ui/text/TextStyle;", "getPageTitle", "(Landroidx/compose/material/Typography;)Landroidx/compose/ui/text/TextStyle;", "pageTitle", "getGuideTitle", "guideTitle", "getSubtext1", "subtext1", "getSubtext2", "subtext2", "getH7", "h7", "getH8", "h8", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TypeKt {
    public static final FontFamily a;
    public static final Typography b;

    static {
        TypeKt.a = FontFamilyKt.FontFamily(new Font[]{FontKt.Font-YpTlLL0$default(font.font_pretendard_light, FontWeight.Companion.getLight(), 0, 0, 12, null), FontKt.Font-YpTlLL0$default(font.font_pretendard_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.Font-YpTlLL0$default(font.font_pretendard_medium, FontWeight.Companion.getMedium(), 0, 0, 12, null), FontKt.Font-YpTlLL0$default(font.font_pretendard_semibold, FontWeight.Companion.getSemiBold(), 0, 0, 12, null), FontKt.Font-YpTlLL0$default(font.font_pretendard_bold, FontWeight.Companion.getBold(), 0, 0, 12, null), FontKt.Font-YpTlLL0$default(font.font_pretendard_extrabold, FontWeight.Companion.getExtraBold(), 0, 0, 12, null)});
        TypeKt.b = new Typography(FontFamilyKt.FontFamily(new Font[]{FontKt.Font-YpTlLL0$default(font.font_pretendard_light, null, 0, 0, 14, null)}), k.c, k.d, k.e, k.f, k.g, k.h, k.l, null, k.k, null, k.n, null, null, 0x3500, null);
    }

    @NotNull
    public static final TextStyle getGuideTitle(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.b;
    }

    @NotNull
    public static final TextStyle getH7(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.i;
    }

    @NotNull
    public static final TextStyle getH8(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.j;
    }

    @NotNull
    public static final TextStyle getPageTitle(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.a;
    }

    @NotNull
    public static final TextStyle getSubtext1(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.l;
    }

    @NotNull
    public static final TextStyle getSubtext2(@NotNull Typography typography0) {
        Intrinsics.checkNotNullParameter(typography0, "<this>");
        return k.m;
    }

    @NotNull
    public static final FontFamily getTFont() {
        return TypeKt.a;
    }

    @NotNull
    public static final Typography getTypography() {
        return TypeKt.b;
    }
}

