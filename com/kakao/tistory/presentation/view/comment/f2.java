package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f2 extends SuspendLambda implements Function2 {
    public int a;
    public final CommentNavViewModel b;
    public final String c;
    public final Long d;
    public final String e;
    public final CommentItem f;

    public f2(CommentNavViewModel commentNavViewModel0, String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, Continuation continuation0) {
        this.b = commentNavViewModel0;
        this.c = s;
        this.d = long0;
        this.e = s1;
        this.f = commentItemType$CommentItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f2(this.b, this.c, this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Modify commentPageType$Modify0 = new Modify(this.c, this.d, this.e, this.f);
                this.a = 1;
                return this.b.g.emit(commentPageType$Modify0, this) == object1 ? object1 : Unit.INSTANCE;
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

