package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function2 {
    public final SettingPushActivity a;
    public final Modifier b;
    public final Function3 c;
    public final int d;
    public final int e;

    public p1(SettingPushActivity settingPushActivity0, Modifier modifier0, Function3 function30, int v, int v1) {
        this.a = settingPushActivity0;
        this.b = modifier0;
        this.c = function30;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

