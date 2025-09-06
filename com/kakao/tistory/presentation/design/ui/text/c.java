package com.kakao.tistory.presentation.design.ui.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final Number a;
    public final Modifier b;
    public final long c;
    public final TextStyle d;
    public final int e;
    public final int f;

    public c(Number number0, Modifier modifier0, long v, TextStyle textStyle0, int v1, int v2) {
        this.a = number0;
        this.b = modifier0;
        this.c = v;
        this.d = textStyle0;
        this.e = v1;
        this.f = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SingleLineNumberKt.SingleLineCompactNumber-cf5BqRc(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

