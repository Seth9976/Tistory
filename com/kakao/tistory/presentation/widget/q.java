package com.kakao.tistory.presentation.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final AnnotatedString a;
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
    public final boolean n;
    public final int o;
    public final int p;
    public final Map q;
    public final Function1 r;
    public final TextStyle s;
    public final int t;
    public final int u;
    public final int v;

    public q(AnnotatedString annotatedString0, Modifier modifier0, long v, long v1, FontStyle fontStyle0, FontWeight fontWeight0, FontFamily fontFamily0, long v2, TextDecoration textDecoration0, TextAlign textAlign0, long v3, int v4, boolean z, boolean z1, int v5, int v6, Map map0, Function1 function10, TextStyle textStyle0, int v7, int v8, int v9) {
        this.a = annotatedString0;
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
        this.n = z1;
        this.o = v5;
        this.p = v6;
        this.q = map0;
        this.r = function10;
        this.s = textStyle0;
        this.t = v7;
        this.u = v8;
        this.v = v9;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ExcludeFontPaddingTextKt.Text-edWjEy0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, ((Composer)object0), (this.t | 1) & -920350135 | ((0x24924924 & (this.t | 1)) >> 1 | 306783378 & (this.t | 1)) | (306783378 & (this.t | 1)) << 1 & (0x24924924 & (this.t | 1)), this.u & -920350135 | ((0x24924924 & this.u) >> 1 | 306783378 & this.u) | (306783378 & this.u) << 1 & (0x24924924 & this.u), this.v);
        return Unit.INSTANCE;
    }
}

