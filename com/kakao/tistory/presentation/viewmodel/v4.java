package com.kakao.tistory.presentation.viewmodel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class v4 extends SuspendLambda implements Function2 {
    public Object a;
    public final SignUpViewModel b;

    public v4(SignUpViewModel signUpViewModel0, Continuation continuation0) {
        this.b = signUpViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v4(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        v4 v40 = new v4(this.b, ((Continuation)object1));
        v40.a = (CoroutineScope)object0;
        return v40.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BuildersKt.launch$default(((CoroutineScope)this.a), null, null, new u4(this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

