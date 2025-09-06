package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.entity.RevenueGraphDetailInfo;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedGraphDetailInfo;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class l0 extends SuspendLambda implements Function2 {
    public Object a;
    public final RevenueViewModel b;

    public l0(RevenueViewModel revenueViewModel0, Continuation continuation0) {
        this.b = revenueViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new l0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        l0 l00 = new l0(this.b, ((Continuation)object1));
        l00.a = (Result)object0;
        return l00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Result result0 = (Result)this.a;
        RevenueViewModel revenueViewModel0 = this.b;
        if(result0 instanceof Success) {
            revenueViewModel0.sendIntent(new LoadedGraphDetailInfo(RevenueMapperKt.toUiState(((RevenueGraphDetailInfo)((Success)result0).getData()))));
        }
        return Unit.INSTANCE;
    }
}

