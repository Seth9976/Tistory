package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000E\u0010\u0002\u001A\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\nH§@¢\u0006\u0002\u0010\u000BJ\"\u0010\f\u001A\u00020\r2\b\b\u0001\u0010\u000E\u001A\u00020\n2\b\b\u0001\u0010\u000F\u001A\u00020\nH§@¢\u0006\u0002\u0010\u0010JB\u0010\u0011\u001A\u00020\r2\b\b\u0001\u0010\u0012\u001A\u00020\n2\b\b\u0001\u0010\u0013\u001A\u00020\u00142\b\b\u0001\u0010\u0015\u001A\u00020\n2\b\b\u0001\u0010\u0016\u001A\u00020\u00142\n\b\u0001\u0010\u0017\u001A\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u0018J\u000E\u0010\u0019\u001A\u00020\rH§@¢\u0006\u0002\u0010\u0004J\u000E\u0010\u001A\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u001A\u0010\u001B\u001A\u00020\u00032\n\b\u0001\u0010\u001C\u001A\u0004\u0018\u00010\u001DH§@¢\u0006\u0002\u0010\u001EJ\u000E\u0010\u001F\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0004JB\u0010 \u001A\u00020!2\b\b\u0001\u0010\u0012\u001A\u00020\n2\b\b\u0001\u0010\u0013\u001A\u00020\u00142\b\b\u0001\u0010\u0015\u001A\u00020\n2\b\b\u0001\u0010\u0016\u001A\u00020\u00142\n\b\u0001\u0010\u0017\u001A\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u0018J\u0018\u0010\"\u001A\u00020#2\b\b\u0001\u0010\u0012\u001A\u00020\nH§@¢\u0006\u0002\u0010\u000BJ\u001A\u0010$\u001A\u00020%2\n\b\u0001\u0010&\u001A\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000BJ\u0018\u0010\'\u001A\u00020(2\b\b\u0001\u0010)\u001A\u00020\u0014H§@¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"Lcom/kakao/tistory/data/service/AccountService;", "", "deleteProfileImage", "Lcom/kakao/tistory/domain/entity/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leave", "", "postCheckNickname", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "nickname", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLogin", "Lcom/kakao/tistory/domain/entity/Account;", "loginId", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginByKakao", "accessToken", "accessTokenExpiresAt", "", "refreshToken", "refreshTokenExpiresAt", "scope", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginByToken", "postLogout", "postProfileImage", "logo", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSendingResetPasswordEmail", "postTransfer", "Lcom/kakao/tistory/domain/entity/common/EmptyModel;", "postTransferCheck", "Lcom/kakao/android/base/model/ErrorModel;", "postWebSession", "Lcom/kakao/tistory/data/model/WebSession;", "session", "putChangeDefaultBlog", "Lcom/kakao/tistory/domain/entity/Blog;", "blogId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AccountService {
    @Nullable
    @DELETE("/app/v2/user/profile")
    Object deleteProfileImage(@NotNull Continuation arg1);

    @Nullable
    @DELETE("/app/v2/quit")
    Object leave(@NotNull Continuation arg1);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/user/checkName")
    Object postCheckNickname(@NotNull @Field("name") String arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/auth/login")
    Object postLogin(@NotNull @Field("loginId") String arg1, @NotNull @Field("password") String arg2, @NotNull Continuation arg3);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/auth/kakao")
    Object postLoginByKakao(@NotNull @Field("access_token") String arg1, @Field("expires_at") long arg2, @NotNull @Field("refresh_token") String arg3, @Field("refresh_token_expires_at") long arg4, @Nullable @Field("scope") String arg5, @NotNull Continuation arg6);

    @Nullable
    @POST("/app/v2/auth/loginByToken")
    Object postLoginByToken(@NotNull Continuation arg1);

    @Nullable
    @POST("/app/v2/auth/logout")
    Object postLogout(@NotNull Continuation arg1);

    @Nullable
    @Multipart
    @POST("/app/v2/user/profile")
    Object postProfileImage(@Nullable @Part okhttp3.MultipartBody.Part arg1, @NotNull Continuation arg2);

    @Nullable
    @POST("/app/v2/user/sendingResetPasswordEmail")
    Object postSendingResetPasswordEmail(@NotNull Continuation arg1);

    @Nullable
    @FormUrlEncoded
    @POST("app/v2/user/transfer")
    Object postTransfer(@NotNull @Field("access_token") String arg1, @Field("expires_at") long arg2, @NotNull @Field("refresh_token") String arg3, @Field("refresh_token_expires_at") long arg4, @Nullable @Field("scope") String arg5, @NotNull Continuation arg6);

    @Nullable
    @FormUrlEncoded
    @POST("app/v2/user/transfer/check")
    Object postTransferCheck(@NotNull @Field("access_token") String arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/auth/session")
    Object postWebSession(@Nullable @Field("session") String arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @PUT("/app/v2/user/defaultBlog")
    Object putChangeDefaultBlog(@Field("blogId") long arg1, @NotNull Continuation arg2);
}

