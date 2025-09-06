package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final SettingNoticeListActivity a;
    public final Function0 b;
    public final Modifier c;
    public final SettingNoticeListViewModel d;
    public final int e;
    public final int f;

    public m(SettingNoticeListActivity settingNoticeListActivity0, Function0 function00, Modifier modifier0, SettingNoticeListViewModel settingNoticeListViewModel0, int v, int v1) {
        this.a = settingNoticeListActivity0;
        this.b = function00;
        this.c = modifier0;
        this.d = settingNoticeListViewModel0;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SettingNoticeListActivity.access$SettingNoticeScreen(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

