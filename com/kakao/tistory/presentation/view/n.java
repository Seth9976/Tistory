package com.kakao.tistory.presentation.view;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final SplashActivity a;

    public n(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.o = true;
        if(((AppUpdateInfo)object0).updateAvailability() == 3) {
            SplashActivity.access$getAppUpdateManager(this.a).startUpdateFlowForResult(((AppUpdateInfo)object0), 1, this.a, 1004);
        }
        return Unit.INSTANCE;
    }
}

