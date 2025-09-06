package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final DialogFactory a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final Function1 f;
    public final Function0 g;
    public final int h;
    public final int i;

    public r(DialogFactory dialogFactory0, String s, String s1, int v, boolean z, Function1 function10, Function0 function00, int v1, int v2) {
        this.a = dialogFactory0;
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = z;
        this.f = function10;
        this.g = function00;
        this.h = v1;
        this.i = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.ShowOk(this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

