package com.kakao.tistory.domain;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/ErrorModelThrowable;", "", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "()Lcom/kakao/android/base/model/ErrorModel;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ErrorModelThrowable extends Throwable {
    public final ErrorModel a;

    public ErrorModelThrowable(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        this.a = errorModel0;
    }

    @NotNull
    public final ErrorModel getErrorModel() {
        return this.a;
    }
}

