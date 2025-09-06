package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.presentation.common.tiara.TistoryGNBTiaraKt;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final Function0 a;

    public p(Function0 function00) {
        this.a = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistoryGNBTiaraKt.trackClickAppBarBlogImage$default(HomeTiara.INSTANCE, false, 1, null);
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

