package com.kakao.sdk.common.network;

import io.reactivex.CompletableTransformer;
import io.reactivex.SingleTransformer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ub.e;
import ub.g;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/sdk/common/network/RxOperations;", "", "T", "Lio/reactivex/SingleTransformer;", "handleApiError", "()Lio/reactivex/SingleTransformer;", "Lio/reactivex/CompletableTransformer;", "handleCompletableError", "()Lio/reactivex/CompletableTransformer;", "common-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxOperations {
    public static final RxOperations INSTANCE;

    static {
        RxOperations.INSTANCE = new RxOperations();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final SingleTransformer handleApiError() {
        return e.a;
    }

    @NotNull
    public final CompletableTransformer handleCompletableError() {
        return g.a;
    }
}

