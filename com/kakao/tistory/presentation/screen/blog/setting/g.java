package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final BlogSettingViewModel a;
    public final BlogSettingUiState b;
    public final NavActions c;
    public final Function1 d;
    public final int e;

    public g(BlogSettingViewModel blogSettingViewModel0, BlogSettingUiState blogSettingUiState0, NavActions navActions0, Function1 function10, int v) {
        this.a = blogSettingViewModel0;
        this.b = blogSettingUiState0;
        this.c = navActions0;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSettingScreenKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

