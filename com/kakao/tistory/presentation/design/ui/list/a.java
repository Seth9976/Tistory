package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final String a;
    public final TextStyle b;
    public final Modifier c;
    public final int d;
    public final int e;

    public a(String s, TextStyle textStyle0, Modifier modifier0, int v, int v1) {
        this.a = s;
        this.b = textStyle0;
        this.c = modifier0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogTitleKt.BlogTitle(this.a, this.b, this.c, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
        return Unit.INSTANCE;
    }
}

