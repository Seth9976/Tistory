package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function2 {
    public final SettingPushActivity a;
    public final SettingPushItem b;
    public final boolean c;
    public final int d;
    public final int e;

    public n1(SettingPushActivity settingPushActivity0, SettingPushItem settingPushItem0, boolean z, int v, int v1) {
        this.a = settingPushActivity0;
        this.b = settingPushItem0;
        this.c = z;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
        return Unit.INSTANCE;
    }
}

