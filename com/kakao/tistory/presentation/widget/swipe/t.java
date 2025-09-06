package com.kakao.tistory.presentation.widget.swipe;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

public final class t extends SuspendLambda implements Function3 {
    public final Function1 a;

    public t(Function1 function10, Continuation continuation0) {
        this.a = function10;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new t(this.a, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a.invoke(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}

