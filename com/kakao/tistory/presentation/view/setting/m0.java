package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.common.SettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function2 {
    public final SettingListActivity a;
    public final SettingItem b;
    public final int c;

    public m0(SettingListActivity settingListActivity0, SettingItem settingItem0, int v) {
        this.a = settingListActivity0;
        this.b = settingItem0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.SettingListItemDivider(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

