package com.kakao.tistory.presentation.main.ui;

import com.kakao.tistory.presentation.main.navigation.MainDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final Function1 a;
    public final MainDestination b;

    public w(Function1 function10, MainDestination mainDestination0) {
        this.a = function10;
        this.b = mainDestination0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

