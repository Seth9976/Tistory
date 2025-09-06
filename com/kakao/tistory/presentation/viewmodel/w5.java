package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.LoginResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w5 extends Lambda implements Function0 {
    public final LoginResult a;
    public final SplashViewModel b;

    public w5(LoginResult loginResult0, SplashViewModel splashViewModel0) {
        this.a = loginResult0;
        this.b = splashViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.a.isTistoryAccount()) {
            this.b.goToDestinationActivity(DestinationType.TRANSFER);
            return Unit.INSTANCE;
        }
        this.b.goToDestinationActivity(DestinationType.MAIN);
        return Unit.INSTANCE;
    }
}

