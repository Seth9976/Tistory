package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function2 {
    public static final x1 a;

    static {
        x1.a = new x1();
    }

    public x1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((SaverScope)object0), "$this$Saver");
        Intrinsics.checkNotNullParameter(((z1)object1), "it");
        return ((Number)((z1)object1).a.getValue()).floatValue();
    }
}

