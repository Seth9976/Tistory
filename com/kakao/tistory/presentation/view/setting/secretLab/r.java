package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final SecretLabActivity a;
    public final NavController b;
    public final int c;

    public r(SecretLabActivity secretLabActivity0, NavController navController0, int v) {
        this.a = secretLabActivity0;
        this.b = navController0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SecretLabActivity.access$MainContent(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

