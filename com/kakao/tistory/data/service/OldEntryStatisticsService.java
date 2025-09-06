package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00052\b\b\u0001\u0010\t\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\nJ<\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00052\b\b\u0001\u0010\t\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\nJ,\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\u0010\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\f2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H§@¢\u0006\u0002\u0010\u0013J<\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00052\b\b\u0001\u0010\t\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\nJ6\u0010\u0016\u001A\u00020\u00172\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00052\b\b\u0001\u0010\t\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/data/service/OldEntryStatisticsService;", "", "getRefererChannels", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "blogName", "", "entryId", "", "date", "granularity", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererEtc", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "getRefererKeywordInfo", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "keyword", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererKeywords", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererRanks", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "getTrends", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OldEntryStatisticsService {
    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/{date}/{granularity}/channels")
    Object getRefererChannels(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("date") String arg3, @NotNull @Path("granularity") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/{date}/{granularity}/topRef")
    Object getRefererEtc(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("date") String arg3, @NotNull @Path("granularity") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/refKeywords/{keyword}/engine")
    Object getRefererKeywordInfo(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("keyword") String arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/refKeywords")
    Object getRefererKeywords(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/{date}/{granularity}/ranks")
    Object getRefererRanks(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("date") String arg3, @NotNull @Path("granularity") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/statistics/{date}/{granularity}/totalAndTrends")
    Object getTrends(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("date") String arg3, @NotNull @Path("granularity") String arg4, @NotNull Continuation arg5);
}

