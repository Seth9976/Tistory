package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.Clear;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.Init;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class x0 extends SuspendLambda implements Function2 {
    public final State a;
    public final CommentFragment b;

    public x0(State state0, CommentFragment commentFragment0, Continuation continuation0) {
        this.a = state0;
        this.b = commentFragment0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x0(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x0(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CommentPageType commentPageType0 = CommentFragment.access$Content$lambda$5$lambda$0(this.a);
        CommentFragment commentFragment0 = this.b;
        if(commentPageType0 instanceof List) {
            commentFragment0.getCommentModifyViewModel().sendIntent(Clear.INSTANCE);
            return Unit.INSTANCE;
        }
        if(commentPageType0 instanceof Modify) {
            commentFragment0.getCommentModifyViewModel().sendIntent(new Init(((Modify)commentPageType0).getBlogName(), ((Modify)commentPageType0).getEntryId(), ((Modify)commentPageType0).getGuestPassword(), ((Modify)commentPageType0).getCommentItem()));
        }
        return Unit.INSTANCE;
    }
}

