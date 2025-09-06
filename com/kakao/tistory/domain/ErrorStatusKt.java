package com.kakao.tistory.domain;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001A\u000E\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B\u001A\u000E\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u000E\"(\u0010\u0002\u001A\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00018F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000F"}, d2 = {"value", "Lcom/kakao/tistory/domain/ErrorStatus;", "errorStatus", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorStatus", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/domain/ErrorStatus;", "setErrorStatus", "(Lcom/kakao/android/base/model/ErrorModel;Lcom/kakao/tistory/domain/ErrorStatus;)V", "checkAuthTokenError", "", "status", "", "checkInspectionError", "code", "", "domain_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nErrorStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorStatus.kt\ncom/kakao/tistory/domain/ErrorStatusKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n288#2,2:69\n*S KotlinDebug\n*F\n+ 1 ErrorStatus.kt\ncom/kakao/tistory/domain/ErrorStatusKt\n*L\n54#1:69,2\n*E\n"})
public final class ErrorStatusKt {
    // 去混淆评级： 低(45)
    public static final boolean checkAuthTokenError(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "status");
        return (Intrinsics.areEqual(s, "AUTH_TOKEN_EXPIRED") ? true : Intrinsics.areEqual(s, "AUTH_TOKEN_NOT_PRESENT")) ? true : Intrinsics.areEqual(s, "AUTH_TOKEN_USER_NOT_FOUND");
    }

    public static final boolean checkInspectionError(int v) {
        return v == 503;
    }

    @NotNull
    public static final ErrorStatus getErrorStatus(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "<this>");
        for(Object object0: ErrorStatus.getEntries()) {
            if(((ErrorStatus)object0).getCode() == errorModel0.getCode() && Intrinsics.areEqual(((ErrorStatus)object0).getStatus(), "EXCEPTION_UNKNOWN_STATUS")) {
                return ((ErrorStatus)object0) == null ? ErrorStatus.EXCEPTION_UNKNOWN_STATUS : ((ErrorStatus)object0);
            }
            if(false) {
                break;
            }
        }
        return ErrorStatus.EXCEPTION_UNKNOWN_STATUS;
    }

    public static final void setErrorStatus(@NotNull ErrorModel errorModel0, @NotNull ErrorStatus errorStatus0) {
        Intrinsics.checkNotNullParameter(errorModel0, "<this>");
        Intrinsics.checkNotNullParameter(errorStatus0, "value");
        errorModel0.setCode(errorStatus0.getCode());
        errorModel0.setStatus(errorStatus0.getStatus());
    }
}

