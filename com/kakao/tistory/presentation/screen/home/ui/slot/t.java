package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final int a;

    public t(int v) {
        this.a = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CategoryKt.CategoryLoadingPreview(((Composer)object0), (this.a | 1) & -920350135 | ((0x24924924 & (this.a | 1)) >> 1 | 306783378 & (this.a | 1)) | (306783378 & (this.a | 1)) << 1 & (0x24924924 & (this.a | 1)));
        return Unit.INSTANCE;
    }
}

