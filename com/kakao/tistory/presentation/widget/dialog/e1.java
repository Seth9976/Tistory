package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Function0 d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Function0 i;
    public final Function0 j;
    public final int k;
    public final int l;

    public e1(String s, String s1, boolean z, Function0 function00, int v, int v1, boolean z1, boolean z2, Function0 function01, Function0 function02, int v2, int v3) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = function00;
        this.e = v;
        this.f = v1;
        this.g = z1;
        this.h = z2;
        this.i = function01;
        this.j = function02;
        this.k = v2;
        this.l = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryComposeDialogKt.TistoryAlertDialog(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((Composer)object0), (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)), this.l);
        return Unit.INSTANCE;
    }
}

