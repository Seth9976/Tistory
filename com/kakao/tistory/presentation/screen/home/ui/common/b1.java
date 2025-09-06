package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function2 {
    public final Modifier a;
    public final int b;
    public final int c;
    public final SlotMoreButtonColor d;
    public final Function0 e;
    public final int f;
    public final int g;

    public b1(Modifier modifier0, int v, int v1, SlotMoreButtonColor slotMoreButtonColor0, Function0 function00, int v2, int v3) {
        this.a = modifier0;
        this.b = v;
        this.c = v1;
        this.d = slotMoreButtonColor0;
        this.e = function00;
        this.f = v2;
        this.g = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotMoreButtonKt.SlotMoreButton(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

