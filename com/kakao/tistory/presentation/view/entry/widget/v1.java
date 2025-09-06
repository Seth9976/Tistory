package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function2 {
    public final Modifier a;
    public final int b;
    public final int c;

    public v1(Modifier modifier0, int v, int v1) {
        this.a = modifier0;
        this.b = v;
        this.c = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReplyKt.a(this.a, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.b | 1), this.c);
        return Unit.INSTANCE;
    }
}

