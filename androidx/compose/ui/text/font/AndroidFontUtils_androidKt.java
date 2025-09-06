package androidx.compose.ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\"\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"AndroidBold", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "getAndroidBold", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/ui/text/font/FontWeight;", "getAndroidTypefaceStyle", "", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "getAndroidTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "isBold", "", "isItalic", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFontUtils_androidKt {
    @NotNull
    public static final FontWeight getAndroidBold(@NotNull Companion fontWeight$Companion0) {
        return fontWeight$Companion0.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z1) {
        if(z1 && z) {
            return 3;
        }
        if(z) {
            return 1;
        }
        return z1 ? 2 : 0;
    }

    // 去混淆评级： 低(40)
    public static final int getAndroidTypefaceStyle-FO1MlWM(@NotNull FontWeight fontWeight0, int v) {
        return fontWeight0.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0 ? AndroidFontUtils_androidKt.getAndroidTypefaceStyle(false, FontStyle.equals-impl0(v, 1)) : AndroidFontUtils_androidKt.getAndroidTypefaceStyle(true, FontStyle.equals-impl0(v, 1));
    }
}

