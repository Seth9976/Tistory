package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z2 extends Lambda implements Function2 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final boolean d;
    public final PaddingValues e;
    public final Function0 f;
    public final int g;
    public final int h;

    public z2(Integer integer0, Integer integer1, String s, boolean z, PaddingValues paddingValues0, Function0 function00, int v, int v1) {
        this.a = integer0;
        this.b = integer1;
        this.c = s;
        this.d = z;
        this.e = paddingValues0;
        this.f = function00;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryChipKt.TistoryChip(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

