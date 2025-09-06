package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.common.graph.GraphPeriod;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.SelectedGraphItem;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function4 {
    public final RevenueViewModel a;

    public h0(RevenueViewModel revenueViewModel0) {
        this.a = revenueViewModel0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(((String)object0), "vendor");
        Intrinsics.checkNotNullParameter(((GraphPeriodType)object1), "graphPeriodType");
        Intrinsics.checkNotNullParameter(((GraphPeriod)object2), "graphPeriod");
        RevenueTiara.INSTANCE.trackClickGraph(((String)object0), ((GraphPeriodType)object1));
        SelectedGraphItem revenueIntent$SelectedGraphItem0 = new SelectedGraphItem(((GraphPeriod)object2), ((Number)object3).intValue());
        this.a.sendIntent(revenueIntent$SelectedGraphItem0);
        return Unit.INSTANCE;
    }
}

