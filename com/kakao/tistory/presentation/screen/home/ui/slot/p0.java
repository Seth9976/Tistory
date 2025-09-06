package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final Function0 c;
    public final int d;
    public final boolean e;
    public final Function0 f;
    public final Function0 g;
    public final int h;

    public p0(String s, String s1, Function0 function00, int v, boolean z, Function0 function01, Function0 function02, int v1) {
        this.a = s;
        this.b = s1;
        this.c = function00;
        this.d = v;
        this.e = z;
        this.f = function01;
        this.g = function02;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CreatorKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
        return Unit.INSTANCE;
    }
}

