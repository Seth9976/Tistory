package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g5 extends ContinuationImpl {
    public SignUpUiState a;
    public SignUpIntent b;
    public Object c;
    public final SignUpViewModel d;
    public int e;

    public g5(SignUpViewModel signUpViewModel0, Continuation continuation0) {
        this.d = signUpViewModel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.handleIntent(null, null, this);
    }
}

