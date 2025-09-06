package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final Function1 a;
    public final boolean b;

    public l(Function1 function10, boolean z) {
        this.a = function10;
        this.b = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((MeasureScope)object0), "$this$layout");
        Intrinsics.checkNotNullParameter(((Measurable)object1), "measurable");
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
        if(placeable0.getWidth() != 0) {
            this.a.invoke(placeable0.getWidth());
        }
        return this.b ? MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new j(placeable0), 4, null) : MeasureScope.layout$default(((MeasureScope)object0), 0, 0, null, k.a, 4, null);
    }
}

