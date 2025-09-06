package com.kakao.tistory.presentation.view.comment.guestbook;

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
    public int a;
    public final GuestbookViewModel b;
    public final String c;

    public j(GuestbookViewModel guestbookViewModel0, String s, Continuation continuation0) {
        this.b = guestbookViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new j(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.K.invoke(this.c, this);
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
        GuestbookViewModel guestbookViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            PinComment pinComment0 = (PinComment)((Success)(((Result)object0))).getData();
            guestbookViewModel0.sendIntent(new LoadedPinCommentList((pinComment0 == null ? null : CommentItemUIModelKt.toUIModel(pinComment0, guestbookViewModel0, null, true, false))));
        }
        return Unit.INSTANCE;
    }
}

