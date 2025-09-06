package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangedVendor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function1 {
    public final RevenueViewModel a;

    public g0(RevenueViewModel revenueViewModel0) {
        this.a = revenueViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Vendor)object0), "vendor");
        ChangedVendor revenueIntent$ChangedVendor0 = new ChangedVendor(((Vendor)object0));
        this.a.sendIntent(revenueIntent$ChangedVendor0);
        return Unit.INSTANCE;
    }
}

