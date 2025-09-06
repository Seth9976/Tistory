package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoRefererKeyword;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;
    public final List b;

    public t1(BlogMainViewModel blogMainViewModel0, List list0) {
        this.a = blogMainViewModel0;
        this.b = list0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickStatisticsKeyword();
        GoRefererKeyword blogMainEvent$GoRefererKeyword0 = new GoRefererKeyword(this.b);
        this.a.sendEvent(blogMainEvent$GoRefererKeyword0);
        return Unit.INSTANCE;
    }
}

