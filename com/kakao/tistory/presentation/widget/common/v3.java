package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function2 {
    public final TopAppBarScrollBehavior a;
    public final Function4 b;
    public final Function3 c;
    public final boolean d;
    public final Function3 e;
    public final Function2 f;
    public final Function3 g;
    public final long h;
    public final int i;
    public final int j;

    public v3(TopAppBarScrollBehavior topAppBarScrollBehavior0, Function4 function40, Function3 function30, boolean z, Function3 function31, Function2 function20, Function3 function32, long v, int v1, int v2) {
        this.a = topAppBarScrollBehavior0;
        this.b = function40;
        this.c = function30;
        this.d = z;
        this.e = function31;
        this.f = function20;
        this.g = function32;
        this.h = v;
        this.i = v1;
        this.j = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.i | 1), this.j);
        return Unit.INSTANCE;
    }
}

