package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class q4 extends SuspendLambda implements Function2 {
    public SettingViewModel a;
    public int b;
    public final SettingViewModel c;

    public q4(SettingViewModel settingViewModel0, Continuation continuation0) {
        this.c = settingViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q4(this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new q4(this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SettingViewModel settingViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.c.i.getFcmToken();
                if(s != null) {
                    SettingViewModel settingViewModel0 = this.c;
                    this.a = settingViewModel0;
                    this.b = 1;
                    object0 = settingViewModel0.h.getPushSetting(s, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    settingViewModel1 = settingViewModel0;
                    goto label_16;
                }
                break;
            }
            case 1: {
                settingViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_16:
                if(!(((Result)object0) instanceof Success) && ((Result)object0) instanceof Fail) {
                    settingViewModel1.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

