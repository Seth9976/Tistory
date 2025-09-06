package com.kakao.sdk.common.network;

import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/sdk/common/network/KakaoAgentInterceptor;", "Lokhttp3/Interceptor;", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/common/model/ContextInfo;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lcom/kakao/sdk/common/model/ContextInfo;", "getContextInfo", "()Lcom/kakao/sdk/common/model/ContextInfo;", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoAgentInterceptor implements Interceptor {
    public final ContextInfo a;

    public KakaoAgentInterceptor() {
        this(null, 1, null);
    }

    public KakaoAgentInterceptor(@NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.a = contextInfo0;
    }

    public KakaoAgentInterceptor(ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            contextInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        this(contextInfo0);
    }

    @NotNull
    public final ContextInfo getContextInfo() {
        return this.a;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) {
        Intrinsics.checkParameterIsNotNull(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        String s = this.a.getKaHeader();
        Response response0 = interceptor$Chain0.proceed(request0.newBuilder().addHeader("KA", s).build());
        Intrinsics.checkExpressionValueIsNotNull(response0, "chain.proceed(request)");
        return response0;
    }
}

