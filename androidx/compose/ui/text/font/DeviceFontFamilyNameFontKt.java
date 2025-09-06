package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A6\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "familyName", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-vxs03AY", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "DeviceFontFamilyNameFontKt")
public final class DeviceFontFamilyNameFontKt {
    @NotNull
    public static final Font Font-vxs03AY(@NotNull String s, @NotNull FontWeight fontWeight0, int v, @NotNull Settings fontVariation$Settings0) {
        return new b(s, fontWeight0, v, fontVariation$Settings0);
    }

    public static Font Font-vxs03AY$default(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = new Settings(new Setting[0]);
        }
        return DeviceFontFamilyNameFontKt.Font-vxs03AY(s, fontWeight0, v, fontVariation$Settings0);
    }
}

