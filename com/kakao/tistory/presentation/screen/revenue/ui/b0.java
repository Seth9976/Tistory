package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public final long a;

    public b0(long v) {
        this.a = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Density)object0), "$this$offset");
        return IntOffset.box-impl(this.a);
    }
}

