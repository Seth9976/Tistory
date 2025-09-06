package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModelKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class t extends SuspendLambda implements Function2 {
    public Object a;
    public final PinGuestbookViewModel b;

    public t(PinGuestbookViewModel pinGuestbookViewModel0, Continuation continuation0) {
        this.b = pinGuestbookViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t t0 = new t(this.b, ((Continuation)object1));
        t0.a = (PinComment)object0;
        return t0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        PinComment pinComment0 = (PinComment)this.a;
        this.b.R = Boxing.boxLong(pinComment0.getComment().getId());
        return CommentItemUIModelKt.toCommentList(pinComment0, this.b);
    }
}

