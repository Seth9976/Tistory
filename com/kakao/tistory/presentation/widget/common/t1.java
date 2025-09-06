package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function2 {
    public final boolean a;
    public final SnackbarHostState b;
    public final int c;

    public t1(boolean z, SnackbarHostState snackbarHostState0, int v) {
        this.a = z;
        this.b = snackbarHostState0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        OfflineSnackbarKt.OfflineSnackbar(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

