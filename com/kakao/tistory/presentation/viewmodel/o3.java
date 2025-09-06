package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.IllegalFilmReportUrl;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class o3 extends SuspendLambda implements Function2 {
    public int a;
    public final ReportViewModel b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final BlogTopReportData g;

    public o3(ReportViewModel reportViewModel0, String s, String s1, Long long0, Long long1, BlogTopReportData blogTopReportData0, Continuation continuation0) {
        this.b = reportViewModel0;
        this.c = s;
        this.d = s1;
        this.e = long0;
        this.f = long1;
        this.g = blogTopReportData0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o3(this.b, this.c, this.d, this.e, this.f, this.g, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                long v = ReportViewModel.access$getBlogId(this.b);
                this.a = 1;
                object2 = this.b.k.invoke(this.c, this.d, v, this.e, this.f, (this.g == null ? null : this.g.getUserKey()), (this.g == null ? null : this.g.getUserName()), (this.g == null ? null : this.g.getNickname()), (this.g == null ? null : this.g.getDescription()), (this.g == null ? null : this.g.getImageUrl()), (this.g == null ? null : this.g.getViewUrl()), (this.g == null ? null : Boxing.boxBoolean(this.g.isFlash())), this);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ReportViewModel reportViewModel0 = this.b;
        if(((Result)object2) instanceof Success) {
            IllegalFilmReportUrl illegalFilmReportUrl0 = (IllegalFilmReportUrl)((Success)(((Result)object2))).getData();
            if(illegalFilmReportUrl0 != null) {
                String s = illegalFilmReportUrl0.getUrl();
                if(s != null) {
                    reportViewModel0.F.postValue(s);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

