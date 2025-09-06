package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SortItem.LogRefSortItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m3 extends SuspendLambda implements Function2 {
    public int a;
    public final RefererLogViewModel b;
    public final LogRefSortItem c;

    public m3(RefererLogViewModel refererLogViewModel0, LogRefSortItem sortItem$LogRefSortItem0, Continuation continuation0) {
        this.b = refererLogViewModel0;
        this.c = sortItem$LogRefSortItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m3(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new m3(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.b.i;
                if(s == null) {
                    Blog blog0 = (Blog)this.b.h.getValue();
                    s = blog0 == null ? null : blog0.getName();
                }
                if(s != null) {
                    this.a = 1;
                    if(this.b.g.getRefLog(s, this.c.getValue(), this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

