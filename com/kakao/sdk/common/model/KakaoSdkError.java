package com.kakao.sdk.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/common/model/KakaoSdkError;", "Ljava/lang/RuntimeException;", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "Lcom/kakao/sdk/common/model/ApiError;", "Lcom/kakao/sdk/common/model/AuthError;", "Lcom/kakao/sdk/common/model/ClientError;", "common_release"}, k = 1, mv = {1, 4, 0})
public abstract class KakaoSdkError extends RuntimeException {
    @NotNull
    private final String msg;

    public KakaoSdkError(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        super(s);
        this.msg = s;
    }

    @NotNull
    public String getMsg() {
        return this.msg;
    }
}

