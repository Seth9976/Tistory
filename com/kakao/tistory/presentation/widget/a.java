package com.kakao.tistory.presentation.widget;

import androidx.compose.material.SwipeableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class a extends Lambda implements Function1 {
    public final SwipeableState a;

    public a(SwipeableState swipeableState0) {
        this.a = swipeableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Density)object0), "$this$offset");
        return IntOffset.box-impl(IntOffsetKt.IntOffset(0, c.roundToInt(((Number)this.a.getOffset().getValue()).floatValue())));
    }
}

