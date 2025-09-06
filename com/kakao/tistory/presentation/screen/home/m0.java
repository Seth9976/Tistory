package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.GoToUrl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1 {
    public final HomeViewModel a;

    public m0(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "url");
        GoToUrl homeEvent$GoToUrl0 = new GoToUrl(((String)object0));
        this.a.sendEvent(homeEvent$GoToUrl0);
        return Unit.INSTANCE;
    }
}

