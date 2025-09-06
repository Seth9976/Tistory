package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final Density a;
    public final float b;
    public final MutableState c;

    public e(Density density0, float f, MutableState mutableState0) {
        this.a = density0;
        this.b = f;
        this.c = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
        int v = IntSize.getWidth-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
        float f = Dp.constructor-impl(this.a.toDp-u2uoSUM(v) - this.b);
        BlogTwinBarGraphKt.access$BlogTwinBarGraph$lambda$2(this.c, f);
        return Unit.INSTANCE;
    }
}

