package com.kakao.tistory.presentation.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final SettingDefaultBlogActivity a;

    public z(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
        this.a = settingDefaultBlogActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SettingDefaultBlogActivity.access$getDefaultBlogViewModel(this.a).dismissDialog();
        return Unit.INSTANCE;
    }
}

