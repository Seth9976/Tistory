package com.kakao.tistory.presentation.view.blog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FollowingTiara.INSTANCE.trackClickSort("구독자");
        return Unit.INSTANCE;
    }
}

