package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final MutableState a;

    public k0(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FocusState)object0), "it");
        boolean z = ((FocusState)object0).isFocused();
        TistroyLoginActivity.access$LoginForm$lambda$15(this.a, z);
        return Unit.INSTANCE;
    }
}

