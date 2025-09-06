package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final MainAppState a;

    public b(MainAppState mainAppState0) {
        this.a = mainAppState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.navigateToMainDestination(MainDestination.MY);
        return Unit.INSTANCE;
    }
}

