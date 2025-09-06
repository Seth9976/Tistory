package com.kakao.tistory.presentation.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function2 {
    public final SettingPushActivity a;

    public o1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        Intrinsics.checkNotNullParameter(((SettingPushItem)object0), "pushItem");
        if(!SettingPushActivity.access$isDevicePushEnabled(this.a)) {
            SettingPushActivity.access$requestNotificationPermission(this.a);
            return Unit.INSTANCE;
        }
        SettingPushActivity.access$getPushViewModel(this.a).onClickPushSetting(((SettingPushItem)object0), z);
        return Unit.INSTANCE;
    }
}

