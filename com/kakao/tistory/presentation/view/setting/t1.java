package com.kakao.tistory.presentation.view.setting;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function1 {
    public final SettingPushActivity a;

    public t1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Pair)object0), "<name for destructuring parameter 0>");
        SettingPushActivity.access$showDialog(this.a, ((String)((Pair)object0).component1()), ((String)((Pair)object0).component2()));
        return Unit.INSTANCE;
    }
}

