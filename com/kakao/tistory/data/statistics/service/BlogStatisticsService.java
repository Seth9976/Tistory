package com.kakao.tistory.data.statistics.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/data/statistics/service/BlogStatisticsService;", "", "getTopEntries", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/statistics/entity/TopEntryResponse;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "date", "granularity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogStatisticsService {
    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{startDate}/{granularity}/topEntries")
    Object getTopEntries(@NotNull @Path("blogName") String arg1, @NotNull @Path("startDate") String arg2, @NotNull @Path("granularity") String arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v3/blog/{blogName}/topEntries")
    Object getTopEntries(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);
}

