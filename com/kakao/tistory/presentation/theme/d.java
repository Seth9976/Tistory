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

public final class d extends Lambda implements Function3 {
    public final int a;
    public final int b;
    public final Function1 c;
    public final int d;

    public d(int v, int v1, Function1 function10, int v2) {
        this.a = v;
        this.b = v1;
        this.c = function10;
        this.d = v2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v = ((Constraints)object2).unbox-impl();
        Intrinsics.checkNotNullParameter(((MeasureScope)object0), "$this$layout");
        Intrinsics.checkNotNullParameter(((Measurable)object1), "measurable");
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v, -this.a, -this.b));
        int v1 = ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight() + this.b);
        int v2 = ((Number)this.c.invoke(v1)).intValue();
        return MeasureScope.layout$default(((MeasureScope)object0), ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth() + v2), v1, null, new c(placeable0, v2, this.d), 4, null);
    }
}

