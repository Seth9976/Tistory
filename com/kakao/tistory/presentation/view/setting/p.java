package com.kakao.tistory.presentation.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final SettingDefaultBlogActivity a;

    public p(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
        this.a = settingDefaultBlogActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SettingDefaultBlogActivity.access$getDefaultBlogViewModel(this.a).getBlogs();
        return Unit.INSTANCE;
    }
}

