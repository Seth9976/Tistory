package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class i2 extends Lambda implements Function1 {
    public final KakaoLoginViewModel a;
    public final Function0 b;

    public i2(KakaoLoginViewModel kakaoLoginViewModel0, Function0 function00) {
        this.a = kakaoLoginViewModel0;
        this.b = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.a), null, null, new h2(((String)object0), this.a, this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

