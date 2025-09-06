package com.kakao.tistory.presentation.main.ui;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function3 {
    public static final m a;

    static {
        m.a = new m();
    }

    public m() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((MeasureScope)object0), "$this$layout");
        Intrinsics.checkNotNullParameter(((Measurable)object1), "measurable");
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
        return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new l(placeable0), 4, null);
    }
}

