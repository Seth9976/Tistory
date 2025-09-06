package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final long a;
    public final long b;
    public final Function0 c;
    public final Function0 d;
    public final int e;

    public j(long v, long v1, Function0 function00, Function0 function01, int v2) {
        this.a = v;
        this.b = v1;
        this.c = function00;
        this.d = function01;
        this.e = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TopAppBarFollowInfoKt.TopAppBarFollowInfo(this.a, this.b, this.c, this.d, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
        return Unit.INSTANCE;
    }
}

