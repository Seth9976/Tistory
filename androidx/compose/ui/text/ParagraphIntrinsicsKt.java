package androidx.compose.ui.text;

import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001AT\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0007\u001AR\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u0011¨\u0006\u0012"}, d2 = {"ParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ParagraphIntrinsicsKt {
    @Deprecated(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    @NotNull
    public static final ParagraphIntrinsics ParagraphIntrinsics(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, @NotNull Density density0, @NotNull ResourceLoader font$ResourceLoader0) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(s, textStyle0, list0, list1, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(font$ResourceLoader0));
    }

    @NotNull
    public static final ParagraphIntrinsics ParagraphIntrinsics(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(s, textStyle0, list0, list1, density0, fontFamily$Resolver0);
    }

    public static ParagraphIntrinsics ParagraphIntrinsics$default(String s, TextStyle textStyle0, List list0, List list1, Density density0, ResourceLoader font$ResourceLoader0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        return ParagraphIntrinsicsKt.ParagraphIntrinsics(s, textStyle0, list0, list1, density0, font$ResourceLoader0);
    }

    public static ParagraphIntrinsics ParagraphIntrinsics$default(String s, TextStyle textStyle0, List list0, List list1, Density density0, Resolver fontFamily$Resolver0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        return ParagraphIntrinsicsKt.ParagraphIntrinsics(s, textStyle0, list0, list1, density0, fontFamily$Resolver0);
    }
}

