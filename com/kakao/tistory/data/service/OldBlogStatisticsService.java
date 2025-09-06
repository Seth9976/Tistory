package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\nJB\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\nJB\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\f0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\nJB\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\nJ2\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\f2\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0014J<\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\b\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/data/service/OldBlogStatisticsService;", "", "getRefererChannels", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "blogName", "", "date", "granularity", "metric", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererEtc", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "getRefererKeywords", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "getRefererRanks", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "getTopPosts", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrends", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OldBlogStatisticsService {
    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{startDate}/{granularity}/channels")
    Object getRefererChannels(@NotNull @Path("blogName") String arg1, @NotNull @Path("startDate") String arg2, @NotNull @Path("granularity") String arg3, @NotNull @Query("metric") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{date}/{granularity}/topRef")
    Object getRefererEtc(@NotNull @Path("blogName") String arg1, @NotNull @Path("date") String arg2, @NotNull @Path("granularity") String arg3, @NotNull @Query("metric") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{date}/{granularity}/refKeywords")
    Object getRefererKeywords(@NotNull @Path("blogName") String arg1, @NotNull @Path("date") String arg2, @NotNull @Path("granularity") String arg3, @NotNull @Query("metric") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{startDate}/{granularity}/ranks")
    Object getRefererRanks(@NotNull @Path("blogName") String arg1, @NotNull @Path("startDate") String arg2, @NotNull @Path("granularity") String arg3, @NotNull @Query("metric") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/statistics/{date}/{granularity}/topPosts")
    Object getTopPosts(@NotNull @Path("blogName") String arg1, @NotNull @Path("date") String arg2, @NotNull @Path("granularity") String arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v3/blog/{blogName}/statistics/{startDate}/{granularity}/totalAndTrends")
    Object getTrends(@NotNull @Path("blogName") String arg1, @NotNull @Path("startDate") String arg2, @NotNull @Path("granularity") String arg3, @NotNull @Query("metric") String arg4, @NotNull Continuation arg5);
}

