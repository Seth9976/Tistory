package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final BlogCategoryViewModel a;

    public f(BlogCategoryViewModel blogCategoryViewModel0) {
        this.a = blogCategoryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.isShowProgress().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

