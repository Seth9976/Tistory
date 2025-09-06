package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final Function1 a;
    public final Blog b;

    public n(Function1 function10, Blog blog0) {
        this.a = function10;
        this.b = blog0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

