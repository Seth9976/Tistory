package com.kakao.sdk.common.network;

import com.kakao.sdk.common.KakaoSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/sdk/common/network/AppKeyInterceptor;", "Lokhttp3/Interceptor;", "", "appKey", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "common_release"}, k = 1, mv = {1, 4, 0})
public final class AppKeyInterceptor implements Interceptor {
    public final String a;

    public AppKeyInterceptor() {
        this(null, 1, null);
    }

    public AppKeyInterceptor(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "appKey");
        super();
        this.a = s;
    }

    public AppKeyInterceptor(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey();
        }
        this(s);
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) {
        Intrinsics.checkParameterIsNotNull(interceptor$Chain0, "chain");
        Response response0 = interceptor$Chain0.proceed(interceptor$Chain0.request().newBuilder().addHeader("Authorization", "KakaoAK " + this.a).build());
        Intrinsics.checkExpressionValueIsNotNull(response0, "chain.proceed(request)");
        return response0;
    }
}

