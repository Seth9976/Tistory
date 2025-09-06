package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p2 extends Lambda implements Function2 {
    public final Function0 a;
    public final String b;
    public final ButtonColors c;
    public final Modifier d;
    public final BorderStroke e;
    public final Shape f;
    public final boolean g;
    public final MutableInteractionSource h;
    public final PaddingValues i;
    public final Function3 j;
    public final int k;
    public final int l;

    public p2(Function0 function00, String s, ButtonColors roundButtonDefaults$ButtonColors0, Modifier modifier0, BorderStroke borderStroke0, Shape shape0, boolean z, MutableInteractionSource mutableInteractionSource0, PaddingValues paddingValues0, Function3 function30, int v, int v1) {
        this.a = function00;
        this.b = s;
        this.c = roundButtonDefaults$ButtonColors0;
        this.d = modifier0;
        this.e = borderStroke0;
        this.f = shape0;
        this.g = z;
        this.h = mutableInteractionSource0;
        this.i = paddingValues0;
        this.j = function30;
        this.k = v;
        this.l = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RoundButtonKt.RoundButton(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.k | 1), this.l);
        return Unit.INSTANCE;
    }
}

