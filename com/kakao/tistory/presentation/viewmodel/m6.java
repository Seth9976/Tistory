package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m6 extends Lambda implements Function1 {
    public static final m6 a;

    static {
        m6.a = new m6();
    }

    public m6() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((RefererKeywordItem)object0).getDaum();
    }
}

