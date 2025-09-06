package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function0 {
    public final AlertDialogData a;
    public final Function0 b;

    public a1(AlertDialogData alertDialogData0, Function0 function00) {
        this.a = alertDialogData0;
        this.b = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function00 = this.a.getOkCallback();
        if(function00 != null) {
            function00.invoke();
        }
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

