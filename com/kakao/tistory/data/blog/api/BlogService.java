package com.kakao.tistory.data.blog.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ$\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ<\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\n\u001A\u00020\u000B2\b\b\u0001\u0010\u0016\u001A\u00020\u00172\b\b\u0003\u0010\u0018\u001A\u00020\u00172\b\b\u0003\u0010\u0019\u001A\u00020\u0017H§@¢\u0006\u0002\u0010\u001AJ2\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00142\b\b\u0001\u0010\n\u001A\u00020\u000B2\b\b\u0003\u0010\u0018\u001A\u00020\u00172\b\b\u0003\u0010\u0019\u001A\u00020\u0017H§@¢\u0006\u0002\u0010\u001DJ\u0018\u0010\u001E\u001A\u00020\u001F2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\u0018\u0010 \u001A\u00020!2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\u001E\u0010\"\u001A\b\u0012\u0004\u0012\u00020#0\b2\b\b\u0001\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\u0018\u0010$\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006%"}, d2 = {"Lcom/kakao/tistory/data/blog/api/BlogService;", "", "deleteBlockUser", "", "targetUserId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogInfo", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/kakao/tistory/domain/common/ItemListModel;", "Lcom/kakao/tistory/domain/blog/entity/Category;", "getChallenge", "", "Lcom/kakao/tistory/domain/blog/entity/Challenge;", "getEntryList", "Lcom/kakao/tistory/domain/common/PagingModel;", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "category", "", "currentPage", "resultSize", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeList", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererKeywords", "Lcom/kakao/tistory/domain/blog/entity/RefererKeywordResponse;", "getRefererLog", "Lcom/kakao/tistory/domain/blog/entity/RefererLogResponse;", "getTrend", "Lcom/kakao/tistory/domain/blog/entity/TrendResponse;", "postBlockUser", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getEntryList$default(BlogService blogService0, String s, int v, int v1, int v2, Continuation continuation0, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEntryList");
            }
            if((v3 & 4) != 0) {
                v1 = 1;
            }
            if((v3 & 8) != 0) {
                v2 = 20;
            }
            return blogService0.getEntryList(s, v, v1, v2, continuation0);
        }

        public static Object getNoticeList$default(BlogService blogService0, String s, int v, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticeList");
            }
            if((v2 & 2) != 0) {
                v = 1;
            }
            if((v2 & 4) != 0) {
                v1 = 20;
            }
            return blogService0.getNoticeList(s, v, v1, continuation0);
        }
    }

    @Nullable
    @DELETE("/app/v2/unblock/{targetUserId}")
    Object deleteBlockUser(@Path("targetUserId") long arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/blog/{blogName}/info")
    Object getBlogInfo(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/categories")
    Object getCategories(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/blog/{blogName}/challenge")
    Object getChallenge(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/posts")
    Object getEntryList(@NotNull @Path("blogName") String arg1, @Query("category") int arg2, @Query("page") int arg3, @Query("resultSize") int arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/notices")
    Object getNoticeList(@NotNull @Path("blogName") String arg1, @Query("page") int arg2, @Query("resultSize") int arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/refKeywords")
    Object getRefererKeywords(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/refLogs")
    Object getRefererLog(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/blog/{blogName}/trend")
    Object getTrend(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @POST("/app/v2/block/{targetUserId}")
    Object postBlockUser(@Path("targetUserId") long arg1, @NotNull Continuation arg2);
}

