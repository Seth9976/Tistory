package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function2 {
    public final Modifier a;
    public final long b;
    public final int c;
    public final Function2 d;
    public final int e;
    public final int f;

    public t0(Modifier modifier0, long v, int v1, Function2 function20, int v2, int v3) {
        this.a = modifier0;
        this.b = v;
        this.c = v1;
        this.d = function20;
        this.e = v2;
        this.f = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotGridKt.SlotGrid-8HUqYh0(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

