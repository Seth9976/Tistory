package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Ar\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0012\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"canReuse", "", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutHelperKt {
    public static final boolean canReuse-7_7YC6M(@NotNull TextLayoutResult textLayoutResult0, @NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull List list0, int v, boolean z, int v1, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Resolver fontFamily$Resolver0, long v2) {
        TextLayoutInput textLayoutInput0 = textLayoutResult0.getLayoutInput();
        if(textLayoutResult0.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return false;
        }
        if(!Intrinsics.areEqual(textLayoutInput0.getText(), annotatedString0) || !textLayoutInput0.getStyle().hasSameLayoutAffectingAttributes(textStyle0) || !Intrinsics.areEqual(textLayoutInput0.getPlaceholders(), list0) || textLayoutInput0.getMaxLines() != v || textLayoutInput0.getSoftWrap() != z || !TextOverflow.equals-impl0(textLayoutInput0.getOverflow-gIe3tQ8(), v1) || !Intrinsics.areEqual(textLayoutInput0.getDensity(), density0) || textLayoutInput0.getLayoutDirection() != layoutDirection0 || !Intrinsics.areEqual(textLayoutInput0.getFontFamilyResolver(), fontFamily$Resolver0) || Constraints.getMinWidth-impl(v2) != Constraints.getMinWidth-impl(textLayoutInput0.getConstraints-msEJaDk())) {
            return false;
        }
        return z || TextOverflow.equals-impl0(v1, 2) ? Constraints.getMaxWidth-impl(v2) == Constraints.getMaxWidth-impl(textLayoutInput0.getConstraints-msEJaDk()) && Constraints.getMaxHeight-impl(v2) == Constraints.getMaxHeight-impl(textLayoutInput0.getConstraints-msEJaDk()) : true;
    }
}

