package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.entity.RevenueSupport;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueInfoUseCase;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenue;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedRevenueSupport;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt;
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

public final class k0 extends SuspendLambda implements Function2 {
    public int a;
    public final Vendor b;
    public final RevenueViewModel c;
    public final RevenueUiState d;
    public final RevenueIntent e;

    public k0(Vendor vendor0, RevenueViewModel revenueViewModel0, RevenueUiState revenueUiState0, RevenueIntent revenueIntent0, Continuation continuation0) {
        this.b = vendor0;
        this.c = revenueViewModel0;
        this.d = revenueUiState0;
        this.e = revenueIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k0(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b == Vendor.SUPPORT) {
                    this.a = 2;
                    object0 = this.c.i.invoke(this.d.getBlogName(), this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_19;
                }
                else {
                    String s = ((LoadRevenue)this.e).getPeriodType().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                    Flow flow0 = GetRevenueInfoUseCase.invoke$default(this.c.g, this.d.getBlogName(), this.b.name(), s, null, "2025-09-06", 8, null);
                    j0 j00 = new j0(this.c, this.e, null);
                    this.a = 1;
                    if(FlowKt.collectLatest(flow0, j00, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
            label_19:
                RevenueViewModel revenueViewModel0 = this.c;
                RevenueIntent revenueIntent0 = this.e;
                if(((Result)object0) instanceof Success) {
                    revenueViewModel0.sendIntent(new LoadedRevenueSupport(((LoadRevenue)revenueIntent0).getSelectedVendor(), RevenueMapperKt.toUiState(((RevenueSupport)((Success)(((Result)object0))).getData()))));
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

