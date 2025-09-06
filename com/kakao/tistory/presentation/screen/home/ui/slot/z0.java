package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final Function1 c;
    public final Function0 d;
    public final int e;

    public z0(String s, String s1, Function1 function10, Function0 function00, int v) {
        this.a = s;
        this.b = s1;
        this.c = function10;
        this.d = function00;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CreatorKt.access$CreatorTitle(this.a, this.b, this.c, this.d, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
        return Unit.INSTANCE;
    }
}

