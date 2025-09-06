package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.SearchKeywordItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import qd.a;

public final class i4 extends SuspendLambda implements Function2 {
    public int a;
    public final SearchViewModel b;
    public final SearchKeywordItem c;

    public i4(SearchViewModel searchViewModel0, SearchKeywordItem searchKeywordItem0, Continuation continuation0) {
        this.b = searchViewModel0;
        this.c = searchKeywordItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i4(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new i4(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h4 h40 = new h4(this.b, this.c, null);
                this.a = 1;
                if(BuildersKt.withContext(Dispatchers.getIO(), h40, this) == object1) {
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
        this.b.getRecentKeywords();
        return Unit.INSTANCE;
    }
}

