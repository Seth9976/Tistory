package com.kakao.tistory.presentation;

import com.kakao.tistory.domain.entity.User;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class v extends SuspendLambda implements Function2 {
    public v(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v(continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        User user0 = (User)object0;
        new v(((Continuation)object1));
        ResultKt.throwOnFailure(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return Unit.INSTANCE;
    }
}

