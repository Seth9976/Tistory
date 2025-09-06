package com.kakao.sdk.common.network;

import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00018\u00002\b\u0010\u0007\u001A\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\u001E\u0010\n\u001A\u00020\u00052\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\r\u001A\u00020\bH\u0016J$\u0010\u000E\u001A\u00020\u00052\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/kakao/sdk/common/network/ApiCallback;", "T", "Lretrofit2/Callback;", "()V", "onComplete", "", "model", "error", "", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "onFailure", "call", "Lretrofit2/Call;", "t", "onResponse", "response", "Lretrofit2/Response;", "Companion", "common_release"}, k = 1, mv = {1, 1, 15})
public abstract class ApiCallback implements Callback {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/sdk/common/network/ApiCallback$Companion;", "", "", "t", "translateError", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "common_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Throwable translateError(@NotNull Throwable throwable0) {
            String s;
            Intrinsics.checkParameterIsNotNull(throwable0, "t");
            try {
                if(throwable0 instanceof HttpException) {
                    Response response0 = ((HttpException)throwable0).response();
                    if(response0 == null) {
                        s = null;
                    }
                    else {
                        ResponseBody responseBody0 = response0.errorBody();
                        s = responseBody0 == null ? null : responseBody0.string();
                    }
                    KakaoJson kakaoJson0 = KakaoJson.INSTANCE;
                    if(s == null) {
                        Intrinsics.throwNpe();
                    }
                    ApiErrorResponse apiErrorResponse0 = (ApiErrorResponse)kakaoJson0.fromJson(s, ApiErrorResponse.class);
                    ApiErrorCause apiErrorCause0 = (ApiErrorCause)kakaoJson0.fromJson(String.valueOf(apiErrorResponse0.getCode()), ApiErrorCause.class);
                    if(apiErrorCause0 == null) {
                        apiErrorCause0 = ApiErrorCause.Unknown;
                    }
                    return new ApiError(((HttpException)throwable0).code(), apiErrorCause0, apiErrorResponse0);
                }
                return throwable0;
            }
            catch(Throwable throwable0) {
            }
            return throwable0;
        }
    }

    public static final Companion Companion;

    static {
        ApiCallback.Companion = new Companion(null);
    }

    public abstract void onComplete(@Nullable Object arg1, @Nullable Throwable arg2);

    @Override  // retrofit2.Callback
    public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
        Intrinsics.checkParameterIsNotNull(call0, "call");
        Intrinsics.checkParameterIsNotNull(throwable0, "t");
        if(throwable0.getCause() instanceof KakaoSdkError) {
            com.kakao.sdk.common.util.SdkLog.Companion sdkLog$Companion0 = SdkLog.Companion;
            Throwable throwable1 = throwable0.getCause();
            if(throwable1 == null) {
                Intrinsics.throwNpe();
            }
            sdkLog$Companion0.e(throwable1);
            this.onComplete(null, throwable0.getCause());
            return;
        }
        SdkLog.Companion.e(throwable0);
        this.onComplete(null, throwable0);
    }

    @Override  // retrofit2.Callback
    public void onResponse(@NotNull Call call0, @NotNull Response response0) {
        Intrinsics.checkParameterIsNotNull(call0, "call");
        Intrinsics.checkParameterIsNotNull(response0, "response");
        Object object0 = response0.body();
        if(object0 != null) {
            SdkLog.Companion.i(object0);
            this.onComplete(object0, null);
            return;
        }
        HttpException httpException0 = new HttpException(response0);
        this.onFailure(call0, ApiCallback.Companion.translateError(httpException0));
    }
}

