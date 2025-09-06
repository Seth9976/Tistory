package com.kakao.tistory.presentation.view.login;

import android.app.Dialog;
import com.kakao.tistory.presentation.screen.feed.t;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final KakaoLoginViewModel a;

    public s(KakaoLoginViewModel kakaoLoginViewModel0) {
        this.a = kakaoLoginViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        this.a.goTistoryLogin(true);
        return Unit.INSTANCE;
    }
}

