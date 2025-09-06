package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final String a;

    public a(String s) {
        this.a = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Number)object0).intValue();
        HomeTiara.INSTANCE.trackClickCategoryMore(this.a);
        return Unit.INSTANCE;
    }
}

