package com.kakao.tistory.presentation.screen.blog;

import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.Init;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final BlogViewModel a;

    public d(BlogViewModel blogViewModel0) {
        this.a = blogViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Init blogIntent$Init0 = new Init(((String)object0), ((Boolean)object1).booleanValue());
        this.a.sendIntent(blogIntent$Init0);
        return Unit.INSTANCE;
    }
}

