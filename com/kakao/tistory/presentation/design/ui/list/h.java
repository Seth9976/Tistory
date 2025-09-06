package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Function2 a;
    public final String b;
    public final TextStyle c;
    public final PaddingValues d;
    public final Vertical e;
    public final Function0 f;
    public final boolean g;
    public final int h;
    public final int i;

    public h(Function2 function20, String s, TextStyle textStyle0, PaddingValues paddingValues0, Vertical alignment$Vertical0, Function0 function00, boolean z, int v, int v1) {
        this.a = function20;
        this.b = s;
        this.c = textStyle0;
        this.d = paddingValues0;
        this.e = alignment$Vertical0;
        this.f = function00;
        this.g = z;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogTitleKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

