package com.kakao.tistory.presentation.widget.bottomsheet;

import android.view.Window;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final Window a;
    public final long b;
    public final Function0 c;
    public final boolean d;
    public final int e;
    public final int f;

    public k(Window window0, long v, Function0 function00, boolean z, int v1, int v2) {
        this.a = window0;
        this.b = v;
        this.c = function00;
        this.d = z;
        this.e = v1;
        this.f = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetModalKt.access$Scrim-sW7UJKQ(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

