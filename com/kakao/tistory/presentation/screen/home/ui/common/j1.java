package com.kakao.tistory.presentation.screen.home.ui.common;

import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class j1 extends FunctionReferenceImpl implements Function0 {
    public j1(Page homeSlotUiState$Page0) {
        super(0, homeSlotUiState$Page0, Page.class, "onClickMore", "onClickMore()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Page)this.receiver).onClickMore();
        return Unit.INSTANCE;
    }
}

