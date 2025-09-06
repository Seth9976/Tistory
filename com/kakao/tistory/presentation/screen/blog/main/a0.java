package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final State a;

    public a0(State state0) {
        this.a = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainScreenKt.access$BlogMainScreen$lambda$0(this.a).getOnFinish().invoke("블로그", "블로그탑");
        return Unit.INSTANCE;
    }
}

