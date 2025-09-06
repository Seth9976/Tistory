package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class o0 extends SuspendLambda implements Function2 {
    public Object a;
    public final MutableState b;

    public o0(MutableState mutableState0, Continuation continuation0) {
        this.b = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        o0 o00 = new o0(this.b, ((Continuation)object1));
        o00.a = (DialogEvent)object0;
        return o00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        TistoryComposeDialogKt.access$DialogHandler$lambda$2(this.b, ((DialogEvent)this.a));
        return Unit.INSTANCE;
    }
}

