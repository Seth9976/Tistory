package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final EntryViewActivity a;
    public final Modifier b;
    public final int c;
    public final String d;
    public final Function0 e;
    public final int f;
    public final int g;

    public q(EntryViewActivity entryViewActivity0, Modifier modifier0, int v, String s, Function0 function00, int v1, int v2) {
        this.a = entryViewActivity0;
        this.b = modifier0;
        this.c = v;
        this.d = s;
        this.e = function00;
        this.f = v1;
        this.g = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.DefaultIconButton(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

