package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.RequestRecommendation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k5 extends Lambda implements Function0 {
    public final SignUpViewModel a;

    public k5(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(RequestRecommendation.INSTANCE);
        return Unit.INSTANCE;
    }
}

