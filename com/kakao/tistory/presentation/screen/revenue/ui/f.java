package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final int c;

    public f(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PeriodStatisticsTableKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

