package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001Av\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u00102\u0012\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A\f\u0010\u0018\u001A\u00020\u0010*\u00020\u0019H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "ceilToIntPx", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n26#2:350\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n304#1:350\n*E\n"})
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        return Math.round(((float)Math.ceil(f)));
    }

    // 去混淆评级： 中等(50)
    @NotNull
    public static final TextDelegate updateTextDelegate-rm0N8CA(@NotNull TextDelegate textDelegate0, @NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2, @NotNull List list0) {
        return !Intrinsics.areEqual(textDelegate0.getText(), annotatedString0) || !Intrinsics.areEqual(textDelegate0.getStyle(), textStyle0) || textDelegate0.getSoftWrap() != z || !TextOverflow.equals-impl0(textDelegate0.getOverflow-gIe3tQ8(), v) || textDelegate0.getMaxLines() != v1 || textDelegate0.getMinLines() != v2 || !Intrinsics.areEqual(textDelegate0.getDensity(), density0) || !Intrinsics.areEqual(textDelegate0.getPlaceholders(), list0) || textDelegate0.getFontFamilyResolver() != fontFamily$Resolver0 ? new TextDelegate(annotatedString0, textStyle0, v1, v2, z, v, density0, fontFamily$Resolver0, list0, null) : textDelegate0;
    }

    public static TextDelegate updateTextDelegate-rm0N8CA$default(TextDelegate textDelegate0, AnnotatedString annotatedString0, TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2, List list0, int v3, Object object0) {
        boolean z1 = (v3 & 0x20) == 0 ? z : true;
        int v4 = (v3 & 0x40) == 0 ? v : 1;
        int v5 = (v3 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
        return (v3 & 0x100) == 0 ? TextDelegateKt.updateTextDelegate-rm0N8CA(textDelegate0, annotatedString0, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, v2, list0) : TextDelegateKt.updateTextDelegate-rm0N8CA(textDelegate0, annotatedString0, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, 1, list0);
    }
}

