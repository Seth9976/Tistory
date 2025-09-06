package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function2 {
    public final TistroyLoginActivity a;
    public final int b;

    public s0(TistroyLoginActivity tistroyLoginActivity0, int v) {
        this.a = tistroyLoginActivity0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TistroyLoginActivity.access$MigrationGuide(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

