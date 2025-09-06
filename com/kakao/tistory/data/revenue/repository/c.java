package com.kakao.tistory.data.revenue.repository;

import androidx.paging.Pager;
import com.kakao.tistory.data.revenue.datasource.RevenueGraphDataSourceKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final String c;
    public final RevenueVendorRepositoryImpl d;
    public final String e;
    public final String f;
    public final String g;

    public c(String s, RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0, String s1, String s2, String s3, Continuation continuation0) {
        this.c = s;
        this.d = revenueVendorRepositoryImpl0;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.c, this.d, this.e, this.f, this.g, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.b;
                Pager pager0 = RevenueGraphDataSourceKt.revenuePager$default(0, new b(this.c, this.d, this.e, this.f, this.g, null), 1, null);
                this.a = 1;
                return flowCollector0.emit(pager0, this) == object1 ? object1 : Unit.INSTANCE;
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

