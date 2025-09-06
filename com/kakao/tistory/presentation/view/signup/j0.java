package com.kakao.tistory.presentation.view.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function2 {
    public final Modifier a;
    public final int b;
    public final int c;

    public j0(Modifier modifier0, int v, int v1) {
        this.a = modifier0;
        this.b = v;
        this.c = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignUpScreenKt.a(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)), this.c);
        return Unit.INSTANCE;
    }
}

