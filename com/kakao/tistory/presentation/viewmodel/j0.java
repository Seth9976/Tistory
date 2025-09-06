package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public static final j0 a;

    static {
        j0.a = new j0();
    }

    public j0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((CategoryItem)object0) == null ? EntryCategoryVisibilityType.PUBLIC.getValue() : ((CategoryItem)object0).getVisibility();
    }
}

