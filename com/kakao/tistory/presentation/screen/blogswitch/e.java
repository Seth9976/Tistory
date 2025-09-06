package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final Function2 a;
    public final int b;
    public final Blog c;

    public e(Function2 function20, int v, Blog blog0) {
        this.a = function20;
        this.b = v;
        this.c = blog0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b, this.c);
        return Unit.INSTANCE;
    }
}

