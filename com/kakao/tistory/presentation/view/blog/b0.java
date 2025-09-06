package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public static final b0 a;

    static {
        b0.a = new b0();
    }

    public b0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "item");
        Long long0 = ((Blog)object0).getId();
        return long0 == null ? -1 : long0;
    }
}

