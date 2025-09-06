package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function2 {
    public final String a;
    public final Function0 b;
    public final int c;

    public m0(String s, Function0 function00, int v) {
        this.a = s;
        this.b = function00;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        StatisticsTopHeaderViewHolderKt.a(this.a, this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

