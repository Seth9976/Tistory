package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final KakaoLoginActivity a;
    public final int b;
    public final Function0 c;
    public final int d;

    public m(KakaoLoginActivity kakaoLoginActivity0, int v, Function0 function00, int v1) {
        this.a = kakaoLoginActivity0;
        this.b = v;
        this.c = function00;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

