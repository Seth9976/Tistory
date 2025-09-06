package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNickname;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final BlogSettingViewModel a;

    public s(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
        ChangeNickname blogSettingIntent$ChangeNickname0 = new ChangeNickname(((TextFieldValue)object0));
        this.a.sendIntent(blogSettingIntent$ChangeNickname0);
        return Unit.INSTANCE;
    }
}

