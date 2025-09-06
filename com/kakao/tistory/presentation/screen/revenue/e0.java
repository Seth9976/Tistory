package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadVendorList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final RevenueViewModel a;

    public e0(RevenueViewModel revenueViewModel0) {
        this.a = revenueViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        LoadVendorList revenueIntent$LoadVendorList0 = new LoadVendorList(((String)object0));
        this.a.sendIntent(revenueIntent$LoadVendorList0);
        return Unit.INSTANCE;
    }
}

