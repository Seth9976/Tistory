package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function2 {
    public final Blog a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Function0 g;
    public final Function0 h;
    public final int i;

    public q1(Blog entryListUiState$Blog0, String s, String s1, int v, int v1, boolean z, Function0 function00, Function0 function01, int v2) {
        this.a = entryListUiState$Blog0;
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = z;
        this.g = function00;
        this.h = function01;
        this.i = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SubscriptionKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Composer)object0), (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)));
        return Unit.INSTANCE;
    }
}

