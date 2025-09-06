package com.kakao.tistory.presentation.screen.revenue.item;

import com.kakao.tistory.domain.revenue.entity.RevenueGraph;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class a extends SuspendLambda implements Function2 {
    public Object a;
    public final GraphPeriodType b;

    public a(GraphPeriodType graphPeriodType0, Continuation continuation0) {
        this.b = graphPeriodType0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        a a0 = new a(this.b, ((Continuation)object1));
        a0.a = (RevenueGraph)object0;
        return a0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return RevenueMapperKt.toUiState(((RevenueGraph)this.a), this.b);
    }
}

