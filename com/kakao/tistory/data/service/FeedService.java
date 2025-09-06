package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000E\u0010\u0007\u001A\u00020\u0003H§@¢\u0006\u0002\u0010\bJB\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\n\b\u0001\u0010\f\u001A\u0004\u0018\u00010\u00052\n\b\u0001\u0010\r\u001A\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0003\u0010\u0010\u001A\u00020\u000FH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/service/FeedService;", "", "getBlogFollowerCount", "Lcom/kakao/tistory/domain/entity/common/Count;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogFollowingCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeed", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "fromDateTime", "toDateTime", "pivot", "", "resultSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface FeedService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getFeed$default(FeedService feedService0, String s, String s1, Integer integer0, int v, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeed");
            }
            if((v1 & 8) != 0) {
                v = 20;
            }
            return feedService0.getFeed(s, s1, integer0, v, continuation0);
        }
    }

    @Nullable
    @GET("/app/v2/feed/blog/{blogName}/followerCount")
    Object getBlogFollowerCount(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/feed/followingCount")
    Object getBlogFollowingCount(@NotNull Continuation arg1);

    @Nullable
    @GET("/app/v2/feed/posts")
    Object getFeed(@Nullable @Query("from") String arg1, @Nullable @Query("to") String arg2, @Nullable @Query("pivot") Integer arg3, @Query("resultSize") int arg4, @NotNull Continuation arg5);
}

