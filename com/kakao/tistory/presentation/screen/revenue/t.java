package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final MutableState a;

    public t(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevenueTiara.INSTANCE.trackClickVendorMenu();
        RevenueScreenKt.access$RevenueScreen$lambda$4(this.a, true);
        return Unit.INSTANCE;
    }
}

