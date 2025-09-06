package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l5 extends Lambda implements Function0 {
    public static final l5 a;

    static {
        l5.a = new l5();
    }

    public l5() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }
}

