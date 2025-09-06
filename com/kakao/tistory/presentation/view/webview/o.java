package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function4 {
    public static final o a;

    static {
        o.a = new o();
    }

    public o() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object0).intValue();
        ((Number)object1).intValue();
        ((Number)object2).intValue();
        ((Number)object3).intValue();
        return Unit.INSTANCE;
    }
}

