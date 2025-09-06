package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final MutableState a;

    public c(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NotificationScreenKt.access$InitViewModel$lambda$14(this.a, null);
        return Unit.INSTANCE;
    }
}

