package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.contract.MainIntent.BackPressedInHome;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final MainAppViewModel a;

    public i0(MainAppViewModel mainAppViewModel0) {
        this.a = mainAppViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(BackPressedInHome.INSTANCE);
        return Unit.INSTANCE;
    }
}

