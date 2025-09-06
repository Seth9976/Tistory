package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function1 {
    public static final n0 a;

    static {
        n0.a = new n0();
    }

    public n0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((DaumLikeItem)object0) != null ? ((DaumLikeItem)object0).getLabel() : null;
    }
}

