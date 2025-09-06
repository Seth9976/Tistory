package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final int a;
    public final PaddingValues b;
    public final int c;
    public final int d;

    public k(int v, PaddingValues paddingValues0, int v1, int v2) {
        this.a = v;
        this.b = paddingValues0;
        this.c = v1;
        this.d = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommonEmptyViewKt.CommonEmptyView(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

