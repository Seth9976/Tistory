package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public g0(boolean z, boolean z1, int v, int v1) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryComposeBottomSheetKt.BottomSheetItemCheckBox(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

