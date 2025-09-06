package com.kakao.tistory.presentation.screen.home;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final State a;

    public e(State state0) {
        this.a = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeScreenKt.access$HomeScreen$lambda$0(this.a).getRefresh().invoke();
        return Unit.INSTANCE;
    }
}

