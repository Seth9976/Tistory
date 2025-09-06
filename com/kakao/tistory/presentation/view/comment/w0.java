package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class w0 extends SuspendLambda implements Function2 {
    public final CommentFragment a;
    public final List b;
    public final State c;

    public w0(CommentFragment commentFragment0, List commentPageType$List0, State state0, Continuation continuation0) {
        this.a = commentFragment0;
        this.b = commentPageType$List0;
        this.c = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w0(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(CommentFragment.access$Content$lambda$5$lambda$4$lambda$1(this.c).isInitialized()) {
            this.a.getCommentListViewModel().sendIntent(new RefreshCommentList(this.b.getTargetCommentId(), false, 2, null));
        }
        return Unit.INSTANCE;
    }
}

