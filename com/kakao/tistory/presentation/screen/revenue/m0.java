package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.SelectedGraphItem;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueUiState;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class m0 extends SuspendLambda implements Function2 {
    public int a;
    public final RevenueViewModel b;
    public final RevenueUiState c;
    public final Vendor d;
    public final RevenueIntent e;

    public m0(RevenueViewModel revenueViewModel0, RevenueUiState revenueUiState0, Vendor vendor0, RevenueIntent revenueIntent0, Continuation continuation0) {
        this.b = revenueViewModel0;
        this.c = revenueUiState0;
        this.d = vendor0;
        this.e = revenueIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m0(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.c.getGranularity().name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                String s1 = ((SelectedGraphItem)this.e).getGraphPeriod().getEndDate();
                String s2 = ((SelectedGraphItem)this.e).getGraphPeriod().getStartDate();
                Flow flow0 = this.b.h.invoke(this.c.getBlogName(), this.d.name(), s, s2, s1);
                l0 l00 = new l0(this.b, null);
                this.a = 1;
                return FlowKt.collectLatest(flow0, l00, this) == object1 ? object1 : Unit.INSTANCE;
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

