package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final int a;
    public final int b;
    public final Function0 c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;

    public g1(int v, int v1, Function0 function00, float f, float f1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = function00;
        this.d = f;
        this.e = f1;
        this.f = v2;
        this.g = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainInfoKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

