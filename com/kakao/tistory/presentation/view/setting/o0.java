package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function2 {
    public final SettingListActivity a;
    public final Function1 b;
    public final int c;

    public o0(SettingListActivity settingListActivity0, Function1 function10, int v) {
        this.a = settingListActivity0;
        this.b = function10;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.SettingListItemLeave(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

