package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u2 extends Lambda implements Function1 {
    public final Function1 a;
    public final MutableState b;

    public u2(Function1 function10, MutableState mutableState0) {
        this.a = function10;
        this.b = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        if(RoundButtonKt.access$RoundToggleButton$lambda$2(this.b)) {
            RoundButtonKt.access$RoundToggleButton$lambda$3(this.b, false);
            this.a.invoke(((Boolean)object0));
        }
        return Unit.INSTANCE;
    }
}

