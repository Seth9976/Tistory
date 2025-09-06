package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class u5 extends SuspendLambda implements Function2 {
    public u5(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u5(continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        User user0 = (User)object0;
        return new u5(((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Logger.INSTANCE.log("SplashViewModel userFlow.collectLatest");
        return Unit.INSTANCE;
    }
}

