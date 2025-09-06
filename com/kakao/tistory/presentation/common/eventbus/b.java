package com.kakao.tistory.presentation.common.eventbus;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

public final class b implements FlowCollector {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.invoke(((TistoryEventBus)object0));
        return Unit.INSTANCE;
    }
}

