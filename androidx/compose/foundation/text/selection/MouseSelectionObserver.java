package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001A\u00020\u000BH&J\u001A\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000FJ\"\u0010\u0012\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "", "onDrag", "", "dragPosition", "Landroidx/compose/ui/geometry/Offset;", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDragDone", "", "onExtend", "downPosition", "onExtend-k-4lQ0M", "(J)Z", "onExtendDrag", "onExtendDrag-k-4lQ0M", "onStart", "onStart-3MmeM6k", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface MouseSelectionObserver {
    boolean onDrag-3MmeM6k(long arg1, @NotNull SelectionAdjustment arg2);

    void onDragDone();

    boolean onExtend-k-4lQ0M(long arg1);

    boolean onExtendDrag-k-4lQ0M(long arg1);

    boolean onStart-3MmeM6k(long arg1, @NotNull SelectionAdjustment arg2);
}

