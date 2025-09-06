package androidx.compose.ui.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"findFollowingBreak", "", "", "index", "findPrecedingBreak", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(@NotNull String s, int v) {
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.following(v);
    }

    public static final int findPrecedingBreak(@NotNull String s, int v) {
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.preceding(v);
    }
}

