package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final String a;
    public final double b;
    public final int c;

    public m(String s, double f, int v) {
        this.a = s;
        this.b = f;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueBoardKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

