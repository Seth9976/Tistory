package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final KakaoLoginActivity a;
    public final int b;

    public l(KakaoLoginActivity kakaoLoginActivity0, int v) {
        this.a = kakaoLoginActivity0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

