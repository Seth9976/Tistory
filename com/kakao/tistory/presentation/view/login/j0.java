package com.kakao.tistory.presentation.view.login;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public final Function0 a;

    public j0(Function0 function00) {
        this.a = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeyboardActionScope)object0), "$this$$receiver");
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

