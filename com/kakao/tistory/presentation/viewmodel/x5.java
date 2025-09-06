package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.LoginResult;
import com.kakao.tistory.domain.entity.common.RegulationErrorModel;
import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class x5 extends SuspendLambda implements Function2 {
    public int a;
    public final SplashViewModel b;

    public x5(SplashViewModel splashViewModel0, Continuation continuation0) {
        this.b = splashViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x5(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x5(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.invoke(this);
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
        SplashViewModel splashViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            LoginResult loginResult0 = (LoginResult)((Success)(((Result)object0))).getData();
            Long long0 = loginResult0.getUserId();
            if(long0 != null) {
                CrashlyticsUtils.INSTANCE.setUserId(String.valueOf(long0.longValue()));
            }
            if(splashViewModel0.q > 0L) {
                SplashViewModel.access$putNotificationRead(splashViewModel0);
            }
            splashViewModel0.a(new w5(loginResult0, splashViewModel0));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_AUTHENTICATE")) {
                ErrorModel errorModel0 = ((Fail)(((Result)object0))).getErrorModel();
                Unit unit0 = null;
                RegulationErrorModel regulationErrorModel0 = errorModel0 instanceof RegulationErrorModel ? ((RegulationErrorModel)errorModel0) : null;
                if(regulationErrorModel0 != null) {
                    RegulationLink regulationLink0 = regulationErrorModel0.getData();
                    if(regulationLink0 != null) {
                        splashViewModel0.n.setValue(new Event(regulationLink0));
                        unit0 = Unit.INSTANCE;
                    }
                }
                if(unit0 == null) {
                    splashViewModel0.goToDestinationActivity(DestinationType.LOGIN);
                    return Unit.INSTANCE;
                }
            }
            else {
                splashViewModel0.goToDestinationActivity(DestinationType.LOGIN);
            }
        }
        return Unit.INSTANCE;
    }
}

