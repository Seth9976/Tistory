package com.kakao.sdk.auth.network;

import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/sdk/auth/network/RxAccessTokenInterceptor;", "Lokhttp3/Interceptor;", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "<init>", "(Lcom/kakao/sdk/auth/TokenManagerProvider;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxAccessTokenInterceptor implements Interceptor {
    public final TokenManagerProvider a;

    public RxAccessTokenInterceptor() {
        this(null, 1, null);
    }

    public RxAccessTokenInterceptor(@NotNull TokenManagerProvider tokenManagerProvider0) {
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        super();
        this.a = tokenManagerProvider0;
    }

    public RxAccessTokenInterceptor(TokenManagerProvider tokenManagerProvider0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        this(tokenManagerProvider0);
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) {
        Intrinsics.checkParameterIsNotNull(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        OAuthToken oAuthToken0 = this.a.getManager().getToken();
        if(oAuthToken0 != null) {
            String s = oAuthToken0.getAccessToken();
            if(s != null) {
                Response response0 = interceptor$Chain0.proceed(request0.newBuilder().addHeader("Authorization", "Bearer " + s).build());
                Intrinsics.checkExpressionValueIsNotNull(response0, "chain.proceed(request)");
                return response0;
            }
        }
        throw new ClientError(ClientErrorCause.TokenNotFound, "Access token not found.");
    }
}

