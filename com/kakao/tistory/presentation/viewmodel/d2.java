package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthApiClientKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d2 extends Lambda implements Function1 {
    public static final d2 a;

    static {
        d2.a = new d2();
    }

    public d2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "authCode");
        return AuthApiClientKt.getRx(AuthApiClient.Companion).issueAccessToken(((String)object0));
    }
}

