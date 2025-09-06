package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001A\u00020\u00032\b\b\u0001\u0010\b\u001A\u00020\u00052\b\b\u0001\u0010\t\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0002\u0010\u000EJ\u000E\u0010\u000F\u001A\u00020\u0003H§@¢\u0006\u0002\u0010\u000EJ,\u0010\u0010\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0011\u001A\u00020\u00052\b\b\u0001\u0010\u0012\u001A\u00020\u0013H§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/data/service/MemberService;", "", "checkDuplicateEmail", "", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkVerifyBlogName", "blogName", "prevRecommendations", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendedBlogName", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinTalkChannel", "postMemberJoin", "blogAddress", "agreeTalkChannel", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MemberService {
    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/member/join/check/email")
    Object checkDuplicateEmail(@NotNull @Field("access_token") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/member/join/check/blogName")
    Object checkVerifyBlogName(@NotNull @Query("title") String arg1, @NotNull @Query("exclude") String arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v3/member/join/recommendedBlogName")
    Object getRecommendedBlogName(@NotNull Continuation arg1);

    @Nullable
    @POST("/app/v2/story/talk-channel/add")
    Object joinTalkChannel(@NotNull Continuation arg1);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/member/join/done")
    Object postMemberJoin(@NotNull @Field("access_token") String arg1, @NotNull @Field("blog_name") String arg2, @Field("agree_talk_channel") boolean arg3, @NotNull Continuation arg4);
}

