package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m2 extends Lambda implements Function2 {
    public final Tip a;
    public final long b;
    public final int c;

    public m2(Tip homeSlotUiStateContent$Tip0, long v, int v1) {
        this.a = homeSlotUiStateContent$Tip0;
        this.b = v;
        this.c = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TipKt.access$TipEntry-RPmYEkk(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

