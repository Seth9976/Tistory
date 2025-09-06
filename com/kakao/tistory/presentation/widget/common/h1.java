package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function2 {
    public final String a;
    public final DateTimeFormat b;
    public final boolean c;
    public final FontFamily d;
    public final FontWeight e;
    public final long f;
    public final long g;
    public final TextStyle h;
    public final int i;
    public final int j;

    public h1(String s, DateTimeFormat dateUtils$DateTimeFormat0, boolean z, FontFamily fontFamily0, FontWeight fontWeight0, long v, long v1, TextStyle textStyle0, int v2, int v3) {
        this.a = s;
        this.b = dateUtils$DateTimeFormat0;
        this.c = z;
        this.d = fontFamily0;
        this.e = fontWeight0;
        this.f = v;
        this.g = v1;
        this.h = textStyle0;
        this.i = v2;
        this.j = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DateTimeTextKt.DateTimeText-Vc6wB30(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
        return Unit.INSTANCE;
    }
}

