package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.revenue.ui.RevenueStandardDateTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function3 {
    public final State a;

    public s(State state0) {
        this.a = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryCollapsingTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1651666610, v, -1, "com.kakao.tistory.presentation.screen.revenue.RevenueScreen.<anonymous>.<anonymous> (RevenueScreen.kt:78)");
        }
        if(RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getLastUpdateTime().length() > 0) {
            RevenueStandardDateTextKt.RevenueStandardDateText(StringResources_androidKt.stringResource(string.revenue_standard_date_text, new Object[]{RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getLastUpdateTime()}, ((Composer)object1), 0x40), ((Composer)object1), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

