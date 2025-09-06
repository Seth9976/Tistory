package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public static final d a;

    static {
        d.a = new d();
    }

    public d() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Number)object0).intValue();
        HomeTiara.INSTANCE.trackClickCreatorMore();
        return Unit.INSTANCE;
    }
}

