package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public static final k a;

    static {
        k.a = new k();
    }

    public k() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((User)object0), "it");
        Long long0 = ((User)object0).getId();
        return long0 == null ? -1 : long0;
    }
}

