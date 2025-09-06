package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

public final class a extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final CheckSingUpUseCase c;
    public final String d;

    public a(CheckSingUpUseCase checkSingUpUseCase0, String s, Continuation continuation0) {
        this.c = checkSingUpUseCase0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.c, this.d, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector0;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.b;
                this.b = flowCollector0;
                this.a = 1;
                object0 = this.c.a.checkDuplicateEmail(this.d, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                flowCollector0 = (FlowCollector)this.b;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: 
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            Success result$Success0 = new Success(Unit.INSTANCE);
            this.b = null;
            this.a = 2;
            if(flowCollector0.emit(result$Success0, this) == object1) {
                return object1;
            }
        }
        else if(((Result)object0) instanceof Fail) {
            Fail result$Fail0 = new Fail(((Fail)(((Result)object0))).getErrorModel());
            this.b = null;
            this.a = 3;
            if(flowCollector0.emit(result$Fail0, this) == object1) {
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}

