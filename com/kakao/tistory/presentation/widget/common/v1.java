package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function2 {
    public final float a;
    public final int b;

    public v1(float f, int v) {
        this.a = f;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PageIndicatorKt.a(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

