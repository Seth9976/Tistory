package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o5 extends Lambda implements Function0 {
    public final SignUpViewModel a;

    public o5(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SignUpViewModel.access$onClickBack(this.a);
        return Unit.INSTANCE;
    }
}

