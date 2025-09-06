package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.common.tiara.TistoryGNBTiaraKt;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final Function0 a;

    public m(Function0 function00) {
        this.a = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistoryGNBTiaraKt.trackClickLogo(HomeTiara.INSTANCE);
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

