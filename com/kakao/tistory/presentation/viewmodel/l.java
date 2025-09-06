package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.eventbus.ChannelBus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l extends SuspendLambda implements Function2 {
    public int a;
    public final BlogFollowViewModel b;

    public l(BlogFollowViewModel blogFollowViewModel0, Continuation continuation0) {
        this.b = blogFollowViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new l(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BlogFollowViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.1 blogFollowViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$10 = new BlogFollowViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.1(ChannelBus.INSTANCE.getSharedFlow());
                BlogFollowViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2 blogFollowViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$20 = new BlogFollowViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2(this.b);
                this.a = 1;
                return blogFollowViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$10.collect(blogFollowViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$20, this) == object1 ? object1 : Unit.INSTANCE;
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

