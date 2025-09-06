package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.appinfo.Android;
import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.domain.entity.appinfo.Platform;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.utils.DeviceUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c6 extends SuspendLambda implements Function2 {
    public int a;
    public final SplashViewModel b;

    public c6(SplashViewModel splashViewModel0, Continuation continuation0) {
        this.b = splashViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c6(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new c6(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Unit unit0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.invoke(this);
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
            AppInfo appInfo0 = (AppInfo)((Success)(((Result)object0))).getData();
            if(appInfo0 == null) {
                unit0 = null;
            }
            else {
                Platform platform0 = appInfo0.getPlatform();
                if(platform0 == null) {
                    unit0 = null;
                }
                else {
                    Android android0 = platform0.getAndroid();
                    if(android0 == null) {
                        unit0 = null;
                    }
                    else {
                        DeviceUtilsKt.checkDeprecatedAppVersion(android0.getDeprecatedVersion(), new b6(splashViewModel0, appInfo0));
                        unit0 = Unit.INSTANCE;
                    }
                }
            }
            if(unit0 == null) {
                SplashViewModel.access$showAppInfoError(splashViewModel0, "app info is null");
                return Unit.INSTANCE;
            }
        }
        else if(((Result)object0) instanceof Fail) {
            SplashViewModel.access$showAppInfoError(splashViewModel0, "get app info fail");
        }
        return Unit.INSTANCE;
    }
}

