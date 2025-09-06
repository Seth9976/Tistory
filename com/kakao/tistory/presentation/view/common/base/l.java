package com.kakao.tistory.presentation.view.common.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final TistoryComposeFragment a;

    public l(TistoryComposeFragment tistoryComposeFragment0) {
        this.a = tistoryComposeFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = !Intrinsics.areEqual(this.a.isNetworkConnected().getValue(), Boolean.TRUE);
        return Unit.INSTANCE;
    }
}

