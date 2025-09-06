package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Today;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final Today a;
    public final Function1 b;

    public s(Today homeSlotContent$Today0, Function1 function10) {
        this.a = homeSlotContent$Today0;
        this.b = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getBlogName();
        if(s != null) {
            this.b.invoke(s);
        }
        return Unit.INSTANCE;
    }
}

