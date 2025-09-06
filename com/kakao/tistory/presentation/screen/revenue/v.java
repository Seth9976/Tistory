package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final State a;

    public v(State state0) {
        this.a = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getRefresh().invoke(RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getBlogName());
        return Unit.INSTANCE;
    }
}

