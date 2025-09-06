package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.appinfo.Android;
import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.domain.entity.appinfo.Platform;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.DeviceUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p4 extends SuspendLambda implements Function2 {
    public int a;
    public final SettingViewModel b;

    public p4(SettingViewModel settingViewModel0, Continuation continuation0) {
        this.b = settingViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p4(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new p4(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
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
        SettingViewModel settingViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            AppInfo appInfo0 = (AppInfo)((Success)(((Result)object0))).getData();
            if(appInfo0 != null) {
                Platform platform0 = appInfo0.getPlatform();
                if(platform0 != null) {
                    Android android0 = platform0.getAndroid();
                    if(android0 != null) {
                        MutableLiveData mutableLiveData0 = settingViewModel0.getAppUpdateState();
                        String s = DeviceUtilsKt.getAppVersion();
                        String s1 = android0.getLatestVersion();
                        if(s1 == null) {
                            s1 = "";
                        }
                        mutableLiveData0.postValue((s.compareTo(s1) < 0 ? BaseKt.getAppContext().getResources().getString(string.label_setting_app_info_need_update) : BaseKt.getAppContext().getResources().getString(string.label_setting_app_info_latest)));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}

