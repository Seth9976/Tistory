package com.kakao.tistory.data.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Function3 a;

    public a(Function3 function30) {
        this.a = function30;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SimplePagingSource(this.a);
    }
}

