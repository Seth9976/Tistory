package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A4\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\f\u001A,\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\u000EH\u0007\u001Ax\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\u0014\b\u0002\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00190\u00182\u0014\b\u0002\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u00190\u00182\b\b\u0002\u0010\b\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001Ap\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\u0014\b\u0002\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00190\u00182\u0014\b\u0002\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u00190\u00182\b\b\u0002\u0010\b\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\nH\u0007\u001Ap\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0014\b\u0002\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00190\u00182\u0014\b\u0002\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u00190\u00182\b\b\u0002\u0010\b\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u001F\u001A\u00020 H\u0007\u001A\f\u0010!\u001A\u00020\u0001*\u00020\u000EH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\""}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ParagraphKt {
    public static final int DefaultMaxLines = 0x7FFFFFFF;

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f) {
        return AndroidParagraph_androidKt.ActualParagraph--hBUhpc(paragraphIntrinsics0, v, z, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null));
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull String s, @NotNull TextStyle textStyle0, float f, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull List list0, @NotNull List list1, int v, boolean z) {
        return AndroidParagraph_androidKt.ActualParagraph-O3s9Psw(s, textStyle0, list0, list1, v, z, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), density0, fontFamily$Resolver0);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, int v, boolean z, float f, @NotNull Density density0, @NotNull ResourceLoader font$ResourceLoader0) {
        return AndroidParagraph_androidKt.ActualParagraph(s, textStyle0, list0, list1, v, z, f, density0, font$ResourceLoader0);
    }

    public static Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return ParagraphKt.Paragraph(paragraphIntrinsics0, v, z, f);
    }

    public static Paragraph Paragraph$default(String s, TextStyle textStyle0, float f, Density density0, Resolver fontFamily$Resolver0, List list0, List list1, int v, boolean z, int v1, Object object0) {
        List list2 = (v1 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        List list3 = (v1 & 0x40) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList();
        int v2 = (v1 & 0x80) == 0 ? v : 0x7FFFFFFF;
        return (v1 & 0x100) == 0 ? ParagraphKt.Paragraph(s, textStyle0, f, density0, fontFamily$Resolver0, list2, list3, v2, z) : ParagraphKt.Paragraph(s, textStyle0, f, density0, fontFamily$Resolver0, list2, list3, v2, false);
    }

    public static Paragraph Paragraph$default(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, Object object0) {
        List list2 = (v1 & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        List list3 = (v1 & 8) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList();
        int v2 = (v1 & 16) == 0 ? v : 0x7FFFFFFF;
        return (v1 & 0x20) == 0 ? ParagraphKt.Paragraph(s, textStyle0, list2, list3, v2, z, f, density0, font$ResourceLoader0) : ParagraphKt.Paragraph(s, textStyle0, list2, list3, v2, false, f, density0, font$ResourceLoader0);
    }

    @NotNull
    public static final Paragraph Paragraph-UdtVg6A(@NotNull String s, @NotNull TextStyle textStyle0, long v, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull List list0, @NotNull List list1, int v1, boolean z) {
        return AndroidParagraph_androidKt.ActualParagraph-O3s9Psw(s, textStyle0, list0, list1, v1, z, v, density0, fontFamily$Resolver0);
    }

    public static Paragraph Paragraph-UdtVg6A$default(String s, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, List list1, int v1, boolean z, int v2, Object object0) {
        List list2 = (v2 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        List list3 = (v2 & 0x40) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList();
        int v3 = (v2 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
        return (v2 & 0x100) == 0 ? ParagraphKt.Paragraph-UdtVg6A(s, textStyle0, v, density0, fontFamily$Resolver0, list2, list3, v3, z) : ParagraphKt.Paragraph-UdtVg6A(s, textStyle0, v, density0, fontFamily$Resolver0, list2, list3, v3, false);
    }

    @NotNull
    public static final Paragraph Paragraph-_EkL_-Y(@NotNull ParagraphIntrinsics paragraphIntrinsics0, long v, int v1, boolean z) {
        return AndroidParagraph_androidKt.ActualParagraph--hBUhpc(paragraphIntrinsics0, v1, z, v);
    }

    public static Paragraph Paragraph-_EkL_-Y$default(ParagraphIntrinsics paragraphIntrinsics0, long v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v2 & 8) != 0) {
            z = false;
        }
        return ParagraphKt.Paragraph-_EkL_-Y(paragraphIntrinsics0, v, v1, z);
    }

    public static final int ceilToInt(float f) {
        return (int)(((float)Math.ceil(f)));
    }
}

