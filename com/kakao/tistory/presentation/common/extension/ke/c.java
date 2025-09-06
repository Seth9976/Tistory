package com.kakao.tistory.presentation.common.extension.ke;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final String a;

    public c(String s) {
        this.a = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a;
    }
}

