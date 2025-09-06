package com.kakao.tistory.presentation.view.login;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class y extends FunctionReferenceImpl implements Function0 {
    public y(Object object0) {
        super(0, object0, TistroyLoginActivity.class, "backToKakaoLogin", "backToKakaoLogin()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistroyLoginActivity.access$backToKakaoLogin(((TistroyLoginActivity)this.receiver));
        return Unit.INSTANCE;
    }
}

