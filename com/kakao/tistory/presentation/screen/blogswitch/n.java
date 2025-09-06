package com.kakao.tistory.presentation.screen.blogswitch;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public int a;
    public final BlogSwitchViewModel b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;

    public n(BlogSwitchViewModel blogSwitchViewModel0, Function0 function00, Function0 function01, Function0 function02, Continuation continuation0) {
        this.b = blogSwitchViewModel0;
        this.c = function00;
        this.d = function01;
        this.e = function02;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                m m0 = new m(this.c, this.d, this.e, null);
                this.a = 1;
                return FlowKt.collectLatest(this.b.getEvent(), m0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

