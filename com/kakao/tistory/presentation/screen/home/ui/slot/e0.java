package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final MutableState a;
    public final MutableState b;

    public e0(MutableState mutableState0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
        long v = Offset.plus-MK-Hz9U(LayoutCoordinatesKt.positionInRoot(((LayoutCoordinates)object0)), OffsetKt.Offset(IntSize.getWidth-impl(((LayoutCoordinates)object0).getSize-YbymL2g()), 0.0f));
        if(Offset.getY-impl(v) != Offset.getY-impl(CreatorKt.access$Creator$lambda$3(this.a))) {
            CreatorKt.access$Creator$lambda$12(this.b, false);
        }
        CreatorKt.access$Creator$lambda$4(this.a, v);
        return Unit.INSTANCE;
    }
}

