package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b6 extends Lambda implements Function1 {
    public final SplashViewModel a;
    public final AppInfo b;

    public b6(SplashViewModel splashViewModel0, AppInfo appInfo0) {
        this.a = splashViewModel0;
        this.b = appInfo0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            this.a.m.postValue(new Event(Unit.INSTANCE));
            return Unit.INSTANCE;
        }
        SplashViewModel.access$checkAppSession(this.a, this.b);
        return Unit.INSTANCE;
    }
}

