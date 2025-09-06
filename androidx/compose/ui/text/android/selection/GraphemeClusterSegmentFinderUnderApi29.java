package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "offset", "previous", "(I)I", "next", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    public final BreakIterator a;

    public GraphemeClusterSegmentFinderUnderApi29(@NotNull CharSequence charSequence0) {
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(charSequence0.toString());
        this.a = breakIterator0;
    }

    @Override  // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int v) {
        return this.a.following(v);
    }

    @Override  // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int v) {
        return this.a.preceding(v);
    }
}

