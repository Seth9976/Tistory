package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class u0 extends FunctionReferenceImpl implements Function0 {
    public u0(TistoryLoginViewModel tistoryLoginViewModel0) {
        super(0, tistoryLoginViewModel0, TistoryLoginViewModel.class, "onClickLogin", "onClickLogin()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((TistoryLoginViewModel)this.receiver).onClickLogin();
        return Unit.INSTANCE;
    }
}

