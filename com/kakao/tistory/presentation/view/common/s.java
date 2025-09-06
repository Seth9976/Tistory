package com.kakao.tistory.presentation.view.common;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class s extends Lambda implements Function1 {
    public static final s a;

    static {
        s.a = new s();
    }

    public s() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        return Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName();
    }
}

