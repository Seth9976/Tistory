package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.common.SettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function2 {
    public final SettingListActivity a;
    public final SettingItem b;
    public final boolean c;
    public final Function1 d;
    public final int e;

    public i0(SettingListActivity settingListActivity0, SettingItem settingItem0, boolean z, Function1 function10, int v) {
        this.a = settingListActivity0;
        this.b = settingItem0;
        this.c = z;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.SettingListItem(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

