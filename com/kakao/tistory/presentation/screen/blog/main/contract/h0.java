package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final Function1 a;
    public final BlogInfo b;

    public h0(Function1 function10, BlogInfo blogInfo0) {
        this.a = function10;
        this.b = blogInfo0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b.getName());
        return Unit.INSTANCE;
    }
}

