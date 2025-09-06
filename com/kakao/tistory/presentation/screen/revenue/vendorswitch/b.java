package com.kakao.tistory.presentation.screen.revenue.vendorswitch;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.item.Vendor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Vendor a;
    public final List b;
    public final Function1 c;
    public final int d;

    public b(Vendor vendor0, List list0, Function1 function10, int v) {
        this.a = vendor0;
        this.b = list0;
        this.c = function10;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueAdSwitchBottomSheetKt.RevenueAdSwitchBottomSheet(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

