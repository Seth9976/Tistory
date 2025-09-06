package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r4 extends Lambda implements Function2 {
    public final int a;

    public r4(int v) {
        this.a = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditGuideDialogKt.access$Message(((Composer)object0), (this.a | 1) & -920350135 | ((0x24924924 & (this.a | 1)) >> 1 | 306783378 & (this.a | 1)) | (306783378 & (this.a | 1)) << 1 & (0x24924924 & (this.a | 1)));
        return Unit.INSTANCE;
    }
}

