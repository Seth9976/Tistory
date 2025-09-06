package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.HideBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function0 {
    public final BlogMainViewModel a;

    public v0(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(HideBottomSheet.INSTANCE);
        return Unit.INSTANCE;
    }
}

