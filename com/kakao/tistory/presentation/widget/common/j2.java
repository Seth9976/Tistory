package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j2 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final TextStyle e;
    public final int f;
    public final int g;
    public final int h;

    public j2(String s, String s1, boolean z, long v, TextStyle textStyle0, int v1, int v2, int v3) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = textStyle0;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RestrictedTitleKt.RestrictedTitle-KgUXRuw(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

