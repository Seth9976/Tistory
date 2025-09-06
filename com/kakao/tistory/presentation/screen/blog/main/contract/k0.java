package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final Function2 a;
    public final BlogInfo b;

    public k0(Function2 function20, BlogInfo blogInfo0) {
        this.a = function20;
        this.b = blogInfo0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        this.a.invoke(this.b.getUserId(), ((Boolean)object0));
        return Unit.INSTANCE;
    }
}

