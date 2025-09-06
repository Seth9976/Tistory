package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.contract.MainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final MainUiState a;

    public c(MainUiState mainUiState0) {
        this.a = mainUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnBackPressedInHome().invoke();
        return Unit.INSTANCE;
    }
}

