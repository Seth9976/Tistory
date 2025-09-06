package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final SettingAppInfoActivity a;
    public final int b;
    public final String c;
    public final int d;

    public l(SettingAppInfoActivity settingAppInfoActivity0, int v, String s, int v1) {
        this.a = settingAppInfoActivity0;
        this.b = v;
        this.c = s;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.AppVersionText(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

