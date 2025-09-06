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

public final class f extends SuspendLambda implements Function3 {
    public Object a;
    public int b;
    public int c;
    public int d;
    public final BlogRepositoryImpl e;
    public final String f;

    public f(BlogRepositoryImpl blogRepositoryImpl0, String s, Continuation continuation0) {
        this.e = blogRepositoryImpl0;
        this.f = s;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        f f0 = new f(this.e, this.f, ((Continuation)object2));
        f0.c = ((Number)object0).intValue();
        f0.d = ((Number)object1).intValue();
        return f0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BaseRepository baseRepository1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BlogRepositoryImpl blogRepositoryImpl0 = this.e;
                try {
                    this.a = blogRepositoryImpl0;
                    this.b = 1;
                    object0 = blogRepositoryImpl0.a.getNoticeList(this.f, this.c, this.d, this);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = blogRepositoryImpl0;
                    this.a = baseRepository1;
                    this.b = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, this) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = blogRepositoryImpl0;
                    goto label_38;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = blogRepositoryImpl0;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)this.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    this.a = baseRepository1;
                    this.b = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, this) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_38;
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
                goto label_43;
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
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            this.a = baseRepository1;
            this.b = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, this) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_38:
        this.a = baseRepository1;
        this.b = 3;
        object0 = baseRepository1.createErrorModel(throwable0, this);
        if(object0 == object1) {
            return object1;
        }
    label_43:
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

