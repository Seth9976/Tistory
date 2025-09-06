package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class a5 extends Lambda implements Function2 {
    public final float a;
    public final float b;
    public final TopAppBarScrollBehavior c;
    public final Function3 d;
    public final int e;

    public a5(float f, float f1, TopAppBarScrollBehavior topAppBarScrollBehavior0, Function3 function30, int v) {
        this.a = f;
        this.b = f1;
        this.c = topAppBarScrollBehavior0;
        this.d = function30;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TopAppBarKt.TopAppBar-if577FI(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

