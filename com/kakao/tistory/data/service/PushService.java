package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J\u001E\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0006\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u000BJ,\u0010\f\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00052\b\b\u0003\u0010\r\u001A\u00020\u000EH§@¢\u0006\u0002\u0010\u000FJ\u0082\u0001\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00052\b\b\u0001\u0010\u0011\u001A\u00020\u00122\b\b\u0001\u0010\u0013\u001A\u00020\u00122\b\b\u0001\u0010\u0014\u001A\u00020\u00122\b\b\u0001\u0010\u0015\u001A\u00020\u00122\b\b\u0001\u0010\u0016\u001A\u00020\u00122\b\b\u0001\u0010\u0017\u001A\u00020\u00122\b\b\u0001\u0010\u0018\u001A\u00020\u00122\b\b\u0001\u0010\u0019\u001A\u00020\u00052\b\b\u0001\u0010\u001A\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/data/service/PushService;", "", "deletePushToken", "", "deviceId", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPushSetting", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/entity/PushSetting;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPushToken", "version", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putPushSetting", "enable", "", "comment", "invite", "subscription", "newEntry", "challenge", "etiquette", "etiquetteStart", "etiquetteFinish", "(Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PushService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object postPushToken$default(PushService pushService0, String s, String s1, int v, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPushToken");
            }
            if((v1 & 4) != 0) {
                v = 3;
            }
            return pushService0.postPushToken(s, s1, v, continuation0);
        }
    }

    @Nullable
    @FormUrlEncoded
    @HTTP(hasBody = true, method = "DELETE", path = "/app/v2/push/token")
    Object deletePushToken(@NotNull @Field("deviceId") String arg1, @NotNull @Field("token") String arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v3/push/setting")
    Object getPushSetting(@NotNull @Query("token") String arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v3/push/token")
    Object postPushToken(@NotNull @Field("deviceId") String arg1, @NotNull @Field("token") String arg2, @Field("version") int arg3, @NotNull Continuation arg4);

    @Nullable
    @FormUrlEncoded
    @PUT("/app/v3/push/setting")
    Object putPushSetting(@NotNull @Field("deviceId") String arg1, @NotNull @Field("token") String arg2, @Field("enable") boolean arg3, @Field("comment") boolean arg4, @Field("invite") boolean arg5, @Field("subscription") boolean arg6, @Field("newEntry") boolean arg7, @Field("challenge") boolean arg8, @Field("etiquette") boolean arg9, @NotNull @Field("etiquetteStart") String arg10, @NotNull @Field("etiquetteFinish") String arg11, @NotNull Continuation arg12);
}

