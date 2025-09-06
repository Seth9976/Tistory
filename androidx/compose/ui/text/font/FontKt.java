package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A.\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A8\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001AB\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\f\u0010\u0012\u001A\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FontKt {
    @ExperimentalTextApi
    @NotNull
    public static final Font Font-F3nL8kk(int v, @NotNull FontWeight fontWeight0, int v1, int v2, @NotNull Settings fontVariation$Settings0) {
        return new ResourceFont(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    public static Font Font-F3nL8kk$default(int v, FontWeight fontWeight0, int v1, int v2, Settings fontVariation$Settings0, int v3, Object object0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        if((v3 & 16) != 0) {
            fontVariation$Settings0 = FontVariation.INSTANCE.Settings-6EWAqTQ(fontWeight0, v1, new Setting[0]);
        }
        return FontKt.Font-F3nL8kk(v, fontWeight0, v1, v2, fontVariation$Settings0);
    }

    // 去混淆评级： 低(20)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    public static final Font Font-RetOiIg(int v, FontWeight fontWeight0, int v1) {
        return new ResourceFont(v, fontWeight0, v1, null, 0, 8, null);
    }

    public static Font Font-RetOiIg$default(int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return FontKt.Font-RetOiIg(v, fontWeight0, v1);
    }

    @Stable
    @NotNull
    public static final Font Font-YpTlLL0(int v, @NotNull FontWeight fontWeight0, int v1, int v2) {
        return new ResourceFont(v, fontWeight0, v1, new Settings(new Setting[0]), v2, null);
    }

    public static Font Font-YpTlLL0$default(int v, FontWeight fontWeight0, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        return FontKt.Font-YpTlLL0(v, fontWeight0, v1, v2);
    }

    @Stable
    @NotNull
    public static final FontFamily toFontFamily(@NotNull Font font0) {
        return FontFamilyKt.FontFamily(new Font[]{font0});
    }
}

