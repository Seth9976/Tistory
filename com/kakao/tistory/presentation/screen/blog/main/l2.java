package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRevenueEnable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l2 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final String c;

    public l2(BlogMainViewModel blogMainViewModel0, String s, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l2(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new l2(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.o.invoke(this.c, this);
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
        List list0 = null;
        Success result$Success0 = object0 instanceof Success ? ((Success)object0) : null;
        if(result$Success0 != null) {
            list0 = (List)result$Success0.getData();
        }
        if(list0 == null || !list0.isEmpty() != 1) {
            z = false;
        }
        UpdateStatisticsRevenueEnable blogMainIntent$UpdateStatisticsRevenueEnable0 = new UpdateStatisticsRevenueEnable(z);
        this.b.sendIntent(blogMainIntent$UpdateStatisticsRevenueEnable0);
        return Unit.INSTANCE;
    }
}

