package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNickname;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final BlogSettingViewModel a;

    public t(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ChangeNickname blogSettingIntent$ChangeNickname0 = new ChangeNickname(new TextFieldValue(null, 0L, null, 7, null));
        this.a.sendIntent(blogSettingIntent$ChangeNickname0);
        return Unit.INSTANCE;
    }
}

