package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final Function1 f;
    public final int g;
    public final int h;

    public g1(String s, String s1, Integer integer0, Integer integer1, boolean z, Function1 function10, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = integer0;
        this.d = integer1;
        this.e = z;
        this.f = function10;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryComposeDialogKt.access$TistoryDialogView(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

