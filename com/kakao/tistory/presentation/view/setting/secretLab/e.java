package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final SecretLabActivity a;
    public final String b;
    public final Function0 c;
    public final int d;
    public final int e;

    public e(SecretLabActivity secretLabActivity0, String s, Function0 function00, int v, int v1) {
        this.a = secretLabActivity0;
        this.b = s;
        this.c = function00;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.CommonItem(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

