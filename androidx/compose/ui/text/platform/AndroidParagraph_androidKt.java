package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A2\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001Ar\u0010\u0000\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0012\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u00112\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001Ah\u0010\u0000\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0012\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u00112\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001FH\u0001\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"ActualParagraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "ActualParagraph--hBUhpc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;IZJ)Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ActualParagraph-O3s9Psw", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/Paragraph;", "width", "", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "AndroidParagraph_androidKt")
public final class AndroidParagraph_androidKt {
    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @NotNull
    public static final Paragraph ActualParagraph(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, int v, boolean z, float f, @NotNull Density density0, @NotNull ResourceLoader font$ResourceLoader0) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(font$ResourceLoader0), density0), v, z, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), null);
    }

    @NotNull
    public static final Paragraph ActualParagraph--hBUhpc(@NotNull ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, long v1) {
        Intrinsics.checkNotNull(paragraphIntrinsics0, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph(((AndroidParagraphIntrinsics)paragraphIntrinsics0), v, z, v1, null);
    }

    @NotNull
    public static final Paragraph ActualParagraph-O3s9Psw(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, int v, boolean z, long v1, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0), v, z, v1, null);
    }
}

