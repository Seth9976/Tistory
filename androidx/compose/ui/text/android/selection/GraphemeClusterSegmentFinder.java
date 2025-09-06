package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H&J\u0010\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016J\u0010\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016J\u0010\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H&J\u0010\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016J\u0010\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "()V", "next", "", "offset", "nextEndBoundary", "nextStartBoundary", "previous", "previousEndBoundary", "previousStartBoundary", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public static final int $stable;

    public abstract int next(int arg1);

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int v) {
        return this.next(v);
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int v) {
        int v1 = this.next(v);
        if(v1 == -1) {
            return -1;
        }
        return this.next(v1) == -1 ? -1 : v1;
    }

    public abstract int previous(int arg1);

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int v) {
        int v1 = this.previous(v);
        if(v1 == -1) {
            return -1;
        }
        return this.previous(v1) == -1 ? -1 : v1;
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int v) {
        return this.previous(v);
    }
}

