package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public static final p0 a;

    static {
        p0.a = new p0();
    }

    public p0() {
        super(1);
    }

    // 去混淆评级： 中等(60)
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((Boolean)object0).booleanValue() ? Color.box-impl(Color.copy-wmQWz5c$default(0L, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)) : Color.box-impl(0L);
    }
}

