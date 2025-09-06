package com.kakao.tistory.presentation.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final SplashActivity a;

    public g(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.finishAffinity();
        return Unit.INSTANCE;
    }
}

