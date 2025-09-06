package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public int a;
    public final boolean b;
    public final GuestbookViewModel c;
    public final String d;
    public final long e;

    public k(boolean z, GuestbookViewModel guestbookViewModel0, String s, long v, Continuation continuation0) {
        this.b = z;
        this.c = guestbookViewModel0;
        this.d = s;
        this.e = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Result result0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b) {
                    this.a = 1;
                    object0 = this.c.I.invoke(this.d, this.e, this);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                else {
                    this.a = 2;
                    object0 = this.c.J.invoke(this.d, this.e, this);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                result0 = (Result)object0;
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                result0 = (Result)object0;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                result0 = (Result)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        GuestbookViewModel guestbookViewModel0 = this.c;
        long v = this.e;
        if(result0 instanceof Success) {
            guestbookViewModel0.sendIntent(new RefreshCommentList(Boxing.boxLong(v), false, 2, null));
        }
        return Unit.INSTANCE;
    }
}

