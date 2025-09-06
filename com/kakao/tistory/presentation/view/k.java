package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.viewmodel.SplashViewModel.DestinationType;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final SplashViewModel a;

    public k(SplashViewModel splashViewModel0) {
        this.a = splashViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.goToDestinationActivity(DestinationType.LOGIN);
        return Unit.INSTANCE;
    }
}

