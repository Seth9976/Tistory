package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p5 extends Lambda implements Function0 {
    public final SignUpViewModel a;
    public final String b;

    public p5(SignUpViewModel signUpViewModel0, String s) {
        this.a = signUpViewModel0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.isShowProgress().postValue(Boolean.FALSE);
        this.a.r.postValue(new Event(this.b));
        return Unit.INSTANCE;
    }
}

