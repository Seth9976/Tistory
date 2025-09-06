package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final boolean a;
    public final Function0 b;
    public final Modifier c;
    public final String d;
    public final Function0 e;
    public final String f;
    public final Function2 g;
    public final Function2 h;
    public final Function3 i;
    public final int j;
    public final int k;

    public i(boolean z, Function0 function00, Modifier modifier0, String s, Function0 function01, String s1, Function2 function20, Function2 function21, Function3 function30, int v, int v1) {
        this.a = z;
        this.b = function00;
        this.c = modifier0;
        this.d = s;
        this.e = function01;
        this.f = s1;
        this.g = function20;
        this.h = function21;
        this.i = function30;
        this.j = v;
        this.k = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomBarKt.BottomBarItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ((Composer)object0), (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
        return Unit.INSTANCE;
    }
}

