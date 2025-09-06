package com.kakao.tistory.presentation.screen.feed;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public static final u a;

    static {
        u.a = new u();
    }

    public u() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        return Unit.INSTANCE;
    }
}

