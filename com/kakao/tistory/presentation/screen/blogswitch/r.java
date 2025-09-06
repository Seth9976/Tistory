package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final Function2 a;

    public r(Function2 function20) {
        this.a = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Blog)object1), "blog");
        this.a.invoke(((Number)object0).intValue(), ((Blog)object1));
        return Unit.INSTANCE;
    }
}

