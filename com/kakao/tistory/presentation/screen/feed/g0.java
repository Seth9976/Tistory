package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.presentation.common.eventbus.BlogFollowEvent;
import com.kakao.tistory.presentation.common.eventbus.BlogTopBlockEvent;
import com.kakao.tistory.presentation.common.eventbus.ChannelBus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g0 extends SuspendLambda implements Function2 {
    public int a;
    public final FeedViewModel b;

    public g0(FeedViewModel feedViewModel0, Continuation continuation0) {
        this.b = feedViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g0(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new g0(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f0 f00 = new f0(this.b);
                this.a = 1;
                return ChannelBus.INSTANCE.subscribe(new Class[]{BlogTopBlockEvent.class, BlogFollowEvent.class}, f00, this) == object1 ? object1 : Unit.INSTANCE;
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

