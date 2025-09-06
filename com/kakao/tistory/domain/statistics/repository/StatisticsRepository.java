package com.kakao.tistory.domain.statistics.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\nJ\"\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/domain/statistics/repository/StatisticsRepository;", "", "getTopEntriesByPeriod", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "blogName", "", "date", "granularity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopEntriesLastWeek", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface StatisticsRepository {
    @Nullable
    Object getTopEntriesByPeriod(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object getTopEntriesLastWeek(@NotNull String arg1, @NotNull Continuation arg2);
}

