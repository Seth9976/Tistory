package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function1 {
    public final Function0 a;
    public final MutableState b;

    public o0(Function0 function00, MutableState mutableState0) {
        this.a = function00;
        this.b = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FocusState)object0), "it");
        boolean z = ((FocusState)object0).isFocused();
        TistroyLoginActivity.access$LoginForm$lambda$18(this.b, z);
        if(TistroyLoginActivity.access$LoginForm$lambda$17(this.b)) {
            this.a.invoke();
        }
        return Unit.INSTANCE;
    }
}

