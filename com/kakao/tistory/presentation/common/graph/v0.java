package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function2 {
    public final Modifier a;
    public final boolean b;
    public final BarGraphItem c;
    public final long d;
    public final long e;
    public final Function1 f;
    public final Function3 g;
    public final int h;
    public final int i;

    public v0(Modifier modifier0, boolean z, BarGraphItem barGraphItem0, long v, long v1, Function1 function10, Function3 function30, int v2, int v3) {
        this.a = modifier0;
        this.b = z;
        this.c = barGraphItem0;
        this.d = v;
        this.e = v1;
        this.f = function10;
        this.g = function30;
        this.h = v2;
        this.i = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryBarGraphKt.TistoryBarGraphItem-vRFhKjU(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.h | 1), this.i);
        return Unit.INSTANCE;
    }
}

