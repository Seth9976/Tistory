package com.kakao.tistory.presentation.view.common.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final TistoryRecyclerFragment a;

    public t(TistoryRecyclerFragment tistoryRecyclerFragment0) {
        this.a = tistoryRecyclerFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(Intrinsics.areEqual(this.a.isNetworkConnected().getValue(), Boolean.TRUE)) {
            this.a.refresh();
        }
        return Unit.INSTANCE;
    }
}

