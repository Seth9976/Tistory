package com.kakao.tistory.presentation.view.comment.entry;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class q extends SuspendLambda implements Function1 {
    public int a;
    public final PostPinCommentViewModel b;
    public final String c;
    public final Long d;

    public q(PostPinCommentViewModel postPinCommentViewModel0, String s, Long long0, Continuation continuation0) {
        this.b = postPinCommentViewModel0;
        this.c = s;
        this.d = long0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new q(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((q)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.R.invoke(this.c, ((long)this.d), this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

