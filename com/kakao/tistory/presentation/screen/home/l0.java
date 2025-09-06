package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.GoToEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final HomeViewModel a;

    public l0(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        GoToEntry homeEvent$GoToEntry0 = new GoToEntry(((String)object0), ((Number)object1).longValue());
        this.a.sendEvent(homeEvent$GoToEntry0);
        return Unit.INSTANCE;
    }
}

