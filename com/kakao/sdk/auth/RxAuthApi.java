package com.kakao.sdk.auth;

import com.kakao.sdk.common.KakaoSdk;
import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u0006H\'JP\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0003\u0010\u0005\u001A\u00020\u00062\n\b\u0001\u0010\n\u001A\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000B\u001A\u00020\u00062\n\b\u0003\u0010\f\u001A\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001A\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u000E\u001A\u00020\u0006H\'¨\u0006\u000F"}, d2 = {"Lcom/kakao/sdk/auth/RxAuthApi;", "", "agt", "Lio/reactivex/Single;", "Lcom/kakao/sdk/auth/model/AgtResponse;", "clientId", "", "accessToken", "issueAccessToken", "Lcom/kakao/sdk/auth/model/AccessTokenResponse;", "redirectUri", "androidKeyHash", "authCode", "refreshToken", "grantType", "auth-rx_release"}, k = 1, mv = {1, 1, 15})
public interface RxAuthApi {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static Single agt$default(RxAuthApi rxAuthApi0, String s, String s1, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: agt");
            }
            if((v & 1) != 0) {
                s = KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey();
            }
            return rxAuthApi0.agt(s, s1);
        }

        public static Single issueAccessToken$default(RxAuthApi rxAuthApi0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueAccessToken");
            }
            if((v & 1) != 0) {
                s = KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey();
            }
            if((v & 0x20) != 0) {
                s5 = "authorization_code";
            }
            return rxAuthApi0.issueAccessToken(s, s1, s2, ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), s5);
        }
    }

    @NotNull
    @FormUrlEncoded
    @POST("api/agt")
    Single agt(@NotNull @Field("client_id") String arg1, @NotNull @Field("access_token") String arg2);

    @NotNull
    @FormUrlEncoded
    @POST("oauth/token")
    Single issueAccessToken(@NotNull @Field("client_id") String arg1, @Nullable @Field("redirect_uri") String arg2, @NotNull @Field("android_key_hash") String arg3, @Nullable @Field("code") String arg4, @Nullable @Field("refresh_token") String arg5, @NotNull @Field("grant_type") String arg6);
}

