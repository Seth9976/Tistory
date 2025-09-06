package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((SaverScope)object0), "$this$Saver");
        return ColorKt.toArgb-8_81llA(((Color)object1).unbox-impl());
    }
}

