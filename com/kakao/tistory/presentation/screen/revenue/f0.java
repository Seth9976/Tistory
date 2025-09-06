package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangedGraphPeriodType;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final RevenueViewModel a;

    public f0(RevenueViewModel revenueViewModel0) {
        this.a = revenueViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphPeriodType)object0), "it");
        ChangedGraphPeriodType revenueIntent$ChangedGraphPeriodType0 = new ChangedGraphPeriodType(((GraphPeriodType)object0));
        this.a.sendIntent(revenueIntent$ChangedGraphPeriodType0);
        return Unit.INSTANCE;
    }
}

