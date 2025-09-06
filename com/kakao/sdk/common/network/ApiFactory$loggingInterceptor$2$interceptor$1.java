package com.kakao.sdk.common.network;

import com.kakao.sdk.common.util.SdkLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/kakao/sdk/common/network/ApiFactory$loggingInterceptor$2$interceptor$1", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "message", "", "log", "(Ljava/lang/String;)V", "common_release"}, k = 1, mv = {1, 4, 0})
public final class ApiFactory.loggingInterceptor.2.interceptor.1 implements Logger {
    @Override  // okhttp3.logging.HttpLoggingInterceptor$Logger
    public void log(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "message");
        SdkLog.Companion.i(s);
    }
}

