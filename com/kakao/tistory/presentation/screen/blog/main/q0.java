package com.kakao.tistory.presentation.screen.blog.main;

import androidx.lifecycle.FlowLiveDataConversions;
import com.kakao.tistory.presentation.common.livedata.ChangedEntryLiveData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class q0 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;

    public q0(BlogMainViewModel blogMainViewModel0, Continuation continuation0) {
        this.b = blogMainViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q0(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new q0(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowLiveDataConversions.asFlow(new ChangedEntryLiveData(this.b.t.getDeletedEntryIds()));
                p0 p00 = new p0(this.b);
                this.a = 1;
                return flow0.collect(p00, this) == object1 ? object1 : Unit.INSTANCE;
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

