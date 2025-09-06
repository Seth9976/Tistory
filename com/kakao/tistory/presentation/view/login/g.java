package com.kakao.tistory.presentation.view.login;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final KakaoLoginActivity a;
    public final Context b;

    public g(KakaoLoginActivity kakaoLoginActivity0, Context context0) {
        this.a = kakaoLoginActivity0;
        this.b = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KakaoLoginActivity.access$getKakaoLoginViewModel(this.a).onClickKakaoLogin(this.b);
        return Unit.INSTANCE;
    }
}

