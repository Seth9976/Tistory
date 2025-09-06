package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final long a;
    public final long b;
    public final Modifier c;
    public final Function3 d;
    public final int e;
    public final int f;

    public b(long v, long v1, Modifier modifier0, Function3 function30, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = modifier0;
        this.d = function30;
        this.e = v2;
        this.f = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomBarKt.BottomBar-6xbWgXg(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

