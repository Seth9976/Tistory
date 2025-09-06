package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final MutableIntState a;

    public k(MutableIntState mutableIntState0) {
        this.a = mutableIntState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
        int v = IntSize.getHeight-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
        RevenueBoardKt.access$RevenueBoardInfoRowContainer$lambda$6(this.a, v);
        return Unit.INSTANCE;
    }
}

