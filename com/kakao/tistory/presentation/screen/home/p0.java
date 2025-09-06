package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SelectCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public final HomeViewModel a;

    public p0(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "categoryGroup");
        SelectCategory homeIntent$SelectCategory0 = new SelectCategory(((String)object0));
        this.a.sendIntent(homeIntent$SelectCategory0);
        return Unit.INSTANCE;
    }
}

