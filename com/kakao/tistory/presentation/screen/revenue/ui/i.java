package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.screen.revenue.item.VariationEarningUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final Modifier a;
    public final VariationEarningUiState b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public i(Modifier modifier0, VariationEarningUiState variationEarningUiState0, String s, String s1, int v, int v1) {
        this.a = modifier0;
        this.b = variationEarningUiState0;
        this.c = s;
        this.d = s1;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueBoardKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

