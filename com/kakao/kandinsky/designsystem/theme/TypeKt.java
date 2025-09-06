package com.kakao.kandinsky.designsystem.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/Typography;", "a", "Landroidx/compose/material3/Typography;", "getTypography", "()Landroidx/compose/material3/Typography;", "Typography", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TypeKt {
    public static final Typography a;

    static {
        GenericFontFamily genericFontFamily0 = FontFamily.Companion.getSansSerif();
        TextStyle textStyle0 = new TextStyle(0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, genericFontFamily0, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
        GenericFontFamily genericFontFamily1 = FontFamily.Companion.getSansSerif();
        TextStyle textStyle1 = new TextStyle(0L, 0x141500000L, FontWeight.Companion.getNormal(), null, null, genericFontFamily1, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFD9, null);
        GenericFontFamily genericFontFamily2 = FontFamily.Companion.getSansSerif();
        TextStyle textStyle2 = new TextStyle(0L, 0x141300000L, FontWeight.Companion.getNormal(), null, null, genericFontFamily2, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
        GenericFontFamily genericFontFamily3 = FontFamily.Companion.getSansSerif();
        TextStyle textStyle3 = new TextStyle(0L, 0x141700000L, FontWeight.Companion.getBold(), null, null, genericFontFamily3, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
        GenericFontFamily genericFontFamily4 = FontFamily.Companion.getSansSerif();
        TextStyle textStyle4 = new TextStyle(0L, 0x141700000L, FontWeight.Companion.getNormal(), null, null, genericFontFamily4, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
        GenericFontFamily genericFontFamily5 = FontFamily.Companion.getSansSerif();
        TypeKt.a = new Typography(null, null, null, new TextStyle(0L, 0x141800000L, FontWeight.Companion.getNormal(), null, null, genericFontFamily5, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFFD9, null), textStyle3, textStyle4, null, null, null, textStyle0, textStyle1, textStyle2, null, null, null, 0x71C7, null);
    }

    @NotNull
    public static final Typography getTypography() {
        return TypeKt.a;
    }
}

