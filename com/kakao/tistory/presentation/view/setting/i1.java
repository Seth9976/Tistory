package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function0 {
    public final SettingPushItem a;
    public final boolean b;
    public final State c;

    public i1(SettingPushItem settingPushItem0, boolean z, State state0) {
        this.a = settingPushItem0;
        this.b = z;
        this.c = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SettingPushActivity.access$PushItem$lambda$6(this.c).invoke(this.a, Boolean.valueOf(!this.b));
        return true;
    }
}

