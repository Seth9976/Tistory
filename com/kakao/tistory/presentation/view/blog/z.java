package com.kakao.tistory.presentation.view.blog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public static final z a;

    static {
        z.a = new z();
    }

    public z() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FollowingTiara.trackClickSort$default(FollowingTiara.INSTANCE, null, 1, null);
        return Unit.INSTANCE;
    }
}

