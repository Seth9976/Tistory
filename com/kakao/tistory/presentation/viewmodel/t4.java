package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class t4 implements FlowCollector {
    public final SignUpViewModel a;

    public t4(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.a(((String)object0));
        return Unit.INSTANCE;
    }
}

