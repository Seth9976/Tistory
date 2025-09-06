package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final MutableState a;

    public w(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevenueScreenKt.access$RevenueScreen$lambda$4(this.a, false);
        return Unit.INSTANCE;
    }
}

