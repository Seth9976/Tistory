package com.kakao.tistory.presentation.screen.blog.main.contract;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Function2 a;
    public final int b;

    public c(Function2 function20, int v) {
        this.a = function20;
        this.b = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogMainCategoryItem)object0), "it");
        this.a.invoke(this.b, ((BlogMainCategoryItem)object0));
        return Unit.INSTANCE;
    }
}

