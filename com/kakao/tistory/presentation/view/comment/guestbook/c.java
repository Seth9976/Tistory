package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.BackToList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int a;
    public final GuestbookModifyViewModel b;
    public final String c;
    public final long d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final boolean h;

    public c(GuestbookModifyViewModel guestbookModifyViewModel0, String s, long v, String s1, Long long0, boolean z, boolean z1, Continuation continuation0) {
        this.b = guestbookModifyViewModel0;
        this.c = s;
        this.d = v;
        this.e = s1;
        this.f = long0;
        this.g = z;
        this.h = z1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.n.invoke(this.c, this.d, this.e, this.f, this.g, this);
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
        GuestbookModifyViewModel guestbookModifyViewModel0 = this.b;
        boolean z = this.h;
        if(((Result)object0) instanceof Success) {
            guestbookModifyViewModel0.sendEvent(new BackToList(Boxing.boxLong(((CommentItem)((Success)(((Result)object0))).getData()).getId())));
            guestbookModifyViewModel0.sendActivityResultEvent(CommentActivityResultType.Updated, z);
        }
        else if(((Result)object0) instanceof Fail) {
            guestbookModifyViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

