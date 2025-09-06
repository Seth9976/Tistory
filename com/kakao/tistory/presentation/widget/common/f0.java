package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function2 {
    public final TextFieldValue a;
    public final Function1 b;
    public final String c;
    public final Modifier d;
    public final TextStyle e;
    public final MutableInteractionSource f;
    public final int g;
    public final int h;
    public final KeyboardOptions i;
    public final KeyboardActions j;
    public final VisualTransformation k;
    public final Integer l;
    public final Integer m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final Function0 r;
    public final int s;
    public final int t;
    public final int u;

    public f0(TextFieldValue textFieldValue0, Function1 function10, String s, Modifier modifier0, TextStyle textStyle0, MutableInteractionSource mutableInteractionSource0, int v, int v1, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, VisualTransformation visualTransformation0, Integer integer0, Integer integer1, boolean z, boolean z1, String s1, boolean z2, Function0 function00, int v2, int v3, int v4) {
        this.a = textFieldValue0;
        this.b = function10;
        this.c = s;
        this.d = modifier0;
        this.e = textStyle0;
        this.f = mutableInteractionSource0;
        this.g = v;
        this.h = v1;
        this.i = keyboardOptions0;
        this.j = keyboardActions0;
        this.k = visualTransformation0;
        this.l = integer0;
        this.m = integer1;
        this.n = z;
        this.o = z1;
        this.p = s1;
        this.q = z2;
        this.r = function00;
        this.s = v2;
        this.t = v3;
        this.u = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommonTextFieldKt.CommonTextField(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.s | 1), RecomposeScopeImplKt.updateChangedFlags(this.t), this.u);
        return Unit.INSTANCE;
    }
}

