package com.kakao.tistory.presentation.widget.swipe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final CommonSwipeGroupState a;
    public final int b;

    public f(CommonSwipeGroupState commonSwipeGroupState0, int v) {
        this.a = commonSwipeGroupState0;
        this.b = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            this.a.updateIndex(this.b);
            return Unit.INSTANCE;
        }
        this.a.clearSwipe();
        return Unit.INSTANCE;
    }
}

