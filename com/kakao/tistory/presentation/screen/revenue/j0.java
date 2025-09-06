package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.usecase.RevenueInfo;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueAnotherFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueTimeout;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenue;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenueFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedRevenue;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class j0 extends SuspendLambda implements Function2 {
    public Object a;
    public final RevenueViewModel b;
    public final RevenueIntent c;

    public j0(RevenueViewModel revenueViewModel0, RevenueIntent revenueIntent0, Continuation continuation0) {
        this.b = revenueViewModel0;
        this.c = revenueIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j0(this.b, this.c, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j0)this.create(((Result)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Result result0 = (Result)this.a;
        RevenueViewModel revenueViewModel0 = this.b;
        RevenueIntent revenueIntent0 = this.c;
        if(result0 instanceof Success) {
            revenueViewModel0.sendIntent(new LoadedRevenue(((LoadRevenue)revenueIntent0).getSelectedVendor(), ((LoadRevenue)revenueIntent0).getPeriodType(), RevenueMapperKt.toUiState(((RevenueInfo)((Success)result0).getData()), ((LoadRevenue)revenueIntent0).getPeriodType())));
            return Unit.INSTANCE;
        }
        if(result0 instanceof Fail) {
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "UNAUTHORIZED")) {
                revenueViewModel0.sendIntent(new LoadRevenueFailed(RevenueFailed.INSTANCE));
                return Unit.INSTANCE;
            }
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "GATEWAY_TIMEOUT")) {
                revenueViewModel0.sendIntent(new LoadRevenueFailed(RevenueTimeout.INSTANCE));
                return Unit.INSTANCE;
            }
            revenueViewModel0.sendIntent(new LoadRevenueFailed(new RevenueAnotherFailed(((Fail)result0).getErrorModel().getTitle(), ((Fail)result0).getErrorModel().getMessage())));
        }
        return Unit.INSTANCE;
    }
}

