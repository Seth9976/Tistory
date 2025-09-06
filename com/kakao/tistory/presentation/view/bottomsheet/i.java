package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CategoryItem)object0), "it");
        return Unit.INSTANCE;
    }
}

