package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EditingBufferKt {
    public static final long updateRangeAfterDelete-pWDy79M(long v, long v1) {
        int v2 = TextRange.getMin-impl(v);
        int v3 = TextRange.getMax-impl(v);
        if(TextRange.intersects-5zc-tL8(v1, v)) {
            if(TextRange.contains-5zc-tL8(v1, v)) {
                v2 = TextRange.getMin-impl(v1);
                return TextRangeKt.TextRange(v2, v2);
            }
            if(TextRange.contains-5zc-tL8(v, v1)) {
                return TextRangeKt.TextRange(v2, v3 - TextRange.getLength-impl(v1));
            }
            return TextRange.contains-impl(v1, v2) ? TextRangeKt.TextRange(TextRange.getMin-impl(v1), v3 - TextRange.getLength-impl(v1)) : TextRangeKt.TextRange(v2, TextRange.getMin-impl(v1));
        }
        return v3 <= TextRange.getMin-impl(v1) ? TextRangeKt.TextRange(v2, v3) : TextRangeKt.TextRange(v2 - TextRange.getLength-impl(v1), v3 - TextRange.getLength-impl(v1));
    }
}

