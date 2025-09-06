package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function2 {
    public final Modifier a;
    public final AnnotatedString b;
    public final TextStyle c;
    public final boolean d;
    public final int e;
    public final int f;
    public final Function1 g;
    public final int h;
    public final int i;

    public l1(Modifier modifier0, AnnotatedString annotatedString0, TextStyle textStyle0, boolean z, int v, int v1, Function1 function10, int v2, int v3) {
        this.a = modifier0;
        this.b = annotatedString0;
        this.c = textStyle0;
        this.d = z;
        this.e = v;
        this.f = v1;
        this.g = function10;
        this.h = v2;
        this.i = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LinkableTextKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.h | 1), this.i);
        return Unit.INSTANCE;
    }
}

