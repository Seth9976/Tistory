package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.common.SettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final SettingListActivity a;
    public final SettingItem b;
    public final Blog c;
    public final int d;

    public l0(SettingListActivity settingListActivity0, SettingItem settingItem0, Blog blog0, int v) {
        this.a = settingListActivity0;
        this.b = settingItem0;
        this.c = blog0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.SettingListItemDescription(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

