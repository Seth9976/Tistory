package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Blog a;
    public final boolean b;
    public final Function1 c;
    public final Function1 d;
    public final int e;
    public final int f;

    public h(Blog blog0, boolean z, Function1 function10, Function1 function11, int v, int v1) {
        this.a = blog0;
        this.b = z;
        this.c = function10;
        this.d = function11;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogFollowingKt.BlogFollowing(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

