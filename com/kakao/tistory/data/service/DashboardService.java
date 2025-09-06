package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J$\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\n\b\u0003\u0010\u000B\u001A\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001A\u00020\u000E2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000F\u001A\u00020\u00102\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001A\u00020\u00122\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/service/DashboardService;", "", "getRecentPosts", "Lcom/kakao/tistory/data/model/HomeItem$RecentPost;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererKeywords", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeyword;", "getRefererLogs", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "sortItem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopMessage", "Lcom/kakao/tistory/data/model/HomeItem$TopMessage;", "getTopPosts", "Lcom/kakao/tistory/data/model/HomeItem$TopPost;", "getTrend", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DashboardService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getRefererLogs$default(DashboardService dashboardService0, String s, String s1, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRefererLogs");
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            return dashboardService0.getRefererLogs(s, s1, continuation0);
        }
    }

    @Nullable
    @GET("/app/v2/blog/{blogName}/recentPosts")
    Object getRecentPosts(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/refKeywords")
    Object getRefererKeywords(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/refLogs")
    Object getRefererLogs(@NotNull @Path("blogName") String arg1, @Nullable @Query("sortType") String arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/topMessage")
    Object getTopMessage(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/topPosts")
    Object getTopPosts(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/trend")
    Object getTrend(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);
}

