package com.kakao.tistory.presentation.view.setting;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function2 {
    public final SettingPushActivity a;

    public a2(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        if(((Number)object1).intValue() == 2) {
            this.a.u.launch(Unit.INSTANCE);
        }
        ((Dialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

