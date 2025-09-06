package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k3 extends Lambda implements Function2 {
    public final int a;
    public final Integer b;
    public final Function0 c;
    public final int d;
    public final int e;

    public k3(int v, Integer integer0, Function0 function00, int v1, int v2) {
        this.a = v;
        this.b = integer0;
        this.c = function00;
        this.d = v1;
        this.e = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryToolbarKt.a(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

