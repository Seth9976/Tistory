package com.kakao.tistory.presentation.common.push;

import com.kakao.tistory.domain.entity.push.PushMessage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int a;
    public final PushMessagingService b;
    public final PushMessage c;

    public c(PushMessagingService pushMessagingService0, PushMessage pushMessage0, Continuation continuation0) {
        this.b = pushMessagingService0;
        this.c = pushMessage0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new c(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PushMessageBuilder pushMessageBuilder0 = this.b.getPushMessageBuilder();
                Intrinsics.checkNotNullExpressionValue(this.c, "$pushMessage");
                this.a = 1;
                return pushMessageBuilder0.sendNotification(this.c, this) == object1 ? object1 : Unit.INSTANCE;
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

