package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class y4 extends Lambda implements Function0 {
    public final FloatRef a;
    public final FloatRef b;
    public final TopAppBarState c;

    public y4(FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, TopAppBarState topAppBarState0) {
        this.a = ref$FloatRef0;
        this.b = ref$FloatRef1;
        this.c = topAppBarState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = this.a.element - this.b.element;
        if(this.c.getHeightOffsetLimit() != f) {
            this.c.setHeightOffsetLimit(f);
        }
        return Unit.INSTANCE;
    }
}

