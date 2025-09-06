package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class t0 extends FunctionReferenceImpl implements Function0 {
    public t0(TistoryLoginViewModel tistoryLoginViewModel0) {
        super(0, tistoryLoginViewModel0, TistoryLoginViewModel.class, "onClickNext", "onClickNext()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((TistoryLoginViewModel)this.receiver).onClickNext();
        return Unit.INSTANCE;
    }
}

