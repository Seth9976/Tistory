package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final TextStyle e;
    public final int f;
    public final int g;

    public v(int v, String s, int v1, int v2, TextStyle textStyle0, int v3, int v4) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = textStyle0;
        this.f = v3;
        this.g = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemInfoKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

