package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.room.a;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NumberExtensionKt;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSupportItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final RevenueSupportItem a;

    public i(RevenueSupportItem revenueSupportItem0) {
        this.a = revenueSupportItem0;
        super(2);
    }

    public final void a(Composer composer0, int v) {
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1E77311A, v, -1, "com.kakao.tistory.presentation.screen.revenue.DonationRevenueScreen.<anonymous>.<anonymous> (DonationRevenueScreen.kt:40)");
        }
        DonationRevenueScreenKt.access$DonationRevenueInfo(null, StringResources_androidKt.stringResource(string.revenue_donation_expected, composer0, 0), a.z("₩", NumberExtensionKt.numberFormatOfCurrency(this.a.getEarnings(), "₩")), composer0, 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        this.a(((Composer)object0), ((Number)object1).intValue());
        return Unit.INSTANCE;
    }
}

