package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.Failed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenueFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadVendorList;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedVendorList;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i0 extends SuspendLambda implements Function2 {
    public int a;
    public final RevenueViewModel b;
    public final RevenueIntent c;

    public i0(RevenueViewModel revenueViewModel0, RevenueIntent revenueIntent0, Continuation continuation0) {
        this.b = revenueViewModel0;
        this.c = revenueIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i0(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new i0(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = ((LoadVendorList)this.c).getBlogName();
                this.a = 1;
                object0 = this.b.f.invoke(s, this);
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
        RevenueViewModel revenueViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            revenueViewModel0.sendIntent(new LoadedVendorList(Vendor.Companion.toVendorList(((List)((Success)(((Result)object0))).getData()))));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            revenueViewModel0.sendIntent(new LoadRevenueFailed(Failed.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}

