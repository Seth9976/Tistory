package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final DaumCategoryViewModel a;

    public u(DaumCategoryViewModel daumCategoryViewModel0) {
        this.a = daumCategoryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.isShowProgress().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

