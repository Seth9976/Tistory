package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final Function1 a;
    public final float b;

    public w0(Function1 function10, float f) {
        this.a = function10;
        this.b = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "coordinates");
        long v = ((LayoutCoordinates)object0).getSize-YbymL2g();
        long v1 = LayoutCoordinatesKt.positionInRoot(((LayoutCoordinates)object0));
        Offset offset0 = Offset.box-impl(OffsetKt.Offset(((float)IntSize.getWidth-impl(v)) / 2.0f + Offset.getX-impl(v1), Offset.getY-impl(v1) + ((float)IntSize.getHeight-impl(v)) + this.b));
        this.a.invoke(offset0);
        return Unit.INSTANCE;
    }
}

