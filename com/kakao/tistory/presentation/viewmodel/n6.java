package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n6 extends Lambda implements Function1 {
    public static final n6 a;

    static {
        n6.a = new n6();
    }

    public n6() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((RefererKeywordItem)object0).getEtc();
    }
}

