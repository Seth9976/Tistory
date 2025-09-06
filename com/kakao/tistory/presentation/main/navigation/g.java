package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class g extends AdaptedFunctionReference implements Function0 {
    public g(Object object0) {
        super(0, object0, MainAppState.class, "navigateToBlogSwitchBottomSheet", "navigateToBlogSwitchBottomSheet(Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MainAppState.navigateToBlogSwitchBottomSheet$default(((MainAppState)this.receiver), false, 1, null);
        return Unit.INSTANCE;
    }
}

