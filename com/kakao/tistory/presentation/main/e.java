package com.kakao.tistory.presentation.main;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final MainDestination a;
    public final MainUiState b;
    public final SnackbarHostState c;
    public final int d;

    public e(MainDestination mainDestination0, MainUiState mainUiState0, SnackbarHostState snackbarHostState0, int v) {
        this.a = mainDestination0;
        this.b = mainUiState0;
        this.c = snackbarHostState0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainAppKt.access$BackPressedHandler(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

