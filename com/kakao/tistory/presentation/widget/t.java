package com.kakao.tistory.presentation.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final String a;
    public final Modifier b;
    public final long c;
    public final long d;
    public final FontStyle e;
    public final FontWeight f;
    public final FontFamily g;
    public final long h;
    public final TextDecoration i;
    public final TextAlign j;
    public final long k;
    public final int l;
    public final boolean m;
    public final int n;
    public final TextStyle o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;

    public t(String s, Modifier modifier0, long v, long v1, FontStyle fontStyle0, FontWeight fontWeight0, FontFamily fontFamily0, long v2, TextDecoration textDecoration0, TextAlign textAlign0, long v3, int v4, boolean z, int v5, TextStyle textStyle0, String s1, int v6, int v7, int v8) {
        this.a = s;
        this.b = modifier0;
        this.c = v;
        this.d = v1;
        this.e = fontStyle0;
        this.f = fontWeight0;
        this.g = fontFamily0;
        this.h = v2;
        this.i = textDecoration0;
        this.j = textAlign0;
        this.k = v3;
        this.l = v4;
        this.m = z;
        this.n = v5;
        this.o = textStyle0;
        this.p = s1;
        this.q = v6;
        this.r = v7;
        this.s = v8;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HighlightTextKt.HighlightText-fLXpl1I(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, ((Composer)object0), (this.q | 1) & -920350135 | ((0x24924924 & (this.q | 1)) >> 1 | 306783378 & (this.q | 1)) | (306783378 & (this.q | 1)) << 1 & (0x24924924 & (this.q | 1)), this.r & -920350135 | ((0x24924924 & this.r) >> 1 | 306783378 & this.r) | (306783378 & this.r) << 1 & (0x24924924 & this.r), this.s);
        return Unit.INSTANCE;
    }
}

