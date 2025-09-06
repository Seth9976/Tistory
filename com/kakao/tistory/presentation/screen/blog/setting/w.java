package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeImageFileUrl;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public w(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogSettingTiara.INSTANCE.trackClickImageDelete();
        ChangeImageFileUrl blogSettingIntent$ChangeImageFileUrl0 = new ChangeImageFileUrl(null);
        this.a.sendIntent(blogSettingIntent$ChangeImageFileUrl0);
        return Unit.INSTANCE;
    }
}

