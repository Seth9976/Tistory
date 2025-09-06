package com.kakao.tistory.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u001D\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/kakao/tistory/domain/ErrorStatus;", "", "", "a", "I", "getCode", "()I", "code", "", "b", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "status", "EXCEPTION_UNKNOWN_STATUS", "EXCEPTION_RESTRICTED_BLOG", "EXCEPTION_BLOG_LESS", "KAKAO_USER_ALREADY_REGISTERED", "AUTH_TOKEN_EXPIRED", "AUTH_TOKEN_NOT_PRESENT", "AUTH_TOKEN_USER_NOT_FOUND", "UNREGISTERED_KAKAO_ACCOUNT", "UNAUTHORIZED", "PROTECTED_ENTRY_PASSWORD_REQUIRED", "USER_RESTRICT", "FILE_NOT_FOUND", "NEWER_VERSION_REQUIRED", "CAN_NOT_FIND_POST", "CAN_NOT_FIND_COMMENT", "CAN_NOT_AUTHENTICATE", "CAN_NOT_EDIT_ENTRY", "KAKAO_USER_EMAIL_DUPLICATED", "ALREADY_FOLLOW_OR_UNFOLLOW", "BLOG_MIGRATING", "HTTP_SERVICE_UNAVAILABLE", "GATEWAY_TIMEOUT", "ERROR_BY_COROUTINE_CANCEL", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ErrorStatus {
    EXCEPTION_UNKNOWN_STATUS(-1, "EXCEPTION_UNKNOWN_STATUS"),
    EXCEPTION_RESTRICTED_BLOG(403, "EXCEPTION_RESTRICTED_BLOG"),
    EXCEPTION_BLOG_LESS(404, "EXCEPTION_BLOG_LESS"),
    KAKAO_USER_ALREADY_REGISTERED(400, "KAKAO_USER_ALREADY_REGISTERED"),
    AUTH_TOKEN_EXPIRED(401, "AUTH_TOKEN_EXPIRED"),
    AUTH_TOKEN_NOT_PRESENT(401, "AUTH_TOKEN_NOT_PRESENT"),
    AUTH_TOKEN_USER_NOT_FOUND(401, "AUTH_TOKEN_USER_NOT_FOUND"),
    UNREGISTERED_KAKAO_ACCOUNT(401, "UNREGISTERED_KAKAO_ACCOUNT"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    PROTECTED_ENTRY_PASSWORD_REQUIRED(403, "PROTECTED_ENTRY_PASSWORD_REQUIRED"),
    USER_RESTRICT(403, "USER_RESTRICT"),
    FILE_NOT_FOUND(404, "FILE_NOT_FOUND"),
    NEWER_VERSION_REQUIRED(412, "NEWER_VERSION_REQUIRED"),
    CAN_NOT_FIND_POST(422, "CAN_NOT_FIND_POST"),
    CAN_NOT_FIND_COMMENT(422, "CAN_NOT_FIND_COMMENT"),
    CAN_NOT_AUTHENTICATE(422, "CAN_NOT_AUTHENTICATE"),
    CAN_NOT_EDIT_ENTRY(422, "CAN_NOT_EDIT_ENTRY"),
    KAKAO_USER_EMAIL_DUPLICATED(422, "KAKAO_USER_EMAIL_DUPLICATED"),
    ALREADY_FOLLOW_OR_UNFOLLOW(422, "CAN_NOT_FOLLOW_BLOG"),
    BLOG_MIGRATING(501, "BLOG_MIGRATING"),
    HTTP_SERVICE_UNAVAILABLE(503, "MAINTENANCE_STATISTICS"),
    GATEWAY_TIMEOUT(504, "GATEWAY_TIMEOUT"),
    ERROR_BY_COROUTINE_CANCEL(0x5F4, "ERROR_BY_COROUTINE_CANCEL");

    public final int a;
    public final String b;
    public static final ErrorStatus[] c;
    public static final EnumEntries d;

    static {
        ErrorStatus.c = arr_errorStatus;
        Intrinsics.checkNotNullParameter(arr_errorStatus, "entries");
        ErrorStatus.d = new a(arr_errorStatus);
    }

    public ErrorStatus(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    public final int getCode() {
        return this.a;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ErrorStatus.d;
    }

    @NotNull
    public final String getStatus() {
        return this.b;
    }
}

