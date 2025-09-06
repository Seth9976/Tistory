package com.kakao.tistory.presentation.view.setting;

import android.app.Dialog;
import com.kakao.tistory.presentation.viewmodel.SettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function2 {
    public final SettingViewModel a;

    public c1(SettingViewModel settingViewModel0) {
        this.a = settingViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        switch(((Number)object1).intValue()) {
            case 1: {
                ((Dialog)object0).dismiss();
                return Unit.INSTANCE;
            }
            case 2: {
                ((Dialog)object0).dismiss();
                this.a.logout();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

