package com.kakao.tistory.presentation.screen.revenue;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.vendorswitch.RevenueAdSwitchBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function3 {
    public final State a;
    public final Context b;
    public final MutableState c;

    public y(State state0, Context context0, MutableState mutableState0) {
        this.a = state0;
        this.b = context0;
        this.c = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$TistoryComposeBottomSheet");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA88E189, v, -1, "com.kakao.tistory.presentation.screen.revenue.RevenueScreen.<anonymous> (RevenueScreen.kt:170)");
        }
        Vendor vendor0 = RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getSelectedVendor();
        if(vendor0 != null) {
            RevenueAdSwitchBottomSheetKt.RevenueAdSwitchBottomSheet(vendor0, RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getVendorList(), new x(this.b, this.a, this.c), ((Composer)object1), 0x40);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

