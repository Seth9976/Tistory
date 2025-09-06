package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d5 extends Lambda implements Function1 {
    public static final d5 a;

    static {
        d5.a = new d5();
    }

    public d5() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RecommendedBlogNameInfo)object0), "it");
        return ((RecommendedBlogNameInfo)object0).getName();
    }
}

