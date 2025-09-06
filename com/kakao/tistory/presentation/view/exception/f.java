package com.kakao.tistory.presentation.view.exception;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final TistoryGuideActivity a;
    public final String b;
    public final CharSequence c;
    public final Integer d;
    public final Function0 e;
    public final int f;

    public f(TistoryGuideActivity tistoryGuideActivity0, String s, CharSequence charSequence0, Integer integer0, Function0 function00, int v) {
        this.a = tistoryGuideActivity0;
        this.b = s;
        this.c = charSequence0;
        this.d = integer0;
        this.e = function00;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.GuideBody(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

