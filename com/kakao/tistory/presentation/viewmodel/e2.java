package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function1 {
    public final KakaoLoginViewModel a;

    public e2(KakaoLoginViewModel kakaoLoginViewModel0) {
        this.a = kakaoLoginViewModel0;
        super(1);
    }

    public final void a(OAuthToken oAuthToken0) {
        Logger.INSTANCE.log("Login : Kakao -> success oAuthToken=" + oAuthToken0);
        TiaraUtils.INSTANCE.setAccessToken(oAuthToken0.getAccessToken());
        Intrinsics.checkNotNull(oAuthToken0);
        KakaoLoginViewModel.access$postLoginByKakao(this.a, oAuthToken0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(((OAuthToken)object0));
        return Unit.INSTANCE;
    }
}

