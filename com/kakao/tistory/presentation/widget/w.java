package com.kakao.tistory.presentation.widget;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class w extends SuspendLambda implements Function2 {
    public final State a;
    public final State b;

    public w(State state0, State state1, Continuation continuation0) {
        this.a = state0;
        this.b = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new w(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(LazyListLoadMoreHandlerKt.access$LazyListLoadMoreHandler$lambda$2(this.a)) {
            LazyListLoadMoreHandlerKt.access$LazyListLoadMoreHandler$lambda$0(this.b).invoke();
        }
        return Unit.INSTANCE;
    }
}

