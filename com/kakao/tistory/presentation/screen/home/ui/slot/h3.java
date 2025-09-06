package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h3 extends Lambda implements Function2 {
    public final ColumnScope a;
    public final boolean b;
    public final String c;
    public final String d;
    public final int e;

    public h3(ColumnScope columnScope0, boolean z, String s, String s1, int v) {
        this.a = columnScope0;
        this.b = z;
        this.c = s;
        this.d = s1;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TodayKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

