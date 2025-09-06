package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.ActivityNavigator.DefaultImpls;
import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class d extends AdaptedFunctionReference implements Function0 {
    public d(Object object0) {
        super(0, object0, MainAppState.class, "navigateToSearch", "navigateToSearch(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DefaultImpls.navigateToSearch$default(((MainAppState)this.receiver), null, 1, null);
        return Unit.INSTANCE;
    }
}

