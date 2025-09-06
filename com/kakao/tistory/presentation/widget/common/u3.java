package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u3 extends Lambda implements Function2 {
    public final Function0 a;
    public final int b;
    public final Modifier c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;

    public u3(Function0 function00, int v, Modifier modifier0, long v1, String s, int v2, int v3) {
        this.a = function00;
        this.b = v;
        this.c = modifier0;
        this.d = v1;
        this.e = s;
        this.f = v2;
        this.g = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryTopAppBarButtonKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

