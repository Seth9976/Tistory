package com.kakao.tistory.presentation.view.common.bottomsheet;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public static final f a;

    static {
        f.a = new f();
    }

    public f() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "it");
        return Unit.INSTANCE;
    }
}

