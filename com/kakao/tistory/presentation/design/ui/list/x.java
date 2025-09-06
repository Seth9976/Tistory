package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public x(int v, String s, int v1, int v2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemInfoKt.access$EntryInfoIcon(this.a, this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
        return Unit.INSTANCE;
    }
}

