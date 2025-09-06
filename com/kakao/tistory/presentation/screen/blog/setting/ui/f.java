package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final boolean a;
    public final Function0 b;
    public final Function0 c;
    public final TopAppBarScrollBehavior d;
    public final int e;

    public f(boolean z, Function0 function00, Function0 function01, TopAppBarScrollBehavior topAppBarScrollBehavior0, int v) {
        this.a = z;
        this.b = function00;
        this.c = function01;
        this.d = topAppBarScrollBehavior0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSettingTopAppBarKt.BlogSettingTopAppBar(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

