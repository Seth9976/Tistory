package com.kakao.tistory.presentation.view;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final SplashActivity a;

    public p(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogInterface)object0), "dialog");
        ((DialogInterface)object0).dismiss();
        this.a.finishAffinity();
        return Unit.INSTANCE;
    }
}

