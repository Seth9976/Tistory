package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final Banner a;
    public final Function1 b;

    public v(Banner homeSlotContent$Banner0, Function1 function10) {
        this.a = homeSlotContent$Banner0;
        this.b = function10;
        super(0);
    }

    // 去混淆评级： 低(26)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeTiara.INSTANCE.trackClickBanner("");
        this.b.invoke("");
        return Unit.INSTANCE;
    }
}

