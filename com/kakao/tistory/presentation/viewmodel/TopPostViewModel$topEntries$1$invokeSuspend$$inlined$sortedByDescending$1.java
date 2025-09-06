package com.kakao.tistory.presentation.viewmodel;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import pd.c;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 TopPostViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/TopPostViewModel$topEntries$1\n*L\n1#1,328:1\n56#2,4:329\n*E\n"})
public final class TopPostViewModel.topEntries.1.invokeSuspend..inlined.sortedByDescending.1 implements Comparator {
    public final TopEntriesSortType a;

    public TopPostViewModel.topEntries.1.invokeSuspend..inlined.sortedByDescending.1(TopEntriesSortType topEntriesSortType0) {
        this.a = topEntriesSortType0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v;
        int[] arr_v = TopPostViewModel.topEntries.1.WhenMappings.$EnumSwitchMapping$0;
        switch(arr_v[this.a.ordinal()]) {
            case 1: {
                v = (int)((TopEntryItem)object1).getCount();
                break;
            }
            case 2: {
                v = ((TopEntryItem)object1).getCommentCount();
                break;
            }
            case 3: {
                v = ((TopEntryItem)object1).getLikeCount();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        Integer integer0 = v;
        switch(arr_v[this.a.ordinal()]) {
            case 1: {
                return c.compareValues(integer0, ((int)((TopEntryItem)object0).getCount()));
            }
            case 2: {
                return c.compareValues(integer0, ((TopEntryItem)object0).getCommentCount());
            }
            case 3: {
                return c.compareValues(integer0, ((TopEntryItem)object0).getLikeCount());
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

