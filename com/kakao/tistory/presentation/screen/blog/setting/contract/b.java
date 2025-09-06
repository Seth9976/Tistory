package com.kakao.tistory.presentation.screen.blog.setting.contract;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BlogInfo blogInfo0 = (BlogInfo)object0;
        return Unit.INSTANCE;
    }
}

