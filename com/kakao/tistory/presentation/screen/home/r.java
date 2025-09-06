package com.kakao.tistory.presentation.screen.home;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final String a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final TopAppBarScrollBehavior e;
    public final int f;

    public r(String s, Function0 function00, Function0 function01, Function0 function02, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v) {
        this.a = s;
        this.b = function00;
        this.c = function01;
        this.d = function02;
        this.e = topAppBarScrollBehavior0;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HomeScreenKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

