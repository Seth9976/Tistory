package com.kakao.tistory.presentation.main;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final MainUiState a;
    public final int b;

    public u(MainUiState mainUiState0, int v) {
        this.a = mainUiState0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainAppKt.access$NewIntentHandler(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

