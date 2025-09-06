package com.kakao.tistory.data.blog.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class e extends SuspendLambda implements Function3 {
    public Object a;
    public int b;
    public int c;
    public int d;
    public final BlogRepositoryImpl e;
    public final String f;
    public final Integer g;

    public e(BlogRepositoryImpl blogRepositoryImpl0, String s, Integer integer0, Continuation continuation0) {
        this.e = blogRepositoryImpl0;
        this.f = s;
        this.g = integer0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        e e0 = new e(this.e, this.f, this.g, ((Continuation)object2));
        e0.c = ((Number)object0).intValue();
        e0.d = ((Number)object1).intValue();
        return e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BaseRepository baseRepository1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                baseRepository1 = this.e;
                try {
                    this.a = baseRepository1;
                    this.b = 1;
                    object0 = ((BlogRepositoryImpl)baseRepository1).a.getEntryList(this.f, (this.g == null ? -3 : ((int)this.g)), this.c, this.d, this);
                    return object0 == object1 ? object1 : new Success(object0);
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_30;
                }
            }
            case 1: {
                baseRepository1 = (BaseRepository)this.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    return new Success(object0);
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_30;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)this.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)this.a;
                ResultKt.throwOnFailure(object0);
                goto label_35;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)this.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.a = baseRepository1;
        this.b = 2;
        return baseRepository1.sendError("coroutine cancel", cancellationException0, this) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
    label_30:
        this.a = baseRepository1;
        this.b = 3;
        object0 = baseRepository1.createErrorModel(throwable0, this);
        if(object0 == object1) {
            return object1;
        }
    label_35:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            this.a = (ErrorModel)object0;
            this.b = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), this) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            this.a = (ErrorModel)object0;
            this.b = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), this) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

