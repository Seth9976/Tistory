package com.kakao.tistory.presentation.view.comment;

import android.app.Dialog;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function2 {
    public static final k1 a;

    static {
        k1.a = new k1();
    }

    public k1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        return Unit.INSTANCE;
    }
}

