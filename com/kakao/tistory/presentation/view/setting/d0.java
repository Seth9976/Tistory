package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function2 {
    public final SettingDefaultBlogActivity a;
    public final String b;
    public final boolean c;
    public final int d;

    public d0(SettingDefaultBlogActivity settingDefaultBlogActivity0, String s, boolean z, int v) {
        this.a = settingDefaultBlogActivity0;
        this.b = s;
        this.c = z;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.TitleItem(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

