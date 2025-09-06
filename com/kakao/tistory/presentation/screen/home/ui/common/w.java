package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final Function2 a;
    public final boolean b;
    public final PaddingValues c;
    public final Function3 d;
    public final int e;
    public final int f;

    public w(Function2 function20, boolean z, PaddingValues paddingValues0, Function3 function30, int v, int v1) {
        this.a = function20;
        this.b = z;
        this.c = paddingValues0;
        this.d = function30;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotContainerKt.SlotContainer(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

