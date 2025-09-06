package m0;

import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.WhenMappings;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.NoWhenBranchMatchedException;

public final class f1 {
    public static final long a(long v, OffsetMappingCalculator offsetMappingCalculator0) {
        long v1 = offsetMappingCalculator0.mapFromDest--jx7JFs(TextRange.getStart-impl(v));
        long v2 = TextRange.getCollapsed-impl(v) ? v1 : offsetMappingCalculator0.mapFromDest--jx7JFs(TextRange.getEnd-impl(v));
        int v3 = Math.min(TextRange.getMin-impl(v1), TextRange.getMin-impl(v2));
        int v4 = Math.max(TextRange.getMax-impl(v1), TextRange.getMax-impl(v2));
        return TextRange.getReversed-impl(v) ? TextRangeKt.TextRange(v4, v3) : TextRangeKt.TextRange(v3, v4);
    }

    public static long b(long v, OffsetMappingCalculator offsetMappingCalculator0, SelectionWedgeAffinity selectionWedgeAffinity0) {
        long v1 = offsetMappingCalculator0.mapFromSource--jx7JFs(TextRange.getStart-impl(v));
        long v2 = TextRange.getCollapsed-impl(v) ? v1 : offsetMappingCalculator0.mapFromSource--jx7JFs(TextRange.getEnd-impl(v));
        int v3 = Math.min(TextRange.getMin-impl(v1), TextRange.getMin-impl(v2));
        int v4 = Math.max(TextRange.getMax-impl(v1), TextRange.getMax-impl(v2));
        long v5 = TextRange.getReversed-impl(v) ? TextRangeKt.TextRange(v4, v3) : TextRangeKt.TextRange(v3, v4);
        if(TextRange.getCollapsed-impl(v) && !TextRange.getCollapsed-impl(v5)) {
            WedgeAffinity wedgeAffinity0 = selectionWedgeAffinity0 == null ? null : selectionWedgeAffinity0.getStartAffinity();
            switch((wedgeAffinity0 == null ? -1 : TransformedTextFieldState.Companion.WhenMappings.$EnumSwitchMapping$0[wedgeAffinity0.ordinal()])) {
                case -1: {
                    break;
                }
                case 1: {
                    return TextRangeKt.TextRange(TextRange.getStart-impl(v5));
                }
                case 2: {
                    return TextRangeKt.TextRange(TextRange.getEnd-impl(v5));
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return v5;
    }
}

