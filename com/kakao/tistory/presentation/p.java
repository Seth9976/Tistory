package com.kakao.tistory.presentation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final String a;

    public p(String s) {
        this.a = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TistoryPhotoEditor(new o(this.a));
    }
}

