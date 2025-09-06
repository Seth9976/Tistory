package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final RevenueUiState a;
    public final int b;

    public c0(RevenueUiState revenueUiState0, int v) {
        this.a = revenueUiState0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueScreenKt.a(this.a, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
        return Unit.INSTANCE;
    }
}

