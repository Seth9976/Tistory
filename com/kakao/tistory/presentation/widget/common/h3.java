package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h3 extends Lambda implements Function2 {
    public final AnnotatedString a;
    public final boolean b;
    public final boolean c;
    public final AppBarHomeAsUpButtonType d;
    public final Function0 e;
    public final Integer f;
    public final Integer g;
    public final Function0 h;
    public final int i;
    public final int j;

    public h3(AnnotatedString annotatedString0, boolean z, boolean z1, AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType0, Function0 function00, Integer integer0, Integer integer1, Function0 function01, int v, int v1) {
        this.a = annotatedString0;
        this.b = z;
        this.c = z1;
        this.d = tistoryToolbar$AppBarHomeAsUpButtonType0;
        this.e = function00;
        this.f = integer0;
        this.g = integer1;
        this.h = function01;
        this.i = v;
        this.j = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistoryToolbarKt.TistoryToolbar(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
        return Unit.INSTANCE;
    }
}

