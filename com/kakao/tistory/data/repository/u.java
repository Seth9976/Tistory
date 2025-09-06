package com.kakao.tistory.data.repository;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class u extends SuspendLambda implements Function1 {
    public int a;
    public final BaseRepository b;
    public final Throwable c;

    public u(BaseRepository baseRepository0, Throwable throwable0, Continuation continuation0) {
        this.b = baseRepository0;
        this.c = throwable0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new u(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new u(this.b, this.c, ((Continuation)object0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                return this.b.sendError("request api call fail because unknownError ", this.c, this) == object1 ? object1 : this.b.createUnknownErrorModel();
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return this.b.createUnknownErrorModel();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

