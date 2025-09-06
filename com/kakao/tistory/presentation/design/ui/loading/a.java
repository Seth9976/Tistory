package com.kakao.tistory.presentation.design.ui.loading;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final long a;
    public final int b;
    public final int c;

    public a(long v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CircularLoadingKt.CircularLoading-Iv8Zu3U(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)), this.c);
        return Unit.INSTANCE;
    }
}

