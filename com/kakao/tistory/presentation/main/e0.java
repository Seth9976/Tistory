package com.kakao.tistory.presentation.main;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import qd.a;

public final class e0 extends SuspendLambda implements Function2 {
    public int a;
    public final MainAppViewModel b;

    public e0(MainAppViewModel mainAppViewModel0, Continuation continuation0) {
        this.b = mainAppViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e0(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new e0(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                if(this.b.g.getNotificationNewCount(this) == object1) {
                    return object1;
                }
                goto label_8;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_8:
                StateFlow stateFlow0 = this.b.g.getNewCount();
                d0 d00 = new d0(this.b);
                this.a = 2;
                if(stateFlow0.collect(d00, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}

