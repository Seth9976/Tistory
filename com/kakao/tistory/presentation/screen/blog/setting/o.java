package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public o(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ShowDialog blogSettingIntent$ShowDialog0 = new ShowDialog(new Alert(null, string.label_dialog_app_permission_gallery, null, null, null, false, 61, null));
        this.a.sendIntent(blogSettingIntent$ShowDialog0);
        return Unit.INSTANCE;
    }
}

