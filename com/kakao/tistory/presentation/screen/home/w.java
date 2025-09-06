package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.common.eventbus.BlogFollowEvent;
import com.kakao.tistory.presentation.common.eventbus.TistoryEventBus;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.ChangeFollow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final HomeViewModel a;

    public w(HomeViewModel homeViewModel0) {
        this.a = homeViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TistoryEventBus)object0), "it");
        if(((TistoryEventBus)object0) instanceof BlogFollowEvent) {
            ChangeFollow homeIntent$ChangeFollow0 = new ChangeFollow(((BlogFollowEvent)(((TistoryEventBus)object0))).getBlogName(), ((BlogFollowEvent)(((TistoryEventBus)object0))).getFollowing());
            this.a.sendIntent(homeIntent$ChangeFollow0);
        }
        return Unit.INSTANCE;
    }
}

