package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class p extends SuspendLambda implements Function2 {
    public final boolean a;
    public final Function0 b;
    public final MutableState c;

    public p(boolean z, Function0 function00, MutableState mutableState0, Continuation continuation0) {
        this.a = z;
        this.b = function00;
        this.c = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a && !CommonExceptionViewKt.access$CommonExceptionView$lambda$6(this.c)) {
            this.b.invoke();
        }
        CommonExceptionViewKt.access$CommonExceptionView$lambda$7(this.c, this.a);
        return Unit.INSTANCE;
    }
}

