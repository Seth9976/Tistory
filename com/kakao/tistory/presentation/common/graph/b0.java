package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public final Density a;
    public final MutableState b;

    public b0(Density density0, MutableState mutableState0) {
        this.a = density0;
        this.b = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
        int v = IntSize.getHeight-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
        float f = this.a.toDp-u2uoSUM(v);
        StatisticsBarGraphKt.access$StatisticsBarGraph_T042LqI$lambda$3(this.b, f);
        return Unit.INSTANCE;
    }
}

