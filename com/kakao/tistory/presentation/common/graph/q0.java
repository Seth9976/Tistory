package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function2 {
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public q0(boolean z, String s, int v, int v1) {
        this.a = z;
        this.b = s;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryBarGraphKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

