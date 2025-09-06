package com.kakao.tistory.domain.statistics.usecase;

import com.kakao.tistory.domain.statistics.repository.StatisticsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B0\n2\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesUseCase;", "", "Lcom/kakao/tistory/domain/statistics/repository/StatisticsRepository;", "statisticsRepository", "<init>", "(Lcom/kakao/tistory/domain/statistics/repository/StatisticsRepository;)V", "", "blogName", "date", "granularity", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetTopEntriesUseCase {
    public final StatisticsRepository a;

    @Inject
    public GetTopEntriesUseCase(@NotNull StatisticsRepository statisticsRepository0) {
        Intrinsics.checkNotNullParameter(statisticsRepository0, "statisticsRepository");
        super();
        this.a = statisticsRepository0;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object invoke(@NotNull String s, @Nullable String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        return s1 == null || p.isBlank(s1) || s2 == null || p.isBlank(s2) ? this.a.getTopEntriesLastWeek(s, continuation0) : this.a.getTopEntriesByPeriod(s, s1, s2, continuation0);
    }

    public static Object invoke$default(GetTopEntriesUseCase getTopEntriesUseCase0, String s, String s1, String s2, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        return getTopEntriesUseCase0.invoke(s, s1, s2, continuation0);
    }
}

