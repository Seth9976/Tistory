package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRefererKeyword;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k2 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final String c;

    public k2(BlogMainViewModel blogMainViewModel0, String s, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k2(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k2(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.n.invoke(this.c, this);
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
        UpdateStatisticsRefererKeyword blogMainIntent$UpdateStatisticsRefererKeyword0 = new UpdateStatisticsRefererKeyword(((Result)object0));
        this.b.sendIntent(blogMainIntent$UpdateStatisticsRefererKeyword0);
        return Unit.INSTANCE;
    }
}

