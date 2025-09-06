package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function2 {
    public final int a;
    public final Function0 b;
    public final Integer c;
    public final Function0 d;
    public final BlogRoleType e;
    public final int f;
    public final int g;

    public h1(int v, Function0 function00, Integer integer0, Function0 function01, BlogRoleType blogRoleType0, int v1, int v2) {
        this.a = v;
        this.b = function00;
        this.c = integer0;
        this.d = function01;
        this.e = blogRoleType0;
        this.f = v1;
        this.g = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainInfoKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
        return Unit.INSTANCE;
    }
}

