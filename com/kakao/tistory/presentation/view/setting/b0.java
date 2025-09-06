package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final SettingDefaultBlogActivity a;
    public final Blog b;

    public b0(SettingDefaultBlogActivity settingDefaultBlogActivity0, Blog blog0) {
        this.a = settingDefaultBlogActivity0;
        this.b = blog0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SettingDefaultBlogActivity.access$getDefaultBlogViewModel(this.a).onClickChange(this.b);
        return Unit.INSTANCE;
    }
}

