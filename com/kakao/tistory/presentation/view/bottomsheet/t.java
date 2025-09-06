package com.kakao.tistory.presentation.view.bottomsheet;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public static final t a;

    static {
        t.a = new t();
    }

    public t() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        com.kakao.tistory.presentation.screen.feed.t.a(((Number)object1), ((Dialog)object0), "dialog");
        return Unit.INSTANCE;
    }
}

