package com.kakao.tistory.presentation.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

public final class y4 extends Lambda implements Function0 {
    public static final y4 a;

    static {
        y4.a = new y4();
    }

    public y4() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Regex("^[a-z0-9]+(-[a-z0-9]+)*$");
    }
}

