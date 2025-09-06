package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function2 {
    public final boolean a;
    public final int b;

    public w0(boolean z, int v) {
        this.a = z;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryBarGraphKt.a(this.a, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
        return Unit.INSTANCE;
    }
}

