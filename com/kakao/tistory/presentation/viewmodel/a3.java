package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a3 extends Lambda implements Function1 {
    public static final a3 a;

    static {
        a3.a = new a3();
    }

    public a3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((User)object0) != null ? ((User)object0).getEmail() : null;
    }
}

