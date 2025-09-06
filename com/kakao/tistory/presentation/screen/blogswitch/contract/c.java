package com.kakao.tistory.presentation.screen.blogswitch.contract;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object0).intValue();
        Intrinsics.checkNotNullParameter(((Blog)object1), "<anonymous parameter 1>");
        return Unit.INSTANCE;
    }
}

