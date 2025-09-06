package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function2 {
    public final Integer a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Function0 f;
    public final int g;
    public final int h;

    public f0(Integer integer0, String s, boolean z, boolean z1, boolean z2, Function0 function00, int v, int v1) {
        this.a = integer0;
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = function00;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryComposeBottomSheetKt.BottomSheetItem(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

