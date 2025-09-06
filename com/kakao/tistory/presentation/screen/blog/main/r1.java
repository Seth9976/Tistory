package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoTrend;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;
    public final String b;

    public r1(BlogMainViewModel blogMainViewModel0, String s) {
        this.a = blogMainViewModel0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickStatisticsState();
        GoTrend blogMainEvent$GoTrend0 = new GoTrend(this.b);
        this.a.sendEvent(blogMainEvent$GoTrend0);
        return Unit.INSTANCE;
    }
}

