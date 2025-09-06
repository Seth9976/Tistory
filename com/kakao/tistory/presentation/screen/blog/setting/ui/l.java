package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final int d;

    public l(Function0 function00, Function0 function01, Function0 function02, int v) {
        this.a = function00;
        this.b = function01;
        this.c = function02;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ImageBottomSheetKt.ImageBottomSheet(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

