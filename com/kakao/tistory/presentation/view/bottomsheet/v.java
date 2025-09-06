package com.kakao.tistory.presentation.view.bottomsheet;

import android.app.Dialog;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public static final v a;

    static {
        v.a = new v();
    }

    public v() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        return Unit.INSTANCE;
    }
}

