package com.kakao.tistory.presentation.screen.blog.noticeList;

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

public final class z extends SuspendLambda implements Function2 {
    public int a;
    public final BlogNoticeListViewModel b;

    public z(BlogNoticeListViewModel blogNoticeListViewModel0, Continuation continuation0) {
        this.b = blogNoticeListViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowLiveDataConversions.asFlow(new ChangedEntryLiveData(this.b.h.getDeletedEntryIds()));
                y y0 = new y(this.b);
                this.a = 1;
                return flow0.collect(y0, this) == object1 ? object1 : Unit.INSTANCE;
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

