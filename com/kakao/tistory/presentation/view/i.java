package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final SplashActivity a;

    public i(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavigatorExtensionKt.goToAccountMigration(this.a, Boolean.TRUE);
        this.a.finish();
        return Unit.INSTANCE;
    }
}

