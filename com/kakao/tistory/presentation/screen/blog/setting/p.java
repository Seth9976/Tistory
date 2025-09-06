package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeBlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final BlogSettingViewModel a;

    public p(BlogSettingViewModel blogSettingViewModel0) {
        this.a = blogSettingViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeBlogInfo blogSettingIntent$ChangeBlogInfo0 = new ChangeBlogInfo(((BlogInfo)object0));
        this.a.sendIntent(blogSettingIntent$ChangeBlogInfo0);
        return Unit.INSTANCE;
    }
}

