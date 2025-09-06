package com.kakao.tistory.presentation.view.signup;

import androidx.compose.ui.focus.FocusManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final FocusManager a;

    public f0(FocusManager focusManager0) {
        this.a = focusManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FocusManager.clearFocus$default(this.a, false, 1, null);
        return Unit.INSTANCE;
    }
}

