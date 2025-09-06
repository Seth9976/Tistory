package androidx.compose.material3.tokens;

import androidx.compose.material3.internal.DefaultPlatformTextStyle_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u000B\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "a", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultLineHeightStyle", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TypographyTokensKt {
    public static final LineHeightStyle a;
    public static final TextStyle b;

    static {
        LineHeightStyle lineHeightStyle0 = new LineHeightStyle(0.5f, 0, null);
        TypographyTokensKt.a = lineHeightStyle0;
        TypographyTokensKt.b = TextStyle.copy-p1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), lineHeightStyle0, 0, 0, null, 0xE7FFFF, null);
    }

    @NotNull
    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return TypographyTokensKt.a;
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return TypographyTokensKt.b;
    }
}

