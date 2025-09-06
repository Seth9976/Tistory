package com.kakao.tistory.presentation.view.comment;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function1 {
    public static final n0 a;

    static {
        n0.a = new n0();
    }

    public n0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return IntSize.box-impl(IntSizeKt.IntSize(IntSize.getWidth-impl(((IntSize)object0).unbox-impl()), 0));
    }
}

