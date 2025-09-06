package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final MutableState a;

    public g0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = CreatorKt.access$Creator$lambda$11(this.a);
        CreatorKt.access$Creator$lambda$12(this.a, !z);
        return Unit.INSTANCE;
    }
}

