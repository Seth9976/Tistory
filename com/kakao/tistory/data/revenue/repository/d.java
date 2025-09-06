package com.kakao.tistory.data.revenue.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public FlowCollector a;
    public int b;
    public Object c;
    public final RevenueVendorRepositoryImpl d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public d(RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0, String s, String s1, String s2, String s3, String s4, Continuation continuation0) {
        this.d = revenueVendorRepositoryImpl0;
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.h = s3;
        this.i = s4;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.d, this.e, this.f, this.g, this.h, this.i, continuation0);
        continuation1.c = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Fail result$Fail0;
        BaseRepository baseRepository0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.c;
                baseRepository0 = this.d;
                try {
                    this.c = baseRepository0;
                    this.a = flowCollector0;
                    this.b = 1;
                    object0 = ((RevenueVendorRepositoryImpl)baseRepository0).a.getRevenueGraphDetailInfo(this.e, this.f, this.g, this.h, this.i, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    result$Fail0 = new Success(((ItemModel)object0).getData());
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_20;
                }
                catch(Throwable throwable0) {
                    goto label_28;
                }
            }
            case 1: {
                flowCollector0 = this.a;
                baseRepository0 = (BaseRepository)this.c;
                try {
                    ResultKt.throwOnFailure(object0);
                    result$Fail0 = new Success(((ItemModel)object0).getData());
                    break;
                }
                catch(CancellationException cancellationException0) {
                label_20:
                    this.c = baseRepository0;
                    this.a = flowCollector0;
                    this.b = 2;
                    if(baseRepository0.sendError("coroutine cancel", cancellationException0, this) == object1) {
                        return object1;
                    }
                    result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                    break;
                }
                catch(Throwable throwable0) {
                label_28:
                    this.c = baseRepository0;
                    this.a = flowCollector0;
                    this.b = 3;
                    object0 = baseRepository0.createErrorModel(throwable0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_42;
                }
            }
            case 2: {
                flowCollector0 = this.a;
                baseRepository0 = (BaseRepository)this.c;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                break;
            }
            case 3: {
                flowCollector0 = this.a;
                baseRepository0 = (BaseRepository)this.c;
                ResultKt.throwOnFailure(object0);
            label_42:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
                    this.c = (ErrorModel)object0;
                    this.a = flowCollector0;
                    this.b = 4;
                    if(mutableSharedFlow0.emit(((ErrorModel)object0), this) == object1) {
                        return object1;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
                    this.c = (ErrorModel)object0;
                    this.a = flowCollector0;
                    this.b = 5;
                    if(mutableSharedFlow1.emit(((ErrorModel)object0), this) == object1) {
                        return object1;
                    }
                }
                result$Fail0 = new Fail(((ErrorModel)object0));
                break;
            }
            case 4: 
            case 5: {
                flowCollector0 = this.a;
                ErrorModel errorModel0 = (ErrorModel)this.c;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(errorModel0);
                break;
            }
            case 6: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.c = null;
        this.a = null;
        this.b = 6;
        return flowCollector0.emit(result$Fail0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

