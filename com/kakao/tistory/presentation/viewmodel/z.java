package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z extends SuspendLambda implements Function2 {
    public DraftViewModel a;
    public long b;
    public int c;
    public final DraftViewModel d;
    public final long e;

    public z(DraftViewModel draftViewModel0, long v, Continuation continuation0) {
        this.d = draftViewModel0;
        this.e = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z(this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z(this.d, this.e, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v1;
        DraftViewModel draftViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.d.h.getOldCurrentBlogName().getValue();
                if(s != null) {
                    DraftViewModel draftViewModel0 = this.d;
                    long v = this.e;
                    this.a = draftViewModel0;
                    this.b = v;
                    this.c = 1;
                    object0 = draftViewModel0.g.deleteDraft(s, v, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    draftViewModel1 = draftViewModel0;
                    v1 = v;
                    goto label_20;
                }
                break;
            }
            case 1: {
                v1 = this.b;
                draftViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_20:
                if(((Result)object0) instanceof Success) {
                    Logger.INSTANCE.log("deleteDraft success " + ((Success)(((Result)object0))).getData());
                    draftViewModel1.l.setValue(new Event(Boxing.boxLong(v1)));
                    draftViewModel1.requestRefresh();
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    Logger.INSTANCE.error("deleteDraft " + ((Fail)(((Result)object0))).getErrorModel());
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

