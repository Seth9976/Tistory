package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoRevenue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;

    public v1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickStatisticsRevenue();
        this.a.sendEvent(GoRevenue.INSTANCE);
        return Unit.INSTANCE;
    }
}

