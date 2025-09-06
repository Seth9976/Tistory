package com.kakao.tistory.presentation.viewmodel.base;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class c extends FunctionReferenceImpl implements SuspendFunction, Function3 {
    public c(BaseMviViewModel baseMviViewModel0) {
        super(3, baseMviViewModel0, BaseMviViewModel.class, "handleIntent", "handleIntent(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return ((BaseMviViewModel)this.receiver).handleIntent(object0, object1, ((Continuation)object2));
    }
}

