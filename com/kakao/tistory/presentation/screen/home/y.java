package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.Loading;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final HomeViewModel a;

    public y(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Loading homeIntent$Loading0 = new Loading(true);
        this.a.sendIntent(homeIntent$Loading0);
        return Unit.INSTANCE;
    }
}

