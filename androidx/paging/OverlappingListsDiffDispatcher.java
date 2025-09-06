package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s4.f0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rJ?\u0010\u000B\u001A\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "T", "Landroidx/paging/PlaceholderPaddedList;", "oldList", "newList", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "Landroidx/paging/PlaceholderPaddedDiffResult;", "diffResult", "", "dispatchDiff", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PlaceholderPaddedDiffResult;)V", "s4/f0", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OverlappingListsDiffDispatcher {
    @NotNull
    public static final OverlappingListsDiffDispatcher INSTANCE;

    static {
        OverlappingListsDiffDispatcher.INSTANCE = new OverlappingListsDiffDispatcher();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void dispatchDiff(@NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull PlaceholderPaddedList placeholderPaddedList1, @NotNull ListUpdateCallback listUpdateCallback0, @NotNull PlaceholderPaddedDiffResult placeholderPaddedDiffResult0) {
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "oldList");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "callback");
        Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult0, "diffResult");
        f0 f00 = new f0(listUpdateCallback0, placeholderPaddedList0, placeholderPaddedList1);
        placeholderPaddedDiffResult0.getDiff().dispatchUpdatesTo(f00);
        int v = Math.min(placeholderPaddedList0.getPlaceholdersBefore(), f00.d);
        int v1 = placeholderPaddedList1.getPlaceholdersBefore() - f00.d;
        boolean z = false;
        if(v1 > 0) {
            if(v > 0) {
                listUpdateCallback0.onChanged(0, v, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            listUpdateCallback0.onInserted(0, v1);
        }
        else if(v1 < 0) {
            listUpdateCallback0.onRemoved(0, -v1);
            int v2 = v + v1;
            if(v2 > 0) {
                listUpdateCallback0.onChanged(0, v2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
        }
        f00.d = placeholderPaddedList1.getPlaceholdersBefore();
        int v3 = Math.min(placeholderPaddedList0.getPlaceholdersAfter(), f00.e);
        int v4 = placeholderPaddedList1.getPlaceholdersAfter() - f00.e;
        int v5 = f00.d + f00.f + f00.e;
        int v6 = v5 - v3;
        if(v6 != placeholderPaddedList0.getSize() - v3) {
            z = true;
        }
        if(v4 > 0) {
            listUpdateCallback0.onInserted(v5, v4);
        }
        else if(v4 < 0) {
            listUpdateCallback0.onRemoved(v5 + v4, -v4);
            v3 += v4;
        }
        if(v3 > 0 && z) {
            listUpdateCallback0.onChanged(v6, v3, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
        }
        f00.e = placeholderPaddedList1.getPlaceholdersAfter();
    }
}

