package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function2 {
    public final BoxScope a;
    public final long b;
    public final Function0 c;
    public final Function0 d;
    public final int e;

    public f1(BoxScope boxScope0, long v, Function0 function00, Function0 function01, int v1) {
        this.a = boxScope0;
        this.b = v;
        this.c = function00;
        this.d = function01;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CreatorKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

