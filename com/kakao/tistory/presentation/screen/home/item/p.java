package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final Function1 a;
    public final Focus b;

    public p(Function1 function10, Focus homeSlotContent$Focus0) {
        this.a = function10;
        this.b = homeSlotContent$Focus0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke("");
        return Unit.INSTANCE;
    }
}

