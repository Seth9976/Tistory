package com.kakao.tistory.presentation.view.login;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final KakaoLoginActivity a;

    public j(KakaoLoginActivity kakaoLoginActivity0) {
        this.a = kakaoLoginActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KakaoLoginActivity.access$getKakaoLoginViewModel(this.a).onClickTistoryLogin();
        return Unit.INSTANCE;
    }
}

