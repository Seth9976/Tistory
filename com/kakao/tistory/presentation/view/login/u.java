package com.kakao.tistory.presentation.view.login;

import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final KakaoLoginActivity a;

    public u(KakaoLoginActivity kakaoLoginActivity0) {
        this.a = kakaoLoginActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Pair)object0), "it");
        NavigatorExtensionKt.goToSignUp$default(this.a, ((OAuthToken)((Pair)object0).getFirst()), ((String)((Pair)object0).getSecond()), false, null, 12, null);
        return Unit.INSTANCE;
    }
}

