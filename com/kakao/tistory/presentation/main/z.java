package com.kakao.tistory.presentation.main;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public static final z a;

    static {
        z.a = new z();
    }

    public z() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeyframesSpecConfig)object0), "$this$keyframes");
        return Unit.INSTANCE;
    }
}

