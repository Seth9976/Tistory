package com.kakao.tistory.presentation.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

public final class x4 extends Lambda implements Function0 {
    public static final x4 a;

    static {
        x4.a = new x4();
    }

    public x4() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Regex("--");
    }
}

