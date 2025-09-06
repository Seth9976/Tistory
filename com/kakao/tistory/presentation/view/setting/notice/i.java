package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final SettingNoticeListActivity a;
    public final LazyPagingItems b;
    public final Function0 c;
    public final int d;

    public i(SettingNoticeListActivity settingNoticeListActivity0, LazyPagingItems lazyPagingItems0, Function0 function00, int v) {
        this.a = settingNoticeListActivity0;
        this.b = lazyPagingItems0;
        this.c = function00;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SettingNoticeListActivity.access$SettingNoticeContent(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

