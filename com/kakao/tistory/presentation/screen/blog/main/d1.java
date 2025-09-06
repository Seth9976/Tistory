package com.kakao.tistory.presentation.screen.blog.main;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function3 {
    public final BlogMainViewModel a;

    public d1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        c1 c10 = new c1(this.a, ((String)object0), ((Number)object1).longValue());
        BlogMainViewModel.access$checkEntryEditable(this.a, ((Boolean)object2).booleanValue(), c10);
        return Unit.INSTANCE;
    }
}

