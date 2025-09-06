package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final MutableState a;

    public i(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

