package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.domain.entity.TrendItem;
import com.kakao.tistory.presentation.common.graph.BarGraphItem;
import com.kakao.tistory.presentation.common.graph.StatisticsBarGraphValue;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsTrendViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsTrendViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTrendViewHolderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n*S KotlinDebug\n*F\n+ 1 StatisticsTrendViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTrendViewHolderKt\n*L\n277#1:289\n277#1:290,3\n*E\n"})
public final class StatisticsTrendViewHolderKt {
    public static final List access$toBarGraphItem(List list0, StatisticsViewModel statisticsViewModel0) {
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            String s = statisticsViewModel0.getDateTimeForBarGraph("");
            String s1 = statisticsViewModel0.getDateTimeForBarGraphSub(((TrendItem)object0));
            Long long0 = ((TrendItem)object0).getSearchEngine();
            float f = 0.0f;
            float f1 = long0 == null ? 0.0f : ((float)(((long)long0)));
            Long long1 = ((TrendItem)object0).getSns();
            float f2 = long1 == null ? 0.0f : ((float)(((long)long1)));
            Long long2 = ((TrendItem)object0).getEtc();
            if(long2 != null) {
                f = (float)(((long)long2));
            }
            ((ArrayList)list1).add(new BarGraphItem(s, s1, null, new StatisticsBarGraphValue(f1, f2, f), 4, null));
        }
        return list1;
    }
}

