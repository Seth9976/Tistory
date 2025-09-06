package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function2 {
    public final Modifier a;
    public final TextStyle b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final Map g;
    public final long h;
    public final FontWeight i;
    public final Function1 j;
    public final int k;
    public final int l;

    public n1(Modifier modifier0, TextStyle textStyle0, boolean z, int v, int v1, String s, Map map0, long v2, FontWeight fontWeight0, Function1 function10, int v3, int v4) {
        this.a = modifier0;
        this.b = textStyle0;
        this.c = z;
        this.d = v;
        this.e = v1;
        this.f = s;
        this.g = map0;
        this.h = v2;
        this.i = fontWeight0;
        this.j = function10;
        this.k = v3;
        this.l = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LinkableTextKt.MultiLinkableText-WxCAl_A(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((Composer)object0), (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)), this.l);
        return Unit.INSTANCE;
    }
}

