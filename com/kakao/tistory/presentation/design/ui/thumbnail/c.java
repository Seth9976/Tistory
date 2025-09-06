package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Color.box-impl(ColorKt.Color(((Number)object0).intValue()));
    }
}

