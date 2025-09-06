package com.kakao.tistory.presentation.view.comment;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1 {
    public static final m0 a;

    static {
        m0.a = new m0();
    }

    public m0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return IntOffset.box-impl(IntOffsetKt.IntOffset(0, IntSize.getHeight-impl(((IntSize)object0).unbox-impl())));
    }
}

