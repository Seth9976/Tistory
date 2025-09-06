package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function1 {
    public static final i0 a;

    static {
        i0.a = new i0();
    }

    public i0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((CategoryItem)object0) != null ? ((CategoryItem)object0).getName() : null;
    }
}

