package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final Modifier a;
    public final GraphDetailInfoUiState b;
    public final long c;
    public final int d;
    public final int e;

    public c(Modifier modifier0, GraphDetailInfoUiState graphDetailInfoUiState0, long v, int v1, int v2) {
        this.a = modifier0;
        this.b = graphDetailInfoUiState0;
        this.c = v;
        this.d = v1;
        this.e = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PeriodStatisticsTableKt.PeriodStatisticsTable-FNF3uiM(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

