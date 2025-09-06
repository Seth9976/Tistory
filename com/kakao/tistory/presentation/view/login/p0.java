package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function0 {
    public final MutableState a;

    public p0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = TistroyLoginActivity.access$LoginForm$lambda$20(this.a);
        TistroyLoginActivity.access$LoginForm$lambda$21(this.a, !z);
        return Unit.INSTANCE;
    }
}

