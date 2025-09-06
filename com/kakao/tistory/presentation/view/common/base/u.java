package com.kakao.tistory.presentation.view.common.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final TistoryRecyclerFragment a;

    public u(TistoryRecyclerFragment tistoryRecyclerFragment0) {
        this.a = tistoryRecyclerFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.refresh();
        this.a.hideExceptionView();
        return Unit.INSTANCE;
    }
}

