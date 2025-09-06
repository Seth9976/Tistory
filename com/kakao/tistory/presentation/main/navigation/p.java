package com.kakao.tistory.presentation.main.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final MainAppState a;
    public final String b;
    public final String c;
    public final Modifier d;
    public final int e;
    public final int f;

    public p(MainAppState mainAppState0, String s, String s1, Modifier modifier0, int v, int v1) {
        this.a = mainAppState0;
        this.b = s;
        this.c = s1;
        this.d = modifier0;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainNavHostKt.MainNavHost(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

