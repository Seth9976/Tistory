package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c4 extends Lambda implements Function2 {
    public final Function3 a;
    public final Function2 b;
    public final Function3 c;
    public final Function3 d;
    public final Function3 e;
    public final long f;
    public final long g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;

    public c4(Function3 function30, Function2 function20, Function3 function31, Function3 function32, Function3 function33, long v, long v1, float f, float f1, int v2, int v3) {
        this.a = function30;
        this.b = function20;
        this.c = function31;
        this.d = function32;
        this.e = function33;
        this.f = v;
        this.g = v1;
        this.h = f;
        this.i = f1;
        this.j = v2;
        this.k = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryTopAppBarKt.access$TistoryCollapsingTopAppBarLayout-8L-wENs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ((Composer)object0), (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
        return Unit.INSTANCE;
    }
}

