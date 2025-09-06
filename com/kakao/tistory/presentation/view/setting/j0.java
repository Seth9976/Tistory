package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.common.SettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final Function1 a;
    public final SettingItem b;

    public j0(Function1 function10, SettingItem settingItem0) {
        this.a = function10;
        this.b = settingItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

