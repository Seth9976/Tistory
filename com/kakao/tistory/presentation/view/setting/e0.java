package com.kakao.tistory.presentation.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final SettingDefaultBlogActivity a;

    public e0(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
        this.a = settingDefaultBlogActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        this.a.finish();
        return Unit.INSTANCE;
    }
}

