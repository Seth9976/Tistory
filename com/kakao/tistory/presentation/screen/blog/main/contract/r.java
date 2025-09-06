package com.kakao.tistory.presentation.screen.blog.main.contract;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public static final r a;

    static {
        r.a = new r();
    }

    public r() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        return Unit.INSTANCE;
    }
}

