package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.CommentItemType;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModelKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class i extends SuspendLambda implements Function2 {
    public Object a;
    public final PostCommentViewModel b;
    public final ObjectRef c;

    public i(PostCommentViewModel postCommentViewModel0, ObjectRef ref$ObjectRef0, Continuation continuation0) {
        this.b = postCommentViewModel0;
        this.c = ref$ObjectRef0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.b, this.c, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CommentItemType)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CommentItemType commentItemType0 = (CommentItemType)this.a;
        CommentItemUIModel commentItemUIModel0 = CommentItemUIModelKt.toUIModel$default(commentItemType0, this.b, ((CommentItem)this.c.element), false, false, 12, null);
        if(commentItemType0 instanceof CommentItem) {
            this.c.element = commentItemType0;
        }
        return commentItemUIModel0;
    }
}

