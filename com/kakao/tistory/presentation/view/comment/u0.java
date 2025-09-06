package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final Modifier b;
    public final boolean c;
    public final boolean d;
    public final Function0 e;
    public final Function2 f;
    public final int g;
    public final int h;

    public u0(CommentFragment commentFragment0, Modifier modifier0, boolean z, boolean z1, Function0 function00, Function2 function20, int v, int v1) {
        this.a = commentFragment0;
        this.b = modifier0;
        this.c = z;
        this.d = z1;
        this.e = function00;
        this.f = function20;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

