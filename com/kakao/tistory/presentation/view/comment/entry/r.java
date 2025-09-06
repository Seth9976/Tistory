package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModelKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class r extends SuspendLambda implements Function2 {
    public Object a;
    public final PostPinCommentViewModel b;

    public r(PostPinCommentViewModel postPinCommentViewModel0, Continuation continuation0) {
        this.b = postPinCommentViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        r r0 = new r(this.b, ((Continuation)object1));
        r0.a = (PinComment)object0;
        return r0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        PinComment pinComment0 = (PinComment)this.a;
        this.b.S = Boxing.boxLong(pinComment0.getComment().getId());
        return CommentItemUIModelKt.toCommentList(pinComment0, this.b);
    }
}

