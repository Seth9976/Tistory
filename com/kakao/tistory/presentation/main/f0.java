package com.kakao.tistory.presentation.main;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class f0 extends SuspendLambda implements Function2 {
    public Object a;
    public final MainAppViewModel b;

    public f0(MainAppViewModel mainAppViewModel0, Continuation continuation0) {
        this.b = mainAppViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        f0 f00 = new f0(this.b, ((Continuation)object1));
        f00.a = (CoroutineScope)object0;
        return f00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.a;
        BuildersKt.launch$default(coroutineScope0, null, null, new a0(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new c0(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new e0(this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

