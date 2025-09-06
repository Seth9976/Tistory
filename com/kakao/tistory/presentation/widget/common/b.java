package com.kakao.tistory.presentation.widget.common;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EditText)object0), "it");
        this.a.invoke(((EditText)object0));
        return Unit.INSTANCE;
    }
}

