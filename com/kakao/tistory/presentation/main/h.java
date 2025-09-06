package com.kakao.tistory.presentation.main;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final MainAppViewModel a;
    public final MainAppState b;
    public final SnackbarHostState c;
    public final int d;

    public h(MainAppViewModel mainAppViewModel0, MainAppState mainAppState0, SnackbarHostState snackbarHostState0, int v) {
        this.a = mainAppViewModel0;
        this.b = mainAppState0;
        this.c = snackbarHostState0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainAppKt.access$ConsumeEvent(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

