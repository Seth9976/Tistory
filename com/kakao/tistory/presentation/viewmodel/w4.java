package com.kakao.tistory.presentation.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

public final class w4 extends Lambda implements Function0 {
    public static final w4 a;

    static {
        w4.a = new w4();
    }

    public w4() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Regex("^-|-$");
    }
}

