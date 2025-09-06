package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final SettingPushActivity a;
    public final Modifier b;
    public final int c;

    public g1(SettingPushActivity settingPushActivity0, Modifier modifier0, int v) {
        this.a = settingPushActivity0;
        this.b = modifier0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.Content(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

