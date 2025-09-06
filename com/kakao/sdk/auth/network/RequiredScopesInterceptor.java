package com.kakao.sdk.auth.network;

import androidx.compose.foundation.text.selection.y;
import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.util.KakaoJson;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/sdk/auth/network/RequiredScopesInterceptor;", "Lokhttp3/Interceptor;", "Lcom/kakao/sdk/common/model/ApplicationContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/common/model/ApplicationContextInfo;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class RequiredScopesInterceptor implements Interceptor {
    public final ApplicationContextInfo a;

    public RequiredScopesInterceptor() {
        this(null, 1, null);
    }

    public RequiredScopesInterceptor(@NotNull ApplicationContextInfo applicationContextInfo0) {
        Intrinsics.checkParameterIsNotNull(applicationContextInfo0, "contextInfo");
        super();
        this.a = applicationContextInfo0;
    }

    public RequiredScopesInterceptor(ApplicationContextInfo applicationContextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            applicationContextInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        this(applicationContextInfo0);
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) {
        Intrinsics.checkParameterIsNotNull(interceptor$Chain0, "chain");
        Response response0 = interceptor$Chain0.proceed(interceptor$Chain0.request());
        Intrinsics.checkExpressionValueIsNotNull(response0, "originalResponse");
        if(response0.isSuccessful()) {
            return response0;
        }
        ResponseBody responseBody0 = response0.body();
        String s = responseBody0 == null ? null : responseBody0.string();
        Response response1 = response0.newBuilder().body(ResponseBody.create((responseBody0 == null ? null : responseBody0.contentType()), s)).build();
        ApiErrorResponse apiErrorResponse0 = s == null ? null : ((ApiErrorResponse)KakaoJson.INSTANCE.fromJson(s, ApiErrorResponse.class));
        List list0 = apiErrorResponse0 == null ? null : apiErrorResponse0.getRequiredScopes();
        if((apiErrorResponse0 == null ? null : ((ApiErrorCause)KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse0.getCode()), ApiErrorCause.class))) == ApiErrorCause.InsufficientScope && list0 != null) {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            ref$ObjectRef0.element = null;
            ObjectRef ref$ObjectRef1 = new ObjectRef();
            ref$ObjectRef1.element = null;
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            LoginClient.Companion.getInstance().loginWithNewScopes(this.a.getApplicationContext(), list0, new y(ref$ObjectRef0, ref$ObjectRef1, 10, countDownLatch0));
            countDownLatch0.await();
            OAuthToken oAuthToken0 = (OAuthToken)ref$ObjectRef0.element;
            if(oAuthToken0 != null) {
                String s1 = oAuthToken0.getAccessToken();
                if(s1 != null) {
                    Request request0 = response1.request();
                    Intrinsics.checkExpressionValueIsNotNull(request0, "response.request()");
                    Response response2 = interceptor$Chain0.proceed(AccessTokenInterceptor.Companion.requestWithAuthorization(request0, s1));
                    if(response2 != null) {
                        return response2;
                    }
                }
            }
            throw new IOException(((Throwable)ref$ObjectRef1.element));
        }
        Intrinsics.checkExpressionValueIsNotNull(response1, "response");
        return response1;
    }
}

