package com.kakao.tistory.presentation.view.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final Modifier a;
    public final List b;
    public final Function1 c;
    public final Function0 d;
    public final int e;
    public final int f;

    public c0(Modifier modifier0, List list0, Function1 function10, Function0 function00, int v, int v1) {
        this.a = modifier0;
        this.b = list0;
        this.c = function10;
        this.d = function00;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignUpScreenKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

