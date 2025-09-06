package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Best;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final Function1 a;
    public final Best b;

    public t(Function1 function10, Best homeSlotContent$Best0) {
        this.a = function10;
        this.b = homeSlotContent$Best0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke("");
        return Unit.INSTANCE;
    }
}

