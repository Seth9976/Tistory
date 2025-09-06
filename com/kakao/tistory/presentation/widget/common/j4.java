package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class j4 extends Lambda implements Function2 {
    public final TopAppBarScrollBehavior a;
    public final boolean b;
    public final Function3 c;
    public final Function3 d;
    public final Function4 e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;

    public j4(TopAppBarScrollBehavior topAppBarScrollBehavior0, boolean z, Function3 function30, Function3 function31, Function4 function40, float f, float f1, int v, int v1) {
        this.a = topAppBarScrollBehavior0;
        this.b = z;
        this.c = function30;
        this.d = function31;
        this.e = function40;
        this.f = f;
        this.g = f1;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryTopAppBarKt.TistoryTopAppBar-nbWgWpA(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

