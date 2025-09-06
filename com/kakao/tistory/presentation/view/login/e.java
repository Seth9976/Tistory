package com.kakao.tistory.presentation.view.login;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final KakaoLoginActivity a;
    public final Context b;

    public e(KakaoLoginActivity kakaoLoginActivity0, Context context0) {
        this.a = kakaoLoginActivity0;
        this.b = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KakaoLoginActivity.access$getKakaoLoginViewModel(this.a).onClickKakaoDirectlyEnterLogin(this.b);
        return Unit.INSTANCE;
    }
}

