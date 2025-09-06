package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final Modifier a;
    public final TextFieldValue b;
    public final Function1 c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final Function0 h;
    public final int i;
    public final int j;

    public g0(Modifier modifier0, TextFieldValue textFieldValue0, Function1 function10, int v, String s, boolean z, String s1, Function0 function00, int v1, int v2) {
        this.a = modifier0;
        this.b = textFieldValue0;
        this.c = function10;
        this.d = v;
        this.e = s;
        this.f = z;
        this.g = s1;
        this.h = function00;
        this.i = v1;
        this.j = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentEditFieldKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.i | 1), this.j);
        return Unit.INSTANCE;
    }
}

