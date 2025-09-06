package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function2 {
    public final boolean a;
    public final Function1 b;
    public final boolean c;
    public final Function0 d;
    public final Function0 e;
    public final int f;

    public z1(boolean z, Function1 function10, boolean z1, Function0 function00, Function0 function01, int v) {
        this.a = z;
        this.b = function10;
        this.c = z1;
        this.d = function00;
        this.e = function01;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainOthersMenuBottomSheetKt.BlogMainOthersMenuBottomSheet(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
        return Unit.INSTANCE;
    }
}

