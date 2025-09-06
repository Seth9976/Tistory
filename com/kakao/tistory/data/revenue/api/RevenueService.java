package com.kakao.tistory.data.revenue.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J<\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\n\u001A\u00020\u00062\b\b\u0001\u0010\u000B\u001A\u00020\u00062\b\b\u0001\u0010\f\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\rJJ\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\n\u001A\u00020\u00062\b\b\u0001\u0010\u000B\u001A\u00020\u00062\n\b\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001A\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\n\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0014J\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J$\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00180\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/data/revenue/api/RevenueService;", "", "getRevenue", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueResponse;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevenueGraph", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "vendor", "granularity", "endDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevenueGraphDetailInfo", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "startDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevenueSummary", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevenueSupport", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSupport;", "getRevenueVendorList", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RevenueService {
    @Nullable
    @GET("/app/v3/revenue/{blogName}/current")
    Object getRevenue(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/revenue/{blogName}/trend")
    Object getRevenueGraph(@NotNull @Path("blogName") String arg1, @NotNull @Query("vendor") String arg2, @NotNull @Query("granularity") String arg3, @NotNull @Query("endDate") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v3/revenue/{blogName}/info")
    Object getRevenueGraphDetailInfo(@NotNull @Path("blogName") String arg1, @NotNull @Query("vendor") String arg2, @NotNull @Query("granularity") String arg3, @Nullable @Query("startDate") String arg4, @Nullable @Query("endDate") String arg5, @NotNull Continuation arg6);

    @Nullable
    @GET("/app/v3/revenue/{blogName}/summary")
    Object getRevenueSummary(@NotNull @Path("blogName") String arg1, @NotNull @Query("vendor") String arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v3/revenue/{blogName}/support")
    Object getRevenueSupport(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/revenue/{blogName}/status")
    Object getRevenueVendorList(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);
}

