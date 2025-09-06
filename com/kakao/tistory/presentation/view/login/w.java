package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final KakaoLoginActivity a;

    public w(KakaoLoginActivity kakaoLoginActivity0) {
        this.a = kakaoLoginActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668804281, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.onCreate.<anonymous>.<anonymous> (KakaoLoginActivity.kt:79)");
        }
        KakaoLoginActivity.access$KakaoLoginScreen(this.a, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

