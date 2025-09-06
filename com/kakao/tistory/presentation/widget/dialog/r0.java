package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function0 {
    public final MutableState a;

    public r0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistoryComposeDialogKt.access$DialogHandler$lambda$2(this.a, null);
        return Unit.INSTANCE;
    }
}

