package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function1 {
    public final SettingPushItem a;
    public final State b;

    public l1(SettingPushItem settingPushItem0, State state0) {
        this.a = settingPushItem0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        SettingPushActivity.access$PushItem$lambda$6(this.b).invoke(this.a, ((Boolean)object0));
        return Unit.INSTANCE;
    }
}

