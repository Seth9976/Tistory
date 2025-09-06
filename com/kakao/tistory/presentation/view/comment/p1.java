package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p1 extends SuspendLambda implements Function2 {
    public int a;
    public final CommentListViewModel b;
    public final CommentItem c;
    public final Long d;

    public p1(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, Long long0, Continuation continuation0) {
        this.b = commentListViewModel0;
        this.c = commentItemType$CommentItem0;
        this.d = long0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p1(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.deleteComment(this.c, this);
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
        if(((Result)object0) != null) {
            CommentListViewModel commentListViewModel0 = this.b;
            Long long0 = this.d;
            CommentItem commentItemType$CommentItem0 = this.c;
            if(((Result)object0) instanceof Success) {
                Success result$Success0 = (Success)(((Result)object0));
                commentListViewModel0.sendIntent(new RefreshCommentList(long0, false));
                commentListViewModel0.sendActivityResultEvent(commentItemType$CommentItem0.getId(), CommentActivityResultType.Updated);
                return Unit.INSTANCE;
            }
            if(((Result)object0) instanceof Fail) {
                commentListViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
            }
        }
        return Unit.INSTANCE;
    }
}

