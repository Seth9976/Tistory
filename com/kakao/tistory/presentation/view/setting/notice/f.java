package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

public final class f extends Lambda implements Function2 {
    public final SettingNoticeListActivity a;
    public final Flow b;
    public final int c;

    public f(SettingNoticeListActivity settingNoticeListActivity0, Flow flow0, int v) {
        this.a = settingNoticeListActivity0;
        this.b = flow0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SettingNoticeListActivity.access$ConsumeEvent(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

