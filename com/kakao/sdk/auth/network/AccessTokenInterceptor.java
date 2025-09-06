package com.kakao.sdk.auth.network;

import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Lcom/kakao/sdk/auth/network/AccessTokenInterceptor;", "Lokhttp3/Interceptor;", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "Lcom/kakao/sdk/auth/AuthApiClient;", "authApiClient", "<init>", "(Lcom/kakao/sdk/auth/TokenManagerProvider;Lcom/kakao/sdk/auth/AuthApiClient;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class AccessTokenInterceptor implements Interceptor {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/sdk/auth/network/AccessTokenInterceptor$Companion;", "", "Lokhttp3/Request;", "request", "", "accessToken", "requestWithAuthorization", "(Lokhttp3/Request;Ljava/lang/String;)Lokhttp3/Request;", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Request requestWithAuthorization(@NotNull Request request0, @NotNull String s) {
            Intrinsics.checkParameterIsNotNull(request0, "request");
            Intrinsics.checkParameterIsNotNull(s, "accessToken");
            Request request1 = request0.newBuilder().removeHeader("Authorization").addHeader("Authorization", "Bearer " + s).build();
            Intrinsics.checkExpressionValueIsNotNull(request1, "request.newBuilder()\n   …\n                .build()");
            return request1;
        }
    }

    public static final Companion Companion;
    public final TokenManagerProvider a;
    public final AuthApiClient b;

    static {
        AccessTokenInterceptor.Companion = new Companion(null);
    }

    public AccessTokenInterceptor() {
        this(null, null, 3, null);
    }

    public AccessTokenInterceptor(@NotNull TokenManagerProvider tokenManagerProvider0, @NotNull AuthApiClient authApiClient0) {
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        Intrinsics.checkParameterIsNotNull(authApiClient0, "authApiClient");
        super();
        this.a = tokenManagerProvider0;
        this.b = authApiClient0;
    }

    public AccessTokenInterceptor(TokenManagerProvider tokenManagerProvider0, AuthApiClient authApiClient0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        if((v & 2) != 0) {
            authApiClient0 = AuthApiClient.Companion.getInstance();
        }
        this(tokenManagerProvider0, authApiClient0);
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) {
        Request request1;
        Intrinsics.checkParameterIsNotNull(interceptor$Chain0, "chain");
        OAuthToken oAuthToken0 = this.a.getManager().getToken();
        ApiErrorCause apiErrorCause0 = null;
        String s = oAuthToken0 == null ? null : oAuthToken0.getAccessToken();
        if(s == null) {
            request1 = interceptor$Chain0.request();
        }
        else {
            Request request0 = interceptor$Chain0.request();
            Intrinsics.checkExpressionValueIsNotNull(request0, "chain.request()");
            request1 = AccessTokenInterceptor.Companion.requestWithAuthorization(request0, s);
            if(request1 == null) {
                request1 = interceptor$Chain0.request();
            }
        }
        Response response0 = interceptor$Chain0.proceed(request1);
        Intrinsics.checkExpressionValueIsNotNull(response0, "originalResponse");
        if(response0.isSuccessful()) {
            return response0;
        }
        ResponseBody responseBody0 = response0.body();
        String s1 = responseBody0 == null ? null : responseBody0.string();
        Response response1 = response0.newBuilder().body(ResponseBody.create((responseBody0 == null ? null : responseBody0.contentType()), s1)).build();
        if(s1 != null) {
            KakaoJson kakaoJson0 = KakaoJson.INSTANCE;
            ApiErrorResponse apiErrorResponse0 = (ApiErrorResponse)kakaoJson0.fromJson(s1, ApiErrorResponse.class);
            if(apiErrorResponse0 != null) {
                apiErrorCause0 = (ApiErrorCause)kakaoJson0.fromJson(String.valueOf(apiErrorResponse0.getCode()), ApiErrorCause.class);
            }
        }
        if(apiErrorCause0 == ApiErrorCause.InvalidToken) {
            synchronized(this) {
                OAuthToken oAuthToken1 = this.a.getManager().getToken();
                if(oAuthToken1 != null) {
                    if(!Intrinsics.areEqual(oAuthToken1.getAccessToken(), s)) {
                        Intrinsics.checkExpressionValueIsNotNull(request1, "request");
                        Response response2 = interceptor$Chain0.proceed(AccessTokenInterceptor.Companion.requestWithAuthorization(request1, oAuthToken1.getAccessToken()));
                        Intrinsics.checkExpressionValueIsNotNull(response2, "chain.proceed(requestWit…urrentToken.accessToken))");
                        return response2;
                    }
                    try {
                        OAuthToken oAuthToken2 = this.b.refreshAccessToken(oAuthToken1);
                        Intrinsics.checkExpressionValueIsNotNull(request1, "request");
                        Response response3 = interceptor$Chain0.proceed(AccessTokenInterceptor.Companion.requestWithAuthorization(request1, oAuthToken2.getAccessToken()));
                        Intrinsics.checkExpressionValueIsNotNull(response3, "chain.proceed(requestWit…t, newToken.accessToken))");
                        return response3;
                    }
                    catch(Throwable throwable0) {
                        throw new IOException(throwable0);
                    }
                }
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(response1, "response");
        return response1;
    }
}

