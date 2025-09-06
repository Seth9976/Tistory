package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.Finish;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z2 extends Lambda implements Function0 {
    public final BlogMainViewModel a;

    public z2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendEvent(Finish.INSTANCE);
        return Unit.INSTANCE;
    }
}

