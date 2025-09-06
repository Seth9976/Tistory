package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i2 extends Lambda implements Function2 {
    public final Modifier a;
    public final AnnotatedString b;
    public final TextStyle c;
    public final int d;
    public final int e;
    public final int f;
    public final Function1 g;
    public final Function1 h;
    public final Function0 i;
    public final int j;
    public final int k;

    public i2(Modifier modifier0, AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, int v2, Function1 function10, Function1 function11, Function0 function00, int v3, int v4) {
        this.a = modifier0;
        this.b = annotatedString0;
        this.c = textStyle0;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = function10;
        this.h = function11;
        this.i = function00;
        this.j = v3;
        this.k = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReadMoreTextViewKt.ReadMoreTextView(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ((Composer)object0), (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
        return Unit.INSTANCE;
    }
}

