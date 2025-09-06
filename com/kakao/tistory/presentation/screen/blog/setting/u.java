package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BottomSheetType.Image;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public u(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogSettingTiara.INSTANCE.trackClickImageSetting();
        ShowBottomSheet blogSettingIntent$ShowBottomSheet0 = new ShowBottomSheet(Image.INSTANCE);
        this.a.sendIntent(blogSettingIntent$ShowBottomSheet0);
        return Unit.INSTANCE;
    }
}

