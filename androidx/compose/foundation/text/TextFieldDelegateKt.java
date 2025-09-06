package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001A;\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000B\u0010\f\"\u0014\u0010\r\u001A\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000E\"\u001A\u0010\u0013\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/IntSize;", "computeSizeForDefaultText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;I)J", "DefaultWidthCharCount", "I", "a", "Ljava/lang/String;", "getEmptyTextReplacement", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    public static final String a;

    static {
        TextFieldDelegateKt.a = "HHHHHHHHHH";
    }

    public static final long computeSizeForDefaultText(@NotNull TextStyle textStyle0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull String s, int v) {
        Paragraph paragraph0 = ParagraphKt.Paragraph-UdtVg6A$default(s, textStyle0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density0, fontFamily$Resolver0, CollectionsKt__CollectionsKt.emptyList(), null, v, false, 0x40, null);
        return IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraph0.getMinIntrinsicWidth()), TextDelegateKt.ceilToIntPx(paragraph0.getHeight()));
    }

    public static long computeSizeForDefaultText$default(TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, String s, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            s = "HHHHHHHHHH";
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        return TextFieldDelegateKt.computeSizeForDefaultText(textStyle0, density0, fontFamily$Resolver0, s, v);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final String getEmptyTextReplacement() [...] // 潜在的解密器
}

