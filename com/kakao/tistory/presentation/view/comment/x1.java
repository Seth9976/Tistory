package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.common.eventbus.ChannelBus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class x1 extends SuspendLambda implements Function2 {
    public int a;
    public final CommentListViewModel b;

    public x1(CommentListViewModel commentListViewModel0, Continuation continuation0) {
        this.b = commentListViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x1(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x1(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.1 commentListViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$10 = new CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.1(ChannelBus.INSTANCE.getSharedFlow());
                CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2 commentListViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$20 = new CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2(this.b);
                this.a = 1;
                return commentListViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$10.collect(commentListViewModel$subscribeChannelBus$1$invokeSuspend$$inlined$subscribe$20, this) == object1 ? object1 : Unit.INSTANCE;
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

