package com.kakao.tistory.presentation.view.setting.secretLab;

import android.app.Dialog;
import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final SecretLabActivity a;

    public t(SecretLabActivity secretLabActivity0) {
        this.a = secretLabActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        com.kakao.tistory.presentation.screen.feed.t.a(((Number)object1), ((Dialog)object0), "dialog");
        this.a.finishAffinity();
        Process.killProcess(Process.myPid());
        return Unit.INSTANCE;
    }
}

