package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.GoSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function0 {
    public final BlogSwitchViewModel a;

    public q0(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(GoSetting.INSTANCE);
        return Unit.INSTANCE;
    }
}

