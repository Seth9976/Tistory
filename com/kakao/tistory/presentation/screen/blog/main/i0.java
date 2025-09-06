package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.NeedGuide;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class i0 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;

    public i0(BlogMainViewModel blogMainViewModel0, Continuation continuation0) {
        this.b = blogMainViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i0(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new i0(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.q.invoke(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_9;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_9:
                this.a = 2;
                object0 = FlowKt.first(((Flow)object0), this);
                if(object0 == object1) {
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
        if(((Boolean)object0).booleanValue()) {
            this.b.sendIntent(NeedGuide.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

