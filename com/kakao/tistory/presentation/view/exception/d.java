package com.kakao.tistory.presentation.view.exception;

import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class d extends FunctionReferenceImpl implements Function0 {
    public d(TistoryGuideViewModel tistoryGuideViewModel0) {
        super(0, tistoryGuideViewModel0, TistoryGuideViewModel.class, "onClickGuideButton", "onClickGuideButton()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((TistoryGuideViewModel)this.receiver).onClickGuideButton();
        return Unit.INSTANCE;
    }
}

