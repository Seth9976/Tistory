package com.kakao.tistory.presentation.common.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

public final class b extends Lambda implements Function0 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Regex("https://[a-zA-Z0-9.]*cdn\\.net/thumb/[RUDPBTCWFS]\\d*x\\d*/\\?.*", RegexOption.IGNORE_CASE);
    }
}

