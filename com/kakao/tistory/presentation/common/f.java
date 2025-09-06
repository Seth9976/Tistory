package com.kakao.tistory.presentation.common;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class f extends FunctionReferenceImpl implements SuspendFunction, Function3 {
    public f(TistoryMVIViewmodel tistoryMVIViewmodel0) {
        super(3, tistoryMVIViewmodel0, TistoryMVIViewmodel.class, "handleIntent", "handleIntent(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return ((TistoryMVIViewmodel)this.receiver).handleIntent(object0, object1, ((Continuation)object2));
    }
}

