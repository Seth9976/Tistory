package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.item.Vendor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final Vendor a;
    public final float b;
    public final Function0 c;
    public final int d;

    public z(Vendor vendor0, float f, Function0 function00, int v) {
        this.a = vendor0;
        this.b = f;
        this.c = function00;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueViewKt.SelectedAdBox(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

