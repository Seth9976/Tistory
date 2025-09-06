package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J;\u0010\t\u001A\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/paging/DistinctListsDiffDispatcher;", "", "T", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "Landroidx/paging/PlaceholderPaddedList;", "oldList", "newList", "", "dispatchDiff", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DistinctListsDiffDispatcher {
    @NotNull
    public static final DistinctListsDiffDispatcher INSTANCE;

    static {
        DistinctListsDiffDispatcher.INSTANCE = new DistinctListsDiffDispatcher();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void dispatchDiff(@NotNull ListUpdateCallback listUpdateCallback0, @NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull PlaceholderPaddedList placeholderPaddedList1) {
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "callback");
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "oldList");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        int v = Math.max(placeholderPaddedList0.getPlaceholdersBefore(), placeholderPaddedList1.getPlaceholdersBefore());
        int v1 = placeholderPaddedList0.getPlaceholdersBefore();
        int v2 = placeholderPaddedList0.getDataCount();
        int v3 = placeholderPaddedList1.getPlaceholdersBefore();
        int v4 = Math.min(v2 + v1, placeholderPaddedList1.getDataCount() + v3);
        int v5 = v4 - v;
        if(v5 > 0) {
            listUpdateCallback0.onRemoved(v, v5);
            listUpdateCallback0.onInserted(v, v5);
        }
        int v6 = Math.min(v, v4);
        int v7 = Math.max(v, v4);
        int v8 = c.coerceAtMost(placeholderPaddedList0.getPlaceholdersBefore(), placeholderPaddedList1.getSize());
        int v9 = placeholderPaddedList0.getPlaceholdersBefore();
        int v10 = c.coerceAtMost(placeholderPaddedList0.getDataCount() + v9, placeholderPaddedList1.getSize());
        DiffingChangePayload diffingChangePayload0 = DiffingChangePayload.ITEM_TO_PLACEHOLDER;
        int v11 = v6 - v8;
        if(v11 > 0) {
            listUpdateCallback0.onChanged(v8, v11, diffingChangePayload0);
        }
        int v12 = v10 - v7;
        if(v12 > 0) {
            listUpdateCallback0.onChanged(v7, v12, diffingChangePayload0);
        }
        int v13 = c.coerceAtMost(placeholderPaddedList1.getPlaceholdersBefore(), placeholderPaddedList0.getSize());
        int v14 = placeholderPaddedList1.getPlaceholdersBefore();
        int v15 = c.coerceAtMost(placeholderPaddedList1.getDataCount() + v14, placeholderPaddedList0.getSize());
        DiffingChangePayload diffingChangePayload1 = DiffingChangePayload.PLACEHOLDER_TO_ITEM;
        int v16 = v6 - v13;
        if(v16 > 0) {
            listUpdateCallback0.onChanged(v13, v16, diffingChangePayload1);
        }
        int v17 = v15 - v7;
        if(v17 > 0) {
            listUpdateCallback0.onChanged(v7, v17, diffingChangePayload1);
        }
        int v18 = placeholderPaddedList1.getSize() - placeholderPaddedList0.getSize();
        if(v18 > 0) {
            listUpdateCallback0.onInserted(placeholderPaddedList0.getSize(), v18);
            return;
        }
        if(v18 < 0) {
            listUpdateCallback0.onRemoved(placeholderPaddedList0.getSize() + v18, -v18);
        }
    }
}

