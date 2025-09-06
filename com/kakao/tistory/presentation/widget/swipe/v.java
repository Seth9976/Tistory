package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final CommonSwipeState a;
    public final long b;
    public final boolean c;
    public final SwipeAnchors d;
    public final Function1 e;
    public final Function2 f;
    public final int g;
    public final int h;

    public v(CommonSwipeState commonSwipeState0, long v, boolean z, SwipeAnchors swipeAnchors0, Function1 function10, Function2 function20, int v1, int v2) {
        this.a = commonSwipeState0;
        this.b = v;
        this.c = z;
        this.d = swipeAnchors0;
        this.e = function10;
        this.f = function20;
        this.g = v1;
        this.h = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SwipeableItemKt.SwipeableItem-OadGlvw(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

