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
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final String c;
    public final RevenueVendorRepositoryImpl d;
    public final String e;
    public final String f;
    public final String g;

    public b(String s, RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0, String s1, String s2, String s3, Continuation continuation0) {
        this.c = s;
        this.d = revenueVendorRepositoryImpl0;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.c, this.d, this.e, this.f, this.g, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((String)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BaseRepository baseRepository1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.b;
                if(s == null) {
                    s = this.c;
                }
                try {
                    baseRepository1 = this.d;
                    this.b = baseRepository1;
                    this.a = 1;
                    object0 = ((RevenueVendorRepositoryImpl)baseRepository1).a.getRevenueGraph(this.e, this.f, this.g, s, this);
                    return object0 == object1 ? object1 : new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            case 1: {
                baseRepository1 = (BaseRepository)this.b;
                try {
                    ResultKt.throwOnFailure(object0);
                    return new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)this.b;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)this.b;
                ResultKt.throwOnFailure(object0);
                goto label_38;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)this.b;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.b = baseRepository1;
        this.a = 2;
        return baseRepository1.sendError("coroutine cancel", cancellationException0, this) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
    label_33:
        this.b = baseRepository1;
        this.a = 3;
        object0 = baseRepository1.createErrorModel(throwable0, this);
        if(object0 == object1) {
            return object1;
        }
    label_38:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            this.b = (ErrorModel)object0;
            this.a = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), this) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            this.b = (ErrorModel)object0;
            this.a = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), this) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

