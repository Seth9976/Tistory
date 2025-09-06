package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function2 {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;
    public final PaddingValues d;
    public final Function3 e;
    public final int f;
    public final int g;

    public p0(Function0 function00, Function0 function01, boolean z, PaddingValues paddingValues0, Function3 function30, int v, int v1) {
        this.a = function00;
        this.b = function01;
        this.c = z;
        this.d = paddingValues0;
        this.e = function30;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
        return Unit.INSTANCE;
    }
}

