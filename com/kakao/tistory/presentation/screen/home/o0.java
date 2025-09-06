package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.OnClickUnFollow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function1 {
    public final HomeViewModel a;

    public o0(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        OnClickUnFollow homeIntent$OnClickUnFollow0 = new OnClickUnFollow(((String)object0));
        this.a.sendIntent(homeIntent$OnClickUnFollow0);
        return Unit.INSTANCE;
    }
}

