package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSummaryUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

public final class f extends Lambda implements Function2 {
    public final Vendor a;
    public final RevenueSummaryUiState b;
    public final Flow c;
    public final GraphDetailInfoUiState d;
    public final int e;
    public final GraphPeriodType f;
    public final Function1 g;
    public final Function4 h;
    public final int i;

    public f(Vendor vendor0, RevenueSummaryUiState revenueSummaryUiState0, Flow flow0, GraphDetailInfoUiState graphDetailInfoUiState0, int v, GraphPeriodType graphPeriodType0, Function1 function10, Function4 function40, int v1) {
        this.a = vendor0;
        this.b = revenueSummaryUiState0;
        this.c = flow0;
        this.d = graphDetailInfoUiState0;
        this.e = v;
        this.f = graphPeriodType0;
        this.g = function10;
        this.h = function40;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AdRevenueScreenKt.AdRevenueScreen(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)));
        return Unit.INSTANCE;
    }
}

