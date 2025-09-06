package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function2 {
    public final String a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Function0 e;
    public final int f;

    public h1(String s, long v, boolean z, boolean z1, Function0 function00, int v1) {
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = function00;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentToolbarKt.CommentToolbar(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

