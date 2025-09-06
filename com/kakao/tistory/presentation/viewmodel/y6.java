package com.kakao.tistory.presentation.viewmodel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class y6 extends SuspendLambda implements Function2 {
    public Object a;
    public final ThrowableViewModel b;

    public y6(ThrowableViewModel throwableViewModel0, Continuation continuation0) {
        this.b = throwableViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y6(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        y6 y60 = new y6(this.b, ((Continuation)object1));
        y60.a = (CoroutineScope)object0;
        return y60.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.a;
        BuildersKt.launch$default(coroutineScope0, null, null, new t6(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new v6(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new x6(this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

