package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public static final s a;

    static {
        s.a = new s();
    }

    public s() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DaumLikeItem daumLikeItem0 = (DaumLikeItem)object0;
        return Unit.INSTANCE;
    }
}

