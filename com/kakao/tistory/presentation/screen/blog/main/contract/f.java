package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Challenge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final Function3 a;
    public final Challenge b;

    public f(Function3 function30, Challenge challenge0) {
        this.a = function30;
        this.b = challenge0;
        super(0);
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke("", "", Boolean.TRUE);
        return Unit.INSTANCE;
    }
}

