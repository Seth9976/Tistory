package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.viewmodel.SplashViewModel.DestinationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final SplashActivity a;

    public e(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SplashActivity.access$getSplashViewModel(this.a).goToDestinationActivity(DestinationType.LOGIN);
        return Unit.INSTANCE;
    }
}

