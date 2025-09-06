package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final List a;
    public final Function1 b;
    public final Function0 c;
    public final Function0 d;
    public final MainDestination e;
    public final Blog f;
    public final long g;
    public final int h;
    public final int i;

    public y(List list0, Function1 function10, Function0 function00, Function0 function01, MainDestination mainDestination0, Blog blog0, long v, int v1, int v2) {
        this.a = list0;
        this.b = function10;
        this.c = function00;
        this.d = function01;
        this.e = mainDestination0;
        this.f = blog0;
        this.g = v;
        this.h = v1;
        this.i = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MainBottomBarKt.MainBottomBar(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

