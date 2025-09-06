package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function0 {
    public final MutableState a;
    public final MutableState b;

    public b1(MutableState mutableState0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = mutableState1;
        super(0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return !BlogMainInfoKt.access$Description$lambda$10(this.a) || !BlogMainInfoKt.access$Description$lambda$13(this.b) ? false : true;
    }
}

