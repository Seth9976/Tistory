package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final Blog a;
    public final boolean b;
    public final Function0 c;
    public final String d;
    public final Function0 e;
    public final String f;
    public final Modifier g;
    public final int h;
    public final int i;

    public r(Blog blog0, boolean z, Function0 function00, String s, Function0 function01, String s1, Modifier modifier0, int v, int v1) {
        this.a = blog0;
        this.b = z;
        this.c = function00;
        this.d = s;
        this.e = function01;
        this.f = s1;
        this.g = modifier0;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainBottomBarKt.access$BottomBarMyItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

