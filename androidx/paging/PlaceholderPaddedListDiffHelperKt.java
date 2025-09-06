package androidx.paging;

import androidx.recyclerview.widget.DiffUtil.Callback;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A8\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000\u001A:\u0010\b\u001A\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\n\u001A\u00020\u000B2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\f\u001A\u00020\u0001H\u0000\u001A,\u0010\r\u001A\u00020\u000E*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\f\u001A\u00020\u00012\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000F\u001A\u00020\u000EH\u0000¨\u0006\u0010"}, d2 = {"computeDiff", "Landroidx/paging/PlaceholderPaddedDiffResult;", "T", "", "Landroidx/paging/PlaceholderPaddedList;", "newList", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "dispatchDiff", "", "callback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "diffResult", "transformAnchorIndex", "", "oldPosition", "paging-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlaceholderPaddedListDiffHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/PlaceholderPaddedListDiffHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n1747#2,3:533\n*S KotlinDebug\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/PlaceholderPaddedListDiffHelperKt\n*L\n84#1:533,3\n*E\n"})
public final class PlaceholderPaddedListDiffHelperKt {
    @NotNull
    public static final PlaceholderPaddedDiffResult computeDiff(@NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull PlaceholderPaddedList placeholderPaddedList1, @NotNull ItemCallback diffUtil$ItemCallback0) {
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "<this>");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        DiffResult diffUtil$DiffResult0 = DiffUtil.calculateDiff(new Callback() {
            @Override  // androidx.recyclerview.widget.DiffUtil$Callback
            public boolean areContentsTheSame(int v, int v1) {
                Object object0 = placeholderPaddedList0.getItem(v);
                Object object1 = placeholderPaddedList1.getItem(v1);
                return object0 == object1 ? true : diffUtil$ItemCallback0.areContentsTheSame(object0, object1);
            }

            @Override  // androidx.recyclerview.widget.DiffUtil$Callback
            public boolean areItemsTheSame(int v, int v1) {
                Object object0 = placeholderPaddedList0.getItem(v);
                Object object1 = placeholderPaddedList1.getItem(v1);
                return object0 == object1 ? true : diffUtil$ItemCallback0.areItemsTheSame(object0, object1);
            }

            @Override  // androidx.recyclerview.widget.DiffUtil$Callback
            @Nullable
            public Object getChangePayload(int v, int v1) {
                return placeholderPaddedList0.getItem(v) == placeholderPaddedList1.getItem(v1) ? true : null;
            }

            @Override  // androidx.recyclerview.widget.DiffUtil$Callback
            public int getNewListSize() {
                return placeholderPaddedList1.getDataCount();
            }

            @Override  // androidx.recyclerview.widget.DiffUtil$Callback
            public int getOldListSize() {
                return placeholderPaddedList0.getDataCount();
            }
        }, true);
        Intrinsics.checkNotNullExpressionValue(diffUtil$DiffResult0, "PlaceholderPaddedList<T>…    },\n        true\n    )");
        IntRange intRange0 = c.until(0, placeholderPaddedList0.getDataCount());
        if(!(intRange0 instanceof Collection) || !((Collection)intRange0).isEmpty()) {
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                if(diffUtil$DiffResult0.convertOldPositionToNew(((IntIterator)iterator0).nextInt()) != -1) {
                    return new PlaceholderPaddedDiffResult(diffUtil$DiffResult0, true);
                }
                if(false) {
                    break;
                }
            }
        }
        return new PlaceholderPaddedDiffResult(diffUtil$DiffResult0, false);
    }

    public static final void dispatchDiff(@NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull ListUpdateCallback listUpdateCallback0, @NotNull PlaceholderPaddedList placeholderPaddedList1, @NotNull PlaceholderPaddedDiffResult placeholderPaddedDiffResult0) {
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "<this>");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "callback");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult0, "diffResult");
        if(placeholderPaddedDiffResult0.getHasOverlap()) {
            OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(placeholderPaddedList0, placeholderPaddedList1, listUpdateCallback0, placeholderPaddedDiffResult0);
            return;
        }
        DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(listUpdateCallback0, placeholderPaddedList0, placeholderPaddedList1);
    }

    public static final int transformAnchorIndex(@NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull PlaceholderPaddedDiffResult placeholderPaddedDiffResult0, @NotNull PlaceholderPaddedList placeholderPaddedList1, int v) {
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "<this>");
        Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult0, "diffResult");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        if(!placeholderPaddedDiffResult0.getHasOverlap()) {
            return c.coerceIn(v, c.until(0, placeholderPaddedList1.getSize()));
        }
        int v1 = v - placeholderPaddedList0.getPlaceholdersBefore();
        if(v1 >= 0 && v1 < placeholderPaddedList0.getDataCount()) {
            for(int v2 = 0; true; ++v2) {
                int v3 = 1;
                if(v2 >= 30) {
                    break;
                }
                if(v2 % 2 == 1) {
                    v3 = -1;
                }
                int v4 = v2 / 2 * v3 + v1;
                if(v4 >= 0 && v4 < placeholderPaddedList0.getDataCount()) {
                    int v5 = placeholderPaddedDiffResult0.getDiff().convertOldPositionToNew(v4);
                    if(v5 != -1) {
                        return placeholderPaddedList1.getPlaceholdersBefore() + v5;
                    }
                }
            }
        }
        return c.coerceIn(v, c.until(0, placeholderPaddedList1.getSize()));
    }
}

