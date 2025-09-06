package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final int a;
    public final Object b;
    public final Object c;
    public final CommonSwipeGroupState d;
    public final AnchorsProvider e;
    public final Integer f;
    public final Function4 g;
    public final int h;
    public final int i;

    public h(int v, Object object0, Object object1, CommonSwipeGroupState commonSwipeGroupState0, AnchorsProvider anchorsProvider0, Integer integer0, Function4 function40, int v1, int v2) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = commonSwipeGroupState0;
        this.e = anchorsProvider0;
        this.f = integer0;
        this.g = function40;
        this.h = v1;
        this.i = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LazyListExtensionKt.access$SwipeableItems(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

