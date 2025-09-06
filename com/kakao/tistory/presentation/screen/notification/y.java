package com.kakao.tistory.presentation.screen.notification;

import com.kakao.android.base.viewmodel.Event;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class y extends SuspendLambda implements Function2 {
    public int a;
    public final NotificationViewModel b;
    public final long c;
    public final NotificationItem d;

    public y(NotificationViewModel notificationViewModel0, long v, NotificationItem notificationItem0, Continuation continuation0) {
        this.b = notificationViewModel0;
        this.c = v;
        this.d = notificationItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.putNotificationRead(this.c, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        boolean z = ((Result)object0) instanceof Success;
        if(this.d.getLink() == null && Intrinsics.areEqual(((Notification)this.d).getType(), "backup")) {
            this.b.q.setValue(new Event(Unit.INSTANCE));
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(((Notification)this.d).getType(), "pc")) {
            this.b.s.setValue(new Event(Unit.INSTANCE));
            return Unit.INSTANCE;
        }
        NotificationViewModel.access$goToDestination(this.b, this.d);
        return Unit.INSTANCE;
    }
}

