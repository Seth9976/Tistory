package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", "offset", "getWordStart", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class WordBoundary_androidKt {
    public static final int getWordEnd(@NotNull WordIterator wordIterator0, int v) {
        int v1 = wordIterator0.isAfterPunctuation(wordIterator0.nextBoundary(v)) ? wordIterator0.getPunctuationEnd(v) : wordIterator0.getNextWordEndOnTwoWordBoundary(v);
        return v1 == -1 ? v : v1;
    }

    public static final int getWordStart(@NotNull WordIterator wordIterator0, int v) {
        int v1 = wordIterator0.isOnPunctuation(wordIterator0.prevBoundary(v)) ? wordIterator0.getPunctuationBeginning(v) : wordIterator0.getPrevWordBeginningOnTwoWordsBoundary(v);
        return v1 == -1 ? v : v1;
    }
}

