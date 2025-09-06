package com.kakao.tistory.presentation.screen.blog.main.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function1 {
    public final List a;

    public e2(List list0) {
        this.a = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a.get(((Number)object0).intValue());
    }
}

