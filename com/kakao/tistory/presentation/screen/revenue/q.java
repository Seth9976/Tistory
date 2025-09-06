package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final NavActions a;

    public q(NavActions navActions0) {
        this.a = navActions0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getFinish().invoke();
        return Unit.INSTANCE;
    }
}

