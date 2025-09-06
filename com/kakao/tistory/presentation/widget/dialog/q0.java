package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

public final class q0 extends Lambda implements Function2 {
    public final Flow a;
    public final Function4 b;
    public final int c;

    public q0(Flow flow0, Function4 function40, int v) {
        this.a = flow0;
        this.b = function40;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryComposeDialogKt.DialogHandler(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

