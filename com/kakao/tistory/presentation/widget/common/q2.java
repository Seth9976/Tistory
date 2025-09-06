package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q2 extends Lambda implements Function0 {
    public static final q2 a;

    static {
        q2.a = new q2();
    }

    public q2() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }
}

