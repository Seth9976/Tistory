package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.domain.entity.entry.DraftItemResult;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c0 extends SuspendLambda implements Function2 {
    public DraftViewModel a;
    public int b;
    public final DraftViewModel c;
    public final DraftItem d;

    public c0(DraftViewModel draftViewModel0, DraftItem draftItem0, Continuation continuation0) {
        this.c = draftViewModel0;
        this.d = draftItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c0(this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new c0(this.c, this.d, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        DraftViewModel draftViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.c.h.getOldCurrentBlogName().getValue();
                if(s != null) {
                    DraftViewModel draftViewModel0 = this.c;
                    this.a = draftViewModel0;
                    this.b = 1;
                    object0 = draftViewModel0.g.getDraft(s, this.d.getSequence(), this);
                    if(object0 == object1) {
                        return object1;
                    }
                    draftViewModel1 = draftViewModel0;
                    goto label_16;
                }
                break;
            }
            case 1: {
                draftViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_16:
                if(((Result)object0) instanceof Success) {
                    draftViewModel1.k.postValue(new Event(((DraftItemResult)((Success)(((Result)object0))).getData()).getDraft()));
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    Logger.INSTANCE.error("getDraft " + ((Fail)(((Result)object0))));
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

