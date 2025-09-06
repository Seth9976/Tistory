package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoNoticeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;

    public p1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickNoticeSeeAll();
        this.a.sendEvent(GoNoticeList.INSTANCE);
        return Unit.INSTANCE;
    }
}

