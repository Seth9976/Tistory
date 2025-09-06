package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.statistics.entity.TopEntry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1 {
    public static final m0 a;

    static {
        m0.a = new m0();
    }

    public m0() {
        super(1);
    }

    public static String a(TopEntry topEntry0) {
        Intrinsics.checkNotNullParameter(topEntry0, "it");
        return topEntry0.getId() + " " + topEntry0.getTitle();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return m0.a(((TopEntry)object0));
    }
}

