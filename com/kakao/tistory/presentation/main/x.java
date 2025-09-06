package com.kakao.tistory.presentation.main;

import androidx.navigation.PopUpToBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public static final x a;

    static {
        x.a = new x();
    }

    public x() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PopUpToBuilder)object0), "$this$popUpTo");
        ((PopUpToBuilder)object0).setSaveState(true);
        return Unit.INSTANCE;
    }
}

