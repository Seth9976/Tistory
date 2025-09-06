package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u0019\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"findParagraphEnd", "", "", "startIndex", "findParagraphStart", "getParagraphBoundary", "Landroidx/compose/ui/text/TextRange;", "index", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StringHelpersKt {
    public static final int findParagraphEnd(@NotNull CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        while(v < v1) {
            if(charSequence0.charAt(v) == 10) {
                return v;
            }
            ++v;
        }
        return charSequence0.length();
    }

    public static final int findParagraphStart(@NotNull CharSequence charSequence0, int v) {
        while(v > 0) {
            if(charSequence0.charAt(v - 1) == 10) {
                return v;
            }
            --v;
        }
        return 0;
    }

    public static final long getParagraphBoundary(@NotNull CharSequence charSequence0, int v) {
        return TextRangeKt.TextRange(StringHelpersKt.findParagraphStart(charSequence0, v), StringHelpersKt.findParagraphEnd(charSequence0, v));
    }
}

