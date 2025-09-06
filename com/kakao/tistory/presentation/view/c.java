package com.kakao.tistory.presentation.view;

import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final SplashActivity a;

    public c(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return AppUpdateManagerFactory.create(this.a);
    }
}

