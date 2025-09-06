package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final Function2 a;
    public final int b;
    public final int c;
    public final TextStyle d;
    public final int e;
    public final int f;

    public w(Function2 function20, int v, int v1, TextStyle textStyle0, int v2, int v3) {
        this.a = function20;
        this.b = v;
        this.c = v1;
        this.d = textStyle0;
        this.e = v2;
        this.f = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemInfoKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
        return Unit.INSTANCE;
    }
}

