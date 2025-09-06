package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public static final u a;

    static {
        u.a = new u();
    }

    public u() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "it");
        Long long0 = ((Blog)object0).getId();
        return long0 != null ? long0 : ((Blog)object0);
    }
}

