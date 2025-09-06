package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.SelectImage;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public v(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogSettingTiara.INSTANCE.trackClickGallery();
        this.a.sendEvent(SelectImage.INSTANCE);
        return Unit.INSTANCE;
    }
}

