package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeImageFileUrl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final BlogSettingViewModel a;

    public x(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        ChangeImageFileUrl blogSettingIntent$ChangeImageFileUrl0 = new ChangeImageFileUrl(((String)object0));
        this.a.sendIntent(blogSettingIntent$ChangeImageFileUrl0);
        return Unit.INSTANCE;
    }
}

