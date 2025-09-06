package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function2 {
    public final String a;
    public final Modifier b;
    public final int c;
    public final int d;

    public v0(String s, Modifier modifier0, int v, int v1) {
        this.a = s;
        this.b = modifier0;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainInfoKt.a(this.a, this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
        return Unit.INSTANCE;
    }
}

