package com.kakao.tistory.presentation.view.comment.contract;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public static final u a;

    static {
        u.a = new u();
    }

    public u() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return true;
    }
}

