package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeBlogDescription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public final BlogSettingViewModel a;

    public r(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
        ChangeBlogDescription blogSettingIntent$ChangeBlogDescription0 = new ChangeBlogDescription(((TextFieldValue)object0));
        this.a.sendIntent(blogSettingIntent$ChangeBlogDescription0);
        return Unit.INSTANCE;
    }
}

