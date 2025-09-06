package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;

    public o(String s, boolean z, String s1, int v) {
        this.a = s;
        this.b = z;
        this.c = s1;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryTitleKt.EntryTitle(this.a, this.b, this.c, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
        return Unit.INSTANCE;
    }
}

