package com.kakao.tistory.presentation.screen.home.ui.slot;

import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class y1 extends FunctionReferenceImpl implements Function0 {
    public y1(Object object0) {
        super(0, object0, Subscription.class, "onClickMore", "onClickMore()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Subscription)this.receiver).onClickMore();
        return Unit.INSTANCE;
    }
}

