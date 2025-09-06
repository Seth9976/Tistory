package com.kakao.tistory.domain.revenue.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ:\u0010\t\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000B0\n2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0007H&J@\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\n2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u00072\b\u0010\u0012\u001A\u0004\u0018\u00010\u00072\b\u0010\u000F\u001A\u0004\u0018\u00010\u0007H&J$\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\n2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0007H&J\u001C\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;", "", "getRevenueCurrent", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevenueGraph", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/Pager;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "vendor", "granularity", "endDate", "getRevenueGraphDetailInfo", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "startDate", "getRevenueSummary", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "getRevenueSupport", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSupport;", "getRevenueVendorList", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RevenueVendorRepository {
    @Nullable
    Object getRevenueCurrent(@NotNull String arg1, @NotNull Continuation arg2);

    @NotNull
    Flow getRevenueGraph(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4);

    @NotNull
    Flow getRevenueGraphDetailInfo(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @Nullable String arg4, @Nullable String arg5);

    @NotNull
    Flow getRevenueSummary(@NotNull String arg1, @NotNull String arg2);

    @Nullable
    Object getRevenueSupport(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRevenueVendorList(@NotNull String arg1, @NotNull Continuation arg2);
}

