package com.kakao.tistory.presentation.widget.bottomsheet;

import android.view.Window;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Window a;
    public final SwipeableState b;
    public final int c;
    public final Function0 d;
    public final Function2 e;
    public final int f;
    public final int g;

    public g(Window window0, SwipeableState swipeableState0, int v, Function0 function00, Function2 function20, int v1, int v2) {
        this.a = window0;
        this.b = swipeableState0;
        this.c = v;
        this.d = function00;
        this.e = function20;
        this.f = v1;
        this.g = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetModalKt.BottomSheetModal(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

