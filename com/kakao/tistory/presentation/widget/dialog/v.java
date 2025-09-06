package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final DialogFactory a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final Function1 g;
    public final Function0 h;
    public final int i;
    public final int j;

    public v(DialogFactory dialogFactory0, String s, String s1, Integer integer0, Integer integer1, boolean z, Function1 function10, Function0 function00, int v, int v1) {
        this.a = dialogFactory0;
        this.b = s;
        this.c = s1;
        this.d = integer0;
        this.e = integer1;
        this.f = z;
        this.g = function10;
        this.h = function00;
        this.i = v;
        this.j = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.ShowOkCancel(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
        return Unit.INSTANCE;
    }
}

