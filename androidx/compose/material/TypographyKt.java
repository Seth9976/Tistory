package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p0.o2;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u000B\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\" \u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "a", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultLineHeightStyle", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "c", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TypographyKt {
    public static final LineHeightStyle a;
    public static final TextStyle b;
    public static final ProvidableCompositionLocal c;

    static {
        LineHeightStyle lineHeightStyle0 = new LineHeightStyle(0.5f, 0, null);
        TypographyKt.a = lineHeightStyle0;
        TypographyKt.b = TextStyle.copy-p1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), lineHeightStyle0, 0, 0, null, 0xE7FFFF, null);
        TypographyKt.c = CompositionLocalKt.staticCompositionLocalOf(o2.F);
    }

    public static final TextStyle access$withDefaultFontFamily(TextStyle textStyle0, FontFamily fontFamily0) {
        return textStyle0.getFontFamily() == null ? TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0L, null, null, null, fontFamily0, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFDF, null) : textStyle0;
    }

    @NotNull
    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return TypographyKt.a;
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return TypographyKt.b;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTypography() {
        return TypographyKt.c;
    }
}

