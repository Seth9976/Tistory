package com.kakao.tistory.presentation.view.signup.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpVerificationState;", "", "INIT", "VERIFYING", "VERIFIED", "ERROR", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SignUpVerificationState {
    INIT,
    VERIFYING,
    VERIFIED,
    ERROR;

    public static final SignUpVerificationState[] a;
    public static final EnumEntries b;

    static {
        SignUpVerificationState.a = arr_signUpVerificationState;
        Intrinsics.checkNotNullParameter(arr_signUpVerificationState, "entries");
        SignUpVerificationState.b = new a(arr_signUpVerificationState);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SignUpVerificationState.b;
    }
}

