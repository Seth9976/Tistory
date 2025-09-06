package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h2 extends Lambda implements Function0 {
    public final Function0 a;
    public final MutableState b;

    public h2(Function0 function00, MutableState mutableState0) {
        this.a = function00;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        ReadMoreTextViewKt.access$ReadMoreTextView$lambda$5(this.b, true);
        return Unit.INSTANCE;
    }
}

