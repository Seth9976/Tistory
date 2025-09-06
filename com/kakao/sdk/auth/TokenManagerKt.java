package com.kakao.sdk.auth;

import com.kakao.sdk.common.util.SdkLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"auth_release"}, k = 2, mv = {1, 4, 0})
public final class TokenManagerKt {
    public static final Object access$parseOrNull(Function0 function00) {
        try {
            return function00.invoke();
        }
        catch(Exception exception0) {
            SdkLog.Companion.e(exception0);
            return null;
        }
    }
}

