package com.kakao.tistory.presentation.screen.blog;

import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.Refresh;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final BlogViewModel a;

    public e(BlogViewModel blogViewModel0) {
        this.a = blogViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(Refresh.INSTANCE);
        return Unit.INSTANCE;
    }
}

