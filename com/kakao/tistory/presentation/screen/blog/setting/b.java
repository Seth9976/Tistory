package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final State a;

    public b(State state0) {
        this.a = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogSettingScreenKt.access$BlogSettingScreen$lambda$0(this.a).getOnFinish().invoke("블로그", "블로그설정");
        return Unit.INSTANCE;
    }
}

