package com.kakao.tistory.domain.revenue.entity;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "a", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "getGraphDummy", "()Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "graphDummy", "domain_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueGraph.kt\ncom/kakao/tistory/domain/revenue/entity/RevenueGraphKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 RevenueGraph.kt\ncom/kakao/tistory/domain/revenue/entity/RevenueGraphKt\n*L\n24#1:60\n24#1:61,3\n*E\n"})
public final class RevenueGraphKt {
    public static final RevenueTrendGraph a;

    static {
        IntRange intRange0 = new IntRange(0, 200);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            ((IntIterator)iterator0).nextInt();
            arrayList0.add(new RevenueGraph("2024-07-10", "2024-07-10", 0.0, 0));
        }
        RevenueGraphKt.a = new RevenueTrendGraph("2024-07-15T17:43:35+09:00", CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.toMutableList(arrayList0), CollectionsKt__CollectionsKt.mutableListOf(new RevenueGraph[]{new RevenueGraph("2024-07-14", "2024-07-14", 0.0, 0), new RevenueGraph("2024-07-13", "2024-07-13", 100.0, 20), new RevenueGraph("2024-07-12", "2024-07-12", 320.0, 50), new RevenueGraph("2024-07-11", "2024-07-11", 20.0, 80)})));
    }

    @NotNull
    public static final RevenueTrendGraph getGraphDummy() {
        return RevenueGraphKt.a;
    }
}

