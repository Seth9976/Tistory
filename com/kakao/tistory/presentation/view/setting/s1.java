package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.domain.entity.PushSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function1 {
    public final SettingPushActivity a;

    public s1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(!SettingPushActivity.access$isDevicePushEnabled(this.a) && ((PushSetting)object0).getEnable()) {
            SettingPushActivity.access$requestNotificationPermission(this.a);
        }
        return Unit.INSTANCE;
    }
}

