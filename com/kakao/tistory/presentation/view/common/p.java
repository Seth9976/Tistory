package com.kakao.tistory.presentation.view.common;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.ErrorModelThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final ErrorModelThrowable a;
    public final Function0 b;
    public final int c;
    public final int d;

    public p(ErrorModelThrowable errorModelThrowable0, Function0 function00, int v, int v1) {
        this.a = errorModelThrowable0;
        this.b = function00;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PagingItemListKt.access$ItemError(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

