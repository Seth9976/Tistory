package com.kakao.tistory.presentation.theme;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public final Function1 a;
    public final int b;

    public b(Function1 function10, int v) {
        this.a = function10;
        this.b = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v = ((Constraints)object2).unbox-impl();
        Intrinsics.checkNotNullParameter(((MeasureScope)object0), "$this$layout");
        Intrinsics.checkNotNullParameter(((Measurable)object1), "measurable");
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(v);
        int v1 = ((Number)this.a.invoke(placeable0.getHeight())).intValue();
        int v2 = (this.b - v1) / 2;
        return MeasureScope.layout$default(((MeasureScope)object0), ConstraintsKt.constrainWidth-K40F9xA(v, v2 * 2 + placeable0.getWidth()), placeable0.getHeight(), null, new a(placeable0, v2), 4, null);
    }
}

