package com.kakao.tistory.domain.revenue.usecase;

import androidx.paging.Pager;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.entity.RevenueGraphDetailInfo;
import com.kakao.tistory.domain.revenue.entity.RevenueSummary;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

public final class a extends SuspendLambda implements Function4 {
    public Result a;
    public Pager b;
    public Result c;

    public a(Continuation continuation0) {
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        a a0 = new a(((Continuation)object3));
        a0.a = (Result)object0;
        a0.b = (Pager)object1;
        a0.c = (Result)object2;
        return a0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Result result0 = this.a;
        Pager pager0 = this.b;
        Result result1 = this.c;
        if(result0 instanceof Success && result1 instanceof Success) {
            return new Success(new RevenueInfo(((RevenueSummary)((Success)result0).getData()), pager0, ((RevenueGraphDetailInfo)((Success)result1).getData())));
        }
        if(result0 instanceof Fail) {
            return new Fail(((Fail)result0).getErrorModel());
        }
        return result1 instanceof Fail ? new Fail(((Fail)result1).getErrorModel()) : new Fail(new ErrorModel());
    }
}

