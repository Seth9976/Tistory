package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function1 {
    public final long a;

    public u1(long v) {
        this.a = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
        DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), this.a, 0.0f, 0L, 0.0f, null, null, 0, 0x7E, null);
        return Unit.INSTANCE;
    }
}

