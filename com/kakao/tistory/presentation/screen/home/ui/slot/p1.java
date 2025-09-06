package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function1 {
    public final boolean a;

    public p1(boolean z) {
        this.a = z;
        super(1);
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        return this.a ? Color.box-impl(Color.copy-wmQWz5c$default(0L, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)) : Color.box-impl(0L);
    }
}

