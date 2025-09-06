package com.kakao.tistory.presentation.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function0 {
    public final SettingPushActivity a;

    public f1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SettingPushActivity.access$getPushViewModel(this.a).onClickShowTimePicker();
        return Unit.INSTANCE;
    }
}

