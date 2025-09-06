package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.Complete;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public l(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(Complete.INSTANCE);
        return Unit.INSTANCE;
    }
}

