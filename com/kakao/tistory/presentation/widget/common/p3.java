package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p3 extends Lambda implements Function2 {
    public final String a;
    public final boolean b;
    public final Function0 c;
    public final Function0 d;
    public final int e;
    public final int f;

    public p3(String s, boolean z, Function0 function00, Function0 function01, int v, int v1) {
        this.a = s;
        this.b = z;
        this.c = function00;
        this.d = function01;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryTopAppBarButtonKt.MainActions(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

