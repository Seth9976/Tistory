package com.kakao.tistory.presentation.widget.swipe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final CommonSwipeState a;

    public p(CommonSwipeState commonSwipeState0) {
        this.a = commonSwipeState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.updateOffset(DragDirection.Start, ((Number)object0).intValue());
        return Unit.INSTANCE;
    }
}

