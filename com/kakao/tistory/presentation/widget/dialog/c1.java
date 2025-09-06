package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function1 {
    public final Function0 a;
    public final Function0 b;

    public c1(Function0 function00, Function0 function01) {
        this.a = function00;
        this.b = function01;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "it");
        switch(((DialogButton)object0)) {
            case 1: {
                this.a.invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                this.b.invoke();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

