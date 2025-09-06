package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l extends SuspendLambda implements Function2 {
    public int a;
    public final PostCommentViewModel b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;
    public final boolean i;

    public l(PostCommentViewModel postCommentViewModel0, String s, long v, String s1, String s2, Long long0, Long long1, boolean z, Continuation continuation0) {
        this.b = postCommentViewModel0;
        this.c = s;
        this.d = v;
        this.e = s1;
        this.f = s2;
        this.g = long0;
        this.h = long1;
        this.i = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.H.invoke(this.c, this.d, this.e, this.f, this.g, this.h, this.i, null, this);
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
        Long long0 = this.g;
        PostCommentViewModel postCommentViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            Logger.INSTANCE.log("writeComment parentCommentId : " + long0 + " ");
            CommentListViewModel.invalidate$default(postCommentViewModel0, long0, Boxing.boxLong(((CommentItem)((Success)(((Result)object0))).getData()).getId()), false, 4, null);
            postCommentViewModel0.sendActivityResultEvent(((CommentItem)((Success)(((Result)object0))).getData()).getId(), CommentActivityResultType.Updated);
        }
        else if(((Result)object0) instanceof Fail) {
            postCommentViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

