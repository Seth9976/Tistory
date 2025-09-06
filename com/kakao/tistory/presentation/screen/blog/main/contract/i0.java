package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final Function2 a;
    public final BlogInfo b;

    public i0(Function2 function20, BlogInfo blogInfo0) {
        this.a = function20;
        this.b = blogInfo0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b.getTitle(), this.b.getDefaultDomain());
        return Unit.INSTANCE;
    }
}

