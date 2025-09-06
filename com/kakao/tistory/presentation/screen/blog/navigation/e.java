package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.navigation.NavOptionsBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public static final e a;

    static {
        e.a = new e();
    }

    public e() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavOptionsBuilder)object0), "$this$navOptions");
        return Unit.INSTANCE;
    }
}

