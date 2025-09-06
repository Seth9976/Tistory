package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function2 {
    public final int a;

    public b2(int v) {
        this.a = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PageIndicatorKt.access$PageIndicatorPreview(((Composer)object0), (this.a | 1) & -920350135 | ((0x24924924 & (this.a | 1)) >> 1 | 306783378 & (this.a | 1)) | (306783378 & (this.a | 1)) << 1 & (0x24924924 & (this.a | 1)));
        return Unit.INSTANCE;
    }
}

