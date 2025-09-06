package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final KakaoLoginActivity a;

    public x(KakaoLoginActivity kakaoLoginActivity0) {
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
            ComposerKt.traceEventStart(0xC88EC5F0, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.onCreate.<anonymous> (KakaoLoginActivity.kt:78)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(668804281, true, new w(this.a), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

