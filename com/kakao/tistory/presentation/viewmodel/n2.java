package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function0 {
    public final KakaoLoginViewModel a;

    public n2(KakaoLoginViewModel kakaoLoginViewModel0) {
        this.a = kakaoLoginViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.isShowProgress().postValue(Boolean.FALSE);
        Main kakaoLoginViewModel$LoginNavigator$Main0 = new Main(((String)this.a.p.getValue()));
        KakaoLoginViewModel.access$goToDestination(this.a, kakaoLoginViewModel$LoginNavigator$Main0);
        return Unit.INSTANCE;
    }
}

