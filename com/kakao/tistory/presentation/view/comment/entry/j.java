package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModelKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.LoadedPinCommentList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j extends SuspendLambda implements Function2 {
    public PostCommentViewModel a;
    public int b;
    public final PostCommentViewModel c;

    public j(PostCommentViewModel postCommentViewModel0, Continuation continuation0) {
        this.c = postCommentViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new j(this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PostCommentViewModel postCommentViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.c.getBlogName();
                if(s != null) {
                    PostCommentViewModel postCommentViewModel0 = this.c;
                    Long long0 = postCommentViewModel0.getEntryId();
                    if(long0 != null) {
                        this.a = postCommentViewModel0;
                        this.b = 1;
                        object0 = postCommentViewModel0.L.invoke(s, long0.longValue(), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        postCommentViewModel1 = postCommentViewModel0;
                        goto label_18;
                    }
                }
                break;
            }
            case 1: {
                postCommentViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_18:
                if(((Result)object0) instanceof Success) {
                    PinComment pinComment0 = (PinComment)((Success)(((Result)object0))).getData();
                    postCommentViewModel1.sendIntent(new LoadedPinCommentList((pinComment0 == null ? null : CommentItemUIModelKt.toUIModel(pinComment0, postCommentViewModel1, null, true, false))));
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

