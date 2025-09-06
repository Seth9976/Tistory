package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w2 extends Lambda implements Function2 {
    public final boolean a;
    public final Function1 b;
    public final CheckedButtonColors c;
    public final Modifier d;
    public final Shape e;
    public final BorderStroke f;
    public final MutableInteractionSource g;
    public final PaddingValues h;
    public final Function2 i;
    public final int j;
    public final int k;

    public w2(boolean z, Function1 function10, CheckedButtonColors roundButtonDefaults$CheckedButtonColors0, Modifier modifier0, Shape shape0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, PaddingValues paddingValues0, Function2 function20, int v, int v1) {
        this.a = z;
        this.b = function10;
        this.c = roundButtonDefaults$CheckedButtonColors0;
        this.d = modifier0;
        this.e = shape0;
        this.f = borderStroke0;
        this.g = mutableInteractionSource0;
        this.h = paddingValues0;
        this.i = function20;
        this.j = v;
        this.k = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RoundButtonKt.RoundToggleButton(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ((Composer)object0), (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
        return Unit.INSTANCE;
    }
}

