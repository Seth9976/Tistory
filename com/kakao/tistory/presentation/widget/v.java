package com.kakao.tistory.presentation.widget;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

public final class v extends Lambda implements Function1 {
    public static final v a;

    static {
        v.a = new v();
    }

    public v() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((MatchResult)object0), "it");
        return ((MatchResult)object0).getValue();
    }
}

